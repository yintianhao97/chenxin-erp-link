package org.jeecg.modules.job;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKWMSRKHZ;
import org.jeecg.modules.link.entity.CJKWMSRKMX;
import org.jeecg.modules.link.entity.Rdrecord10Link;
import org.jeecg.modules.link.service.ICJKWMSRKHZService;
import org.jeecg.modules.link.service.ICJKWMSRKMXService;
import org.jeecg.modules.link.service.IRdrecord10LinkService;
import org.jeecg.modules.u8.entity.Rdrecord10;
import org.jeecg.modules.u8.entity.Rdrecords10;
import org.jeecg.modules.u8.service.IRdrecord10Service;
import org.jeecg.modules.u8.service.IRdrecords10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Rdrecord10Job {
    @Autowired
    private IRdrecord10Service rdrecord10Service;
    @Autowired
    private IRdrecords10Service rdrecords10Service;

    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;

    @Autowired
    private IRdrecord10LinkService iRdrecord10LinkService;


    /**
     * 产成品入库更新   应该是不用
     */
    //@Scheduled(cron = "0 0/5 * * * ? ")
    public void rdJob() {
        log.info("Rdrecord10Job定时任务开始执行");
        List<Rdrecord10> list = rdrecord10Service.selectNoSyn();
        for (Rdrecord10 rdrecord10 : list) {

            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            cjkwmsrkhz.setDgxsj(new Date());
            //单据编号
            cjkwmsrkhz.setDjbh(rdrecord10.getCcode());
            //仓库id
            cjkwmsrkhz.setSgsid(rdrecord10.getCwhcode());
            cjkwmsrkhz.setDjlx("1");
            cjkwmsrkhz.setSjkid(rdrecord10.getCcode());

            ///日期
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
            // 将Date对象转换为格式化的字符串
            String formattedDate = dateFormat.format(new Date());
            String formattedDateTime = dateFormatTime.format(new Date());

            ///日期
            cjkwmsrkhz.setRq(formattedDate);
            //单位
            //
            cjkwmsrkhz.setIsZx("否");
            cjkwmsrkhz.setOntime(formattedDateTime);
            cjkwmsrkhz.setUsername(rdrecord10.getCmaker());
            cjkwmsrkhz.setYwy(rdrecord10.getCmaker());

            cjkwmsrkhz.setDwbh(rdrecord10.getCvencode());

            ///货主id? 产成品入库哪里来的供货商
            cjkwmsrkhz.setShzid("HXS");
            cjkwmsrkhz.setShzgsid("HXS");

            //cjkwmsrkhz.setSgsid("0101");

            //System.out.println(cjkwmsrkhz);
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);
            if (save) {
                iRdrecord10LinkService.save(new Rdrecord10Link().setErpid(rdrecord10.getId().toString()));
            }



            List<Rdrecords10> rdrecords10s = rdrecords10Service.selectByMainId(rdrecord10.getId().toString());
            for (Rdrecords10 rdrecords10 : rdrecords10s) {
                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号
                cjkwmsrkmx.setDjbh(rdrecord10.getCcode());
                //行号
                cjkwmsrkmx.setDjSn(rdrecords10.getIrowno());
                //商品编码
                cjkwmsrkmx.setSpid(rdrecords10.getCinvcode());
                //默认0
                cjkwmsrkmx.setRecnum(rdrecords10.getIrowno());
                //相关单据编号?
                //cjkwmsrkmx.setXgdjbh(rdrecord10.getCcode());

                //cjkwmsrkmx.setJlgg(0);
                //cjkwmsrkmx.setBaozhshl(0);
                //cjkwmsrkmx.setLingsshl(new BigDecimal("0"));
                //数量
                cjkwmsrkmx.setJkjkjk(rdrecords10.getIquantity());
                //默认0
                cjkwmsrkmx.setYiwchsl(new BigDecimal("0"));
                /*//含税价
                cjkwmsrkmx.setHshj(new BigDecimal(rdrecords10.getIprice().toString()));*/
                //单价
                cjkwmsrkmx.setDj(rdrecords10.getIunitcost());


                cjkwmsrkmx.setHshj(rdrecords10.getIunitcost());
                //金额
                cjkwmsrkmx.setJe(new BigDecimal(rdrecords10.getIprice().toString()));
                cjkwmsrkmx.setHsje(new BigDecimal(rdrecords10.getIprice().toString()));
/*                cjkwmsrkmx.setShe(new BigDecimal("0"));
                cjkwmsrkmx.setHsje(new BigDecimal("0"));
                cjkwmsrkmx.setShlv(new BigDecimal("0"));*/
                //批号
                // cjkwmsrkmx.setPihao(rdrecords10.getCbatch());
                Date dmadedate = rdrecords10.getDmadedate();
                // 定义日期格式
                SimpleDateFormat dateFormat111 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");

                // 将Date对象转换为格式化的字符串
                String formattedDate111 = dateFormat123.format(new Date());
                //生产日期
                // cjkwmsrkmx.setBaozhiqi(formattedDate111);

                String cexpirationdate = rdrecords10.getCexpirationdate();

                //有效期
                //cjkwmsrkmx.setSxrq(cexpirationdate);
                //货主id
                cjkwmsrkmx.setShzid("HXS");
                //货主公司ID
                cjkwmsrkmx.setShzgsid("HXS");
                //更新日期
                cjkwmsrkmx.setDgxsj(new Date());
                //仓库ID
                //cjkwmsrkmx.setSgsid("0101");


                cjkwmsrkmx.setRkzt("0");
                cjkwmsrkmx.setShzt("0");
                cjkwmsrkmx.setYszt("0");
                System.out.println(cjkwmsrkmx);
                System.out.println(icjkwmsrkmxService.save(cjkwmsrkmx));

            }


        }

    }

    public void rdJob_bak() {
        List<Rdrecord10> list = rdrecord10Service.selectNoSyn();
        for (Rdrecord10 rdrecord10 : list) {

            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            cjkwmsrkhz.setDgxsj(new Date());
            //单据编号
            cjkwmsrkhz.setDjbh(rdrecord10.getCcode());
            //仓库id
            cjkwmsrkhz.setSgsid(rdrecord10.getCwhcode());
            cjkwmsrkhz.setDjlx("1");
            cjkwmsrkhz.setSjkid(rdrecord10.getCcode());
            ///日期
            ///货主id? 产成品入库哪里来的供货商
            cjkwmsrkhz.setShzid("L01");
            cjkwmsrkhz.setShzgsid("l01");

            //System.out.println(cjkwmsrkhz);
            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);
            if (save) {
                iRdrecord10LinkService.save(new Rdrecord10Link().setErpid(rdrecord10.getId().toString()));
            }



            List<Rdrecords10> rdrecords10s = rdrecords10Service.selectByMainId(rdrecord10.getId().toString());
            for (Rdrecords10 rdrecords10 : rdrecords10s) {
                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号
                cjkwmsrkmx.setDjbh(rdrecord10.getCcode());
                //行号
                cjkwmsrkmx.setDjSn(rdrecords10.getIrowno());
                //商品编码
                cjkwmsrkmx.setSpid(rdrecords10.getCinvcode());
                //默认0
                cjkwmsrkmx.setRecnum(0);
                //相关单据编号?
                cjkwmsrkmx.setXgdjbh(rdrecord10.getCcode());

                //cjkwmsrkmx.setJlgg(0);
                //cjkwmsrkmx.setBaozhshl(0);
                //cjkwmsrkmx.setLingsshl(new BigDecimal("0"));
                //数量
                cjkwmsrkmx.setJkjkjk(rdrecords10.getIquantity());
                //默认0
                cjkwmsrkmx.setYiwchsl(new BigDecimal("0"));
                /*//含税价
                cjkwmsrkmx.setHshj(new BigDecimal(rdrecords10.getIprice().toString()));*/
                //单价
                cjkwmsrkmx.setDj(rdrecords10.getIunitcost());


                cjkwmsrkmx.setHshj(rdrecords10.getIunitcost());
                //金额
                cjkwmsrkmx.setJe(new BigDecimal(rdrecords10.getIprice().toString()));
                cjkwmsrkmx.setHsje(new BigDecimal(rdrecords10.getIprice().toString()));
/*                cjkwmsrkmx.setShe(new BigDecimal("0"));
                cjkwmsrkmx.setHsje(new BigDecimal("0"));
                cjkwmsrkmx.setShlv(new BigDecimal("0"));*/
                //批号
                cjkwmsrkmx.setPihao(rdrecords10.getCbatch());
                Date dmadedate = rdrecords10.getDmadedate();
                // 定义日期格式
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");

                // 将Date对象转换为格式化的字符串
                String formattedDate = dateFormat123.format(new Date());
                //生产日期
                cjkwmsrkmx.setBaozhiqi(formattedDate);

                String cexpirationdate = rdrecords10.getCexpirationdate();

                //有效期
                cjkwmsrkmx.setSxrq(cexpirationdate);
                //货主id
                cjkwmsrkmx.setShzid("L01");
                //货主公司ID
                cjkwmsrkmx.setShzgsid("l01");
                //更新日期
                cjkwmsrkmx.setDgxsj(new Date());
                //仓库ID
                cjkwmsrkmx.setSgsid(rdrecord10.getCwhcode());

                System.out.println(cjkwmsrkmx);
                System.out.println(icjkwmsrkmxService.save(cjkwmsrkmx));

            }


        }

    }
}
