package org.jeecg.modules.job;

import cn.hutool.core.util.NumberUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.mapper.FhjlXsMapper;
import org.jeecg.modules.link.mapper.SjjlXsMapper;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.link.vo.AddPuStoreInVo;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class CaiGouDingDanJob {
    @Autowired
    private IPoPodetailsService iPoPodetailsService;
    @Autowired
    private IPoPomainService iPoPomainService;
    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;
    @Autowired
    private IPoPomainLinkService poPomainLinkService;
    @Autowired
    private IShjlXsService iShjlXsService;
    @Autowired
    private PoPodetailsMapper poPodetailsMapper;
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
    @Autowired
    private SjjlXsMapper sjjlXsMapper;
    @Autowired
    private IGspVouchsQCService gspVouchsQCService;


    @Autowired
    private IPuArrivalVouchService iPuArrivalVouchService;
    @Autowired
    private IPuArrivalVouchsService iPuArrivalVouchsService;
    @Autowired
    private ICJKDJCKJHDERPService icjkdjckjhderpService;
    @Autowired
    private ICJKDJCKJHDMXERPService icjkdjckjhdmxerpService;
    @Autowired
    private ITuiHuoLinkService iTuiHuoLinkService;
    @Autowired
    private IPersonService iPersonService;
    @Autowired
    private GspVouchQCMapper gspVouchQCMapper;
    @Autowired
    private GspVouchsQCMapper gspVouchsQCMapper;


    @Autowired
    private Gsp_VouchsUnsalableMapper gspVouchsUnsalableMapper;
    @Autowired
    private Gsp_VouchUnsalableMapper gspVouchUnsalableMapper;
    @Autowired
    private RdRecord01Mapper rdRecord01Mapper;
    @Autowired
    private RdRecords01Mapper rdRecords01Mapper;
    @Autowired
    private VoucherHistoryMapper voucherHistoryMapper;

    @Autowired
    private FhjlXsMapper fhjlXsMapper;


    @Scheduled(cron = "0 0,10,20,30,40,50 * * * ? ")
    public void CaiGouDingDanJobRun() {
        log.info("==========采购到货job开始==========");
        this.caiGouDingDan();
        this.daoHuo();
        this.yanShou();
        this.ruKuV2();
        log.info("==========采购到货job结束==========");

        log.info("==========采购退货job开始==========");
        this.caiGouTuiHuo();
        this.yanShouShenHe();
        log.info("==========采购退货job结束==========");

    }

    /**
     * 采购订单更新 1
     */
    public void caiGouDingDan() {
        //log.info("Rdrecord10Job定时任务开始执行");
        List<PoPomain> poPomains = iPoPomainService.selectNoSyn();
        log.info("采购订单数量:{}", poPomains.size());
        for (PoPomain poPomain : poPomains) {
            log.info("采购订单:{}", poPomain);
            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            //单据编号 1
            cjkwmsrkhz.setDjbh(poPomain.getPoid().toString());


            //单据类型，1入库，2销售退回 1
            cjkwmsrkhz.setDjlx("1");
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
            cjkwmsrkhz.setUsername(poPomain.getCmaker());
            //业务员 1
            cjkwmsrkhz.setYwy(poPomain.getCmaker());
            //单位内码 1
            cjkwmsrkhz.setDwbh(poPomain.getCvencode());
            ///货主id? 产成品入库哪里来的供货商 1
            cjkwmsrkhz.setShzid("HXS");
            cjkwmsrkhz.setShzgsid("HXS");
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);

            if (save) {
                poPomainLinkService.save(new PoPomainLink().setErpid(poPomain.getPoid().toString()));
            }

            List<PoPodetails> poPodetails = iPoPodetailsService.selectById(poPomain.getPoid());
            for (PoPodetails poPodetail : poPodetails) {

                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号 1
                cjkwmsrkmx.setDjbh(poPomain.getPoid().toString());
                //行号 1
                cjkwmsrkmx.setDjSn(poPodetail.getIvouchrowno());
                //商品编码 1
                cjkwmsrkmx.setSpid(poPodetail.getCinvcode());
                //数量 1
                cjkwmsrkmx.setJkjkjk(poPodetail.getIquantity());
                //单价 1
                cjkwmsrkmx.setDj(poPodetail.getIunitprice());
                //含税价 1
                cjkwmsrkmx.setHshj(poPodetail.getItaxprice());
                //金额 1
                cjkwmsrkmx.setJe(new BigDecimal(poPodetail.getImoney().toString()));
                //含税金额 1
                cjkwmsrkmx.setHsje(new BigDecimal(poPodetail.getIsum().toString()));
                // 定义日期格式
                SimpleDateFormat dateFormat111 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");
                // 将Date对象转换为格式化的字符串
                String formattedDate111 = dateFormat123.format(new Date());
                //货主id 1
                cjkwmsrkmx.setShzid("HXS");
                //System.out.println(cjkwmsrkmx);
                log.info("采购订单传递实体类:{}", cjkwmsrkmx);
                boolean save1 = icjkwmsrkmxService.save(cjkwmsrkmx);
                log.info("保存结果:{}", save1);

            }


        }

    }
    /**
     * 采购到货 2
     */
    public void daoHuo(){
        //先查询所有单据
        List<String> codeListGroupCode = iShjlXsService.getCodeListGroupCode();
        for (String s : codeListGroupCode) {
            //获取单号
            List<ShjlXs> listByCode = iShjlXsService.getListByCode(s);
            //json 构建
            List<ShjlXs> shjlXs = new ArrayList<>();
            for (ShjlXs shjlX : listByCode) {
                PoPodetails byCodeRow = poPodetailsMapper.getByPoidRow(shjlX.getDjbh(), shjlX.getDdDjSn().toString());
                BigDecimal div = NumberUtil.div(byCodeRow.getIquantity(), byCodeRow.getInum(), 2);
                BigDecimal shl = shjlX.getShl();
                BigDecimal div1 = NumberUtil.div(shl, div, 2);
                //Person byName = personMapper.getByName(shjlX.getYwy());
                //shjlX.setYwy(byName.getCpersoncode());
                shjlX.setJs(div1.toString());
                shjlXs.add(shjlX);

            }
            String json = JSON.toJSONString(shjlXs);
            System.out.println(json);

            String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/AddDaoHuo";
            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .readTimeout(180, TimeUnit.SECONDS)
                    .build();
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), json);


            Request request  = new Request.Builder()
                    .url(targetUrl)
                    .post(requestBody)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                } else {
                    // 打印响应体
                    String string1 = response.body().string();
                    System.out.println(string1);
                    JSONObject jsonObject = JSONObject.parseObject(string1);
                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {
                        iShjlXsService.updateIsTqInt(s);
                    }
                }
            }  catch (IOException e) {
                throw new RuntimeException(e);
            }

        }



    }
    /**
     * 采购验收3
     */
    public void yanShou() {

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
    /**
     * 采购入库4
     */
    public void ruKuV2() {
        List<String> ysdhs = sjjlXsMapper.selectChuOrder();
        for (String ysdh : ysdhs) {

            //获取验收单表头信息
            GspVouchQC byCodeCai = iGspVouchQCService.getByCodeCai(ysdh);
            if (byCodeCai == null) {
                log.info("没有找到" + ysdh);
                // System.out.println("没有找到" + ysdh);
                break;
            }
            //获取采购到货单表头信息
            PuArrivalVouch vouchById = puArrivalVouchMapper.getVouchById(byCodeCai.getIcode().toString());
            //获取验收单对应行信息
            List<GspVouchsQC> gspVouchsQCS = gspVouchsQCService.selectByTid(byCodeCai.getId().toString());

            List<AddPuStoreInVo> list = new ArrayList<>();
            for (GspVouchsQC gspVouchsQC : gspVouchsQCS) {
                PuArrivalVouchs daohuoFByAutoID = puArrivalVouchsMapper.getDaohuoFByAutoID(gspVouchsQC.getIcodeT().toString());
                AddPuStoreInVo addPuStoreInVo = new AddPuStoreInVo();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                // 格式化Date对象
                //部门
                addPuStoreInVo.setCDepCode(vouchById.getCdepcode());
                //业务员
                addPuStoreInVo.setCpersoncode(vouchById.getCpersoncode());
                //生产日期
                Date dprodate = gspVouchsQC.getDprodate();
                addPuStoreInVo.setDmadedate(sdf.format(dprodate));
                //失效日期
                Date dvaldate = gspVouchsQC.getDvaldate();
                addPuStoreInVo.setDvdate(sdf.format(dvaldate));
                //存货
                addPuStoreInVo.setCInvCode(gspVouchsQC.getCinvcode());
                //供应商
                addPuStoreInVo.setCVenCode(vouchById.getCvencode());
                //采购到货单号 carvcode
                addPuStoreInVo.setCarvcode(byCodeCai.getCcode());
                //辅助单位
                addPuStoreInVo.setCassunit(gspVouchsQC.getCunitid());
                //批号
                addPuStoreInVo.setCbatch(gspVouchsQC.getCbatch());
                //检验单号
                addPuStoreInVo.setCchkcode(byCodeCai.getQcid());
                //采购订单号
                addPuStoreInVo.setCordercode(vouchById.getCpocode());
                //仓库号
                addPuStoreInVo.setCwhcode(U8LinkConstant.U8_LINK_CWHCODE);
                //数量
                addPuStoreInVo.setIQuantity(gspVouchsQC.getFelgquantity());
                //采购到货单行ID
                addPuStoreInVo.setIarrsid(gspVouchsQC.getIcodeT().toString());
                //验货单行ID
                addPuStoreInVo.setIcheckids(gspVouchsQC.getAutoid().toString());
                //原币含税单价
                addPuStoreInVo.setIoritaxcost(daohuoFByAutoID.getIoritaxcost());
                //订单行id
                addPuStoreInVo.setIposid(daohuoFByAutoID.getIposid().toString());
                //采购到货单ID
                addPuStoreInVo.setIpurarriveid(byCodeCai.getIcode().toString());
                //税率
                addPuStoreInVo.setItaxrate(vouchById.getItaxrate());
                //件数
                addPuStoreInVo.setInum(gspVouchsQC.getFelgquantitys());
                //转换率
                addPuStoreInVo.setIinvexchrate(daohuoFByAutoID.getIinvexchrate());

                list.add(addPuStoreInVo);
            }

            String json = JSON.toJSONString(list);
            System.out.println(json);

            String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/AddCoPuStoreIn";
            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .readTimeout(180, TimeUnit.SECONDS)
                    .build();
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), json);


            Request request  = new Request.Builder()
                    .url(targetUrl)
                    .post(requestBody)
                    .build();

            try (Response response = client.newCall(request)
                    .execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                } else {
                    // 打印响应体
                    String string1 = response.body().string();
                    System.out.println(string1);
                    JSONObject jsonObject = JSONObject.parseObject(string1);
                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {


                        sjjlXsMapper.update1ByYSDH(ysdh);
                    }
                }
            }  catch (IOException  e) {
                throw new RuntimeException(e);
            }



        }
    }



    public void ruKu() {

        List<SjjlXs> sjjlXs = sjjlXsMapper.selectChu();

        for (SjjlXs sjjlX : sjjlXs) {
            //验收单单号
            String ysdh = sjjlX.getYsdh();
            //验收单行号
            String nydjhh = sjjlX.getNydjhh();
            BigDecimal ysdhHH = NumberUtil.add(nydjhh, "1");
            //获取验收单表头信息
            GspVouchQC byCodeCai = iGspVouchQCService.getByCodeCai(ysdh);

            if (byCodeCai == null) {
                log.info("没有找到" + ysdh);
               // System.out.println("没有找到" + ysdh);
                break;
            }
            //获取采购到货单表头信息
            PuArrivalVouch vouchById = puArrivalVouchMapper.getVouchById(byCodeCai.getIcode().toString());
            //获取验收单对应行信息
            List<GspVouchsQC> gspVouchsQCS = gspVouchsQCService.selectByIdAndRow(byCodeCai.getId().toString(), ysdhHH.toString());

            List<AddPuStoreInVo> list = new ArrayList<>();
            for (GspVouchsQC gspVouchsQC : gspVouchsQCS) {
                PuArrivalVouchs daohuoFByAutoID = puArrivalVouchsMapper.getDaohuoFByAutoID(gspVouchsQC.getIcodeT().toString());

                AddPuStoreInVo addPuStoreInVo = new AddPuStoreInVo();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                // 格式化Date对象


                //部门
                addPuStoreInVo.setCDepCode(vouchById.getCdepcode());
                //业务员
                addPuStoreInVo.setCpersoncode(vouchById.getCpersoncode());
                //生产日期
                Date dprodate = gspVouchsQC.getDprodate();
                addPuStoreInVo.setDmadedate(sdf.format(dprodate));
                //失效日期
                Date dvaldate = gspVouchsQC.getDvaldate();
                addPuStoreInVo.setDvdate(sdf.format(dvaldate));
                //存货
                addPuStoreInVo.setCInvCode(sjjlX.getDaohwd());
                //供应商
                addPuStoreInVo.setCVenCode(vouchById.getCvencode());
                //采购到货单号 carvcode
                addPuStoreInVo.setCarvcode(byCodeCai.getCcode());
                //辅助单位
                addPuStoreInVo.setCassunit(gspVouchsQC.getCunitid());
                //批号
                addPuStoreInVo.setCbatch(gspVouchsQC.getCbatch());
                //检验单号
                addPuStoreInVo.setCchkcode(byCodeCai.getQcid());
                //采购订单号
                addPuStoreInVo.setCordercode(vouchById.getCpocode());
                //仓库号
                addPuStoreInVo.setCwhcode(U8LinkConstant.U8_LINK_CWHCODE);
                //数量
                addPuStoreInVo.setIQuantity(gspVouchsQC.getFelgquantity());
                //采购到货单行ID
                addPuStoreInVo.setIarrsid(gspVouchsQC.getIcodeT().toString());
                //验货单行ID
                addPuStoreInVo.setIcheckids(gspVouchsQC.getAutoid().toString());
                //原币含税单价
                addPuStoreInVo.setIoritaxcost(daohuoFByAutoID.getIoritaxcost());
                //订单行id
                addPuStoreInVo.setIposid(daohuoFByAutoID.getIposid().toString());
                //采购到货单ID
                addPuStoreInVo.setIpurarriveid(byCodeCai.getIcode().toString());
                //税率
                addPuStoreInVo.setItaxrate(vouchById.getItaxrate());
                //件数
                addPuStoreInVo.setInum(gspVouchsQC.getFelgquantitys());
                //转换率
                addPuStoreInVo.setIinvexchrate(daohuoFByAutoID.getIinvexchrate());

                list.add(addPuStoreInVo);
            }

            String json = JSON.toJSONString(list);
            System.out.println(json);

            String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/AddCoPuStoreIn";
            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .readTimeout(180, TimeUnit.SECONDS)
                    .build();
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), json);


            Request request  = new Request.Builder()
                    .url(targetUrl)
                    .post(requestBody)
                    .build();

            try (Response response = client.newCall(request)
                    .execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                } else {
                    // 打印响应体
                    String string1 = response.body().string();
                    System.out.println(string1);
                    JSONObject jsonObject = JSONObject.parseObject(string1);
                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {
                        sjjlXsMapper.update1ByYSDH(ysdh);
                    }
                }
            }  catch (IOException  e) {
                throw new RuntimeException(e);
            }



        }





    }



    public void caiGouTuiHuo() {
        List<PuArrivalVouch> tuiHuo = iPuArrivalVouchService.getTuiHuo();
        for (PuArrivalVouch puArrivalVouch : tuiHuo) {
            //主表
            CJKDJCKJHDERP cjkdjckjhderp = new CJKDJCKJHDERP();


            // cjkdjckjhderp.setDgxsj(new Date());
            // cjkdjckjhderp.setSgsid("");
            //线上线下?
            // cjkdjckjhderp.setNdjlx(0);

            //ID 1
            cjkdjckjhderp.setId(Long.valueOf(puArrivalVouch.getId()));

            cjkdjckjhderp.setNjsbj(0);

            cjkdjckjhderp.setSjsbz("0");

            // cjkdjckjhderp.setNckdid(0L);
            //接口ID1000000069
            cjkdjckjhderp.setSjkid(puArrivalVouch.getId().toString());
            // cjkdjckjhderp.setSjkid("1000000070");

            //单位ID 1
            cjkdjckjhderp.setSwldwid(puArrivalVouch.getCvencode());
            //出库类型 2采购出库 1
            cjkdjckjhderp.setNcklx(8L);
            //提货方式 0未定义 1
            cjkdjckjhderp.setNthfs(0L);
            //备注 1
            cjkdjckjhderp.setSbz(puArrivalVouch.getCmaker());

            //业务员 1
            String cpersoncode = puArrivalVouch.getCpersoncode();
            if (cpersoncode != null) {
                String codeByName = iPersonService.getCodeByName(cpersoncode);
                cjkdjckjhderp.setSywymc(codeByName);
            } else {
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
            cjkdjckjhderp.setSzdr(puArrivalVouch.getCmaker());
            //cjkdjckjhderp.setCombrainTimes("");
            // cjkdjckjhderp.setShxbs("");
            // 1
            cjkdjckjhderp.setNck(1);
            //部门名称 1
            cjkdjckjhderp.setSbm(puArrivalVouch.getCdepcode());
            //货主ID 1
            cjkdjckjhderp.setShzid("HXS");
            cjkdjckjhderp.setShzname("");
            //货主公司ID 1
            cjkdjckjhderp.setShzgsid("HXS");
           /* //收货人 1
            cjkdjckjhderp.setShouhr("");
            //收货地址 1
            cjkdjckjhderp.setSzwdz(puArrivalVouch.getCarrivalplace());*/

            //System.out.println(cjkdjckjhderp);

            boolean save = icjkdjckjhderpService.save(cjkdjckjhderp);
            if (save) {
                iTuiHuoLinkService.save(new TuiHuoLink().setErpid(puArrivalVouch.getId().toString()));
            }

            List<PuArrivalVouchs> daohuoFByID = iPuArrivalVouchsService.getDaohuoFByID(puArrivalVouch.getId().toString());
            for (PuArrivalVouchs puArrivalVouchs : daohuoFByID) {
                CJKDJCKJHDMXERP cjkdjckjhdmxerp = new CJKDJCKJHDMXERP();
                //ID 1
                cjkdjckjhdmxerp.setId(Long.valueOf(puArrivalVouchs.getAutoid()));
                //行号 1
                cjkdjckjhdmxerp.setNhh(puArrivalVouchs.getIvouchrowno().longValue());
                //单据code 1
                cjkdjckjhdmxerp.setSjkid(puArrivalVouch.getId().toString());
                //       cjkdjckjhdmxerp.setSjkid("1000000070");

                //存货编码 1
                cjkdjckjhdmxerp.setSjkspid(puArrivalVouchs.getCinvcode());
                //
                cjkdjckjhdmxerp.setNckdid(0L);
                cjkdjckjhdmxerp.setNspid(0L);
                BigDecimal iquantity = puArrivalVouchs.getIquantity();

                //装件数  1
                BigDecimal njlgg = NumberUtil.mul(iquantity.toString(), "-1");
                cjkdjckjhdmxerp.setNjlgg(njlgg.longValue());
                //订单数量 1
                cjkdjckjhdmxerp.setN4jhsl(njlgg);
                //订单数量 1
                cjkdjckjhdmxerp.setN4sjsl(new BigDecimal(0));
                //
                cjkdjckjhdmxerp.setN4lsslCh(new BigDecimal(0));
                //含税价 1
                /*String isum = puArrivalVouchs.getIsum().toString();
                BigDecimal mul = NumberUtil.mul(isum, "-1");*/
                cjkdjckjhdmxerp.setN4dj(puArrivalVouchs.getIoritaxcost());
                //批号 1
                cjkdjckjhdmxerp.setSph(puArrivalVouchs.getCbatch());
//                cjkdjckjhdmxerp.setSph("lists.getCbatch()");
                // cjkdjckjhdmxerp.setSmjph("");

                //生产日期 1
                cjkdjckjhdmxerp.setDscrq(puArrivalVouchs.getDpdate());
                //有效日期 1
                cjkdjckjhdmxerp.setDyxqz(puArrivalVouchs.getDvdate());


                //erp 行号 1
                cjkdjckjhdmxerp.setNyhh(Long.valueOf(puArrivalVouchs.getIvouchrowno()));
                //时间 1
                cjkdjckjhdmxerp.setSsjc(formattedDate);
                //货主id 1
                cjkdjckjhdmxerp.setShzid("HXS");

                //备注
                //cjkdjckjhdmxerp.setSbz(puArrivalVouchs.getCmemo());
                //货主公司ID
/*                cjkdjckjhdmxerp.setShzgsid("HXS");
                cjkdjckjhdmxerp.setDgxsj(new Date());*/
                //仓库ID
                //cjkdjckjhdmxerp.setSgsid(lists.getCwhcode());
                System.out.println(cjkdjckjhdmxerp);
                System.out.println(icjkdjckjhdmxerpService.save(cjkdjckjhdmxerp));
            }


        }

    }


    public void yanShouShenHe() {

        List<String> fhjlXs = fhjlXsMapper.SelectCaiGouTuiHuo();

        for (String fhjlX : fhjlXs) {
            List<FhjlXs> fhjlXs1 = fhjlXsMapper.selectByNckdid(fhjlX);
            FhjlXs fhjlXs2 = fhjlXs1.get(0);

            List<AddPuStoreInVo> icodes = new ArrayList<AddPuStoreInVo>();
            PuArrivalVouch vouchById = puArrivalVouchMapper.getVouchById(fhjlXs2.getSjkid());



            for (FhjlXs xs : fhjlXs1) {
                AddPuStoreInVo addPuStoreInVo = new AddPuStoreInVo();
                PuArrivalVouchs byIdAndRow = puArrivalVouchsMapper.getByIdAndRow(xs.getSjkid(), xs.getNhh().toString());
                //TODO: 就一个仓库写死
                addPuStoreInVo.setCwhcode(U8LinkConstant.U8_LINK_CWHCODE);
                //部门
                addPuStoreInVo.setCDepCode(vouchById.getCdepcode());
                //供应商
                addPuStoreInVo.setCVenCode(vouchById.getCvencode());
                //采购订单号
                addPuStoreInVo.setCordercode(vouchById.getCpocode());
                //到货单号
                addPuStoreInVo.setCarvcode(vouchById.getCcode());
                //采购到货ID
                addPuStoreInVo.setIpurarriveid(vouchById.getId().toString());
                //业务员编码
                addPuStoreInVo.setCpersoncode(vouchById.getCpersoncode());
                //存货
                addPuStoreInVo.setCInvCode(byIdAndRow.getCinvcode());
                //辅助计量单位
                addPuStoreInVo.setCassunit(byIdAndRow.getCunitid());
                //批号
                addPuStoreInVo.setCbatch(byIdAndRow.getCbatch());
                //换算率
                BigDecimal iinvexchrate = byIdAndRow.getIinvexchrate();
                addPuStoreInVo.setIinvexchrate(iinvexchrate);

                //数量
                Integer shl = xs.getShl();
                BigDecimal mul = NumberUtil.mul(shl.toString(), "-1");
                addPuStoreInVo.setIQuantity(mul);
                //件数
                BigDecimal div = NumberUtil.div(mul, iinvexchrate, 4);
                addPuStoreInVo.setInum(div);


                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //失效日期
                Date dvdate = byIdAndRow.getDvdate();
                String dvdateStr = sdf.format(dvdate);
                addPuStoreInVo.setDvdate(dvdateStr);
                //生产日期
                Date dpdate = byIdAndRow.getDpdate();
                String dpdateStr = sdf.format(dpdate);
                addPuStoreInVo.setDmadedate(dpdateStr);

                //采购到货子表
                addPuStoreInVo.setIarrsid(byIdAndRow.getAutoid().toString());
                //到货单号
                addPuStoreInVo.setCbarvcode(vouchById.getCcode());
                //订单子表ID
                addPuStoreInVo.setIposid(byIdAndRow.getIposid().toString());
                //税率
                addPuStoreInVo.setItaxrate(byIdAndRow.getItaxrate());
                //含税单价
                addPuStoreInVo.setIoritaxcost(byIdAndRow.getIoritaxcost());


                icodes.add(addPuStoreInVo);
            }
            String jsonString = JSON.toJSONString(icodes);
            System.out.println(jsonString);


            String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/AddCoPuStoreInTui";
            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .readTimeout(180, TimeUnit.SECONDS)
                    .build();
            RequestBody requestBody = RequestBody.create(MediaType
                    .parse("application/json"), jsonString);


            Request request  = new Request.Builder()
                    .url(targetUrl)
                    .post(requestBody)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                } else {
                    // 打印响应体
                    String string1 = response.body().string();
                    System.out.println(string1);
                    JSONObject jsonObject = JSONObject.parseObject(string1);


                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {
                        fhjlXsMapper.updateIsTQ(fhjlXs2.getNckdid().toString());
                        this.addGSP_VOUCHUNSALABLE(jsonObject.getString("VouchCode"),fhjlXs2.getSwfhymc());
                    }
                }
            }  catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


    public void addGSP_VOUCHUNSALABLE(String id,String shr){





        //String id = "1000000098";
        RdRecord01 rdRecord01 = rdRecord01Mapper.selectTById(id);
        PuArrivalVouch vouchById = puArrivalVouchMapper.getVouchById(rdRecord01.getIpurarriveid().toString());


        //code
        String coding = voucherHistoryMapper.getCoding("091");
        int i = Integer.parseInt(coding)+1;
        String str = String.format("%010d", i);

        UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>()
                .eq("cVouchType", "GSP_VOUCHUNSALABLE").eq("cAcc_Id", 900));
        int autoid = uaIdentity.getIfatherid();
        int forecastid = autoid + 1000000001;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date currentDate2 = new Date(calendar.getTimeInMillis());


        int i1 = gspVouchUnsalableMapper.addVouchT(String.valueOf(forecastid), str, currentDate2, id, rdRecord01.getCcode(),
                rdRecord01.getDgatheringdate(), rdRecord01.getCvencode(), vouchById.getCmaker(), vouchById.getCmaker(),"demo",rdRecord01.getCwhcode(),currentDate2,new Date());
        if (i1 > 0) {

            System.out.println("单据添加成功");
            uaIdentityMapper.iFatherIdAdd("GSP_VOUCHUNSALABLE", U8LinkConstant.U8_LINK_CACC_ID);
            voucherHistoryMapper.codingAdd("091");
        }

        List<RdRecords01> rdRecords01s = rdRecords01Mapper.selectBById(id);
        for (RdRecords01 rdRecords01 : rdRecords01s) {
            UaIdentity uaIdentity1 = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>()
                    .eq("cVouchType", "GSP_VOUCHUNSALABLE").eq("cAcc_Id", 900));
            Integer ichildid = uaIdentity1.getIchildid();
            ichildid = ichildid + 1000000001;
            Gsp_VouchsUnsalable gspVouchsUnsalable = new Gsp_VouchsUnsalable();
            gspVouchsUnsalable.setAutoid(ichildid);
            gspVouchsUnsalable.setId(forecastid);
            //采购入库单子表编号
            gspVouchsUnsalable.setIrdsid(rdRecords01.getAutoid());
            //生产日期
            gspVouchsUnsalable.setDmadedate(rdRecords01.getDmadedate());
            //辅助计量单位
            gspVouchsUnsalable.setCunitid(rdRecords01.getCassunit());
            //比例
            gspVouchsUnsalable.setIchangrate(rdRecords01.getIinvexchrate());
            //批号
            gspVouchsUnsalable.setCbatch(rdRecords01.getCbatch());
            //有效期
            gspVouchsUnsalable.setDvaldate(rdRecords01.getDvdate());
            //存货
            gspVouchsUnsalable.setCinvcode(rdRecords01.getCinvcode());
            //数量
            gspVouchsUnsalable.setIquantity(rdRecords01.getIquantity());
            //件数
            gspVouchsUnsalable.setInum(rdRecords01.getInum());
            //审核人
            gspVouchsUnsalable.setCchecker1(shr);

            int insert = gspVouchsUnsalableMapper.insert(gspVouchsUnsalable);
            if (insert > 0) {
                System.out.println("单据子表添加成功");
                System.out.println(gspVouchsUnsalable);
                uaIdentityMapper.iChildIdAdd("GSP_VOUCHUNSALABLE", U8LinkConstant.U8_LINK_CACC_ID);
            }


        }
        String jsonString = "{}";
        String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/ReViewCaiGouRuKu?id="+id;
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .readTimeout(180, TimeUnit.SECONDS)
                .build();
        RequestBody requestBody = RequestBody.create(MediaType
                .parse("application/json"), jsonString);


        Request request  = new Request.Builder()
                .url(targetUrl)
                .post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            } else {
                // 打印响应体
                String string1 = response.body().string();
                System.out.println(string1);
/*                JSONObject jsonObject = new JSONObject(string1);
                String string = jsonObject.getString("code");*/

            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


}
