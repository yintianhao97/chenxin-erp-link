package org.jeecg.modules.caigoudingdan;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.dynamic.datasource.creator.druid.DruidConfigUtil;
import org.jeecg.config.DruidConfig;
import org.jeecg.modules.U8LinkConstant;
import org.json.JSONException;
import org.json.JSONObject;


import okhttp3.*;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.ShjlXs;

import org.jeecg.modules.link.service.IShjlXsService;

import org.jeecg.modules.u8.entity.PoPodetails;
import org.jeecg.modules.u8.mapper.PersonMapper;
import org.jeecg.modules.u8.mapper.PoPodetailsMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class daohuoAdd2 {

    @Autowired
    private IShjlXsService iShjlXsService;

    @Autowired
    private PoPodetailsMapper poPodetailsMapper;

    @Test
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
                    JSONObject jsonObject = new JSONObject(string1);
                    String string = jsonObject.getString("code");
                    if ("0".equals(string)) {
                        iShjlXsService.updateIsTqInt(s);
                    }
                }
            }  catch (IOException | JSONException e) {
                throw new RuntimeException(e);
            }

        }



    }


}



