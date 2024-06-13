package org.jeecg.modules;

import org.jeecg.JeecgSystemApplication;
import org.jeecg.modules.link.entity.*;
import org.jeecg.modules.link.service.*;
import org.jeecg.modules.u8.entity.*;
import org.jeecg.modules.u8.mapper.VendorMapper;
import org.jeecg.modules.u8.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
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
public class CrudTest11 {

    @Autowired
    private IVendorService iVendorService;
    @Autowired
    private IPoPodetailsService iPoPodetailsService;
    @Autowired
    private IPoPomainService iPoPomainService;
    @Autowired
    private IVendorService vendorService;


    @Test
    public void dlJob() {
        List<Vendor> vendors = vendorService.selectNoSyn();
        for (Vendor vendor : vendors) {
            System.out.println(vendor);
        }


    }




    }



