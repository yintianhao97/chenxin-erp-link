package org.jeecg.modules;

import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.VendorMapper;
import org.jeecg.modules.u8.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = JeecgSystemApplication.class)
public class CrudTest11 {
    @Autowired
    private IPoPodetailsService iPoPodetailsService;
    @Autowired
    private IPoPomainService iPoPomainService;

    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;

    @Autowired
    private IPoPomainLinkService poPomainLinkService;



    @Test
    public void rdJob() {
       // log.info("Rdrecord10Job定时任务开始执行");
        List<PoPomain> poPomains = iPoPomainService.selectNoSyn();


        for (PoPomain poPomain : poPomains) {

            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            //单据编号 1
            cjkwmsrkhz.setDjbh(poPomain.getCpoid());
            //单据类型，1入库，2销售退回 1
            cjkwmsrkhz.setDjlx("1");
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
            cjkwmsrkhz.setUsername(poPomain.getCmaker());
            //业务员 1
            cjkwmsrkhz.setYwy(poPomain.getCmaker());
            //单位内码 1
            cjkwmsrkhz.setDwbh(poPomain.getCdepcode());
            ///货主id? 产成品入库哪里来的供货商 1
            cjkwmsrkhz.setShzid("L08");

            cjkwmsrkhz.setShzgsid("L08");
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);

            if (save) {

                poPomainLinkService.save(new PoPomainLink().setErpid(poPomain.getPoid().toString()));
            }


            List<PoPodetails> poPodetails = iPoPodetailsService.selectById(poPomain.getPoid());
            for (PoPodetails poPodetail : poPodetails) {

                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号 1
                cjkwmsrkmx.setDjbh(String.valueOf(poPodetail.getPoid()));
                //行号 1
                cjkwmsrkmx.setDjSn(poPodetail.getIvouchrowno());
                //商品编码 1
                cjkwmsrkmx.setSpid(poPodetail.getCinvcode());
                //数量 1
                BigDecimal iquantity = poPodetail.getIquantity();
                if (iquantity == null) {
                    cjkwmsrkmx.setJkjkjk(BigDecimal.ZERO);
                } else {
                    cjkwmsrkmx.setJkjkjk(iquantity);
                }
                //单价 1
                BigDecimal iunitprice = poPodetail.getIunitprice();
                if (iunitprice == null) {
                    cjkwmsrkmx.setDj(BigDecimal.ZERO);
                    //含税价 1  todo:自己算一下
                    cjkwmsrkmx.setHshj(BigDecimal.ZERO);
                } else {
                    cjkwmsrkmx.setDj(iunitprice);
                    //含税价 1  todo:自己算一下
                    cjkwmsrkmx.setHshj(iunitprice);
                }
                //金额 1
                Object imoney = poPodetail.getImoney();
                if (imoney == null) {
                    cjkwmsrkmx.setJe(BigDecimal.ZERO);
                }else {
                    cjkwmsrkmx.setJe(new BigDecimal(imoney.toString()));
                }


                //含税金额 1
                Object ism = poPodetail.getIsum();
                if (ism == null) {
                    cjkwmsrkmx.setHsje(BigDecimal.ZERO);
                }else {
                    cjkwmsrkmx.setHsje(new BigDecimal(ism.toString()));
                }
                // 定义日期格式
                SimpleDateFormat dateFormat111 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");
                // 将Date对象转换为格式化的字符串
                String formattedDate111 = dateFormat123.format(new Date());
                //货主id 1
                cjkwmsrkmx.setShzid("L08");

                System.out.println(cjkwmsrkmx);
                System.out.println(icjkwmsrkmxService.save(cjkwmsrkmx));

            }


        }

    }







    }



