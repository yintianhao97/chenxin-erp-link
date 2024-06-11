package org.jeecg.modules;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import org.jeecg.JeecgSystemApplication;
import org.jeecg.common.api.dto.message.BusMessageDTO;
import org.jeecg.common.api.dto.message.BusTemplateMessageDTO;
import org.jeecg.common.api.dto.message.MessageDTO;
import org.jeecg.common.api.dto.message.TemplateMessageDTO;
import org.jeecg.common.constant.CommonConstant;
import org.jeecg.common.constant.enums.DySmsEnum;
import org.jeecg.common.constant.enums.EmailTemplateEnum;
import org.jeecg.common.constant.enums.MessageTypeEnum;
import org.jeecg.common.constant.enums.SysAnnmentTypeEnum;
import org.jeecg.common.system.api.ISysBaseAPI;
import org.jeecg.common.system.util.JwtUtil;
import org.jeecg.common.util.DySmsHelper;
import org.jeecg.common.util.RedisUtil;
import org.jeecg.common.util.RestUtil;
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
public class CrudTest {

    @Autowired
    private IInventoryService inventoryService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IDispatchListService dispatchListService;
    @Autowired
    private IDispatchListsService dispatchListsService;
    @Autowired
    private IRdrecord10Service rdrecord10Service;
    @Autowired
    private IRdrecords10Service rdrecords10Service;
    @Autowired
    private ICJKJCSPXXService icjkjcspxxService;
    @Autowired
    private ICJKJCWLDWService icjkjcwldwService;
    @Autowired
    private ICJKDJCKJHDERPService icjkdjckjhderpService;
    @Autowired
    private ICJKDJCKJHDMXERPService icjkdjckjhdmxerpService;
    @Autowired
    private ICJKWMSRKHZService icjkwmsrkhzService;
    @Autowired
    private ICJKWMSRKMXService icjkwmsrkmxService;
    @Autowired
    private ICustomerLinkService customerLinkService;
    @Autowired
    private IRdrecord10LinkService iRdrecord10LinkService;
    @Autowired
    private IDispatchListLinkService dispatchListLinkService;


    @Autowired
    private IInventoryLinkService iInventoryLinkService;

    @Autowired
    private IlinkAutoIdService ilinkAutoIdService;
    @Autowired
    private InventoryMapper inventoryMapper;
    @Test
    public void inventory() {
        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer inventoryId = linkAutoId.getInventoryId();
        Inventory inventory = inventoryMapper.selectCodeC03048();

            CJKJCSPXX cjkjcspxx = new CJKJCSPXX();
            cjkjcspxx.setId(inventoryId.longValue());
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
            //产地
            cjkjcspxx.setSspcd(inventory.getCaddress());

            String cinvmnemcode = inventory.getCinvmnemcode();
            if (cinvmnemcode == null || cinvmnemcode.equals("")) {
                cjkjcspxx.setSzjm(inventory.getCinvname());
            }else {
                cjkjcspxx.setSzjm(cinvmnemcode);
            }
            //有效标记
            cjkjcspxx.setNyxbj(1L);
            //批准文号
            cjkjcspxx.setSpjwh(inventory.getCfile());
            //生产厂家????
            cjkjcspxx.setSsccj(inventory.getCenterprise());

            cjkjcspxx.setN4zbzgg(1L);
            //单位重量
            Float iinvweight = inventory.getIinvweight();
            if (iinvweight == null) {
                iinvweight = 9999f;
            }
            cjkjcspxx.setNjlgg(iinvweight.longValue());
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
            cjkjcspxx.setNlx(0);
            cjkjcspxx.setSjx(inventory.getCinvdefine5());

            cjkjcspxx.setSscyr(inventory.getCinvdefine7());
           /* cjkjcspxx.setNyxbz(0);
            cjkjcspxx.setNgmpbj(0);
            cjkjcspxx.setNgspbj(0);
            cjkjcspxx.setNsybj(0);*/
            //分组类型
            //cjkjcspxx.setSspfq("");

            cjkjcspxx.setSfzlx("602");
            cjkjcspxx.setN4c(new BigDecimal("0"));
            cjkjcspxx.setN4k(new BigDecimal("0"));
            cjkjcspxx.setN4g(new BigDecimal("0"));

            //货主公司id
            cjkjcspxx.setShzgsid("L08");





    }

