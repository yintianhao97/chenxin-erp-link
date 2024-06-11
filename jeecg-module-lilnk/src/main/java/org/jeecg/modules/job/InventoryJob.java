package org.jeecg.modules.job;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKJCSPXX;
import org.jeecg.modules.link.entity.InventoryLink;
import org.jeecg.modules.link.entity.linkAutoId;
import org.jeecg.modules.link.service.ICJKJCSPXXService;
import org.jeecg.modules.link.service.IInventoryLinkService;
import org.jeecg.modules.link.service.IlinkAutoIdService;
import org.jeecg.modules.u8.entity.Inventory;
import org.jeecg.modules.u8.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InventoryJob {
    @Autowired
    private IInventoryService inventoryService;
    @Autowired
    private ICJKJCSPXXService icjkjcspxxService;
    @Autowired
    private IInventoryLinkService iInventoryLinkService;
    @Autowired
    private IlinkAutoIdService ilinkAutoIdService;

    //@Scheduled(cron = "0 0/5 * * * ? ")
    public void inventory() {
        log.info("InventoryJob定时任务开始执行");
        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer inventoryId = linkAutoId.getInventoryId();

        List<Inventory> inventories = inventoryService.selectNoSyn();
        for (Inventory inventory : inventories) {
            CJKJCSPXX cjkjcspxx = new CJKJCSPXX();
            cjkjcspxx.setId(inventoryId.longValue());
            cjkjcspxx.setNgxbj(1);
            cjkjcspxx.setNjsbj(0);
            //erp id
            cjkjcspxx.setSjkspid(inventory.getCinvcode());
            //erp id
            cjkjcspxx.setSspbm(inventory.getCinvcode());
            //名称
            cjkjcspxx.setSspmc(inventory.getCinvname());
            //规格
            cjkjcspxx.setSspgg(inventory.getCinvstd());
            //产地
            cjkjcspxx.setSspcd(inventory.getCaddress());

            String cinvmnemcode = inventory.getCinvmnemcode();
            if (cinvmnemcode == null || cinvmnemcode.equals("")) {
                cjkjcspxx.setSzjm(inventory.getCinvname());
            }else {
                cjkjcspxx.setSzjm(cinvmnemcode);
            }
            //有效标记
            cjkjcspxx.setNyxbj(1L);
            //批准文号
            cjkjcspxx.setSpjwh(inventory.getCfile());
            //生产厂家????
            cjkjcspxx.setSsccj(inventory.getCenterprise());

            cjkjcspxx.setN4zbzgg(1L);
            //单位重量
            Float iinvweight = inventory.getIinvweight();
            if (iinvweight == null) {
                iinvweight = 9999f;
            }
            cjkjcspxx.setNjlgg(iinvweight.longValue());
            //是否监管
            cjkjcspxx.setNsfjg(0);
            //包装单位名称
            cjkjcspxx.setSjldw(inventory.getCenterprise());
            //时间戳
            cjkjcspxx.setSsjc("");
            //备注
            cjkjcspxx.setSbz("");
            //创建时间
            cjkjcspxx.setDcjrq(new Date());
            //更新时间
            cjkjcspxx.setDgxrq(new Date());
            //是否二验药
            cjkjcspxx.setNjsyp(0);
            //是否冷藏
            cjkjcspxx.setNncbj(0);
            //存储类型
            cjkjcspxx.setNsfzy(0);
            cjkjcspxx.setNlx(0);

           /* cjkjcspxx.setNyxbz(0);
            cjkjcspxx.setNgmpbj(0);
            cjkjcspxx.setNgspbj(0);
            cjkjcspxx.setNsybj(0);*/
            //分组类型
            //cjkjcspxx.setSspfq("");

            cjkjcspxx.setSfzlx("602");
            cjkjcspxx.setN4c(new BigDecimal("0"));
            cjkjcspxx.setN4k(new BigDecimal("0"));
            cjkjcspxx.setN4g(new BigDecimal("0"));

            //货主公司id
            cjkjcspxx.setShzgsid("L08");


            System.out.println(cjkjcspxx.toString());
            boolean save = icjkjcspxxService.save(cjkjcspxx);
            if (!save) {
                // log.error("保存失败"+cjkjcspxx.toString());
            }else {
                inventoryId++;
                ilinkAutoIdService.uptateInventoryIdAdd();
                iInventoryLinkService.save(
                        new InventoryLink().setErpid(inventory.getCinvcode())
                );
            }
        }


    }
    public void inventory111() {
        List<Inventory> inventories = inventoryService.selectNoSyn();
        for (Inventory inventory : inventories) {
            CJKJCSPXX cjkjcspxx = new CJKJCSPXX();
            cjkjcspxx.setNgxbj(1);
            cjkjcspxx.setNjsbj(0);
            //erp id
            cjkjcspxx.setSjkspid(inventory.getCinvcode());
            //erp id
            cjkjcspxx.setSspbm(inventory.getCinvcode());
            //名称
            cjkjcspxx.setSspmc(inventory.getCinvname());
            //规格
            cjkjcspxx.setSspgg(inventory.getCinvstd());


            String cinvmnemcode = inventory.getCinvmnemcode();
            if (cinvmnemcode == null || cinvmnemcode.equals("")) {
                cjkjcspxx.setSzjm(inventory.getCinvname());
            }else {
                cjkjcspxx.setSzjm(cinvmnemcode);
            }

            //助记码
            cjkjcspxx.setSzjm(cinvmnemcode);
            //有效标记
            cjkjcspxx.setNyxbj(1L);
            //批准文号
            cjkjcspxx.setSpjwh(inventory.getCfile());
            //生产厂家????
            cjkjcspxx.setSsccj(inventory.getCenterprise());

            cjkjcspxx.setN4zbzgg(1L);

            cjkjcspxx.setNjlgg(1L);
            //是否监管
            cjkjcspxx.setNsfjg(0);
            //包装单位名称
            cjkjcspxx.setSjldw(inventory.getCenterprise());
            //时间戳
            cjkjcspxx.setSsjc("");
            //备注
            cjkjcspxx.setSbz("");
            //创建时间
            cjkjcspxx.setDcjrq(new Date());
            //更新时间
            cjkjcspxx.setDgxrq(new Date());
            //是否二验药
            cjkjcspxx.setNjsyp(0);
            //是否冷藏
            cjkjcspxx.setNncbj(0);
            //存储类型
            cjkjcspxx.setNsfzy(0);

           /* cjkjcspxx.setNyxbz(0);
            cjkjcspxx.setNgmpbj(0);
            cjkjcspxx.setNgspbj(0);
            cjkjcspxx.setNsybj(0);*/
            //分组类型
            //cjkjcspxx.setSspfq("");

//            cjkjcspxx.setSfzlx("0");
//            cjkjcspxx.setN4c(new BigDecimal("0"));
//            cjkjcspxx.setN4k(new BigDecimal("0"));
//            cjkjcspxx.setN4g(new BigDecimal("0"));
//            cjkjcspxx.setSjx("");
//            cjkjcspxx.setSsptm("");
            //           cjkjcspxx.setNzdyh(0);
            //类型
            cjkjcspxx.setNlx(0);
            String cvencode = inventory.getCvencode();
            //如果cvencode为空跳出循环
            if (cvencode == null || cvencode.equals("")) {
                continue;
            }
            //货主公司id
            cjkjcspxx.setShzgsid(cvencode);
//            cjkjcspxx.setN4yxq(new BigDecimal("0"));
//            cjkjcspxx.setPizhwhxq("");
//            cjkjcspxx.setSscyr("");
//            cjkjcspxx.setShoutf("");
//            cjkjcspxx.setNjhbz(0);
            /*cjkjcspxx.setSbeiy1("");
            cjkjcspxx.setSbeiy2("");
            cjkjcspxx.setSbeiy3("");
            cjkjcspxx.setSbeiy4("");
            cjkjcspxx.setSbeiy5("");
            cjkjcspxx.setSbeiy6("");
            cjkjcspxx.setSbeiy7("");
            cjkjcspxx.setSbeiy8("");
            cjkjcspxx.setNbeiy1(new BigDecimal("0"));
            cjkjcspxx.setNbeiy2(new BigDecimal("0"));
            cjkjcspxx.setNbeiy3(new BigDecimal("0"));
            cjkjcspxx.setNbeiy4(new BigDecimal("0"));
            cjkjcspxx.setNbeiy5(new BigDecimal("0"));
            cjkjcspxx.setNbeiy6(new BigDecimal("0"));
            cjkjcspxx.setNbeiy7(new BigDecimal("0"));
            cjkjcspxx.setNbeiy8(new BigDecimal("0"));*/
            //cjkjcspxx.setId(0L);

            System.out.println(cjkjcspxx.toString());
            boolean save = icjkjcspxxService.save(cjkjcspxx);
            if (!save) {
                log.error("保存失败"+cjkjcspxx.toString());
            }else {
                iInventoryLinkService.save(
                        new InventoryLink().setErpid(inventory.getCinvcode())
                );
            }
        }


    }

}
