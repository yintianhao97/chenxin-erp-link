package org.jeecg.modules.u8.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 发货单主表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Data
@TableName("DispatchList")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="DispatchList对象", description="发货单主表")
public class DispatchList {
    
	/**dlid*/
	@Excel(name = "dlid", width = 15)
    @ApiModelProperty(value = "dlid")
	private java.lang.Integer dlid;
	/**cdlcode*/
	@Excel(name = "cdlcode", width = 15)
    @ApiModelProperty(value = "cdlcode")
	private java.lang.String cdlcode;
	/**cvouchtype*/
	@Excel(name = "cvouchtype", width = 15)
    @ApiModelProperty(value = "cvouchtype")
	private java.lang.String cvouchtype;
	/**cstcode*/
	@Excel(name = "cstcode", width = 15)
    @ApiModelProperty(value = "cstcode")
	private java.lang.String cstcode;
	/**ddate*/
	@Excel(name = "ddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddate")
	private java.util.Date ddate;
	/**crdcode*/
	@Excel(name = "crdcode", width = 15)
    @ApiModelProperty(value = "crdcode")
	private java.lang.String crdcode;
	/**cdepcode*/
	@Excel(name = "cdepcode", width = 15)
    @ApiModelProperty(value = "cdepcode")
	private java.lang.String cdepcode;
	/**cpersoncode*/
	@Excel(name = "cpersoncode", width = 15)
    @ApiModelProperty(value = "cpersoncode")
	private java.lang.String cpersoncode;
	/**sbvid*/
	@Excel(name = "sbvid", width = 15)
    @ApiModelProperty(value = "sbvid")
	private java.lang.Integer sbvid;
	/**csbvcode*/
	@Excel(name = "csbvcode", width = 15)
    @ApiModelProperty(value = "csbvcode")
	private java.lang.String csbvcode;
	/**csocode*/
	@Excel(name = "csocode", width = 15)
    @ApiModelProperty(value = "csocode")
	private java.lang.String csocode;
	/**ccuscode*/
	@Excel(name = "ccuscode", width = 15)
    @ApiModelProperty(value = "ccuscode")
	private java.lang.String ccuscode;
	/**cpaycode*/
	@Excel(name = "cpaycode", width = 15)
    @ApiModelProperty(value = "cpaycode")
	private java.lang.String cpaycode;
	/**csccode*/
	@Excel(name = "csccode", width = 15)
    @ApiModelProperty(value = "csccode")
	private java.lang.String csccode;
	/**cshipaddress*/
	@Excel(name = "cshipaddress", width = 15)
    @ApiModelProperty(value = "cshipaddress")
	private java.lang.String cshipaddress;
	/**cexchName*/
	@Excel(name = "cexchName", width = 15)
    @ApiModelProperty(value = "cexchName")
	private java.lang.String cexchName;
	/**iexchrate*/
	@Excel(name = "iexchrate", width = 15)
    @ApiModelProperty(value = "iexchrate")
	private java.lang.Float iexchrate;
	/**itaxrate*/
	@Excel(name = "itaxrate", width = 15)
    @ApiModelProperty(value = "itaxrate")
	private java.lang.Float itaxrate;
	/**bfirst*/
	@Excel(name = "bfirst", width = 15)
    @ApiModelProperty(value = "bfirst")
	private java.lang.Object bfirst;
	/**breturnflag*/
	@Excel(name = "breturnflag", width = 15)
    @ApiModelProperty(value = "breturnflag")
	private java.lang.Object breturnflag;
	/**bsettleall*/
	@Excel(name = "bsettleall", width = 15)
    @ApiModelProperty(value = "bsettleall")
	private java.lang.Object bsettleall;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**csaleout*/
	@Excel(name = "csaleout", width = 15)
    @ApiModelProperty(value = "csaleout")
	private java.lang.String csaleout;
	/**cdefine1*/
	@Excel(name = "cdefine1", width = 15)
    @ApiModelProperty(value = "cdefine1")
	private java.lang.String cdefine1;
	/**cdefine2*/
	@Excel(name = "cdefine2", width = 15)
    @ApiModelProperty(value = "cdefine2")
	private java.lang.String cdefine2;
	/**cdefine3*/
	@Excel(name = "cdefine3", width = 15)
    @ApiModelProperty(value = "cdefine3")
	private java.lang.String cdefine3;
	/**cdefine4*/
	@Excel(name = "cdefine4", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cdefine4")
	private java.util.Date cdefine4;
	/**cdefine5*/
	@Excel(name = "cdefine5", width = 15)
    @ApiModelProperty(value = "cdefine5")
	private java.lang.Integer cdefine5;
	/**cdefine6*/
	@Excel(name = "cdefine6", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cdefine6")
	private java.util.Date cdefine6;
	/**cdefine7*/
	@Excel(name = "cdefine7", width = 15)
    @ApiModelProperty(value = "cdefine7")
	private java.lang.Float cdefine7;
	/**cdefine8*/
	@Excel(name = "cdefine8", width = 15)
    @ApiModelProperty(value = "cdefine8")
	private java.lang.String cdefine8;
	/**cdefine9*/
	@Excel(name = "cdefine9", width = 15)
    @ApiModelProperty(value = "cdefine9")
	private java.lang.String cdefine9;
	/**cdefine10*/
	@Excel(name = "cdefine10", width = 15)
    @ApiModelProperty(value = "cdefine10")
	private java.lang.String cdefine10;
	/**cverifier*/
	@Excel(name = "cverifier", width = 15)
    @ApiModelProperty(value = "cverifier")
	private java.lang.String cverifier;
	/**cmaker*/
	@Excel(name = "cmaker", width = 15)
    @ApiModelProperty(value = "cmaker")
	private java.lang.String cmaker;
	/**inetlock*/
	@Excel(name = "inetlock", width = 15)
    @ApiModelProperty(value = "inetlock")
	private java.lang.Object inetlock;
	/**isale*/
	@Excel(name = "isale", width = 15)
    @ApiModelProperty(value = "isale")
	private java.lang.Integer isale;
	/**ccusname*/
	@Excel(name = "ccusname", width = 15)
    @ApiModelProperty(value = "ccusname")
	private java.lang.String ccusname;
	/**ivtid*/
	@Excel(name = "ivtid", width = 15)
    @ApiModelProperty(value = "ivtid")
	private java.lang.Integer ivtid;

	/**cbustype*/
	@Excel(name = "cbustype", width = 15)
    @ApiModelProperty(value = "cbustype")
	private java.lang.String cbustype;

	/**ccloser*/
	@Excel(name = "ccloser", width = 15)
    @ApiModelProperty(value = "ccloser")
	private java.lang.String ccloser;
	/**caccounter*/
	@Excel(name = "caccounter", width = 15)
    @ApiModelProperty(value = "caccounter")
	private java.lang.String caccounter;
	/**ccrechpname*/
	@Excel(name = "ccrechpname", width = 15)
    @ApiModelProperty(value = "ccrechpname")
	private java.lang.String ccrechpname;
	/**cdefine11*/
	@Excel(name = "cdefine11", width = 15)
    @ApiModelProperty(value = "cdefine11")
	private java.lang.String cdefine11;
	/**cdefine12*/
	@Excel(name = "cdefine12", width = 15)
    @ApiModelProperty(value = "cdefine12")
	private java.lang.String cdefine12;
	/**cdefine13*/
	@Excel(name = "cdefine13", width = 15)
    @ApiModelProperty(value = "cdefine13")
	private java.lang.String cdefine13;
	/**cdefine14*/
	@Excel(name = "cdefine14", width = 15)
    @ApiModelProperty(value = "cdefine14")
	private java.lang.String cdefine14;
	/**cdefine15*/
	@Excel(name = "cdefine15", width = 15)
    @ApiModelProperty(value = "cdefine15")
	private java.lang.Integer cdefine15;
	/**cdefine16*/
	@Excel(name = "cdefine16", width = 15)
    @ApiModelProperty(value = "cdefine16")
	private java.lang.Float cdefine16;
	/**biafirst*/
	@Excel(name = "biafirst", width = 15)
    @ApiModelProperty(value = "biafirst")
	private java.lang.Object biafirst;
	/**ioutgolden*/
	@Excel(name = "ioutgolden", width = 15)
    @ApiModelProperty(value = "ioutgolden")
	private java.lang.Integer ioutgolden;
	/**cgatheringplan*/
	@Excel(name = "cgatheringplan", width = 15)
    @ApiModelProperty(value = "cgatheringplan")
	private java.lang.String cgatheringplan;
	/**dcreditstart*/
	@Excel(name = "dcreditstart", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcreditstart")
	private java.util.Date dcreditstart;
	/**dgatheringdate*/
	@Excel(name = "dgatheringdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dgatheringdate")
	private java.util.Date dgatheringdate;
	/**icreditdays*/
	@Excel(name = "icreditdays", width = 15)
    @ApiModelProperty(value = "icreditdays")
	private java.lang.Integer icreditdays;
	/**bcredit*/
	@Excel(name = "bcredit", width = 15)
    @ApiModelProperty(value = "bcredit")
	private java.lang.Object bcredit;
	/**caddcode*/
	@Excel(name = "caddcode", width = 15)
    @ApiModelProperty(value = "caddcode")
	private java.lang.String caddcode;
	/**iverifystate*/
	@Excel(name = "iverifystate", width = 15)
    @ApiModelProperty(value = "iverifystate")
	private java.lang.Integer iverifystate;
	/**ireturncount*/
	@Excel(name = "ireturncount", width = 15)
    @ApiModelProperty(value = "ireturncount")
	private java.lang.Integer ireturncount;
	/**iswfcontrolled*/
	@Excel(name = "iswfcontrolled", width = 15)
    @ApiModelProperty(value = "iswfcontrolled")
	private java.lang.Integer iswfcontrolled;
	/**icreditstate*/
	@Excel(name = "icreditstate", width = 15)
    @ApiModelProperty(value = "icreditstate")
	private java.lang.String icreditstate;
	/**barfirst*/
	@Excel(name = "barfirst", width = 15)
    @ApiModelProperty(value = "barfirst")
	private java.lang.Object barfirst;
	/**cmodifier*/
	@Excel(name = "cmodifier", width = 15)
    @ApiModelProperty(value = "cmodifier")
	private java.lang.String cmodifier;
	/**dmoddate*/
	@Excel(name = "dmoddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmoddate")
	private java.util.Date dmoddate;
	/**dverifydate*/
	@Excel(name = "dverifydate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dverifydate")
	private java.util.Date dverifydate;
	/**ccusperson*/
	@Excel(name = "ccusperson", width = 15)
    @ApiModelProperty(value = "ccusperson")
	private java.lang.String ccusperson;
	/**dcreatesystime*/
	@Excel(name = "dcreatesystime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcreatesystime")
	private java.util.Date dcreatesystime;
	/**dverifysystime*/
	@Excel(name = "dverifysystime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dverifysystime")
	private java.util.Date dverifysystime;
	/**dmodifysystime*/
	@Excel(name = "dmodifysystime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmodifysystime")
	private java.util.Date dmodifysystime;
	/**csvouchtype*/
	@Excel(name = "csvouchtype", width = 15)
    @ApiModelProperty(value = "csvouchtype")
	private java.lang.String csvouchtype;
	/**iflowid*/
	@Excel(name = "iflowid", width = 15)
    @ApiModelProperty(value = "iflowid")
	private java.lang.Integer iflowid;
	/**bsigncreate*/
	@Excel(name = "bsigncreate", width = 15)
    @ApiModelProperty(value = "bsigncreate")
	private java.lang.Object bsigncreate;
	/**bcashsale*/
	@Excel(name = "bcashsale", width = 15)
    @ApiModelProperty(value = "bcashsale")
	private java.lang.Object bcashsale;
	/**cgathingcode*/
	@Excel(name = "cgathingcode", width = 15)
    @ApiModelProperty(value = "cgathingcode")
	private java.lang.String cgathingcode;
	/**cchanger*/
	@Excel(name = "cchanger", width = 15)
    @ApiModelProperty(value = "cchanger")
	private java.lang.String cchanger;
	/**cchangememo*/
	@Excel(name = "cchangememo", width = 15)
    @ApiModelProperty(value = "cchangememo")
	private java.lang.String cchangememo;
	/**outid*/
	@Excel(name = "outid", width = 15)
    @ApiModelProperty(value = "outid")
	private java.lang.Object outid;
	/**bmustbook*/
	@Excel(name = "bmustbook", width = 15)
    @ApiModelProperty(value = "bmustbook")
	private java.lang.Object bmustbook;
	/**cbookdepcode*/
	@Excel(name = "cbookdepcode", width = 15)
    @ApiModelProperty(value = "cbookdepcode")
	private java.lang.String cbookdepcode;
	/**cbooktype*/
	@Excel(name = "cbooktype", width = 15)
    @ApiModelProperty(value = "cbooktype")
	private java.lang.String cbooktype;
	/**bsaused*/
	@Excel(name = "bsaused", width = 15)
    @ApiModelProperty(value = "bsaused")
	private java.lang.Object bsaused;
	/**bneedbill*/
	@Excel(name = "bneedbill", width = 15)
    @ApiModelProperty(value = "bneedbill")
	private java.lang.Object bneedbill;
	/**baccswitchflag*/
	@Excel(name = "baccswitchflag", width = 15)
    @ApiModelProperty(value = "baccswitchflag")
	private java.lang.Object baccswitchflag;
	/**iprintcount*/
	@Excel(name = "iprintcount", width = 15)
    @ApiModelProperty(value = "iprintcount")
	private java.lang.Integer iprintcount;
	/**ccuspersoncode*/
	@Excel(name = "ccuspersoncode", width = 15)
    @ApiModelProperty(value = "ccuspersoncode")
	private java.lang.String ccuspersoncode;
	/**csourcecode*/
	@Excel(name = "csourcecode", width = 15)
    @ApiModelProperty(value = "csourcecode")
	private java.lang.String csourcecode;
	/**bsaleoutcreatebill*/
	@Excel(name = "bsaleoutcreatebill", width = 15)
    @ApiModelProperty(value = "bsaleoutcreatebill")
	private java.lang.Object bsaleoutcreatebill;
	/**csysbarcode*/
	@Excel(name = "csysbarcode", width = 15)
    @ApiModelProperty(value = "csysbarcode")
	private java.lang.String csysbarcode;
	/**ccurrentauditor*/
	@Excel(name = "ccurrentauditor", width = 15)
    @ApiModelProperty(value = "ccurrentauditor")
	private java.lang.String ccurrentauditor;
	/**csscode*/
	@Excel(name = "csscode", width = 15)
    @ApiModelProperty(value = "csscode")
	private java.lang.String csscode;
	/**cinvoicecompany*/
	@Excel(name = "cinvoicecompany", width = 15)
    @ApiModelProperty(value = "cinvoicecompany")
	private java.lang.String cinvoicecompany;
	/**febweight*/
	@Excel(name = "febweight", width = 15)
    @ApiModelProperty(value = "febweight")
	private java.math.BigDecimal febweight;
	/**cebweightunit*/
	@Excel(name = "cebweightunit", width = 15)
    @ApiModelProperty(value = "cebweightunit")
	private java.lang.String cebweightunit;
	/**cebexpresscode*/
	@Excel(name = "cebexpresscode", width = 15)
    @ApiModelProperty(value = "cebexpresscode")
	private java.lang.String cebexpresscode;
	/**iebexpresscoid*/
	@Excel(name = "iebexpresscoid", width = 15)
    @ApiModelProperty(value = "iebexpresscoid")
	private java.lang.Integer iebexpresscoid;
	/**separateid*/
	@Excel(name = "separateid", width = 15)
    @ApiModelProperty(value = "separateid")
	private java.lang.Integer separateid;
	/**bnottogoldtax*/
	@Excel(name = "bnottogoldtax", width = 15)
    @ApiModelProperty(value = "bnottogoldtax")
	private java.lang.Integer bnottogoldtax;
	/**cebtrnumber*/
	@Excel(name = "cebtrnumber", width = 15)
    @ApiModelProperty(value = "cebtrnumber")
	private java.lang.String cebtrnumber;
	/**cebbuyer*/
	@Excel(name = "cebbuyer", width = 15)
    @ApiModelProperty(value = "cebbuyer")
	private java.lang.String cebbuyer;
	/**cebbuyernote*/
	@Excel(name = "cebbuyernote", width = 15)
    @ApiModelProperty(value = "cebbuyernote")
	private java.lang.String cebbuyernote;
	/**ccontactname*/
	@Excel(name = "ccontactname", width = 15)
    @ApiModelProperty(value = "ccontactname")
	private java.lang.String ccontactname;
	/**cebprovince*/
	@Excel(name = "cebprovince", width = 15)
    @ApiModelProperty(value = "cebprovince")
	private java.lang.String cebprovince;
	/**cebcity*/
	@Excel(name = "cebcity", width = 15)
    @ApiModelProperty(value = "cebcity")
	private java.lang.String cebcity;
	/**cebdistrict*/
	@Excel(name = "cebdistrict", width = 15)
    @ApiModelProperty(value = "cebdistrict")
	private java.lang.String cebdistrict;
	/**cmobilephone*/
	@Excel(name = "cmobilephone", width = 15)
    @ApiModelProperty(value = "cmobilephone")
	private java.lang.String cmobilephone;
	/**cinvoicecusname*/
	@Excel(name = "cinvoicecusname", width = 15)
    @ApiModelProperty(value = "cinvoicecusname")
	private java.lang.String cinvoicecusname;
	/**cweighter*/
	@Excel(name = "cweighter", width = 15)
    @ApiModelProperty(value = "cweighter")
	private java.lang.String cweighter;
	/**dweighttime*/
	@Excel(name = "dweighttime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dweighttime")
	private java.util.Date dweighttime;
	/**cpickvouchcode*/
	@Excel(name = "cpickvouchcode", width = 15)
    @ApiModelProperty(value = "cpickvouchcode")
	private java.lang.String cpickvouchcode;
	/**cgcroutecode*/
	@Excel(name = "cgcroutecode", width = 15)
    @ApiModelProperty(value = "cgcroutecode")
	private java.lang.String cgcroutecode;
}