    @Test
    public void customerJob() {
        List<Customer> customers = customerService.selectNoSyn();

        linkAutoId linkAutoId = ilinkAutoIdService.selectBy1();
        Integer customerId = linkAutoId.getCustomerId();

        for (Customer customer : customers) {
            CJKJCWLDW cjkjcwldw = new CJKJCWLDW();
            cjkjcwldw.setId(customerId.longValue());
            //中文名称
            cjkjcwldw.setSdwmc(customer.getCcusname());
            //中文地址
            cjkjcwldw.setSzwdz(customer.getCcusaddress());

            //邮政编码
            String ccuspostcode = customer.getCcuspostcode();
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
            //传真
            cjkjcwldw.setSczhm(customer.getCcusfax());
            //电话
            cjkjcwldw.setSlxdh(customer.getCcusphone());
            //有效标志
            cjkjcwldw.setNyxbj(0);
            //助记码
            if (customer.getCcusmnemcode() == null || customer.getCcusmnemcode().equals("")) {
                cjkjcwldw.setSzjm(customer.getCcusname());
            }else {
                cjkjcwldw.setSzjm(customer.getCcusmnemcode());
            }
            //往来属性(0供应商,1客户,2：货主)
            cjkjcwldw.setNwlsx(1);
            cjkjcwldw.setNsfhz(0);
            cjkjcwldw.setSlxr("");
            cjkjcwldw.setSfrdb("");
            //电子监管网单位ID
            cjkjcwldw.setSdzjgwid("");
            cjkjcwldw.setSsjc("");
            cjkjcwldw.setSxlid("");

            //货主公司ID
            //TODO: 随便写一个先
            cjkjcwldw.setShzgsid("L08");
            cjkjcwldw.setSkhyh("");
            cjkjcwldw.setSzh("");
            cjkjcwldw.setSsh("");

            cjkjcwldw.setSckfbk("");
            //更新时间
            cjkjcwldw.setDgxsj(new Date());
            cjkjcwldw.setShengfen("");
            cjkjcwldw.setShiqu("");
            cjkjcwldw.setXianqu("");
            cjkjcwldw.setXiaozhen("");
            cjkjcwldw.setXiangxdz("");
            //cjkjcwldw.setId(0L);
            //
            cjkjcwldw.setNgxbj(1);
            cjkjcwldw.setNjsbj(0);
            //接收备注
            cjkjcwldw.setSjsbz("u8");
            //客户ID
            cjkjcwldw.setSwldwid(customer.getCcuscode());
            cjkjcwldw.setSjkdwbh(customer.getCcuscode());

            System.out.println(cjkjcwldw.toString());
            boolean save = icjkjcwldwService.save(cjkjcwldw);
            if (save) {
                customerId++;
                ilinkAutoIdService.uptateCustomerIdAdd();
                customerLinkService.save(new CustomerLink().setErpid(customer.getCcuscode()));
            }

        }


    }

    @Test
    public void dlJob() {
        List<DispatchList> dispatchLists =
                dispatchListService.listType05();
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

    @Test
    public void rdJob() {
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

            cjkwmsrkhz.setDwbh(rdrecord10.getCdepcode());

            ///货主id? 产成品入库哪里来的供货商
            cjkwmsrkhz.setShzid("L08");
            cjkwmsrkhz.setShzgsid("L08");

            cjkwmsrkhz.setSgsid("0101");

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
                cjkwmsrkmx.setShzid("L08");
                //货主公司ID
                cjkwmsrkmx.setShzgsid("L08");
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

}