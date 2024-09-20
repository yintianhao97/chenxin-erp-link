package org.jeecg.modules.xiaoshoufahuo;

import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.Customer;
import org.jeecg.modules.u8.entity.DispatchList;
import org.jeecg.modules.u8.entity.DispatchLists;
import org.jeecg.modules.u8.service.ICustomerService;
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
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = JeecgSystemApplication.class)
public class xiaoShouChuKu {

    @Autowired
    private IDispatchListService dispatchListService;
    @Autowired
    private IDispatchListsService dispatchListsService;

    @Autowired
    private ICJKDJCKJHDERPService icjkdjckjhderpService;
    @Autowired
    private ICJKDJCKJHDMXERPService icjkdjckjhdmxerpService;

    @Autowired
    private IDispatchListLinkService dispatchListLinkService;
    @Autowired
    private IPersonService iPersonService;

    /**
     * 销售发货
     */
    //@Scheduled(cron = "0 0/5 * * * ? ")
    @Test
    public void xiaoShouChuKu() {

        List<DispatchList> dispatchLists =
                dispatchListService.selectNoSynFa();
        for (DispatchList dispatchList : dispatchLists) {
            //主表
            CJKDJCKJHDERP cjkdjckjhderp = new CJKDJCKJHDERP();
            //ID 1
            cjkdjckjhderp.setId(Long.valueOf(dispatchList.getDlid()));
            cjkdjckjhderp.setSjsbz("0");
            //接口ID
            cjkdjckjhderp.setSjkid(dispatchList.getDlid().toString());
            //单位ID 1 TODO: 客户么
            cjkdjckjhderp.setSwldwid(dispatchList.getCcuscode());
            //出库类型2采购出库 1
            cjkdjckjhderp.setNcklx(2L);
            //提货方式0未定义 1
            cjkdjckjhderp.setNthfs(0L);
            //备注 1
            cjkdjckjhderp.setSbz(dispatchList.getCmaker());

            cjkdjckjhderp.setNjsbj(0);


            //业务员 1
            String cpersoncode = dispatchList.getCpersoncode();
            if (cpersoncode != null){
                String codeByName = iPersonService.getCodeByName(cpersoncode);
                cjkdjckjhderp.setSywymc(codeByName);
            }else {
                cjkdjckjhderp.setSywymc("");
            }


            Date date1 = new Date();
            LocalDate localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Date from = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());


            //日期
            cjkdjckjhderp.setDzdrq(from);

            cjkdjckjhderp.setSysr("");

            cjkdjckjhderp.setDysrq(new Date());
            // 定义日期格式
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

            // 将Date对象转换为格式化的字符串
            String formattedDate = dateFormat.format(new Date());
            //时间
            cjkdjckjhderp.setSsjc(formattedDate);
            cjkdjckjhderp.setNchzt(0);
            //制单人 1
            cjkdjckjhderp.setSzdr(dispatchList.getCmaker());
            // 1
            cjkdjckjhderp.setNck(1);
            //部门名称 1
            cjkdjckjhderp.setSbm(dispatchList.getCdepcode());
            //货主ID 1
            cjkdjckjhderp.setShzid("HXS");


            //货主公司ID 1
            cjkdjckjhderp.setShzgsid("HXS");

            boolean save = icjkdjckjhderpService.save(cjkdjckjhderp);

            if (save) {
                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(String.valueOf(dispatchList.getDlid()));
            for (DispatchLists lists : dispatchLists1) {
                CJKDJCKJHDMXERP cjkdjckjhdmxerp = new CJKDJCKJHDMXERP();
                //ID 1
                cjkdjckjhdmxerp.setId(Long.valueOf(lists.getAutoid()));
                //行号 1
                cjkdjckjhdmxerp.setNhh(lists.getIrowno().longValue());
                //单据code 1
                cjkdjckjhdmxerp.setSjkid(dispatchList.getDlid().toString());
                //存货编码 1
                cjkdjckjhdmxerp.setSjkspid(lists.getCinvcode());
                //
                cjkdjckjhdmxerp.setNckdid(0L);
                cjkdjckjhdmxerp.setNspid(0L);
                BigDecimal iquantity = lists.getIquantity();

                //装件数  1
                cjkdjckjhdmxerp.setNjlgg(iquantity.longValue());
                //订单数量 1
                cjkdjckjhdmxerp.setN4jhsl(iquantity);
                //订单数量 1
                cjkdjckjhdmxerp.setN4sjsl(new BigDecimal(0));
                //
                cjkdjckjhdmxerp.setN4lsslCh(new BigDecimal(0));
                //含税价 1
                cjkdjckjhdmxerp.setN4dj(new BigDecimal(lists.getIsum().toString()));
                //批号 1
                cjkdjckjhdmxerp.setSph(lists.getCbatch());
//                cjkdjckjhdmxerp.setSph("lists.getCbatch()");
                // cjkdjckjhdmxerp.setSmjph("");

                //生产日期 1
                cjkdjckjhdmxerp.setDscrq(lists.getDmdate());
                //有效日期 1
                cjkdjckjhdmxerp.setDyxqz(lists.getDvdate());




                //erp 行号 1
                cjkdjckjhdmxerp.setNyhh(Long.valueOf(lists.getIrowno()));
                //时间 1
                cjkdjckjhdmxerp.setSsjc(formattedDate);
                //货主id 1
                cjkdjckjhdmxerp.setShzid("HXS");
                //备注
                //cjkdjckjhdmxerp.setSbz(puArrivalVouchs.getCmemo());
                //货主公司ID
                //cjkdjckjhdmxerp.setShzgsid("HXS");
                //cjkdjckjhdmxerp.setDgxsj(new Date());
                //仓库ID
                //cjkdjckjhdmxerp.setSgsid(lists.getCwhcode());
                System.out.println(cjkdjckjhdmxerp);
                System.out.println(icjkdjckjhdmxerpService.save(cjkdjckjhdmxerp));
            }


        }

    }

}