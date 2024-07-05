package org.jeecg.modules.caigoudingdan;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import okhttp3.*;
import org.checkerframework.checker.units.qual.A;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.SjjlXs;
import org.jeecg.modules.link.mapper.SjjlXsMapper;
import org.jeecg.modules.link.vo.AddPuStoreInVo;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.PersonMapper;
import org.jeecg.modules.u8.mapper.PoPomainMapper;
import org.jeecg.modules.u8.mapper.PuArrivalVouchMapper;
import org.jeecg.modules.u8.mapper.PuArrivalVouchsMapper;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
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
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class ruku4 {
    @Autowired
    private SjjlXsMapper sjjlXsMapper;
    @Autowired
    private IGspVouchsQCService gspVouchsQCService;
    @Autowired
    private IGspVouchQCService iGspVouchQCService;
    @Autowired
    private PuArrivalVouchMapper puArrivalVouchMapper;
    @Autowired
    private PuArrivalVouchsMapper puArrivalVouchsMapper;
    @Autowired
    private PersonMapper personMapper;

    @Test
    public void Test1() {

        List<SjjlXs> sjjlXs = sjjlXsMapper.selectChu();

        for (SjjlXs sjjlX : sjjlXs) {
            //验收单单号
            String ysdh = sjjlX.getYsdh();
            String nydjhh = sjjlX.getNydjhh();
            //验收单行号
            BigDecimal ysdhHH = NumberUtil.add(nydjhh, "1");
            GspVouchQC byCodeCai = iGspVouchQCService.getByCodeCai(ysdh);

            if (byCodeCai == null) {
                System.out.println("没有找到" + ysdh);
                break;
            }
            PuArrivalVouch vouchById = puArrivalVouchMapper.getVouchById(byCodeCai.getIcode().toString());

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
                //仓库号 TODO:就一个仓库
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
                    JSONObject jsonObject = new JSONObject(string1);
                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {
                        sjjlXsMapper.deleteByYSDH(ysdh);
                    }
                }
            }  catch (IOException | JSONException e) {
                throw new RuntimeException(e);
            }



        }





    }
}
