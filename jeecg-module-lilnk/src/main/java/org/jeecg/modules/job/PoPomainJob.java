package org.jeecg.modules.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKWMSRKHZ;
import org.jeecg.modules.link.entity.CJKWMSRKMX;
import org.jeecg.modules.link.entity.Rdrecord10Link;
import org.jeecg.modules.link.service.ICJKWMSRKHZService;
import org.jeecg.modules.link.service.ICJKWMSRKMXService;
import org.jeecg.modules.u8.entity.PoPodetails;
import org.jeecg.modules.u8.entity.PoPomain;
import org.jeecg.modules.u8.service.IPoPodetailsService;
import org.jeecg.modules.u8.service.IPoPomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class PoPomainJob {

    @Autowired
    private IPoPodetailsService iPoPodetailsService;
    @Autowired
    private IPoPomainService iPoPomainService;

    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;




    public void rdJob() {
        log.info("Rdrecord10Job定时任务开始执行");
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
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);

            if (save) {
                //todo: 到时候 生成一下
                //iRdrecord10LinkService.save(new Rdrecord10Link().setErpid(rdrecord10.getId().toString()));
            }





            List<PoPodetails> poPodetails = iPoPodetailsService.selectById(poPomain.getPoid());
            for (PoPodetails poPodetail : poPodetails) {

                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号 1
                cjkwmsrkmx.setDjbh(String.valueOf(poPodetail.getPoid()));
                //行号 1
                cjkwmsrkmx.setDjSn(poPodetail.getIrowno());
                //商品编码 1
                cjkwmsrkmx.setSpid(poPodetail.getCinvcode());
                //数量 1
                cjkwmsrkmx.setJkjkjk(poPodetail.getIquantity());
                //单价 1
                cjkwmsrkmx.setDj(poPodetail.getIunitprice());
                //含税价 1  todo:自己算一下
                cjkwmsrkmx.setHshj(poPodetail.getIunitprice());
                //金额 1
                cjkwmsrkmx.setJe(new BigDecimal(poPodetail.getImoney().toString()));
                //含税金额 1
                cjkwmsrkmx.setHsje(new BigDecimal(poPodetail.getIsum().toString()));
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
