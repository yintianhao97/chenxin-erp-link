package org.jeecg.modules.test;

import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.InventoryMapper;
import org.jeecg.modules.u8.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = JeecgSystemApplication.class)
public class CunHuo {

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
    /*
    存货更新
     */
    //@Scheduled(cron = "0 0/5 * * * ? ")
    @Test
    public void inventory() {
        //log.info("InventoryJob定时任务开始执行");
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
//            商品分组类型 ERP没有  1  TODO:U8创建一个必填的 参照类型
            cjkjcspxx.setSfzlx(inventory.getCinvdefine2());

            //备注 1
            cjkjcspxx.setSbz("");
            //创建时间 1
            cjkjcspxx.setDcjrq(new Date());
            //更新时间 1
            cjkjcspxx.setDgxrq(new Date());
            //是否精神药品(0否    1是) 1
            cjkjcspxx.setNjsyp(Integer.parseInt(inventory.getBspecialties().toString()));

            //存储类型 1
            cjkjcspxx.setNsfzy(Integer.parseInt(inventory.getCinvdefine4()));
            //中药：26；二类精神：22；大输液：21；原料药：29；中药材：25；普通药品：0；食品：30；冷库：23；非药品：24 1
            int i = Integer.parseInt(inventory.getCinvdefine3());
            cjkjcspxx.setNlx(i);
            //是否冷藏 1
            if (i == 23) {
                cjkjcspxx.setNncbj(1);
            }else {
                cjkjcspxx.setNncbj(0);
            }



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

}