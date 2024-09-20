package org.jeecg.modules.xiaoshoutuihuo;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.YsjlXs;
import org.jeecg.modules.link.mapper.YsjlXsMapper;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class YanShouXSTH2 {
    @Autowired
    private YsjlXsMapper ysjlXsMapper;
    @Autowired
    private UaIdentityMapper uaIdentityMapper;
    @Autowired
    private DispatchListMapper dispatchListMapper;
    @Autowired
    private DispatchListsMapper dispatchListsMapper;

    @Autowired
    private IGspVouchQCService iGspVouchQCService;
    @Autowired
    private IGspVouchsQCService iGspVouchsQCService;

    @Test
    public void yanShou() {
        List<String> codeListGroupCodeTui = ysjlXsMapper.getCodeListGroupCodeTui();
        for (String s : codeListGroupCodeTui) {
            List<YsjlXs> listByCode = ysjlXsMapper.getListByCode(s);

            YsjlXs ysjlXs = listByCode.get(0);
            String djbh = ysjlXs.getDjbh();
            String thdid = djbh.substring(0, djbh.length() - 1);
            DispatchList byId = dispatchListMapper.getById(thdid);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            Date currentDate2 = new Date(calendar.getTimeInMillis());

            UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
            int id = uaIdentity.getIfatherid();
            int forecastid = id + 1000000001;
            String ysdjbh = ysjlXs.getYsdjbh();
            GspVouchQC gspVouchQC = new GspVouchQC();
            gspVouchQC.setId(forecastid);
            //单据编号
            gspVouchQC.setQcid(ysdjbh);
            //到货单ID
            gspVouchQC.setIcode(byId.getDlid());
            //到货单code
            gspVouchQC.setCcode(byId.getCdlcode());
            //审核
            gspVouchQC.setCverifier("demo");
            gspVouchQC.setDverifydate(currentDate2);
            gspVouchQC.setDverifysystime(new Date());
            //到货日期
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Date date = sdf.parse(ysjlXs.getDaohrq());
                gspVouchQC.setDarvdate(date);

            } catch (ParseException e) {
                gspVouchQC.setDarvdate(new Date());
                throw new RuntimeException(e);
            }

            //创建人
            gspVouchQC.setCmaker("demo");
            //单据日期
            gspVouchQC.setDdate(currentDate2);

            gspVouchQC.setCdepcode(byId.getCdepcode());
            gspVouchQC.setCvouchtype("004");
            gspVouchQC.setIvtid(224);
            gspVouchQC.setBrefer("1");
            gspVouchQC.setIverifystate(0);
            gspVouchQC.setIreturncount(0);
            gspVouchQC.setIverifystatenew(0);
            gspVouchQC.setIswfcontrolled(0);
            gspVouchQC.setDcreatesystime(new Date());
            gspVouchQC.setCbsysbarcode("||GS04|"+ ysdjbh);

            boolean save = iGspVouchQCService.save(gspVouchQC);

            if (save) {
                System.out.println("添加成功");
                uaIdentityMapper.iFatherIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
                ysjlXsMapper.updateIsTq(ysdjbh);
                //voucherHistoryMapper.codingAdd("001");

            }


            for (YsjlXs ysjlXslist : listByCode) {

                Integer djSn = ysjlXslist.getDjSn();
                djSn = djSn + 1;
                UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchQC").eq("cAcc_Id", 900));
                DispatchLists dispatchLists = dispatchListsMapper.selectByDLIDAndRow(byId.getDlid().toString(), ysjlXslist.getDdDjSn().toString());
                int ids = uaIdentity1.getIchildid();
                int ichildid = ids + 1000000001;

                GspVouchsQC gspVouchsQC = new GspVouchsQC();
                //id
                gspVouchsQC.setAutoid(ichildid);

                gspVouchsQC.setId(forecastid);
                //存货编码
                gspVouchsQC.setCinvcode(ysjlXslist.getSpbh());

                gspVouchsQC.setFquantity(ysjlXslist.getShl());
                gspVouchsQC.setFarvquantity(ysjlXslist.getShl());
                gspVouchsQC.setFelgquantity(ysjlXslist.getShl());
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

                gspVouchsQC.setCconclusion("合格");
                gspVouchsQC.setDdateT(new Date());
                //生产日期
                gspVouchsQC.setDprodate(dispatchLists.getDmdate());
                //到期日期
                gspVouchsQC.setDvaldate(dispatchLists.getDvdate());
                //批号
                gspVouchsQC.setCbatch(dispatchLists.getCbatch());
                //
                gspVouchsQC.setCcuscode(byId.getCcuscode());

                gspVouchsQC.setIcodeT(dispatchLists.getIdlsid());
                //存货
                gspVouchsQC.setCunitid(dispatchLists.getCunitid());

                gspVouchsQC.setCwhcode(U8LinkConstant.U8_LINK_CWHCODE);

                gspVouchsQC.setCchecker1(ysjlXslist.getYanshr());

                gspVouchsQC.setBmakescrapin(0);

                BigDecimal iinvexchrate = dispatchLists.getIinvexchrate();
                gspVouchsQC.setFquantitys(NumberUtil.div(ysjlXslist.getShl(),iinvexchrate,2));
                gspVouchsQC.setFarvquantitys(NumberUtil.div(ysjlXslist.getShl(),iinvexchrate,2));
                gspVouchsQC.setFelgquantitys(NumberUtil.div(ysjlXslist.getShl(),iinvexchrate,2));

                gspVouchsQC.setCbsysbarcode("||GS04|"+ysdjbh+"|"+ djSn);

                boolean save1 = iGspVouchsQCService.save(gspVouchsQC);

                if (save1) {
                    System.out.println("添加成功");
                    uaIdentityMapper.iChildIdAdd("GSP_VouchQC", U8LinkConstant.U8_LINK_CACC_ID);
                }



            }

        }
    }
}
