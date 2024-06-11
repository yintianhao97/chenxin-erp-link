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
 * @Description: 客户档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Data
@TableName("Customer")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Customer对象", description="客户档案")
public class Customer {
    
	/**ccuscode*/
	@Excel(name = "ccuscode", width = 15)
    @ApiModelProperty(value = "ccuscode")
	private java.lang.String ccuscode;
	/**ccusname*/
	@Excel(name = "ccusname", width = 15)
    @ApiModelProperty(value = "ccusname")
	private java.lang.String ccusname;
	/**ccusabbname*/
	@Excel(name = "ccusabbname", width = 15)
    @ApiModelProperty(value = "ccusabbname")
	private java.lang.String ccusabbname;
	/**ccccode*/
	@Excel(name = "ccccode", width = 15)
    @ApiModelProperty(value = "ccccode")
	private java.lang.String ccccode;
	/**cdccode*/
	@Excel(name = "cdccode", width = 15)
    @ApiModelProperty(value = "cdccode")
	private java.lang.String cdccode;
	/**ctrade*/
	@Excel(name = "ctrade", width = 15)
    @ApiModelProperty(value = "ctrade")
	private java.lang.String ctrade;
	/**ccusaddress*/
	@Excel(name = "ccusaddress", width = 15)
    @ApiModelProperty(value = "ccusaddress")
	private java.lang.String ccusaddress;
	/**ccuspostcode*/
	@Excel(name = "ccuspostcode", width = 15)
    @ApiModelProperty(value = "ccuspostcode")
	private java.lang.String ccuspostcode;
	/**ccusregcode*/
	@Excel(name = "ccusregcode", width = 15)
    @ApiModelProperty(value = "ccusregcode")
	private java.lang.String ccusregcode;
	/**ccusbank*/
	@Excel(name = "ccusbank", width = 15)
    @ApiModelProperty(value = "ccusbank")
	private java.lang.String ccusbank;
	/**ccusaccount*/
	@Excel(name = "ccusaccount", width = 15)
    @ApiModelProperty(value = "ccusaccount")
	private java.lang.String ccusaccount;
	/**dcusdevdate*/
	@Excel(name = "dcusdevdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcusdevdate")
	private java.util.Date dcusdevdate;
	/**ccuslperson*/
	@Excel(name = "ccuslperson", width = 15)
    @ApiModelProperty(value = "ccuslperson")
	private java.lang.String ccuslperson;
	/**ccusemail*/
	@Excel(name = "ccusemail", width = 15)
    @ApiModelProperty(value = "ccusemail")
	private java.lang.String ccusemail;
	/**ccusperson*/
	@Excel(name = "ccusperson", width = 15)
    @ApiModelProperty(value = "ccusperson")
	private java.lang.String ccusperson;
	/**ccusphone*/
	@Excel(name = "ccusphone", width = 15)
    @ApiModelProperty(value = "ccusphone")
	private java.lang.String ccusphone;
	/**ccusfax*/
	@Excel(name = "ccusfax", width = 15)
    @ApiModelProperty(value = "ccusfax")
	private java.lang.String ccusfax;
	/**ccusbp*/
	@Excel(name = "ccusbp", width = 15)
    @ApiModelProperty(value = "ccusbp")
	private java.lang.String ccusbp;
	/**ccushand*/
	@Excel(name = "ccushand", width = 15)
    @ApiModelProperty(value = "ccushand")
	private java.lang.String ccushand;
	/**ccuspperson*/
	@Excel(name = "ccuspperson", width = 15)
    @ApiModelProperty(value = "ccuspperson")
	private java.lang.String ccuspperson;
	/**icusdisrate*/
	@Excel(name = "icusdisrate", width = 15)
    @ApiModelProperty(value = "icusdisrate")
	private java.lang.Float icusdisrate;
	/**ccuscregrade*/
	@Excel(name = "ccuscregrade", width = 15)
    @ApiModelProperty(value = "ccuscregrade")
	private java.lang.String ccuscregrade;
	/**icuscreline*/
	@Excel(name = "icuscreline", width = 15)
    @ApiModelProperty(value = "icuscreline")
	private java.lang.Float icuscreline;
	/**icuscredate*/
	@Excel(name = "icuscredate", width = 15)
    @ApiModelProperty(value = "icuscredate")
	private java.lang.Integer icuscredate;
	/**ccuspaycond*/
	@Excel(name = "ccuspaycond", width = 15)
    @ApiModelProperty(value = "ccuspaycond")
	private java.lang.String ccuspaycond;
	/**ccusoaddress*/
	@Excel(name = "ccusoaddress", width = 15)
    @ApiModelProperty(value = "ccusoaddress")
	private java.lang.String ccusoaddress;
	/**ccusotype*/
	@Excel(name = "ccusotype", width = 15)
    @ApiModelProperty(value = "ccusotype")
	private java.lang.String ccusotype;
	/**ccusheadcode*/
	@Excel(name = "ccusheadcode", width = 15)
    @ApiModelProperty(value = "ccusheadcode")
	private java.lang.String ccusheadcode;
	/**ccuswhcode*/
	@Excel(name = "ccuswhcode", width = 15)
    @ApiModelProperty(value = "ccuswhcode")
	private java.lang.String ccuswhcode;
	/**ccusdepart*/
	@Excel(name = "ccusdepart", width = 15)
    @ApiModelProperty(value = "ccusdepart")
	private java.lang.String ccusdepart;
	/**iarmoney*/
	@Excel(name = "iarmoney", width = 15)
    @ApiModelProperty(value = "iarmoney")
	private java.lang.Float iarmoney;
	/**dlastdate*/
	@Excel(name = "dlastdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlastdate")
	private java.util.Date dlastdate;
	/**ilastmoney*/
	@Excel(name = "ilastmoney", width = 15)
    @ApiModelProperty(value = "ilastmoney")
	private java.lang.Float ilastmoney;
	/**dlrdate*/
	@Excel(name = "dlrdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlrdate")
	private java.util.Date dlrdate;
	/**ilrmoney*/
	@Excel(name = "ilrmoney", width = 15)
    @ApiModelProperty(value = "ilrmoney")
	private java.lang.Float ilrmoney;
	/**denddate*/
	@Excel(name = "denddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "denddate")
	private java.util.Date denddate;
	/**ifrequency*/
	@Excel(name = "ifrequency", width = 15)
    @ApiModelProperty(value = "ifrequency")
	private java.lang.Integer ifrequency;
	/**ccusdefine1*/
	@Excel(name = "ccusdefine1", width = 15)
    @ApiModelProperty(value = "ccusdefine1")
	private java.lang.String ccusdefine1;
	/**ccusdefine2*/
	@Excel(name = "ccusdefine2", width = 15)
    @ApiModelProperty(value = "ccusdefine2")
	private java.lang.String ccusdefine2;
	/**ccusdefine3*/
	@Excel(name = "ccusdefine3", width = 15)
    @ApiModelProperty(value = "ccusdefine3")
	private java.lang.String ccusdefine3;
	/**icostgrade*/
	@Excel(name = "icostgrade", width = 15)
    @ApiModelProperty(value = "icostgrade")
	private java.lang.Integer icostgrade;
	/**ccreateperson*/
	@Excel(name = "ccreateperson", width = 15)
    @ApiModelProperty(value = "ccreateperson")
	private java.lang.String ccreateperson;
	/**cmodifyperson*/
	@Excel(name = "cmodifyperson", width = 15)
    @ApiModelProperty(value = "cmodifyperson")
	private java.lang.String cmodifyperson;
	/**dmodifydate*/
	@Excel(name = "dmodifydate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmodifydate")
	private java.util.Date dmodifydate;
	/**crelvendor*/
	@Excel(name = "crelvendor", width = 15)
    @ApiModelProperty(value = "crelvendor")
	private java.lang.String crelvendor;
	/**iid*/
	@Excel(name = "iid", width = 15)
    @ApiModelProperty(value = "iid")
	private java.lang.String iid;
	/**cpricegroup*/
	@Excel(name = "cpricegroup", width = 15)
    @ApiModelProperty(value = "cpricegroup")
	private java.lang.String cpricegroup;
	/**coffergrade*/
	@Excel(name = "coffergrade", width = 15)
    @ApiModelProperty(value = "coffergrade")
	private java.lang.String coffergrade;
	/**iofferrate*/
	@Excel(name = "iofferrate", width = 15)
    @ApiModelProperty(value = "iofferrate")
	private java.lang.Float iofferrate;
	/**ccusdefine4*/
	@Excel(name = "ccusdefine4", width = 15)
    @ApiModelProperty(value = "ccusdefine4")
	private java.lang.String ccusdefine4;
	/**ccusdefine5*/
	@Excel(name = "ccusdefine5", width = 15)
    @ApiModelProperty(value = "ccusdefine5")
	private java.lang.String ccusdefine5;
	/**ccusdefine6*/
	@Excel(name = "ccusdefine6", width = 15)
    @ApiModelProperty(value = "ccusdefine6")
	private java.lang.String ccusdefine6;
	/**ccusdefine7*/
	@Excel(name = "ccusdefine7", width = 15)
    @ApiModelProperty(value = "ccusdefine7")
	private java.lang.String ccusdefine7;
	/**ccusdefine8*/
	@Excel(name = "ccusdefine8", width = 15)
    @ApiModelProperty(value = "ccusdefine8")
	private java.lang.String ccusdefine8;
	/**ccusdefine9*/
	@Excel(name = "ccusdefine9", width = 15)
    @ApiModelProperty(value = "ccusdefine9")
	private java.lang.String ccusdefine9;
	/**ccusdefine10*/
	@Excel(name = "ccusdefine10", width = 15)
    @ApiModelProperty(value = "ccusdefine10")
	private java.lang.String ccusdefine10;
	/**ccusdefine11*/
	@Excel(name = "ccusdefine11", width = 15)
    @ApiModelProperty(value = "ccusdefine11")
	private java.lang.Integer ccusdefine11;
	/**ccusdefine12*/
	@Excel(name = "ccusdefine12", width = 15)
    @ApiModelProperty(value = "ccusdefine12")
	private java.lang.Integer ccusdefine12;
	/**ccusdefine13*/
	@Excel(name = "ccusdefine13", width = 15)
    @ApiModelProperty(value = "ccusdefine13")
	private java.lang.Float ccusdefine13;
	/**ccusdefine14*/
	@Excel(name = "ccusdefine14", width = 15)
    @ApiModelProperty(value = "ccusdefine14")
	private java.lang.Float ccusdefine14;
	/**ccusdefine15*/
	@Excel(name = "ccusdefine15", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ccusdefine15")
	private java.util.Date ccusdefine15;
	/**ccusdefine16*/
	@Excel(name = "ccusdefine16", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ccusdefine16")
	private java.util.Date ccusdefine16;

	/**cinvoicecompany*/
	@Excel(name = "cinvoicecompany", width = 15)
    @ApiModelProperty(value = "cinvoicecompany")
	private java.lang.String cinvoicecompany;
	/**bcredit*/
	@Excel(name = "bcredit", width = 15)
    @ApiModelProperty(value = "bcredit")
	private java.lang.Object bcredit;
	/**bcreditdate*/
	@Excel(name = "bcreditdate", width = 15)
    @ApiModelProperty(value = "bcreditdate")
	private java.lang.Object bcreditdate;
	/**bcreditbyhead*/
	@Excel(name = "bcreditbyhead", width = 15)
    @ApiModelProperty(value = "bcreditbyhead")
	private java.lang.Object bcreditbyhead;
	/**blicencedate*/
	@Excel(name = "blicencedate", width = 15)
    @ApiModelProperty(value = "blicencedate")
	private java.lang.Object blicencedate;
	/**dlicencesdate*/
	@Excel(name = "dlicencesdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlicencesdate")
	private java.util.Date dlicencesdate;
	/**dlicenceedate*/
	@Excel(name = "dlicenceedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlicenceedate")
	private java.util.Date dlicenceedate;
	/**ilicenceadays*/
	@Excel(name = "ilicenceadays", width = 15)
    @ApiModelProperty(value = "ilicenceadays")
	private java.lang.Integer ilicenceadays;
	/**bbusinessdate*/
	@Excel(name = "bbusinessdate", width = 15)
    @ApiModelProperty(value = "bbusinessdate")
	private java.lang.Object bbusinessdate;
	/**dbusinesssdate*/
	@Excel(name = "dbusinesssdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dbusinesssdate")
	private java.util.Date dbusinesssdate;
	/**dbusinessedate*/
	@Excel(name = "dbusinessedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dbusinessedate")
	private java.util.Date dbusinessedate;
	/**ibusinessadays*/
	@Excel(name = "ibusinessadays", width = 15)
    @ApiModelProperty(value = "ibusinessadays")
	private java.lang.Integer ibusinessadays;
	/**bproxy*/
	@Excel(name = "bproxy", width = 15)
    @ApiModelProperty(value = "bproxy")
	private java.lang.Object bproxy;
	/**dproxysdate*/
	@Excel(name = "dproxysdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dproxysdate")
	private java.util.Date dproxysdate;
	/**dproxyedate*/
	@Excel(name = "dproxyedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dproxyedate")
	private java.util.Date dproxyedate;
	/**iproxyadays*/
	@Excel(name = "iproxyadays", width = 15)
    @ApiModelProperty(value = "iproxyadays")
	private java.lang.Integer iproxyadays;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**blimitsale*/
	@Excel(name = "blimitsale", width = 15)
    @ApiModelProperty(value = "blimitsale")
	private java.lang.Object blimitsale;
	/**ccuscontactcode*/
	@Excel(name = "ccuscontactcode", width = 15)
    @ApiModelProperty(value = "ccuscontactcode")
	private java.lang.Object ccuscontactcode;
	/**ccuscountrycode*/
	@Excel(name = "ccuscountrycode", width = 15)
    @ApiModelProperty(value = "ccuscountrycode")
	private java.lang.String ccuscountrycode;
	/**ccusenname*/
	@Excel(name = "ccusenname", width = 15)
    @ApiModelProperty(value = "ccusenname")
	private java.lang.String ccusenname;
	/**ccusenaddr1*/
	@Excel(name = "ccusenaddr1", width = 15)
    @ApiModelProperty(value = "ccusenaddr1")
	private java.lang.String ccusenaddr1;
	/**ccusenaddr2*/
	@Excel(name = "ccusenaddr2", width = 15)
    @ApiModelProperty(value = "ccusenaddr2")
	private java.lang.String ccusenaddr2;
	/**ccusenaddr3*/
	@Excel(name = "ccusenaddr3", width = 15)
    @ApiModelProperty(value = "ccusenaddr3")
	private java.lang.String ccusenaddr3;
	/**ccusenaddr4*/
	@Excel(name = "ccusenaddr4", width = 15)
    @ApiModelProperty(value = "ccusenaddr4")
	private java.lang.String ccusenaddr4;
	/**ccusportcode*/
	@Excel(name = "ccusportcode", width = 15)
    @ApiModelProperty(value = "ccusportcode")
	private java.lang.String ccusportcode;
	/**cprimaryven*/
	@Excel(name = "cprimaryven", width = 15)
    @ApiModelProperty(value = "cprimaryven")
	private java.lang.String cprimaryven;
	/**fcommisionrate*/
	@Excel(name = "fcommisionrate", width = 15)
    @ApiModelProperty(value = "fcommisionrate")
	private java.lang.Float fcommisionrate;
	/**finsuerate*/
	@Excel(name = "finsuerate", width = 15)
    @ApiModelProperty(value = "finsuerate")
	private java.lang.Float finsuerate;
	/**bhomebranch*/
	@Excel(name = "bhomebranch", width = 15)
    @ApiModelProperty(value = "bhomebranch")
	private java.lang.Object bhomebranch;
	/**cbranchaddr*/
	@Excel(name = "cbranchaddr", width = 15)
    @ApiModelProperty(value = "cbranchaddr")
	private java.lang.String cbranchaddr;
	/**cbranchphone*/
	@Excel(name = "cbranchphone", width = 15)
    @ApiModelProperty(value = "cbranchphone")
	private java.lang.String cbranchphone;
	/**cbranchperson*/
	@Excel(name = "cbranchperson", width = 15)
    @ApiModelProperty(value = "cbranchperson")
	private java.lang.String cbranchperson;
	/**ccustradeccode*/
	@Excel(name = "ccustradeccode", width = 15)
    @ApiModelProperty(value = "ccustradeccode")
	private java.lang.String ccustradeccode;
	/**customerkcode*/
	@Excel(name = "customerkcode", width = 15)
    @ApiModelProperty(value = "customerkcode")
	private java.lang.String customerkcode;
	/**bcusstate*/
	@Excel(name = "bcusstate", width = 15)
    @ApiModelProperty(value = "bcusstate")
	private java.lang.Object bcusstate;
	/**bshop*/
	@Excel(name = "bshop", width = 15)
    @ApiModelProperty(value = "bshop")
	private java.lang.Integer bshop;
	/**ccusbankcode*/
	@Excel(name = "ccusbankcode", width = 15)
    @ApiModelProperty(value = "ccusbankcode")
	private java.lang.String ccusbankcode;
	/**ccusexchName*/
	@Excel(name = "ccusexchName", width = 15)
    @ApiModelProperty(value = "ccusexchName")
	private java.lang.String ccusexchName;
	/**icusgsptype*/
	@Excel(name = "icusgsptype", width = 15)
    @ApiModelProperty(value = "icusgsptype")
	private java.lang.Integer icusgsptype;
	/**icusgspauth*/
	@Excel(name = "icusgspauth", width = 15)
    @ApiModelProperty(value = "icusgspauth")
	private java.lang.Integer icusgspauth;
	/**ccusgspauthno*/
	@Excel(name = "ccusgspauthno", width = 15)
    @ApiModelProperty(value = "ccusgspauthno")
	private java.lang.String ccusgspauthno;
	/**ccusbusinessno*/
	@Excel(name = "ccusbusinessno", width = 15)
    @ApiModelProperty(value = "ccusbusinessno")
	private java.lang.String ccusbusinessno;
	/**ccuslicenceno*/
	@Excel(name = "ccuslicenceno", width = 15)
    @ApiModelProperty(value = "ccuslicenceno")
	private java.lang.String ccuslicenceno;
	/**bcusdomestic*/
	@Excel(name = "bcusdomestic", width = 15)
    @ApiModelProperty(value = "bcusdomestic")
	private java.lang.Object bcusdomestic;
	/**bcusoverseas*/
	@Excel(name = "bcusoverseas", width = 15)
    @ApiModelProperty(value = "bcusoverseas")
	private java.lang.Object bcusoverseas;
	/**ccuscreditcompany*/
	@Excel(name = "ccuscreditcompany", width = 15)
    @ApiModelProperty(value = "ccuscreditcompany")
	private java.lang.String ccuscreditcompany;
	/**ccussaprotocol*/
	@Excel(name = "ccussaprotocol", width = 15)
    @ApiModelProperty(value = "ccussaprotocol")
	private java.lang.String ccussaprotocol;
	/**ccusexprotocol*/
	@Excel(name = "ccusexprotocol", width = 15)
    @ApiModelProperty(value = "ccusexprotocol")
	private java.lang.String ccusexprotocol;
	/**ccusotherprotocol*/
	@Excel(name = "ccusotherprotocol", width = 15)
    @ApiModelProperty(value = "ccusotherprotocol")
	private java.lang.String ccusotherprotocol;
	/**fcusdiscountrate*/
	@Excel(name = "fcusdiscountrate", width = 15)
    @ApiModelProperty(value = "fcusdiscountrate")
	private java.lang.Float fcusdiscountrate;
	/**ccussscode*/
	@Excel(name = "ccussscode", width = 15)
    @ApiModelProperty(value = "ccussscode")
	private java.lang.String ccussscode;
	/**ccuscmprotocol*/
	@Excel(name = "ccuscmprotocol", width = 15)
    @ApiModelProperty(value = "ccuscmprotocol")
	private java.lang.String ccuscmprotocol;
	/**dcuscreatedatetime*/
	@Excel(name = "dcuscreatedatetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcuscreatedatetime")
	private java.util.Date dcuscreatedatetime;
	/**ccusappdocno*/
	@Excel(name = "ccusappdocno", width = 15)
    @ApiModelProperty(value = "ccusappdocno")
	private java.lang.String ccusappdocno;
	/**ccusmnemcode*/
	@Excel(name = "ccusmnemcode", width = 15)
    @ApiModelProperty(value = "ccusmnemcode")
	private java.lang.String ccusmnemcode;
	/**fadvancepaymentratio*/
	@Excel(name = "fadvancepaymentratio", width = 15)
    @ApiModelProperty(value = "fadvancepaymentratio")
	private java.lang.Float fadvancepaymentratio;
	/**bserviceattribute*/
	@Excel(name = "bserviceattribute", width = 15)
    @ApiModelProperty(value = "bserviceattribute")
	private java.lang.Object bserviceattribute;
	/**brequestsign*/
	@Excel(name = "brequestsign", width = 15)
    @ApiModelProperty(value = "brequestsign")
	private java.lang.Object brequestsign;
	/**bongpinstore*/
	@Excel(name = "bongpinstore", width = 15)
    @ApiModelProperty(value = "bongpinstore")
	private java.lang.Object bongpinstore;
	/**ccusmngtypecode*/
	@Excel(name = "ccusmngtypecode", width = 15)
    @ApiModelProperty(value = "ccusmngtypecode")
	private java.lang.String ccusmngtypecode;
	/**accountType*/
	@Excel(name = "accountType", width = 15)
    @ApiModelProperty(value = "accountType")
	private java.math.BigDecimal accountType;
	/**ccusimagentprotocol*/
	@Excel(name = "ccusimagentprotocol", width = 15)
    @ApiModelProperty(value = "ccusimagentprotocol")
	private java.lang.String ccusimagentprotocol;
	/**isourcetype*/
	@Excel(name = "isourcetype", width = 15)
    @ApiModelProperty(value = "isourcetype")
	private java.lang.Integer isourcetype;
	/**isourceid*/
	@Excel(name = "isourceid", width = 15)
    @ApiModelProperty(value = "isourceid")
	private java.lang.String isourceid;
	/**fexpense*/
	@Excel(name = "fexpense", width = 15)
    @ApiModelProperty(value = "fexpense")
	private java.lang.Float fexpense;
	/**fapprovedexpense*/
	@Excel(name = "fapprovedexpense", width = 15)
    @ApiModelProperty(value = "fapprovedexpense")
	private java.lang.Float fapprovedexpense;
	/**dtouchedtime*/
	@Excel(name = "dtouchedtime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dtouchedtime")
	private java.util.Date dtouchedtime;
	/**drecentlyinvoicetime*/
	@Excel(name = "drecentlyinvoicetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentlyinvoicetime")
	private java.util.Date drecentlyinvoicetime;
	/**drecentlyquotetime*/
	@Excel(name = "drecentlyquotetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentlyquotetime")
	private java.util.Date drecentlyquotetime;
	/**drecentlyactivitytime*/
	@Excel(name = "drecentlyactivitytime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentlyactivitytime")
	private java.util.Date drecentlyactivitytime;
	/**drecentlychancetime*/
	@Excel(name = "drecentlychancetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentlychancetime")
	private java.util.Date drecentlychancetime;
	/**drecentlycontracttime*/
	@Excel(name = "drecentlycontracttime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentlycontracttime")
	private java.util.Date drecentlycontracttime;
	/**cltccustomercode*/
	@Excel(name = "cltccustomercode", width = 15)
    @ApiModelProperty(value = "cltccustomercode")
	private java.lang.String cltccustomercode;
	/**btransflag*/
	@Excel(name = "btransflag", width = 15)
    @ApiModelProperty(value = "btransflag")
	private java.lang.Object btransflag;
	/**cltcperson*/
	@Excel(name = "cltcperson", width = 15)
    @ApiModelProperty(value = "cltcperson")
	private java.lang.String cltcperson;
	/**dltcdate*/
	@Excel(name = "dltcdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dltcdate")
	private java.util.Date dltcdate;
	/**clocationsite*/
	@Excel(name = "clocationsite", width = 15)
    @ApiModelProperty(value = "clocationsite")
	private java.lang.String clocationsite;
	/**icustaxrate*/
	@Excel(name = "icustaxrate", width = 15)
    @ApiModelProperty(value = "icustaxrate")
	private java.lang.Float icustaxrate;
	/**alloctDeptTime*/
	@Excel(name = "alloctDeptTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "alloctDeptTime")
	private java.util.Date alloctDeptTime;
	/**allotUserTime*/
	@Excel(name = "allotUserTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "allotUserTime")
	private java.util.Date allotUserTime;
	/**recyleDeptTime*/
	@Excel(name = "recyleDeptTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "recyleDeptTime")
	private java.util.Date recyleDeptTime;
	/**recylePubTime*/
	@Excel(name = "recylePubTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "recylePubTime")
	private java.util.Date recylePubTime;
	/**clicenceno*/
	@Excel(name = "clicenceno", width = 15)
    @ApiModelProperty(value = "clicenceno")
	private java.lang.String clicenceno;
	/**clicencerange*/
	@Excel(name = "clicencerange", width = 15)
    @ApiModelProperty(value = "clicencerange")
	private java.lang.String clicencerange;
	/**ccusbusinessrange*/
	@Excel(name = "ccusbusinessrange", width = 15)
    @ApiModelProperty(value = "ccusbusinessrange")
	private java.lang.String ccusbusinessrange;
	/**ccusgspauthrange*/
	@Excel(name = "ccusgspauthrange", width = 15)
    @ApiModelProperty(value = "ccusgspauthrange")
	private java.lang.String ccusgspauthrange;
	/**dcusgspedate*/
	@Excel(name = "dcusgspedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcusgspedate")
	private java.util.Date dcusgspedate;
	/**dcusgspsdate*/
	@Excel(name = "dcusgspsdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcusgspsdate")
	private java.util.Date dcusgspsdate;
	/**icusgspadays*/
	@Excel(name = "icusgspadays", width = 15)
    @ApiModelProperty(value = "icusgspadays")
	private java.lang.Integer icusgspadays;
	/**biscusattachfile*/
	@Excel(name = "biscusattachfile", width = 15)
    @ApiModelProperty(value = "biscusattachfile")
	private java.lang.Object biscusattachfile;
	/**drecentcontractdate*/
	@Excel(name = "drecentcontractdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentcontractdate")
	private java.util.Date drecentcontractdate;
	/**drecentdeliverydate*/
	@Excel(name = "drecentdeliverydate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentdeliverydate")
	private java.util.Date drecentdeliverydate;
	/**drecentoutbounddate*/
	@Excel(name = "drecentoutbounddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "drecentoutbounddate")
	private java.util.Date drecentoutbounddate;
	/**cprovince*/
	@Excel(name = "cprovince", width = 15)
    @ApiModelProperty(value = "cprovince")
	private java.lang.String cprovince;
	/**ccity*/
	@Excel(name = "ccity", width = 15)
    @ApiModelProperty(value = "ccity")
	private java.lang.String ccity;
	/**ccounty*/
	@Excel(name = "ccounty", width = 15)
    @ApiModelProperty(value = "ccounty")
	private java.lang.String ccounty;
	/**ccusaddressguid*/
	@Excel(name = "ccusaddressguid", width = 15)
    @ApiModelProperty(value = "ccusaddressguid")
	private java.lang.Object ccusaddressguid;
	/**caddcode*/
	@Excel(name = "caddcode", width = 15)
    @ApiModelProperty(value = "caddcode")
	private java.lang.String caddcode;
	/**ccreditaddcode*/
	@Excel(name = "ccreditaddcode", width = 15)
    @ApiModelProperty(value = "ccreditaddcode")
	private java.lang.String ccreditaddcode;
	/**cregcash*/
	@Excel(name = "cregcash", width = 15)
    @ApiModelProperty(value = "cregcash")
	private java.lang.String cregcash;
	/**ddepbegindate*/
	@Excel(name = "ddepbegindate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddepbegindate")
	private java.util.Date ddepbegindate;
	/**iemployeenum*/
	@Excel(name = "iemployeenum", width = 15)
    @ApiModelProperty(value = "iemployeenum")
	private java.lang.Integer iemployeenum;
	/**curl*/
	@Excel(name = "curl", width = 15)
    @ApiModelProperty(value = "curl")
	private java.lang.String curl;
	/**pictureguid*/
	@Excel(name = "pictureguid", width = 15)
    @ApiModelProperty(value = "pictureguid")
	private java.lang.Object pictureguid;
}
