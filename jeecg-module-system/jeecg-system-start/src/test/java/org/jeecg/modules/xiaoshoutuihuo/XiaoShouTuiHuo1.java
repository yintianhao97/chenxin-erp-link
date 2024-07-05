package org.jeecg.modules.xiaoshoutuihuo;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.CJKWMSRKHZ;
import org.jeecg.modules.link.entity.CJKWMSRKMX;
import org.jeecg.modules.link.entity.DispatchListLink;
import org.jeecg.modules.link.service.ICJKWMSRKHZService;
import org.jeecg.modules.link.service.ICJKWMSRKMXService;
import org.jeecg.modules.link.service.IDispatchListLinkService;
import org.jeecg.modules.link.vo.AddPuStoreInVo;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.*;
import org.jeecg.modules.u8.service.IDispatchListService;
import org.jeecg.modules.u8.service.IDispatchListsService;
import org.jeecg.modules.u8.service.IPersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.string;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = JeecgSystemApplication.class)
public class XiaoShouTuiHuo1 {
    @Autowired
    private IDispatchListService dispatchListService;
    @Autowired
    private IDispatchListsService dispatchListsService;
    @Autowired
    private IDispatchListLinkService dispatchListLinkService;

    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;
    @Autowired
    private IPersonService iPersonService;


    /**
     * 销售退货
     */
    //@Scheduled(cron = "0 0/5 * * * ? ")
    @Test
    public void run() {
        List<DispatchList> dispatchLists = dispatchListService.selectNoSynTui();

        for (DispatchList dispatchList : dispatchLists) {


            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            //单据编号 1 1000000024
            cjkwmsrkhz.setDjbh(dispatchList.getDlid().toString()+"T");
            //cjkwmsrkhz.setDjbh("1000000026"+"T");
            //单据类型，1入库，2销售退回 1
            cjkwmsrkhz.setDjlx("2");
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
            cjkwmsrkhz.setUsername(dispatchList.getCmaker());
            //业务员 1
            String cpersoncode = dispatchList.getCpersoncode();

            if (cpersoncode != null){
                String codeByName = iPersonService.getCodeByName(cpersoncode);
                cjkwmsrkhz.setYwy(codeByName);
            }else {
                cjkwmsrkhz.setYwy("");
            }

            //单位内码 1  TODO:这个是供货商CODE
            cjkwmsrkhz.setDwbh(dispatchList.getCcuscode());
            ///货主id? 产成品入库哪里来的供货商 1
            cjkwmsrkhz.setShzid("HXS");
            cjkwmsrkhz.setShzgsid("HXS");
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);

            if (save) {

                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(dispatchList.getDlid().toString());


            for (DispatchLists lists : dispatchLists1) {

                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号 1  1000000024T
                cjkwmsrkmx.setDjbh(dispatchList.getDlid().toString()+"T");
                //cjkwmsrkmx.setDjbh("1000000026"+"T");
                //行号 1
                cjkwmsrkmx.setDjSn(lists.getIrowno());
                //批号
                cjkwmsrkmx.setPihao(lists.getCbatch());
                //商品编码 1
                cjkwmsrkmx.setSpid(lists.getCinvcode());
                //数量 1
                BigDecimal iquantity = lists.getIquantity();
                BigDecimal mul = NumberUtil.mul(iquantity.toString(), "-1");
                cjkwmsrkmx.setJkjkjk(mul);
                //单价 1
                cjkwmsrkmx.setDj(lists.getIunitprice());
                //含税价 1

                cjkwmsrkmx.setHshj(lists.getItaxunitprice());

                //生产日期

                //金额 1
                String imoney = lists.getImoney().toString();
                BigDecimal mul1 = NumberUtil.mul(imoney, "-1");
                cjkwmsrkmx.setJe(mul1);
                //含税金额 1
                String isum = lists.getIsum().toString();
                BigDecimal mul2 = NumberUtil.mul(isum, "-1");
                cjkwmsrkmx.setHsje(mul2);
                // 定义日期格式
                SimpleDateFormat dateFormat111 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");
                // 将Date对象转换为格式化的字符串
                String formattedDate111 = dateFormat123.format(new Date());

                cjkwmsrkmx.setBaozhiqi(dateFormat123.format(lists.getDmdate()));

                cjkwmsrkmx.setSxrq(dateFormat123.format(lists.getDvdate()));

                //货主id 1
                cjkwmsrkmx.setShzid("HXS");

                System.out.println(cjkwmsrkmx);
                System.out.println(icjkwmsrkmxService.save(cjkwmsrkmx));

            }


        }


    }
}



