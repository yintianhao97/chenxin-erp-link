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
    /*
    存货更新
     */
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
            cjkjcspxx.setSspcd(inventory.getCinvdefine4());
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
            cjkjcspxx.setSsccj(inventory.getCinvdefine9());
            // 中包装规格(箱,条,盒) 不能为0   1
            cjkjcspxx.setN4zbzgg(1L);
            //计量规格，不能为0  1
            Float iinvweight = inventory.getIinvweight();
            if (iinvweight == null) {
                iinvweight = 9999f;
            }
            cjkjcspxx.setNjlgg(iinvweight.longValue());
            //是否监管 1
            cjkjcspxx.setNsfjg(0);
            //包装单位名称 1
            cjkjcspxx.setSjldw(inventory.getCpackingtype());
            //时间戳
            //cjkjcspxx.setSsjc("");
//            商品分组类型 ERP没有  1  TODO:U8创建一个必填的 参照类型
            cjkjcspxx.setSfzlx("602");

            //备注 1
            cjkjcspxx.setSbz("");
            //创建时间 1
            cjkjcspxx.setDcjrq(new Date());
            //更新时间 1
            cjkjcspxx.setDgxrq(new Date());
            //是否精神药品(0否    1是) 1
            cjkjcspxx.setNjsyp(0);
            //是否冷藏 1
            cjkjcspxx.setNncbj(0);
            //存储类型 1
            cjkjcspxx.setNsfzy(0);
            //中药：26；二类精神：22；大输液：21；原料药：29；中药材：25；普通药品：0；食品：30；冷库：23；非药品：24 1
            cjkjcspxx.setNlx(0);

           /* cjkjcspxx.setNyxbz(0);
            cjkjcspxx.setNgmpbj(0);
            cjkjcspxx.setNgspbj(0);
            cjkjcspxx.setNsybj(0);*/
            //分组类型
            //cjkjcspxx.setSspfq("");

            cjkjcspxx.setN4c(new BigDecimal("0"));
            cjkjcspxx.setN4k(new BigDecimal("0"));
            cjkjcspxx.setN4g(new BigDecimal("0"));

            //货主公司id
            cjkjcspxx.setShzgsid("HXS");


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
