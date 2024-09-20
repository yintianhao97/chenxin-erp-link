package org.jeecg.modules.job;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.mapper.FhjlXsMapper;
import org.jeecg.modules.link.mapper.SjjlXsMapper;
import org.jeecg.modules.link.mapper.YsjlXsMapper;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class XiaoShouFaHuoJob {
    @Autowired
    private IDispatchListService dispatchListService;
    @Autowired
    private IDispatchListsService dispatchListsService;
    @Autowired
    private ICJKDJCKJHDERPService icjkdjckjhderpService;
    @Autowired
    private ICJKDJCKJHDMXERPService icjkdjckjhdmxerpService;
    @Autowired
    private IDispatchListLinkService dispatchListLinkService;
    @Autowired
    private IPersonService iPersonService;
    @Autowired
    private FhjlXsMapper fhjlXsMapper;
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
    private GspVouchNoteMapper gspVouchNoteMapper;
    @Autowired
    private GspVouchsNoteMapper gspVouchsNoteMapper;
    @Autowired
    private DispatchListMapper dispatchListMapper;
    @Autowired
    private DispatchListsMapper dispatchListsMapper;
    @Autowired
    private Rdrecords32Mapper rdrecords32Mapper;
    @Autowired
    private Rdrecord32Mapper rdrecord32Mapper;




    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;

    @Autowired
    private YsjlXsMapper ysjlXsMapper;

    @Autowired
    private SjjlXsMapper sjjlXsMapper;
    @Autowired
    private GspVouchsQCMapper gspVouchsQCMapper;
    @Autowired
    private GspVouchQCMapper gspVouchQCMapper;

    @Scheduled(cron = "0 5,15,25,35,45,55 * * * ? ")
    public void XiaoShouFaHuoJobRun() {
        log.info("==========销售发货job开始==========");
        this.xiaoShouChuKu();
        this.fuHeShenHe();
        log.info("==========销售发货job结束==========");

        log.info("==========销售退货job开始==========");
        this.xiaoShouTuiHuo();
        this.yanShou();
        this.RedxiaoShouChuKu();
        log.info("==========销售退货job结束==========");
    }


    public void xiaoShouChuKu() {

        List<DispatchList> dispatchLists =
                dispatchListService.selectNoSynFa();
        for (DispatchList dispatchList : dispatchLists) {
            //主表
            CJKDJCKJHDERP cjkdjckjhderp = new CJKDJCKJHDERP();
            //ID 1
            cjkdjckjhderp.setId(Long.valueOf(dispatchList.getDlid()));
            cjkdjckjhderp.setSjsbz("0");
            //接口ID
            cjkdjckjhderp.setSjkid(dispatchList.getDlid().toString());
            //单位ID 1 TODO: 客户么
            cjkdjckjhderp.setSwldwid(dispatchList.getCcuscode());
            //出库类型2采购出库 1
            cjkdjckjhderp.setNcklx(2L);
            //提货方式0未定义 1
            cjkdjckjhderp.setNthfs(0L);
            //备注 1
            cjkdjckjhderp.setSbz(dispatchList.getCmaker());

            cjkdjckjhderp.setNjsbj(0);


            //业务员 1
            String cpersoncode = dispatchList.getCpersoncode();
            if (cpersoncode != null){
                String codeByName = iPersonService.getCodeByName(cpersoncode);
                cjkdjckjhderp.setSywymc(codeByName);
            }else {
                cjkdjckjhderp.setSywymc("");
            }


            Date date1 = new Date();
            LocalDate localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Date from = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());


            //日期
            cjkdjckjhderp.setDzdrq(from);

            cjkdjckjhderp.setSysr("");

            cjkdjckjhderp.setDysrq(new Date());
            // 定义日期格式
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

            // 将Date对象转换为格式化的字符串
            String formattedDate = dateFormat.format(new Date());
            //时间
            cjkdjckjhderp.setSsjc(formattedDate);
            cjkdjckjhderp.setNchzt(0);
            //制单人 1
            cjkdjckjhderp.setSzdr(dispatchList.getCmaker());
            // 1
            cjkdjckjhderp.setNck(1);
            //部门名称 1
            cjkdjckjhderp.setSbm(dispatchList.getCdepcode());
            //货主ID 1
            cjkdjckjhderp.setShzid("HXS");


            //货主公司ID 1
            cjkdjckjhderp.setShzgsid("HXS");

            boolean save = icjkdjckjhderpService.save(cjkdjckjhderp);

            if (save) {
                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(String.valueOf(dispatchList.getDlid()));
            for (DispatchLists lists : dispatchLists1) {
                CJKDJCKJHDMXERP cjkdjckjhdmxerp = new CJKDJCKJHDMXERP();
                //ID 1
                cjkdjckjhdmxerp.setId(Long.valueOf(lists.getAutoid()));
                //行号 1
                cjkdjckjhdmxerp.setNhh(lists.getIrowno().longValue());
                //单据code 1
                cjkdjckjhdmxerp.setSjkid(dispatchList.getDlid().toString());
                //存货编码 1
                cjkdjckjhdmxerp.setSjkspid(lists.getCinvcode());
                //
                cjkdjckjhdmxerp.setNckdid(0L);
                cjkdjckjhdmxerp.setNspid(0L);
                BigDecimal iquantity = lists.getIquantity();

                //装件数  1
                cjkdjckjhdmxerp.setNjlgg(iquantity.longValue());
                //订单数量 1
                cjkdjckjhdmxerp.setN4jhsl(iquantity);
                //订单数量 1
                cjkdjckjhdmxerp.setN4sjsl(new BigDecimal(0));
                //
                cjkdjckjhdmxerp.setN4lsslCh(new BigDecimal(0));
                //含税价 1
                cjkdjckjhdmxerp.setN4dj(new BigDecimal(lists.getIsum().toString()));
                //批号 1
                cjkdjckjhdmxerp.setSph(lists.getCbatch());
//                cjkdjckjhdmxerp.setSph("lists.getCbatch()");
                // cjkdjckjhdmxerp.setSmjph("");

                //生产日期 1
                cjkdjckjhdmxerp.setDscrq(lists.getDmdate());
                //有效日期 1
                cjkdjckjhdmxerp.setDyxqz(lists.getDvdate());




                //erp 行号 1
                cjkdjckjhdmxerp.setNyhh(Long.valueOf(lists.getIrowno()));
                //时间 1
                cjkdjckjhdmxerp.setSsjc(formattedDate);
                //货主id 1
                cjkdjckjhdmxerp.setShzid("HXS");
                //备注
                //cjkdjckjhdmxerp.setSbz(puArrivalVouchs.getCmemo());
                //货主公司ID
                //cjkdjckjhdmxerp.setShzgsid("HXS");
                //cjkdjckjhdmxerp.setDgxsj(new Date());
                //仓库ID
                //cjkdjckjhdmxerp.setSgsid(lists.getCwhcode());
                System.out.println(cjkdjckjhdmxerp);
                System.out.println(icjkdjckjhdmxerpService.save(cjkdjckjhdmxerp));
            }


        }

    }


    public void fuHeShenHe(){

        List<String> ids = fhjlXsMapper.SelectXiaoShouFaHuo();
        for (String nckdidString : ids) {
            List<FhjlXs> fhjlXs = fhjlXsMapper.selectByNckdid(nckdidString);
            FhjlXs fhjlX = fhjlXs.get(0);

            //获取ID
            UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchNote").eq("cAcc_Id", 900));
            int id = uaIdentity.getIfatherid();
            int forecastid = id + 1000000001;

            //发货单号
            DispatchList byCode = dispatchListMapper.getById(fhjlX.getSjkid());

            int i1 = gspVouchNoteMapper.addVouchNote(String.valueOf(forecastid), fhjlX.getNckdid().toString(), "demo", null,new Date());
            if (i1 >0){

                System.out.println("添加成功");
                fhjlXsMapper.updateIsTQ(nckdidString);
                uaIdentityMapper.iFatherIdAdd("GSP_VouchNote", U8LinkConstant.U8_LINK_CACC_ID);
            }

            //发货单code
            String cdlcode = byCode.getCdlcode();
            //根据发货单查询 出库单
            List<Rdrecords32> byCbdlcode = rdrecords32Mapper.getByCbdlcode(cdlcode);
            String string = byCbdlcode.get(0).getId().toString();
            Rdrecord32 rdrecord32 = rdrecord32Mapper.getById(string);
            for (Rdrecords32 rdrecords32 : byCbdlcode) {

                GspVouchsNote gspVouchsNote = new GspVouchsNote();

                UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchNote").eq("cAcc_Id", 900));
                int ichildid = uaIdentity1.getIchildid();
                ichildid = ichildid + 1000000001;


                gspVouchsNote.setId(forecastid);
                gspVouchsNote.setAutoid(ichildid);
                //存货编码
                gspVouchsNote.setCinvcode(rdrecords32.getCinvcode());
                //批号
                gspVouchsNote.setCbatch(rdrecords32.getCbatch());
                //数量
                gspVouchsNote.setFquantity(rdrecords32.getIquantity());
                //当前日期 没有时间
                Calendar calendar = Calendar.getInstance();
                Date currentDate2 = calendar.getTime();
                //生产日期
                gspVouchsNote.setDprodate(rdrecords32.getDmadedate());
                //有效期
                gspVouchsNote.setDvaldate(rdrecords32.getDvdate());
                //发货单ID //TODO:这里没错就说这样的
                gspVouchsNote.setCwhcode(cdlcode);

                gspVouchsNote.setBflag(0);

                //出库行ID
                gspVouchsNote.setIcodeT(rdrecords32.getAutoid());
                //单位code
                // gspVouchsNote.setCcuscode(rdrecords32);
                //存货单位
                gspVouchsNote.setCunitid(rdrecords32.getCassunit());
                //辅助单位数量
                gspVouchsNote.setFquantitys(rdrecords32.getInum());
                //仓库code
                gspVouchsNote.setCwhcodes(U8LinkConstant.U8_LINK_CWHCODE);
                //保质期
                gspVouchsNote.setImassdate(rdrecords32.getImassdate());
                //保质期单位
                gspVouchsNote.setCmassunit(rdrecords32.getCmassunit());
                //出库主编号
                gspVouchsNote.setIcode(rdrecord32.getId());
                //出库单号
                gspVouchsNote.setCcode(rdrecord32.getCcode());
                //制单人
                gspVouchsNote.setCshipper("demo");
                //
                gspVouchsNote.setBzdyh(0);
                //验收人
                gspVouchsNote.setCchecker1(fhjlX.getSwfhymc());

                int insert = gspVouchsNoteMapper.insert(gspVouchsNote);
                if (insert > 0){

                    System.out.println("添加成功");
                    uaIdentityMapper.iChildIdAdd("GSP_VouchNote", U8LinkConstant.U8_LINK_CACC_ID);
                }

            }
            shenhe(string);



        }


    }


    public void shenhe(String id){


        String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/ReViewChuKu?id="+id.toString();
        String vouchCode = null;

        try {
            URL url = new URL(targetUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                //wr.writeBytes(jsonBody);
                wr.flush();
            }

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // 打印结果
            System.out.println(response.toString());
            //JSONObject jsonObject = JSONObject.parseObject(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

//===================================


    public void xiaoShouTuiHuo() {
        List<DispatchList> dispatchLists = dispatchListService.selectNoSynTui();

        for (DispatchList dispatchList : dispatchLists) {


            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            //单据编号 1 1000000024
            cjkwmsrkhz.setDjbh(dispatchList.getDlid().toString()+"T");
            //cjkwmsrkhz.setDjbh("1000000026"+"T");
            //单据类型，1入库，2销售退回 1
            cjkwmsrkhz.setDjlx("2");
            ///日期
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
            // 将Date对象转换为格式化的字符串
            String formattedDate = dateFormat.format(new Date());
            String formattedDateTime = dateFormatTime.format(new Date());
            ///日期 1
            cjkwmsrkhz.setRq(formattedDate);
            //1
            cjkwmsrkhz.setIsZx("否");
            //时间 1
            cjkwmsrkhz.setOntime(formattedDateTime);
            //操作员 1
            cjkwmsrkhz.setUsername(dispatchList.getCmaker());
            //业务员 1
            String cpersoncode = dispatchList.getCpersoncode();

            if (cpersoncode != null){
                String codeByName = iPersonService.getCodeByName(cpersoncode);
                cjkwmsrkhz.setYwy(codeByName);
            }else {
                cjkwmsrkhz.setYwy("");
            }

            //单位内码 1  TODO:这个是供货商CODE
            cjkwmsrkhz.setDwbh(dispatchList.getCcuscode());
            ///货主id? 产成品入库哪里来的供货商 1
            cjkwmsrkhz.setShzid("HXS");
            cjkwmsrkhz.setShzgsid("HXS");
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);

            if (save) {

                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(dispatchList.getDlid().toString());


            for (DispatchLists lists : dispatchLists1) {

                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号 1  1000000024T
                cjkwmsrkmx.setDjbh(dispatchList.getDlid().toString()+"T");
                //cjkwmsrkmx.setDjbh("1000000026"+"T");
                //行号 1
                cjkwmsrkmx.setDjSn(lists.getIrowno());
                //批号
                cjkwmsrkmx.setPihao(lists.getCbatch());
                //商品编码 1
                cjkwmsrkmx.setSpid(lists.getCinvcode());
                //数量 1
                BigDecimal iquantity = lists.getIquantity();
                BigDecimal mul = NumberUtil.mul(iquantity.toString(), "-1");
                cjkwmsrkmx.setJkjkjk(mul);
                //单价 1
                cjkwmsrkmx.setDj(lists.getIunitprice());
                //含税价 1

                cjkwmsrkmx.setHshj(lists.getItaxunitprice());

                //生产日期

                //金额 1
                String imoney = lists.getImoney().toString();
                BigDecimal mul1 = NumberUtil.mul(imoney, "-1");
                cjkwmsrkmx.setJe(mul1);
                //含税金额 1
                String isum = lists.getIsum().toString();
                BigDecimal mul2 = NumberUtil.mul(isum, "-1");
                cjkwmsrkmx.setHsje(mul2);
                // 定义日期格式
                SimpleDateFormat dateFormat111 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");
                // 将Date对象转换为格式化的字符串
                String formattedDate111 = dateFormat123.format(new Date());

                cjkwmsrkmx.setBaozhiqi(dateFormat123.format(lists.getDmdate()));

                cjkwmsrkmx.setSxrq(dateFormat123.format(lists.getDvdate()));

                //货主id 1
                cjkwmsrkmx.setShzid("HXS");

                System.out.println(cjkwmsrkmx);
                System.out.println(icjkwmsrkmxService.save(cjkwmsrkmx));

            }


        }


    }


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


    public void RedxiaoShouChuKu(){

        List<SjjlXs> sjjlXs = sjjlXsMapper.selectTui();
        for (SjjlXs sjjlX : sjjlXs) {

            UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "rd").eq("cAcc_Id", 900));
            int id = uaIdentity.getIfatherid();
            int forecastid = id + 1000000001;


            String sxgjkid = sjjlX.getDuiydjbh();
            String thdid = sxgjkid.substring(0, sxgjkid.length() - 1);

            String ysdh = sjjlX.getYsdh();
            //获取验收单表头
            GspVouchQC gspVouchQC = gspVouchQCMapper.selectVouchByCode(ysdh);
            //销售退货单表头
            DispatchList byId = dispatchListMapper.getById(thdid);
            //收货单 单号
            String sdydjbh = sjjlX.getSdydjbh();

            Rdrecord32 rdrecord32 = new Rdrecord32();
            //ID
            rdrecord32.setId(forecastid);
            //code
            rdrecord32.setCcode(sdydjbh);

            rdrecord32.setBrdflag(1);
            rdrecord32.setCvouchtype("32");
            rdrecord32.setCbustype("普通销售");
            rdrecord32.setCsource("退货验收单");



            //退货单号
            rdrecord32.setCbuscode(byId.getCdlcode());
            //仓库
            rdrecord32.setCwhcode(U8LinkConstant.U8_LINK_CWHCODE);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            Date currentDate2 = new Date(calendar.getTimeInMillis());
            rdrecord32.setChandler("demo");
            rdrecord32.setDveridate(currentDate2);
            rdrecord32.setDnverifytime(new Date());

            //日期
            rdrecord32.setDdate(currentDate2);
            //TODO:出库类别 会改
            rdrecord32.setCrdcode("201");

            rdrecord32.setCdepcode(byId.getCdepcode());
            rdrecord32.setCpersoncode(byId.getCpersoncode());
            rdrecord32.setCstcode("01");
            rdrecord32.setCcuscode(byId.getCcuscode());
            rdrecord32.setCdlcode(Integer.parseInt(thdid));
            rdrecord32.setBtransflag(0);
            rdrecord32.setCmaker("demo");
            rdrecord32.setBpufirst(0);
            rdrecord32.setBiafirst(0);
            rdrecord32.setCchkcode(ysdh);
            rdrecord32.setDchkdate(currentDate2);

            rdrecord32.setCchkperson("demo");
            rdrecord32.setVtId(87);
            rdrecord32.setBisstqc(0);
            //不知道是啥
            //rdrecord32.setCdefine15(byId.getCcuscode());
            rdrecord32.setBfrompreyear(0);
            rdrecord32.setBiscomplement(0);
            rdrecord32.setIdiscounttaxtype(0);
            rdrecord32.setIreturncount(0);
            rdrecord32.setIverifystate(0);
            rdrecord32.setIswfcontrolled(0);
            rdrecord32.setDnmaketime(new Date());
            rdrecord32.setBredvouch(0);
            rdrecord32.setCsysbarcode("||st32|"+ sdydjbh);
            rdrecord32.setCinvoicecompany(byId.getCinvoicecompany());
            rdrecord32.setBscanexpress(0);
            rdrecord32.setBuploaded(0);
            int insert = rdrecord32Mapper.insert(rdrecord32);

            if (insert > 0) {
                System.out.println("成功");
                uaIdentityMapper.iFatherIdAdd("rd", U8LinkConstant.U8_LINK_CACC_ID);
                int i = sjjlXsMapper.update1Bysdydjbh(sdydjbh);
            }

            int row = 1;
            List<GspVouchsQC> gspVouchsQCS = gspVouchsQCMapper.selectByTid(gspVouchQC.getId().toString());
            for (GspVouchsQC gspVouchsQC : gspVouchsQCS) {
                Integer dlid = byId.getDlid();
                DispatchLists dispatchLists = dispatchListsMapper.selectByDLIDAndRow(dlid.toString(), sjjlX.getDjSn().toString());

                UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "rd").eq("cAcc_Id", 900));
                int ids = uaIdentity1.getIchildid();
                int ichildid = ids + 1000000001;

                Rdrecords32 rdrecords32 = new Rdrecords32();
                rdrecords32.setAutoid(ichildid);
                rdrecords32.setId(forecastid);
                rdrecords32.setCinvcode(gspVouchsQC.getCinvcode());
                BigDecimal felgquantity = gspVouchsQC.getFelgquantity();
                BigDecimal felgquantitys = gspVouchsQC.getFelgquantitys();
                rdrecords32.setInum(NumberUtil.mul(felgquantitys.toString(),"-1"));
                rdrecords32.setIquantity(NumberUtil.mul(felgquantity.toString(),"-1"));

                rdrecords32.setCbatch(gspVouchsQC.getCbatch());
                rdrecords32.setIflag(0);
                rdrecords32.setDvdate(gspVouchsQC.getDvdate());
                rdrecords32.setIdlsid(gspVouchsQC.getIcodeT());
                rdrecords32.setCassunit(gspVouchsQC.getCunitid());
                rdrecords32.setDmadedate(gspVouchsQC.getDprodate());
                rdrecords32.setIcheckids(gspVouchsQC.getAutoid());
                rdrecords32.setBlpusefree(0);
                rdrecords32.setIrsrowno(0);
                rdrecords32.setIoritrackid(0);
                rdrecords32.setBcosting(1);
                rdrecords32.setBvmiused(0);
                rdrecords32.setIinvexchrate(NumberUtil.div(felgquantity,felgquantitys,2));
                rdrecords32.setIexpiratdatecalcu(0);
                rdrecords32.setIrowno(row);
                rdrecords32.setCbsysbarcode("||st32|"+ sdydjbh +"|"+row);
                row++;
                rdrecords32.setBiacreatebill(1);
                rdrecords32.setBneedbill(1);

                int insert1 = rdrecords32Mapper.insert(rdrecords32);
                if (insert1 > 0) {
                    rdrecords32Mapper.updateDispatchLists(dispatchLists.getAutoid().toString(), felgquantity, felgquantitys);
                    rdrecords32Mapper.updateGspVouchsQC(gspVouchsQC.getAutoid().toString(), felgquantity, felgquantitys);
                    rdrecords32Mapper.updateCurrentStock(felgquantity,gspVouchsQC.getCinvcode(), gspVouchsQC.getCbatch());
                    System.out.println("成功");
                    uaIdentityMapper.iChildIdAdd("rd", U8LinkConstant.U8_LINK_CACC_ID);
                }

            }


        }




    }
}
