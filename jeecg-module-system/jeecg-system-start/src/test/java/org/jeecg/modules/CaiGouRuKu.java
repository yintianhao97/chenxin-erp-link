package org.jeecg.modules;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.checkerframework.checker.units.qual.A;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.YsjlXs;
import org.jeecg.modules.link.mapper.YsjlXsMapper;
import org.jeecg.modules.link.vo.AddPuStoreInVo;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class CaiGouRuKu {
    @Autowired
    private GspVouchQCMapper gspVouchQCMapper;
    @Autowired
    private GspVouchsQCMapper gspVouchsQCMapper;
    @Autowired
    private PuArrivalVouchMapper puArrivalVouchMapper;
    @Autowired
    private PuArrivalVouchsMapper puArrivalVouchsMapper;


    @Test
    public void add2() {
        GspVouchQC gspVouchQC = gspVouchQCMapper.selectVouchByCode("ys006");

        List<GspVouchsQC> gspVouchQCS = gspVouchsQCMapper.selectByTid(gspVouchQC.getId().toString());




        for (GspVouchsQC vouchQC : gspVouchQCS) {
            AddPuStoreInVo addPuStoreInVo = new AddPuStoreInVo();

/*          ICODE (U861)  采购到货退货单主表标识  int 4  True
            CCODE (U861)  采购到货退货单号  nvarchar 50  True
            DARVDATE (U861)  到货退货日期  datetime 8  True
            CDEPCODE (U861)  填报部门编码  nvarchar 12  True
            */
            Integer icode = gspVouchQC.getIcode();
            String ccode = gspVouchQC.getCcode();
            Date darvdate = gspVouchQC.getDarvdate();
/*          CINVCODE (U861)  药品编码  nvarchar 20  True
            DPRODATE (U861)  生产日期
            DValDate (U861)  失效日期
            FELGQUANTITY
            ICODE_T (U861)  采购到货退货单号   行ID
            */

            String cinvcode = vouchQC.getCinvcode();
            BigDecimal felgquantity = vouchQC.getFelgquantity();
            Date dvaldate = vouchQC.getDvaldate();
            Date dprodate = vouchQC.getDprodate();
            // 创建一个SimpleDateFormat对象来定义日期和时间的格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // 格式化Date对象
            String dvaldateStr = sdf.format(dvaldate);

            // 格式化Date对象
            String dprodateStr = sdf.format(dprodate);


            String cbatch = vouchQC.getCbatch();
            String cvencode = vouchQC.getCvencode();
            Integer icodeT = vouchQC.getIcodeT();

            PuArrivalVouch daoHuoByCode = puArrivalVouchMapper.getDaoHuoByCode(ccode);
            String cpocode = daoHuoByCode.getCpocode(); //采购单编码
            String cdepcode1 = daoHuoByCode.getCdepcode();//部门编码
            PuArrivalVouchs daohuoFByAutoID = puArrivalVouchsMapper.getDaohuoFByAutoID(icodeT.toString());
            Integer iposid = daohuoFByAutoID.getIposid();//采购订单明细ID
            String cunitid = daohuoFByAutoID.getCunitid();
            BigDecimal iinvexchrate = daohuoFByAutoID.getIinvexchrate();
            BigDecimal ioritaxcost = daohuoFByAutoID.getIoritaxcost();
            BigDecimal itaxrate = daohuoFByAutoID.getItaxrate();
            //仓库
            addPuStoreInVo.setCwhcode(U8LinkConstant.U8_LINK_CWHCODE);
            // addPuStoreInVo.setCbuscode(ccode);
            addPuStoreInVo.setCDepCode(cdepcode1);
            addPuStoreInVo.setCVenCode(cvencode);
            addPuStoreInVo.setCordercode(cpocode);
            addPuStoreInVo.setCarvcode(ccode);
            addPuStoreInVo.setIpurarriveid(icode.toString());
            addPuStoreInVo.setCchkcode("ys006");
            addPuStoreInVo.setCInvCode(cinvcode);
            addPuStoreInVo.setCassunit(cunitid);
            addPuStoreInVo.setIQuantity(felgquantity);
            addPuStoreInVo.setCbatch(cbatch);
            addPuStoreInVo.setItaxrate(itaxrate);
            addPuStoreInVo.setIoritaxcost(ioritaxcost);
            addPuStoreInVo.setIcheckids(vouchQC.getAutoid().toString());
            addPuStoreInVo.setIarrsid(icodeT.toString());
            addPuStoreInVo.setIposid(iposid.toString());
            addPuStoreInVo.setDmadedate(dprodateStr);
            addPuStoreInVo.setDvdate(dvaldateStr);

            addPuStoreInVo.setIinvexchrate(iinvexchrate);
            addPuStoreInVo.setInum(NumberUtil.div(felgquantity, iinvexchrate, 2));

            List<AddPuStoreInVo> icodes = new java.util.ArrayList<AddPuStoreInVo>();
            icodes.add(addPuStoreInVo);
            String jsonString = JSON.toJSONString(icodes);

            System.out.println(jsonString);

            String targetUrl = U8LinkConstant.U8_LINK_URL + "/U8API/AddCoPuStoreIn";
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



