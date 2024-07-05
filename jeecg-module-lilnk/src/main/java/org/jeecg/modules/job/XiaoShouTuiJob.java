package org.jeecg.modules.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKWMSRKHZ;
import org.jeecg.modules.link.entity.CJKWMSRKMX;
import org.jeecg.modules.link.entity.DispatchListLink;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.DispatchList;
import org.jeecg.modules.u8.entity.DispatchLists;
import org.jeecg.modules.u8.service.IDispatchListService;
import org.jeecg.modules.u8.service.IDispatchListsService;
import org.jeecg.modules.u8.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class XiaoShouTuiJob {
    @Autowired
    private IDispatchListService dispatchListService;
    @Autowired
    private IDispatchListsService dispatchListsService;
    @Autowired
    private IDispatchListLinkService dispatchListLinkService;

    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;
    @Autowired
    private IPersonService iPersonService;


    /**
     * 销售退货
     */
    //@Scheduled(cron = "0 0/5 * * * ? ")
    public void run() {
        List<DispatchList> dispatchLists = dispatchListService.selectNoSynTui();

        for (DispatchList dispatchList : dispatchLists) {


            CJKWMSRKHZ cjkwmsrkhz = new CJKWMSRKHZ();
            //单据编号 1
            cjkwmsrkhz.setDjbh(dispatchList.getDlid().toString());

            //单据类型，1入库，2销售退回 1
            cjkwmsrkhz.setDjlx("2");
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
            cjkwmsrkhz.setUsername(dispatchList.getCmaker());
            //业务员 1
            String cpersoncode = dispatchList.getCpersoncode();
            if (cpersoncode != null){
                String codeByName = iPersonService.getCodeByName(cpersoncode);
                cjkwmsrkhz.setYwy(codeByName);
            }else {
                cjkwmsrkhz.setYwy("");
            }

            //单位内码 1  TODO:这个是供货商CODE
            cjkwmsrkhz.setDwbh(dispatchList.getCdepcode());
            ///货主id? 产成品入库哪里来的供货商 1
            cjkwmsrkhz.setShzid("HXS");

            boolean save = icjkwmsrkhzService.save(cjkwmsrkhz);

            if (save) {

                dispatchListLinkService.save(new DispatchListLink().setErpid(dispatchList.getDlid().toString()));
            }


            List<DispatchLists> dispatchLists1 = dispatchListsService.selectById(dispatchList.getDlid().toString());


            for (DispatchLists lists : dispatchLists1) {

                CJKWMSRKMX cjkwmsrkmx = new CJKWMSRKMX();
                //单据编号 1
                cjkwmsrkmx.setDjbh(dispatchList.getDlid().toString());
                //行号 1
                cjkwmsrkmx.setDjSn(lists.getIrowno());
                //商品编码 1
                cjkwmsrkmx.setSpid(lists.getCinvcode());
                //数量 1
                cjkwmsrkmx.setJkjkjk(lists.getIquantity());
                //单价 1
                cjkwmsrkmx.setDj(lists.getIunitprice());
                //含税价 1  todo:自己算一下
                cjkwmsrkmx.setHshj(lists.getIunitprice());
                //金额 1
                cjkwmsrkmx.setJe(new BigDecimal(lists.getImoney().toString()));
                //含税金额 1
                cjkwmsrkmx.setHsje(new BigDecimal(lists.getIsum().toString()));
                // 定义日期格式
                SimpleDateFormat dateFormat111 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat dateFormat123 = new SimpleDateFormat("yyyy-MM-dd");
                // 将Date对象转换为格式化的字符串
                String formattedDate111 = dateFormat123.format(new Date());
                //货主id 1
                cjkwmsrkmx.setShzid("HXS");

                System.out.println(cjkwmsrkmx);
                System.out.println(icjkwmsrkmxService.save(cjkwmsrkmx));

            }


        }


    }
}
