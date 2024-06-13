package org.jeecg.modules.job;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKDJCKJHDERP;
import org.jeecg.modules.link.entity.CJKDJCKJHDMXERP;
import org.jeecg.modules.link.entity.DispatchListLink;
import org.jeecg.modules.link.service.ICJKDJCKJHDERPService;
import org.jeecg.modules.link.service.ICJKDJCKJHDMXERPService;
import org.jeecg.modules.link.service.IDispatchListLinkService;
import org.jeecg.modules.u8.entity.DispatchList;
import org.jeecg.modules.u8.entity.DispatchLists;
import org.jeecg.modules.u8.service.IDispatchListService;
import org.jeecg.modules.u8.service.IDispatchListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DispatchListJob {

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



    @Scheduled(cron = "0 0/5 * * * ? ")
    public void dlJob() {
        log.info("DispatchListJob定时任务开始执行");
        /*List<DispatchList> dispatchLists =
                dispatchListService.listType05();*/
        List<DispatchList> dispatchLists = null;
        for (DispatchList dispatchList : dispatchLists) {
            //主表
            CJKDJCKJHDERP cjkdjckjhderp = new CJKDJCKJHDERP();



            cjkdjckjhderp.setDgxsj(new Date());
            cjkdjckjhderp.setSgsid("");
            //线上线下? todo:这个怎么判断
            cjkdjckjhderp.setNdjlx(0);

            //ID
            cjkdjckjhderp.setId(Long.valueOf(dispatchList.getDlid()));
            cjkdjckjhderp.setNjsbj(0);
            cjkdjckjhderp.setSjsbz("u8");

            cjkdjckjhderp.setNckdid(0L);
            //接口ID
            cjkdjckjhderp.setSjkid(dispatchList.getCdlcode());
            //单位ID
            cjkdjckjhderp.setSwldwid(dispatchList.getCcuscode());
            //出库类型2采购出库
            cjkdjckjhderp.setNcklx(2L);
            //提货方式0未定义
            cjkdjckjhderp.setNthfs(0L);
            //备注
            cjkdjckjhderp.setSbz(dispatchList.getCmaker());
            //TODO:要修改获取名称
            //业务员
            /*String cpersoncode = dispatchList.getCpersoncode();
            //如果cpersoncode为空，则跳出循环
            if (cpersoncode == null) {
                continue;
            }*/
            cjkdjckjhderp.setSywymc(dispatchList.getCmaker());

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
            //制单人
            cjkdjckjhderp.setSzdr(dispatchList.getCmaker());
            cjkdjckjhderp.setCombrainTimes("");
            cjkdjckjhderp.setShxbs("");
            cjkdjckjhderp.setNck(1);
            //部门名称
            cjkdjckjhderp.setSbm("");
            //货主ID
            cjkdjckjhderp.setShzid("L08");
            cjkdjckjhderp.setShzname("");
            //货主公司ID
            cjkdjckjhderp.setShzgsid("L08");
            //收货人
            cjkdjckjhderp.setShouhr("");
            //收货地址
            cjkdjckjhderp.setSzwdz(dispatchList.getCshipaddress());

            //System.out.println(cjkdjckjhderp);
            boolean save = icjkdjckjhderpService.save(cjkdjckjhderp);
            if (save) {
                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(String.valueOf(dispatchList.getDlid()));
            for (DispatchLists lists : dispatchLists1) {
                CJKDJCKJHDMXERP cjkdjckjhdmxerp = new CJKDJCKJHDMXERP();
                cjkdjckjhdmxerp.setId(Long.valueOf(lists.getAutoid()));
                cjkdjckjhdmxerp.setNhh(Long.valueOf(lists.getIrowno()));
                //单据code
                cjkdjckjhdmxerp.setSjkid(dispatchList.getCdlcode());
                //存货编码
                cjkdjckjhdmxerp.setSjkspid(lists.getCinvcode());

                cjkdjckjhdmxerp.setNckdid(0L);
                cjkdjckjhdmxerp.setNspid(0L);
                BigDecimal iquantity = lists.getIquantity();

                //装件数
                cjkdjckjhdmxerp.setNjlgg(iquantity.longValue());
                cjkdjckjhdmxerp.setN4jhsl(iquantity);
                cjkdjckjhdmxerp.setN4sjsl(new BigDecimal(0));
                cjkdjckjhdmxerp.setN4lsslCh(new BigDecimal(0));
                cjkdjckjhdmxerp.setN4dj(lists.getInatunitprice());
                //批号
                cjkdjckjhdmxerp.setSph(lists.getCbatch());
//                cjkdjckjhdmxerp.setSph("lists.getCbatch()");
                cjkdjckjhdmxerp.setSmjph("");
                cjkdjckjhdmxerp.setDscrq(lists.getDmdate());

                String cexpirationdate = lists.getCexpirationdate();
                //判断cExpirationdate 是否为空或者null
                if (cexpirationdate != null && !"".equals(cexpirationdate)) {
                    //有效期至
                    SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
                    // 将字符串转换为Date对象
                    Date date = null;
                    try {
                        date = dateFormat1.parse(cexpirationdate);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    cjkdjckjhdmxerp.setDyxqz(date);
                }else {
                    cjkdjckjhdmxerp.setDyxqz(new Date());
                }



                //行号
                cjkdjckjhdmxerp.setNyhh(Long.valueOf(lists.getIrowno()));
                //时间
                cjkdjckjhdmxerp.setSsjc(formattedDate);




                //货主表示
                cjkdjckjhdmxerp.setShzid("L08");

                //备注
                cjkdjckjhdmxerp.setSbz(lists.getCmemo());
                //货主公司ID
                cjkdjckjhdmxerp.setShzgsid("L08");
                cjkdjckjhdmxerp.setDgxsj(new Date());
                //仓库ID
                //cjkdjckjhdmxerp.setSgsid(lists.getCwhcode());
                System.out.println(cjkdjckjhdmxerp);
                System.out.println(icjkdjckjhdmxerpService.save(cjkdjckjhdmxerp));
            }


        }

    }


    public void dlJob_bak() {
        List<DispatchList> dispatchLists = null;

        for (DispatchList dispatchList : dispatchLists) {
            //主表
            CJKDJCKJHDERP cjkdjckjhderp = new CJKDJCKJHDERP();



            cjkdjckjhderp.setDgxsj(new Date());
            cjkdjckjhderp.setSgsid("");
            //线上线下? todo:这个怎么判断
            cjkdjckjhderp.setNdjlx(0);

            //ID
            cjkdjckjhderp.setId(Long.valueOf(dispatchList.getDlid()));
            cjkdjckjhderp.setNjsbj(0);
            cjkdjckjhderp.setSjsbz("u8");

            cjkdjckjhderp.setNckdid(Long.valueOf(dispatchList.getDlid()));
            //接口ID
            cjkdjckjhderp.setSjkid(dispatchList.getCdlcode());
            //单位ID
            cjkdjckjhderp.setSwldwid(dispatchList.getCcuscode());
            //出库类型2采购出库
            cjkdjckjhderp.setNcklx(2L);
            //提货方式0未定义
            cjkdjckjhderp.setNthfs(0L);
            //备注
            cjkdjckjhderp.setSbz(dispatchList.getCmaker());
            //TODO:要修改获取名称
            //业务员
            String cpersoncode = dispatchList.getCpersoncode();
            //如果cpersoncode为空，则跳出循环
            if (cpersoncode == null) {
                continue;
            }
            cjkdjckjhderp.setSywymc(cpersoncode);
            //日期
            cjkdjckjhderp.setDzdrq(new Date());

            cjkdjckjhderp.setSysr("");
            cjkdjckjhderp.setDysrq(new Date());
            // 定义日期格式
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

            // 将Date对象转换为格式化的字符串
            String formattedDate = dateFormat.format(new Date());

            //时间
            cjkdjckjhderp.setSsjc(formattedDate);
            cjkdjckjhderp.setNchzt(0);
            //制单人
            cjkdjckjhderp.setSzdr(dispatchList.getCmaker());
            cjkdjckjhderp.setCombrainTimes("");
            cjkdjckjhderp.setShxbs("");
            cjkdjckjhderp.setNck(1);
            //部门名称
            cjkdjckjhderp.setSbm("");
            //货主ID
            cjkdjckjhderp.setShzid("L04");
            cjkdjckjhderp.setShzname("");
            //货主公司ID
            cjkdjckjhderp.setShzgsid("L04");
            //收货人
            cjkdjckjhderp.setShouhr("");
            //收货地址
            cjkdjckjhderp.setSzwdz(dispatchList.getCshipaddress());

            //System.out.println(cjkdjckjhderp);
            boolean save = icjkdjckjhderpService.save(cjkdjckjhderp);
            if (save) {
                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(String.valueOf(dispatchList.getDlid()));
            for (DispatchLists lists : dispatchLists1) {
                CJKDJCKJHDMXERP cjkdjckjhdmxerp = new CJKDJCKJHDMXERP();
                cjkdjckjhdmxerp.setId(Long.valueOf(lists.getAutoid()));
                cjkdjckjhdmxerp.setNhh(Long.valueOf(lists.getIrowno()));
                //单据code
                cjkdjckjhdmxerp.setSjkid(String.valueOf(lists.getDlid()));
                //存货编码
                cjkdjckjhdmxerp.setSjkspid(lists.getCinvcode());

/*                cjkdjckjhdmxerp.setNckdid(0L);
                cjkdjckjhdmxerp.setNspid(0L);*/
                BigDecimal iquantity = lists.getIquantity();

                //装件数
                cjkdjckjhdmxerp.setNjlgg(iquantity.longValue());
                cjkdjckjhdmxerp.setN4jhsl(iquantity);
                cjkdjckjhdmxerp.setN4sjsl(iquantity);
                cjkdjckjhdmxerp.setN4lsslCh(new BigDecimal(0));
                //批号
                cjkdjckjhdmxerp.setSph(lists.getCbatch());
//                cjkdjckjhdmxerp.setSph("lists.getCbatch()");
                cjkdjckjhdmxerp.setSmjph("");
                cjkdjckjhdmxerp.setDscrq(lists.getDmdate());

                String cexpirationdate = lists.getCexpirationdate();
                //判断cExpirationdate 是否为空或者null
                if (cexpirationdate != null && !"".equals(cexpirationdate)) {
                    //有效期至
                    SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
                    // 将字符串转换为Date对象
                    Date date = null;
                    try {
                        date = dateFormat1.parse(cexpirationdate);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    cjkdjckjhdmxerp.setDyxqz(date);
                }else {
                    cjkdjckjhdmxerp.setDyxqz(new Date());
                }



                //行号
                cjkdjckjhdmxerp.setNyhh(Long.valueOf(lists.getIrowno()));
                //时间
                cjkdjckjhdmxerp.setSsjc(formattedDate);




                //货主表示
                cjkdjckjhdmxerp.setShzid("L04");

                //备注
                cjkdjckjhdmxerp.setSbz(lists.getCmemo());
                //货主公司ID
                cjkdjckjhdmxerp.setShzgsid("L04");
                cjkdjckjhdmxerp.setDgxsj(new Date());
                //仓库ID
                cjkdjckjhdmxerp.setSgsid(lists.getCwhcode());
                System.out.println(cjkdjckjhdmxerp);
                System.out.println(icjkdjckjhdmxerpService.save(cjkdjckjhdmxerp));
            }


        }

    }


}
