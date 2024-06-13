package org.jeecg.modules.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.link.entity.CJKJCWLDW;
import org.jeecg.modules.link.entity.CustomerLink;
import org.jeecg.modules.link.entity.linkAutoId;
import org.jeecg.modules.link.service.ICJKJCWLDWService;
import org.jeecg.modules.link.service.ICustomerLinkService;
import org.jeecg.modules.link.service.IlinkAutoIdService;
import org.jeecg.modules.u8.entity.Customer;
import org.jeecg.modules.u8.entity.Vendor;
import org.jeecg.modules.u8.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class VendorJob {
    @Autowired
    private ICJKJCWLDWService icjkjcwldwService;
    @Autowired
    private IlinkAutoIdService ilinkAutoIdService;
    @Autowired
    private ICustomerLinkService customerLinkService;
    @Autowired
    private IVendorService iVendorService;


    public void Venjob(){
        List<Vendor> vendors = iVendorService.selectNoSyn();
        //获得id
        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer customerId = linkAutoId.getCustomerId();

        for (Vendor vendor : vendors) {

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
                cjkjcwldw.setShzgsid("L08");
                cjkjcwldw.setSkhyh("");
                cjkjcwldw.setSzh("");
                cjkjcwldw.setSsh("");

                //

                //接收备注
                cjkjcwldw.setSjsbz("u8");


                System.out.println(cjkjcwldw.toString());
                boolean save = icjkjcwldwService.save(cjkjcwldw);
                if (save) {
                    customerId++;
                    ilinkAutoIdService.uptateCustomerIdAdd();
                    customerLinkService.save(new CustomerLink().setErpid(vendor.getCvencode()));
                }

            }
    }
}
