package org.jeecg.modules.caigoudingdan;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.ShjlXs;
import org.jeecg.modules.link.entity.YsjlXs;
import org.jeecg.modules.link.mapper.YsjlXsMapper;
import org.jeecg.modules.link.service.IYsjlXsService;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.PuArrivalVouchMapper;
import org.jeecg.modules.u8.mapper.PuArrivalVouchsMapper;
import org.jeecg.modules.u8.mapper.UaIdentityMapper;
import org.jeecg.modules.u8.mapper.VoucherHistoryMapper;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class YanShou3 {
    @Autowired
    private VoucherHistoryMapper voucherHistoryMapper;
    @Autowired
    private UaIdentityMapper uaIdentityMapper;
    @Autowired
    private IGspVouchQCService iGspVouchQCService;
    @Autowired
    private IGspVouchsQCService iGspVouchsQCService;
    @Autowired
    private PuArrivalVouchMapper puArrivalVouchMapper;
    @Autowired
    private PuArrivalVouchsMapper puArrivalVouchsMapper;
    @Autowired
    private IYsjlXsService iYsjlXsService;

    @Test
    public void Test1() {

        List<String> codeListGroupCode = iYsjlXsService.getCodeListGroupCodeCai();
        //获取所有待同步验收单据
        for (String s : codeListGroupCode) {
            //到货单单号查询

            List<YsjlXs> listByCode = iYsjlXsService.getListByCode(s);

            YsjlXs ysjlXs = listByCode.get(0);
            String ysdjbh = ysjlXs.getYsdjbh();
            PuArrivalVouch daoHuoByCode = puArrivalVouchMapper.getDaoHuoByCode(ysjlXs.getShdjbh());
            Integer id1 = daoHuoByCode.getId();
            UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
            int id = uaIdentity.getIfatherid();
            int forecastid = id + 1000000001;

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            Date currentDate2 = new Date(calendar.getTimeInMillis());


            GspVouchQC gspVouchQC = new GspVouchQC();
            //id
            gspVouchQC.setId(forecastid);
            //code
            gspVouchQC.setQcid(ysdjbh);
            //到货单ID
            gspVouchQC.setIcode(id1);
            //到货单code
            gspVouchQC.setCcode(daoHuoByCode.getCcode());

            //审核
            gspVouchQC.setCverifier("demo");
            gspVouchQC.setDverifydate(currentDate2);
            gspVouchQC.setDverifysystime(new Date());
            //日期

            gspVouchQC.setDarvdate(currentDate2);
            gspVouchQC.setDdate(currentDate2);

            //创建人
            gspVouchQC.setCmaker("demo");
            //单据类型 001 验收单 002 拒收单
            gspVouchQC.setCvouchtype("001");

            gspVouchQC.setIvtid(221);
            gspVouchQC.setBrefer("1");
            gspVouchQC.setIverifystate(0);
            gspVouchQC.setIreturncount(0);
            gspVouchQC.setIverifystatenew(0);
            gspVouchQC.setIswfcontrolled(0);
            gspVouchQC.setCmodifier("demo");
            gspVouchQC.setDcreatesystime(new Date());
            // ||GS01| + 订单号;
            gspVouchQC.setCbsysbarcode("||GS01|" + ysdjbh);
            System.out.println(gspVouchQC);
            boolean save = iGspVouchQCService.save(gspVouchQC);

            if (save) {
                //TODO:需要一个更新字段
                System.out.println("添加成功");
                iYsjlXsService.updateIsTq(ysdjbh);
                uaIdentityMapper.iFatherIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
                //voucherHistoryMapper.codingAdd("001");

            }
            for (YsjlXs ysjlX : listByCode) {
                Integer shDjSn = ysjlX.getShDjSn();

                Integer djSn = ysjlX.getDjSn();
                djSn = djSn+ 1;
                BigDecimal add = NumberUtil.add(shDjSn.toString(), "1");

                PuArrivalVouchs puArrivalVouchs = puArrivalVouchsMapper.getByIdAndRow(id1.toString(), add.toString());

                UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
                int ids = uaIdentity1.getIchildid();
                int ichildid = ids + 1000000001;


                GspVouchsQC gspVouchsQC = new GspVouchsQC();
                //id
                gspVouchsQC.setAutoid(ichildid);

                BigDecimal iquantity = puArrivalVouchs.getIquantity();

                //计算换算比例
                BigDecimal inum = puArrivalVouchs.getInum();
                BigDecimal div = null;
                if (inum != null) {
                    div = NumberUtil.div(iquantity, inum, 2);
                }
                //换算比例
                BigDecimal iinvexchrate = puArrivalVouchs.getIinvexchrate();

                //二级单位
                String cunitid = puArrivalVouchs.getCunitid();


                gspVouchsQC.setId(forecastid);
                //存货编码
                gspVouchsQC.setCinvcode(puArrivalVouchs.getCinvcode());
                //总数
                gspVouchsQC.setFarvquantity(ysjlX.getShl());
                //验收数量    总数-拒收
                gspVouchsQC.setFquantity(ysjlX.getShl());
                //合格数量
                gspVouchsQC.setFelgquantity(ysjlX.getHegshl());
                //不合格数量
                gspVouchsQC.setFnelgquantity(ysjlX.getBuhgshl());
                //拒收数量
                gspVouchsQC.setFrefusequantity(new BigDecimal("0"));

                if (inum != null) {
                    //辅计量单位 验收数量    总数-拒收
                    gspVouchsQC.setFquantitys(NumberUtil.div(ysjlX.getShl(), div, 4));
                    //辅计量单位 总数
                    gspVouchsQC.setFarvquantitys(NumberUtil.div(ysjlX.getShl(), div, 4));
                    //辅计量单位 合格数量
                    gspVouchsQC.setFelgquantitys(NumberUtil.div(ysjlX.getHegshl(), div, 4));
                    //辅计量单位 不合格数量
                    gspVouchsQC.setFnelgquantitys(NumberUtil.div(ysjlX.getBuhgshl(), div, 4));
                    //辅计量单位 拒收数量
                    gspVouchsQC.setFrefusenum(new BigDecimal("0"));
                }


                //供应商
                gspVouchsQC.setCvencode(daoHuoByCode.getCvencode());

                gspVouchsQC.setBspecial(0);
                gspVouchsQC.setBname(0);
                gspVouchsQC.setBspec(0);
                gspVouchsQC.setBproc(0);
                gspVouchsQC.setBfinish(0);
                gspVouchsQC.setBflag(0);
                gspVouchsQC.setBcheck(0);
                gspVouchsQC.setBmakescrap(0);
                gspVouchsQC.setBmakepurin(0);
                gspVouchsQC.setBmakesaleout(0);

                gspVouchsQC.setCmassunit(2);
                gspVouchsQC.setBmakescrapin(0);
                gspVouchsQC.setBgift(0);

                gspVouchsQC.setCbsysbarcode("||GS01|" + ysdjbh + "|" + djSn);


                //生产日期
                gspVouchsQC.setDprodate(puArrivalVouchs.getDpdate());
                //到期日期
                gspVouchsQC.setDvaldate(puArrivalVouchs.getDvdate());

                gspVouchsQC.setDdateT(new Date());

                //有效期
                gspVouchsQC.setImassdate(puArrivalVouchs.getImassdate());
                //批号
                gspVouchsQC.setCbatch(ysjlX.getPihao());
                //到货单行ID
                gspVouchsQC.setIcodeT(puArrivalVouchs.getAutoid());
                //订单编号
                gspVouchsQC.setCordercode(daoHuoByCode.getCpocode());
                //单位ID
                gspVouchsQC.setCunitid(cunitid);

                gspVouchsQC.setCchecker1(ysjlX.getYanshr());
                System.out.println(gspVouchsQC);

                //gspVouchsQC.setCchecker2("曹政");

                boolean save1 = iGspVouchsQCService.save(gspVouchsQC);

                if (save1) {
                    System.out.println("添加成功");
                    if (inum != null) {
                        puArrivalVouchsMapper.updateYanShou(puArrivalVouchs.getAutoid().toString(), ysjlX.getShl().longValue(), ysjlX.getHegshl().longValue(), ysjlX.getBuhgshl().longValue(), ysjlX.getShl().longValue(), NumberUtil.div(ysjlX.getShl(), div, 4).longValue());

                    } else {
                        puArrivalVouchsMapper.updateYanShou(puArrivalVouchs.getAutoid().toString(), ysjlX.getShl().longValue(), ysjlX.getHegshl().longValue(), ysjlX.getBuhgshl().longValue(), ysjlX.getShl().longValue(), null);
                    }

                    uaIdentityMapper.iChildIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
                }
            }


        }


    }



    /*public void add() {

        PuArrivalVouch cs001 = puArrivalVouchMapper.getDaoHuoByCode("csdh0002");

        List<PuArrivalVouchs> daohuoFByID = puArrivalVouchsMapper.getDaohuoFByID(String.valueOf(cs001.getId()));


        String coding = voucherHistoryMapper.getCoding("001");
        int i = Integer.parseInt(coding) + 1;
        String str = String.format("%010d", i);

        UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
        int id = uaIdentity.getIfatherid();
        int forecastid = id + 1000000001;


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date currentDate2 = new Date(calendar.getTimeInMillis());


        GspVouchQC gspVouchQC = new GspVouchQC();
        //id
        gspVouchQC.setId(forecastid);
        //code
        gspVouchQC.setQcid(str);
        //到货单ID
        gspVouchQC.setIcode(cs001.getId());
        //到货单code
        gspVouchQC.setCcode(cs001.getCcode());

        gspVouchQC.setCverifier("demo");

        gspVouchQC.setDverifydate(currentDate2);
        gspVouchQC.setDverifysystime(new Date());
        //日期

        gspVouchQC.setDarvdate(currentDate2);
        gspVouchQC.setDdate(currentDate2);
        //创建人
        gspVouchQC.setCmaker("demo");
        //单据类型 001 验收单 002 拒收单
        gspVouchQC.setCvouchtype("001");

        gspVouchQC.setIvtid(221);
        gspVouchQC.setBrefer("1");
        gspVouchQC.setIverifystate(0);
        gspVouchQC.setIreturncount(0);
        gspVouchQC.setIverifystatenew(0);
        gspVouchQC.setIswfcontrolled(0);
        gspVouchQC.setCmodifier("demo");
        gspVouchQC.setDcreatesystime(new Date());
        // ||GS01| + 订单号;
        gspVouchQC.setCbsysbarcode("||GS01|" + str);

        boolean save = iGspVouchQCService.save(gspVouchQC);
        if (save) {
            System.out.println("添加成功");
            uaIdentityMapper.iFatherIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
            voucherHistoryMapper.codingAdd("001");

        }


        for (PuArrivalVouchs puArrivalVouchs : daohuoFByID) {
            UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
            int ids = uaIdentity1.getIchildid();
            int ichildid = ids + 1000000001;


            GspVouchsQC gspVouchsQC = new GspVouchsQC();
            //id
            gspVouchsQC.setAutoid(ichildid);

            BigDecimal iquantity = puArrivalVouchs.getIquantity();

            BigDecimal inum = puArrivalVouchs.getInum();
            BigDecimal div = null;
            if (inum != null) {
                div = NumberUtil.div(iquantity, inum, 2);
            }
            //换算比例

            //二级单位
            String cunitid = puArrivalVouchs.getCunitid();


            gspVouchsQC.setId(forecastid);
            //存货编码
            gspVouchsQC.setCinvcode(puArrivalVouchs.getCinvcode());
            //总数
            gspVouchsQC.setFarvquantity(iquantity);
            //验收数量    总数-拒收
            gspVouchsQC.setFquantity(iquantity);
            //合格数量
            gspVouchsQC.setFelgquantity(new BigDecimal("2000"));
            //不合格数量
            gspVouchsQC.setFnelgquantity(new BigDecimal("0"));
            //拒收数量
            gspVouchsQC.setFrefusequantity(new BigDecimal("0"));

            if (inum != null) {
                //辅计量单位 验收数量    总数-拒收
                gspVouchsQC.setFquantitys(inum);
                //辅计量单位 总数
                gspVouchsQC.setFarvquantitys(inum);
                //辅计量单位 合格数量
                gspVouchsQC.setFelgquantitys(NumberUtil.div(new BigDecimal("2000"), div, 4));
                //辅计量单位 不合格数量
                gspVouchsQC.setFnelgquantitys(NumberUtil.div(new BigDecimal("0"), div, 4));
                //辅计量单位 拒收数量
                gspVouchsQC.setFrefusenum(NumberUtil.div(new BigDecimal("0"), div, 4));
            }


            //供应商
            gspVouchsQC.setCvencode(cs001.getCvencode());

            gspVouchsQC.setBspecial(0);
            gspVouchsQC.setBname(0);
            gspVouchsQC.setBspec(0);
            gspVouchsQC.setBproc(0);
            gspVouchsQC.setBfinish(0);
            gspVouchsQC.setBflag(0);
            gspVouchsQC.setBcheck(0);
            gspVouchsQC.setBmakescrap(0);
            gspVouchsQC.setBmakepurin(0);
            gspVouchsQC.setBmakesaleout(0);

            gspVouchsQC.setCmassunit(2);
            gspVouchsQC.setBmakescrapin(0);
            gspVouchsQC.setBgift(0);

            gspVouchsQC.setCbsysbarcode("||GS01|" + str + "|" + "1");


            //生产日期
            gspVouchsQC.setDprodate(new Date());
            //到期日期
            gspVouchsQC.setDvaldate(new Date());

            gspVouchsQC.setDdateT(new Date());

            //有效期
            gspVouchsQC.setImassdate(puArrivalVouchs.getImassdate());
            //批号
            gspVouchsQC.setCbatch(puArrivalVouchs.getCbatch());
            //到货单行ID
            gspVouchsQC.setIcodeT(puArrivalVouchs.getAutoid());
            //订单编号
            gspVouchsQC.setCordercode(cs001.getCpocode());
            //单位ID
            gspVouchsQC.setCunitid(cunitid);

            gspVouchsQC.setCchecker1("曹政");

            gspVouchsQC.setCchecker2("曹政");

            iGspVouchsQCService.save(gspVouchsQC);

            if (save) {
                System.out.println("添加成功");
                if (inum != null) {

                } else {
                    puArrivalVouchsMapper.updateYanShou(puArrivalVouchs.getAutoid().toString(), 2000L, 2000L, 0L, 2000L, null);
                }

                uaIdentityMapper.iChildIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
            }
        }


        for (PuArrivalVouchs puArrivalVouchs : daohuoFByID) {
            UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
            int ids = uaIdentity1.getIchildid();
            int ichildid = ids + 1000000001;


            GspVouchsQC gspVouchsQC = new GspVouchsQC();
            //id
            gspVouchsQC.setAutoid(ichildid);

            BigDecimal iquantity = puArrivalVouchs.getIquantity();

            BigDecimal inum = puArrivalVouchs.getInum();
            BigDecimal div = null;
            if (inum != null) {
                div = NumberUtil.div(iquantity, inum, 2);
            }
            //换算比例

            //二级单位
            String cunitid = puArrivalVouchs.getCunitid();


            gspVouchsQC.setId(forecastid);
            //存货编码
            gspVouchsQC.setCinvcode(puArrivalVouchs.getCinvcode());
            //总数
            gspVouchsQC.setFarvquantity(iquantity);
            //验收数量    总数-拒收
            gspVouchsQC.setFquantity(iquantity);
            //合格数量
            gspVouchsQC.setFelgquantity(new BigDecimal("2000"));
            //不合格数量
            gspVouchsQC.setFnelgquantity(new BigDecimal("0"));
            //拒收数量
            gspVouchsQC.setFrefusequantity(new BigDecimal("0"));

            if (inum != null) {
                //辅计量单位 验收数量    总数-拒收
                gspVouchsQC.setFquantitys(inum);
                //辅计量单位 总数
                gspVouchsQC.setFarvquantitys(inum);
                //辅计量单位 合格数量
                gspVouchsQC.setFelgquantitys(NumberUtil.div(new BigDecimal("2000"), div, 4));
                //辅计量单位 不合格数量
                gspVouchsQC.setFnelgquantitys(NumberUtil.div(new BigDecimal("0"), div, 4));
                //辅计量单位 拒收数量
                gspVouchsQC.setFrefusenum(NumberUtil.div(new BigDecimal("0"), div, 4));
            }


            //供应商
            gspVouchsQC.setCvencode(cs001.getCvencode());

            gspVouchsQC.setBspecial(0);
            gspVouchsQC.setBname(0);
            gspVouchsQC.setBspec(0);
            gspVouchsQC.setBproc(0);
            gspVouchsQC.setBfinish(0);
            gspVouchsQC.setBflag(0);
            gspVouchsQC.setBcheck(0);
            gspVouchsQC.setBmakescrap(0);
            gspVouchsQC.setBmakepurin(0);
            gspVouchsQC.setBmakesaleout(0);

            gspVouchsQC.setCmassunit(2);
            gspVouchsQC.setBmakescrapin(0);
            gspVouchsQC.setBgift(0);

            gspVouchsQC.setCbsysbarcode("||GS01|" + str + "|" + "1");


            //生产日期
            gspVouchsQC.setDprodate(new Date());
            //到期日期
            gspVouchsQC.setDvaldate(new Date());

            gspVouchsQC.setDdateT(new Date());

            //有效期
            gspVouchsQC.setImassdate(puArrivalVouchs.getImassdate());
            //批号
            gspVouchsQC.setCbatch(puArrivalVouchs.getCbatch());
            //到货单行ID
            gspVouchsQC.setIcodeT(puArrivalVouchs.getAutoid());
            //订单编号
            gspVouchsQC.setCordercode(cs001.getCpocode());
            //单位ID
            gspVouchsQC.setCunitid(cunitid);

            gspVouchsQC.setCchecker1("曹政");

            gspVouchsQC.setCchecker2("曹政");

            iGspVouchsQCService.save(gspVouchsQC);

            if (save) {
                System.out.println("添加成功");
                if (inum != null) {

                } else {
                    puArrivalVouchsMapper.updateYanShou(puArrivalVouchs.getAutoid().toString(), 2000L, 2000L, 0L, 2000L, null);
                }

                uaIdentityMapper.iChildIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
            }
        }


    }*/

}



