package org.jeecg.modules;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.ShjlXs;
import org.jeecg.modules.link.mapper.ShjlXsMapper;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class daohuoAdd {

    @Autowired
    private ShjlXsMapper shjlXsMapper1;
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PoPodetailsMapper poPodetailsMapper;

    @Test
    public void add1(){


        List<ShjlXs> shjlXs = shjlXsMapper1.selectList(new QueryWrapper<ShjlXs>());
        for (ShjlXs shjlX : shjlXs) {
            //PoPodetails byCodeRow = poPodetailsMapper.getByCodeRow(shjlX.getDjbh(), shjlX.getDjSn().toString());
            PoPodetails byCodeRow = poPodetailsMapper.getByPoidRow(shjlX.getDjbh(), shjlX.getDjSn().toString());
            BigDecimal div = NumberUtil.div(byCodeRow.getIquantity(), byCodeRow.getInum(), 2);
            BigDecimal shl = shjlX.getShl();
            BigDecimal div1 = NumberUtil.div(shl, div, 2);
            Person byName = personMapper.getByName(shjlX.getYwy());
            shjlX.setYwy(byName.getCpersoncode());
            shjlX.setJs(div1.toString());
            String jsonString = JSON.toJSONString(shjlX);
            System.out.println(jsonString);

            String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/AddDaoHuo";
            String jsonBody = jsonString;

            try {
                URL url = new URL(targetUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json; utf-8");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);

                try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                    wr.writeBytes(jsonBody);
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

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }


}



