package org.jeecg.modules.xiaoshoutuihuo;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.checkerframework.checker.units.qual.A;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.U8LinkConstant;
import org.jeecg.modules.link.entity.CJKDJRKD;
import org.jeecg.modules.link.entity.SjjlXs;
import org.jeecg.modules.link.mapper.CJKDJRKDMXMapper;
import org.jeecg.modules.link.mapper.CJKDJRKDMapper;
import org.jeecg.modules.link.mapper.SjjlXsMapper;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class RedXiaoShouChuKu3 {
    @Autowired
    private Rdrecord32Mapper rdrecord32Mapper;
    @Autowired
    private Rdrecords32Mapper rdrecords32Mapper;

    @Autowired
    private DispatchListMapper dispatchListMapper;
    @Autowired
    private DispatchListsMapper dispatchListsMapper;
    @Autowired
    private SjjlXsMapper sjjlXsMapper;
    @Autowired
    private UaIdentityMapper uaIdentityMapper;
    @Autowired
    private GspVouchsQCMapper gspVouchsQCMapper;

    @Autowired
    private GspVouchQCMapper gspVouchQCMapper;

    @Test
    public void xiaoShouChuKu(){

        List<SjjlXs> sjjlXs = sjjlXsMapper.selectTui();
        for (SjjlXs sjjlX : sjjlXs) {

            UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "rd").eq("cAcc_Id", 900));
            int id = uaIdentity.getIfatherid();
            int forecastid = id + 1000000001;


            String sxgjkid = sjjlX.getDuiydjbh();
            String thdid = sxgjkid.substring(0, sxgjkid.length() - 1);

            String ysdh = sjjlX.getYsdh();
            GspVouchQC gspVouchQC = gspVouchQCMapper.selectVouchByCode(ysdh);
            DispatchList byId = dispatchListMapper.getById(thdid);
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
