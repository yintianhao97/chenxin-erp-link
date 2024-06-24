package org.jeecg.modules;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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
    public void add(){

        String coding = voucherHistoryMapper.getCoding("010");
        int i = Integer.parseInt(coding)+1;
        String str = String.format("%010d", i);

        UaIdentity uaIdentity = uaIdentityMapper.selectOne(new QueryWrapper<UaIdentity>().eq("cVouchType", "GSP_VouchNote").eq("cAcc_Id", 900));
        int id = uaIdentity.getIfatherid();
        int forecastid = id + 1000000001;


        //发货单号
        DispatchList byCode = dispatchListMapper.getByCode("0000000016");

        int i1 = gspVouchNoteMapper.addVouchNote(String.valueOf(forecastid), str, "demo", null,new Date());
        if (i1 >0){
            System.out.println("添加成功");
            voucherHistoryMapper.codingAdd("010");
            uaIdentityMapper.iFatherIdAdd("GSP_VouchNote", "900");
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
            gspVouchsNote.setDprodate(currentDate2);
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
            gspVouchsNote.setCwhcodes(rdrecord32.getCwhcode());
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
                uaIdentityMapper.iChildIdAdd("GSP_VouchNote", "900");
            }

        }


    }

}



