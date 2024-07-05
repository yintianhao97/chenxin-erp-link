package org.jeecg.modules;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.JsonObject;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
import org.json.JSONObject;
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
public class GspVouchNoteAdd {
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


    @Test
    public void shenhe(){

        //发货单号
        DispatchList byCode = dispatchListMapper.getByCode("0000000029");
        String cdlcode = byCode.getCdlcode();
        //根据发货单查询 出库单
        List<Rdrecords32> byCbdlcode = rdrecords32Mapper.getByCbdlcode(cdlcode);

        Integer id = byCbdlcode.get(0).getId();

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
            JSONObject jsonObject = new JSONObject(response.toString());
            vouchCode = jsonObject.getString("VouchCode");

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    @Test
    public void add(){

        String coding = voucherHistoryMapper.getCoding("010");
        int i = Integer.parseInt(coding)+1;
        String str = String.format("%010d", i);

        UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchNote").eq("cAcc_Id", 900));
        int id = uaIdentity.getIfatherid();
        int forecastid = id + 1000000001;


        //发货单号
        DispatchList byCode = dispatchListMapper.getByCode("0000000029");

        int i1 = gspVouchNoteMapper.addVouchNote(String.valueOf(forecastid), str, "demo", null,new Date());
        if (i1 >0){
            System.out.println("添加成功");
            voucherHistoryMapper.codingAdd("010");
            uaIdentityMapper.iFatherIdAdd("GSP_VouchNote", U8LinkConstant.U8_LINK_CACC_ID);
        }

        //List<DispatchLists> dispatchLists = dispatchListsMapper.selectByDLID(byCode.getDlid().toString());
        //发货单code
        String cdlcode = byCode.getCdlcode();
        //根据发货单查询 出库单
        List<Rdrecords32> byCbdlcode = rdrecords32Mapper.getByCbdlcode(cdlcode);


        Rdrecord32 rdrecord32 = rdrecord32Mapper.getById(byCbdlcode.get(0).getId().toString());
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
            //发货单ID
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
            gspVouchsNote.setCchecker1("曹政");

            int insert = gspVouchsNoteMapper.insert(gspVouchsNote);
            if (insert > 0){
                System.out.println("添加成功");
                uaIdentityMapper.iChildIdAdd("GSP_VouchNote", U8LinkConstant.U8_LINK_CACC_ID);
            }

        }


    }

}



