package org.jeecg.modules.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKDJCKJHDERP;
import org.jeecg.modules.link.entity.CJKDJCKJHDMXERP;
import org.jeecg.modules.link.entity.TuiHuoLink;
import org.jeecg.modules.link.service.ICJKDJCKJHDERPService;
import org.jeecg.modules.link.service.ICJKDJCKJHDMXERPService;
import org.jeecg.modules.link.service.ITuiHuoLinkService;
import org.jeecg.modules.u8.entity.Person;
import org.jeecg.modules.u8.entity.PuArrivalVouch;
import org.jeecg.modules.u8.entity.PuArrivalVouchs;
import org.jeecg.modules.u8.service.IPersonService;
import org.jeecg.modules.u8.service.IPuArrivalVouchService;
import org.jeecg.modules.u8.service.IPuArrivalVouchsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


/**
 * 销售退货
 */
@Slf4j
@Component
public class CaiGouTuiHuoJob {
    @Autowired
    private IPuArrivalVouchService iPuArrivalVouchService;
    @Autowired
    private IPuArrivalVouchsService iPuArrivalVouchsService;

    @Autowired
    private ICJKDJCKJHDERPService icjkdjckjhderpService;
    @Autowired
    private ICJKDJCKJHDMXERPService icjkdjckjhdmxerpService;

    @Autowired
    private ITuiHuoLinkService iTuiHuoLinkService;
    @Autowired
    private IPersonService iPersonService;


    //@Scheduled(cron = "0 0/5 * * * ? ")
    public void run() {
        List<PuArrivalVouch> tuiHuo = iPuArrivalVouchService.getTuiHuo();
        for (PuArrivalVouch puArrivalVouch : tuiHuo) {

            //主表
            CJKDJCKJHDERP cjkdjckjhderp = new CJKDJCKJHDERP();



           // cjkdjckjhderp.setDgxsj(new Date());
           // cjkdjckjhderp.setSgsid("");
            //线上线下?
           // cjkdjckjhderp.setNdjlx(0);

            //ID 1
            cjkdjckjhderp.setId(Long.valueOf(puArrivalVouch.getId()));

            //cjkdjckjhderp.setNjsbj(0);

            cjkdjckjhderp.setSjsbz("0");

           // cjkdjckjhderp.setNckdid(0L);
            //接口ID
            cjkdjckjhderp.setSjkid(puArrivalVouch.getId().toString());
            //单位ID 1
            cjkdjckjhderp.setSwldwid(puArrivalVouch.getCvencode());
            //出库类型 2采购出库 1
            cjkdjckjhderp.setNcklx(8L);
            //提货方式 0未定义 1
            cjkdjckjhderp.setNthfs(0L);
            //备注 1
            cjkdjckjhderp.setSbz(puArrivalVouch.getCmaker());

            //业务员 1
            String cpersoncode = puArrivalVouch.getCpersoncode();
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
            cjkdjckjhderp.setSzdr(puArrivalVouch.getCmaker());
            //cjkdjckjhderp.setCombrainTimes("");
           // cjkdjckjhderp.setShxbs("");
             // 1
            cjkdjckjhderp.setNck(1);
            //部门名称 1
            cjkdjckjhderp.setSbm(puArrivalVouch.getCdepcode());
            //货主ID 1
            cjkdjckjhderp.setShzid("HXS");
            cjkdjckjhderp.setShzname("");
            //货主公司ID 1
            cjkdjckjhderp.setShzgsid("HXS");
           /* //收货人 1
            cjkdjckjhderp.setShouhr("");
            //收货地址 1
            cjkdjckjhderp.setSzwdz(puArrivalVouch.getCarrivalplace());*/

            //System.out.println(cjkdjckjhderp);

            boolean save = icjkdjckjhderpService.save(cjkdjckjhderp);
            if (save) {
                iTuiHuoLinkService.save(new TuiHuoLink().setErpid(puArrivalVouch.getId().toString()));
            }

            List<PuArrivalVouchs> daohuoFByID = iPuArrivalVouchsService.getDaohuoFByID(puArrivalVouch.getId().toString());
            for (PuArrivalVouchs puArrivalVouchs : daohuoFByID) {
                                CJKDJCKJHDMXERP cjkdjckjhdmxerp = new CJKDJCKJHDMXERP();
                //ID 1
                cjkdjckjhdmxerp.setId(Long.valueOf(puArrivalVouchs.getAutoid()));
                //行号 1
                cjkdjckjhdmxerp.setNhh(puArrivalVouchs.getIvouchrowno().longValue());
                //单据code 1
                cjkdjckjhdmxerp.setSjkid(puArrivalVouch.getId().toString());
                //存货编码 1
                cjkdjckjhdmxerp.setSjkspid(puArrivalVouchs.getCinvcode());
                //
                cjkdjckjhdmxerp.setNckdid(0L);
                cjkdjckjhdmxerp.setNspid(0L);
                BigDecimal iquantity = puArrivalVouchs.getIquantity();

                //装件数  1
                cjkdjckjhdmxerp.setNjlgg(iquantity.longValue());
                //订单数量 1
                cjkdjckjhdmxerp.setN4jhsl(iquantity);
                //订单数量 1
                cjkdjckjhdmxerp.setN4sjsl(new BigDecimal(0));
                //
                cjkdjckjhdmxerp.setN4lsslCh(new BigDecimal(0));
                //含税价 1
                cjkdjckjhdmxerp.setN4dj(new BigDecimal(puArrivalVouchs.getIsum().toString()));
                //批号 1
                cjkdjckjhdmxerp.setSph(puArrivalVouchs.getCbatch());
//                cjkdjckjhdmxerp.setSph("lists.getCbatch()");
               // cjkdjckjhdmxerp.setSmjph("");

                //生产日期 1
                cjkdjckjhdmxerp.setDscrq(puArrivalVouchs.getDpdate());
                //有效日期 1
                cjkdjckjhdmxerp.setDyxqz(puArrivalVouchs.getDvdate());




                //erp 行号 1
                cjkdjckjhdmxerp.setNyhh(Long.valueOf(puArrivalVouchs.getIvouchrowno()));
                //时间 1
                cjkdjckjhdmxerp.setSsjc(formattedDate);




                //货主id 1
                cjkdjckjhdmxerp.setShzid("HXS");

                //备注
                //cjkdjckjhdmxerp.setSbz(puArrivalVouchs.getCmemo());
                //货主公司ID
                cjkdjckjhdmxerp.setShzgsid("HXS");
                cjkdjckjhdmxerp.setDgxsj(new Date());
                //仓库ID
                //cjkdjckjhdmxerp.setSgsid(lists.getCwhcode());
                System.out.println(cjkdjckjhdmxerp);
                System.out.println(icjkdjckjhdmxerpService.save(cjkdjckjhdmxerp));
            }


        }

    }
}
