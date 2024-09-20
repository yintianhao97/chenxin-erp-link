package org.jeecg.modules.job;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.CJKDJCKJHDERP;
import org.jeecg.modules.link.entity.CJKDJCKJHDMXERP;
import org.jeecg.modules.link.entity.FhjlXs;
import org.jeecg.modules.link.entity.TuiHuoLink;
import org.jeecg.modules.link.mapper.FhjlXsMapper;
import org.jeecg.modules.link.service.ICJKDJCKJHDERPService;
import org.jeecg.modules.link.service.ICJKDJCKJHDMXERPService;
import org.jeecg.modules.link.service.ITuiHuoLinkService;
import org.jeecg.modules.link.vo.AddPuStoreInVo;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.IPersonService;
import org.jeecg.modules.u8.service.IPuArrivalVouchService;
import org.jeecg.modules.u8.service.IPuArrivalVouchsService;
import org.springframework.beans.factory.annotation.Autowired;
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


/**
 * 销售退货
 */
@Slf4j
@Component
public class CaiGouTuiHuoJob {
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
    private PuArrivalVouchMapper puArrivalVouchMapper;
    @Autowired
    private PuArrivalVouchsMapper puArrivalVouchsMapper;
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
    private UaIdentityMapper uaIdentityMapper;
    @Autowired
    private FhjlXsMapper fhjlXsMapper;

    public void CaiGouTuiHuoJobRun() {
        log.info("==========采购退货job开始==========");
        this.caiGouTuiHuo();
        this.yanShouShenHe();
        log.info("==========采购退货job结束==========");
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
