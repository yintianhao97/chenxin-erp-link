package org.jeecg.modules.test;

import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.Customer;
import org.jeecg.modules.u8.entity.Inventory;
import org.jeecg.modules.u8.service.ICustomerService;
import org.jeecg.modules.u8.service.IInventoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = JeecgSystemApplication.class)
public class KeHu {

    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICJKJCWLDWService icjkjcwldwService;
    @Autowired
    private ICustomerLinkService customerLinkService;
    @Autowired
    private IlinkAutoIdService ilinkAutoIdService;

    /**
     * 供应商更新
     */
    //@Scheduled(cron = "0 0/5 * * * ? ")
    @Test
    public void customerJob() {
        //log.info("CustomerJob定时任务开始执行");
        List<Customer> customers = customerService.selectNoSyn();

        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer customerId = linkAutoId.getCustomerId();

        for (Customer customer : customers) {
            CJKJCWLDW cjkjcwldw = new CJKJCWLDW();
            //接收标记 1
            cjkjcwldw.setNgxbj(1);
            cjkjcwldw.setNjsbj(0);

            //id 1
            cjkjcwldw.setId(customerId.longValue());
            //单位代码 单位编号 1
            cjkjcwldw.setSwldwid(customer.getCcuscode());
            cjkjcwldw.setSjkdwbh(customer.getCcuscode());

            //中文名称 1
            cjkjcwldw.setSdwmc(customer.getCcusname());
            //中文地址 1
            cjkjcwldw.setSzwdz(customer.getCcusaddress());

            //邮政编码 1
            String ccuspostcode = customer.getCcuspostcode();
            if (ccuspostcode == null || ccuspostcode.equals("")) {
                cjkjcwldw.setSyzbm(ccuspostcode);
            }else {
                if (ccuspostcode.length() > 6) {
                    // 处理字符串过长的情况，例如截断或抛出异常
                    ccuspostcode = ccuspostcode.substring(0, 6);
                    cjkjcwldw.setSyzbm(ccuspostcode);
                }else {
                    cjkjcwldw.setSyzbm(ccuspostcode);
                }

            }
            //传真 1
            cjkjcwldw.setSczhm(customer.getCcusfax());
            //电话 1
            cjkjcwldw.setSlxdh(customer.getCcusphone());
            //有效标志 1
            cjkjcwldw.setNyxbj(0);
            //助记码 1
            if (customer.getCcusmnemcode() == null || customer.getCcusmnemcode().equals("")) {
                cjkjcwldw.setSzjm(customer.getCcusname());
            }else {
                cjkjcwldw.setSzjm(customer.getCcusmnemcode());
            }

            //往来属性(0供应商,1客户,2：货主) 1
            cjkjcwldw.setNwlsx(1);
            //cjkjcwldw.setNsfhz(0);
            //联系人名称 1
            cjkjcwldw.setSlxr("");
            //法人代表 1
            cjkjcwldw.setSfrdb("");
            //电子监管网单位ID
            cjkjcwldw.setSdzjgwid("");
            //时间戳 1
            cjkjcwldw.setSsjc("");

            //cjkjcwldw.setSxlid("");

            //货主公司ID 1
            //TODO: 随便写一个先
            cjkjcwldw.setShzgsid("HXS");
            cjkjcwldw.setSkhyh("");
            cjkjcwldw.setSzh("");
            cjkjcwldw.setSsh("");

            //

            //接收备注
            cjkjcwldw.setSjsbz("u8");


            System.out.println(cjkjcwldw.toString());
            boolean save = icjkjcwldwService.save(cjkjcwldw);
            if (save) {
                customerId++;
                ilinkAutoIdService.uptateCustomerIdAdd();
                customerLinkService.save(new CustomerLink().setErpid(customer.getCcuscode()));
            }

        }


    }

}