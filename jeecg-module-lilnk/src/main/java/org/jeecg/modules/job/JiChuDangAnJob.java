package org.jeecg.modules.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.ComputationUnit;
import org.jeecg.modules.u8.entity.Customer;
import org.jeecg.modules.u8.entity.Inventory;
import org.jeecg.modules.u8.entity.Vendor;
import org.jeecg.modules.u8.service.IComputationUnitService;
import org.jeecg.modules.u8.service.ICustomerService;
import org.jeecg.modules.u8.service.IInventoryService;
import org.jeecg.modules.u8.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class JiChuDangAnJob {
    @Autowired
    private IInventoryService inventoryService;
    @Autowired
    private ICJKJCSPXXService icjkjcspxxService;
    @Autowired
    private IInventoryLinkService iInventoryLinkService;
    @Autowired
    private IlinkAutoIdService ilinkAutoIdService;
    @Autowired
    private IComputationUnitService iComputationUnitService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICJKJCWLDWService icjkjcwldwService;
    @Autowired
    private ICustomerLinkService customerLinkService;
    @Autowired
    private IVendorService iVendorService;
    @Autowired
    private IVendorLinkService iVendorLinkService;


    @Scheduled(cron = "0 0/5 * * * ? ")
    public void JiChuDangAnJobRun() {
        log.info("==========基础档案job开始==========");
        this.inventoryJob();
        this.Venjob();
        this.customerJob();
        log.info("==========基础档案job结束==========");
    }

    /**
     * 同步商品
     */
    //@Scheduled(cron = "0 0,10,20,30,40,50 * * * ? ")
    public void inventoryJob() {
        log.info("商品同步开始");
        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer inventoryId = linkAutoId.getInventoryId();

        List<Inventory> inventories = inventoryService.selectNoSyn();
        log.info("商品同步数量:{}",inventories.size());
        for (Inventory inventory : inventories) {
            log.info("商品信息:{}",inventory);
            CJKJCSPXX cjkjcspxx = new CJKJCSPXX();
            cjkjcspxx.setId(inventoryId.longValue());
            cjkjcspxx.setNgxbj(1);
            //接收标记(0，未接收；1，接收成功；2，处理失败)   1
            cjkjcspxx.setNjsbj(0);
            //erp code 1
            cjkjcspxx.setSjkspid(inventory.getCinvcode());
            //erp code 1
            cjkjcspxx.setSspbm(inventory.getCinvcode());
            //名称 1
            cjkjcspxx.setSspmc(inventory.getCinvname());
            //规格 1
            cjkjcspxx.setSspgg(inventory.getCinvstd());
            //产地 1
            cjkjcspxx.setSspcd(inventory.getCaddress());
            //SZJM	VARCHAR2(40)	N	助记码 1
            String cinvmnemcode = inventory.getCinvmnemcode();
            if (cinvmnemcode == null || cinvmnemcode.equals("")) {
                cjkjcspxx.setSzjm(inventory.getCinvname());
            }else {
                cjkjcspxx.setSzjm(cinvmnemcode);
            }

            //有效标记 1
            cjkjcspxx.setNyxbj(1L);
            //批准文号 1
            cjkjcspxx.setSpjwh(inventory.getCfile());
            //生产厂家????
            cjkjcspxx.setSsccj(inventory.getCenterprise());

            // 中包装规格(箱,条,盒) 不能为0   1
            cjkjcspxx.setN4zbzgg(1L);
            //计量规格，不能为0  1
            String cstcomunitcode = inventory.getCstcomunitcode();
            if(cstcomunitcode !=null && !cstcomunitcode.equals("")){
                Long huanSuanLv = inventoryService.getHuanSuanLv(cstcomunitcode);
                cjkjcspxx.setNjlgg(huanSuanLv);
            }else {
                cjkjcspxx.setNjlgg(9999L);
            }

            //是否监管 1
            cjkjcspxx.setNsfjg(0);
            //包装单位名称 1
            String ccacomunitcode = inventory.getCcomunitcode();
            ComputationUnit computationUnit = iComputationUnitService.selectByCode(ccacomunitcode);
            cjkjcspxx.setSjldw(computationUnit.getCcomunitname());
            //时间戳
            //cjkjcspxx.setSsjc("");
//            商品分组类型 ERP没有  1
            cjkjcspxx.setSfzlx(inventory.getCinvdefine2());

            //备注 1
            cjkjcspxx.setSbz("");
            //创建时间 1
            cjkjcspxx.setDcjrq(new Date());
            //更新时间 1
            cjkjcspxx.setDgxrq(new Date());
            //是否精神药品(0否    1是) 1
            String string1 = inventory.getBspecialties().toString();
            if(string1.equals("false")){
                cjkjcspxx.setNjsyp(0);
            }else {
                cjkjcspxx.setNjsyp(1);
            }

            //是否首营状态
            String string = inventory.getBfirstbusimedicine().toString();
            if (string.equals("false")) {
                cjkjcspxx.setNsybj(0);
            }else {
                cjkjcspxx.setNsybj(1);
            }



            //存储类型 1
            String cinvdefine4 = inventory.getCinvdefine4();
            int dashIndex = cinvdefine4.indexOf("-");
            String substring = cinvdefine4.substring(0, dashIndex);
            cjkjcspxx.setNsfzy(Integer.parseInt(substring));


            //中药：26；二类精神：22；大输液：21；原料药：29；中药材：25；普通药品：0；食品：30；冷库：23；非药品：24 1
            String cinvdefine3 = inventory.getCinvdefine3();

            int i = Integer.parseInt(substring);

            cjkjcspxx.setNlx(i);
            //是否冷藏 1
            if (i == 23) {
                cjkjcspxx.setNncbj(1);
            }else {
                cjkjcspxx.setNncbj(0);
            }


            //是否异性包装
            cjkjcspxx.setNyxbz(0);
            /*cjkjcspxx.setNgmpbj(0);
            cjkjcspxx.setNgspbj(0);
            cjkjcspxx.setNsybj(0);*/
            //分组类型
            //cjkjcspxx.setSspfq("");

            cjkjcspxx.setN4c(new BigDecimal("0"));
            cjkjcspxx.setN4k(new BigDecimal("0"));
            cjkjcspxx.setN4g(new BigDecimal("0"));

            //货主公司id
            cjkjcspxx.setShzgsid("HXS");


            //System.out.println(cjkjcspxx.toString());
            boolean save = icjkjcspxxService.save(cjkjcspxx);
            if (!save) {
                 log.error("保存失败"+cjkjcspxx);
            }else {
                log.info("保存成功"+cjkjcspxx);
                inventoryId++;
                ilinkAutoIdService.uptateInventoryIdAdd();
                iInventoryLinkService.save(
                        new InventoryLink().setErpid(inventory.getCinvcode())
                );
            }
        }

        log.info("商品同步job结束");
    }

    /**
     * 供应商
     */
    public void Venjob(){
        log.info("供应商同步job开始");

        List<Vendor> vendors = iVendorService.selectNoSyn();
        log.info("供应商同步数量:{}",vendors.size());
        //获得id
        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer customerId = linkAutoId.getCustomerId();

        for (Vendor vendor : vendors) {
            log.info("供应商同步:{}",vendor);
            log.info(vendor.toString());
            CJKJCWLDW cjkjcwldw = new CJKJCWLDW();
            //接收标记 1
            cjkjcwldw.setNgxbj(1);
            cjkjcwldw.setNjsbj(0);

            //id 1
            cjkjcwldw.setId(customerId.longValue());
            //单位代码 单位编号 1
            cjkjcwldw.setSwldwid(vendor.getCvencode());
            cjkjcwldw.setSjkdwbh(vendor.getCvencode());

            //中文名称 1
            cjkjcwldw.setSdwmc(vendor.getCvenname());
            //中文地址 1
            cjkjcwldw.setSzwdz(vendor.getCvenaddress());

            //邮政编码 1
            String ccuspostcode = vendor.getCvenpostcode();
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
            cjkjcwldw.setSczhm(vendor.getCvenfax());
            //电话 1
            cjkjcwldw.setSlxdh(vendor.getCvenphone());
            //有效标志 1
            cjkjcwldw.setNyxbj(0);
            //助记码 1
            if (vendor.getCvenmnemcode() == null || vendor.getCvenmnemcode().equals("")) {
                cjkjcwldw.setSzjm(vendor.getCvenname());
            }else {
                cjkjcwldw.setSzjm(vendor.getCvenabbname());
            }

            //往来属性(0供应商,1客户,2：货主) 1
            cjkjcwldw.setNwlsx(0);
            cjkjcwldw.setNsfhz(0);
            //联系人名称 1
            cjkjcwldw.setSlxr(vendor.getCvenperson());
            //法人代表 1
            cjkjcwldw.setSfrdb(vendor.getCvenlperson());
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


           // System.out.println(cjkjcwldw.toString());
            boolean save = icjkjcwldwService.save(cjkjcwldw);
            if (save) {
                log.info("保存成功"+cjkjcwldw);
                customerId++;
                ilinkAutoIdService.uptateCustomerIdAdd();
                iVendorLinkService.save(new VendorLink().setErpid(vendor.getCvencode()));
            }

        }
        log.info("供应商同步job结束");
    }

    /**
     * 客户
     */
    public void customerJob() {
        log.info("客户同步job开始");
        List<Customer> customers = customerService.selectNoSyn();
        log.info("客户同步数量:{}",customers.size());
        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer customerId = linkAutoId.getCustomerId();

        for (Customer customer : customers) {
            log.info("客户同步:{}",customer);
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
                log.info("保存成功"+cjkjcwldw);
                customerId++;
                ilinkAutoIdService.uptateCustomerIdAdd();
                customerLinkService.save(new CustomerLink().setErpid(customer.getCcuscode()));
            }

        }
        log.info("客户同步job结束");
    }


}
