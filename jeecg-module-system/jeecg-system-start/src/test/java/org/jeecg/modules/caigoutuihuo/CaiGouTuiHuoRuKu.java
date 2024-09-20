package org.jeecg.modules.caigoutuihuo;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import okhttp3.*;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.FhjlXs;
import org.jeecg.modules.link.mapper.FhjlXsMapper;
import org.jeecg.modules.link.vo.AddPuStoreInVo;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class CaiGouTuiHuoRuKu {
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


    @Test
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
                    JSONObject jsonObject = new JSONObject(string1);
                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {
                        fhjlXsMapper.updateIsTQ(fhjlXs2.getNckdid().toString());
                        this.addGSP_VOUCHUNSALABLE(jsonObject.getString("VouchCode"),fhjlXs2.getSwfhymc());
                    }
                }
            }  catch (IOException | JSONException e) {
                throw new RuntimeException(e);
            }
        }










        //获取到id 1000000067






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
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



