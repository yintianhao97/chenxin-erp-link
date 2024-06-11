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
 * @Description: 存货档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Data
@TableName("Inventory")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Inventory对象", description="存货档案")
public class Inventory {
    
	/**cinvcode*/
	@Excel(name = "cinvcode", width = 15)
    @ApiModelProperty(value = "cinvcode")
	private java.lang.String cinvcode;
	/**cinvaddcode*/
	@Excel(name = "cinvaddcode", width = 15)
    @ApiModelProperty(value = "cinvaddcode")
	private java.lang.String cinvaddcode;
	/**cinvname*/
	@Excel(name = "cinvname", width = 15)
    @ApiModelProperty(value = "cinvname")
	private java.lang.String cinvname;
	/**cinvstd*/
	@Excel(name = "cinvstd", width = 15)
    @ApiModelProperty(value = "cinvstd")
	private java.lang.String cinvstd;
	/**cinvccode*/
	@Excel(name = "cinvccode", width = 15)
    @ApiModelProperty(value = "cinvccode")
	private java.lang.String cinvccode;
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**creplaceitem*/
	@Excel(name = "creplaceitem", width = 15)
    @ApiModelProperty(value = "creplaceitem")
	private java.lang.String creplaceitem;
	/**cposition*/
	@Excel(name = "cposition", width = 15)
    @ApiModelProperty(value = "cposition")
	private java.lang.String cposition;
	/**bsale*/
	@Excel(name = "bsale", width = 15)
    @ApiModelProperty(value = "bsale")
	private java.lang.Object bsale;
	/**bpurchase*/
	@Excel(name = "bpurchase", width = 15)
    @ApiModelProperty(value = "bpurchase")
	private java.lang.Object bpurchase;
	/**bself*/
	@Excel(name = "bself", width = 15)
    @ApiModelProperty(value = "bself")
	private java.lang.Object bself;
	/**bcomsume*/
	@Excel(name = "bcomsume", width = 15)
    @ApiModelProperty(value = "bcomsume")
	private java.lang.Object bcomsume;
	/**bproducing*/
	@Excel(name = "bproducing", width = 15)
    @ApiModelProperty(value = "bproducing")
	private java.lang.Object bproducing;
	/**bservice*/
	@Excel(name = "bservice", width = 15)
    @ApiModelProperty(value = "bservice")
	private java.lang.Object bservice;
	/**baccessary*/
	@Excel(name = "baccessary", width = 15)
    @ApiModelProperty(value = "baccessary")
	private java.lang.Object baccessary;
	/**itaxrate*/
	@Excel(name = "itaxrate", width = 15)
    @ApiModelProperty(value = "itaxrate")
	private java.lang.Float itaxrate;
	/**iinvweight*/
	@Excel(name = "iinvweight", width = 15)
    @ApiModelProperty(value = "iinvweight")
	private java.lang.Float iinvweight;
	/**ivolume*/
	@Excel(name = "ivolume", width = 15)
    @ApiModelProperty(value = "ivolume")
	private java.lang.Float ivolume;
	/**iinvrcost*/
	@Excel(name = "iinvrcost", width = 15)
    @ApiModelProperty(value = "iinvrcost")
	private java.lang.Float iinvrcost;
	/**iinvsprice*/
	@Excel(name = "iinvsprice", width = 15)
    @ApiModelProperty(value = "iinvsprice")
	private java.lang.Float iinvsprice;
	/**iinvscost*/
	@Excel(name = "iinvscost", width = 15)
    @ApiModelProperty(value = "iinvscost")
	private java.lang.Float iinvscost;
	/**iinvlscost*/
	@Excel(name = "iinvlscost", width = 15)
    @ApiModelProperty(value = "iinvlscost")
	private java.lang.Float iinvlscost;
	/**iinvncost*/
	@Excel(name = "iinvncost", width = 15)
    @ApiModelProperty(value = "iinvncost")
	private java.lang.Float iinvncost;
	/**iinvadvance*/
	@Excel(name = "iinvadvance", width = 15)
    @ApiModelProperty(value = "iinvadvance")
	private java.lang.Float iinvadvance;
	/**iinvbatch*/
	@Excel(name = "iinvbatch", width = 15)
    @ApiModelProperty(value = "iinvbatch")
	private java.lang.Float iinvbatch;
	/**isafenum*/
	@Excel(name = "isafenum", width = 15)
    @ApiModelProperty(value = "isafenum")
	private java.lang.Float isafenum;
	/**itopsum*/
	@Excel(name = "itopsum", width = 15)
    @ApiModelProperty(value = "itopsum")
	private java.lang.Float itopsum;
	/**ilowsum*/
	@Excel(name = "ilowsum", width = 15)
    @ApiModelProperty(value = "ilowsum")
	private java.lang.Float ilowsum;
	/**ioverstock*/
	@Excel(name = "ioverstock", width = 15)
    @ApiModelProperty(value = "ioverstock")
	private java.lang.Float ioverstock;
	/**cinvabc*/
	@Excel(name = "cinvabc", width = 15)
    @ApiModelProperty(value = "cinvabc")
	private java.lang.String cinvabc;
	/**binvquality*/
	@Excel(name = "binvquality", width = 15)
    @ApiModelProperty(value = "binvquality")
	private java.lang.Object binvquality;
	/**binvbatch*/
	@Excel(name = "binvbatch", width = 15)
    @ApiModelProperty(value = "binvbatch")
	private java.lang.Object binvbatch;
	/**binventrust*/
	@Excel(name = "binventrust", width = 15)
    @ApiModelProperty(value = "binventrust")
	private java.lang.Object binventrust;
	/**binvoverstock*/
	@Excel(name = "binvoverstock", width = 15)
    @ApiModelProperty(value = "binvoverstock")
	private java.lang.Object binvoverstock;
	/**dsdate*/
	@Excel(name = "dsdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dsdate")
	private java.util.Date dsdate;
	/**dedate*/
	@Excel(name = "dedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dedate")
	private java.util.Date dedate;
	/**bfree1*/
	@Excel(name = "bfree1", width = 15)
    @ApiModelProperty(value = "bfree1")
	private java.lang.Object bfree1;
	/**bfree2*/
	@Excel(name = "bfree2", width = 15)
    @ApiModelProperty(value = "bfree2")
	private java.lang.Object bfree2;
	/**cinvdefine1*/
	@Excel(name = "cinvdefine1", width = 15)
    @ApiModelProperty(value = "cinvdefine1")
	private java.lang.String cinvdefine1;
	/**cinvdefine2*/
	@Excel(name = "cinvdefine2", width = 15)
    @ApiModelProperty(value = "cinvdefine2")
	private java.lang.String cinvdefine2;
	/**cinvdefine3*/
	@Excel(name = "cinvdefine3", width = 15)
    @ApiModelProperty(value = "cinvdefine3")
	private java.lang.String cinvdefine3;
	/**iId*/
	@Excel(name = "iId", width = 15)
    @ApiModelProperty(value = "iId")
	private java.lang.Integer iId;
	/**binvtype*/
	@Excel(name = "binvtype", width = 15)
    @ApiModelProperty(value = "binvtype")
	private java.lang.Object binvtype;
	/**iinvmpcost*/
	@Excel(name = "iinvmpcost", width = 15)
    @ApiModelProperty(value = "iinvmpcost")
	private java.lang.Float iinvmpcost;
	/**cquality*/
	@Excel(name = "cquality", width = 15)
    @ApiModelProperty(value = "cquality")
	private java.lang.String cquality;
	/**iinvsalecost*/
	@Excel(name = "iinvsalecost", width = 15)
    @ApiModelProperty(value = "iinvsalecost")
	private java.lang.Float iinvsalecost;
	/**iinvscost1*/
	@Excel(name = "iinvscost1", width = 15)
    @ApiModelProperty(value = "iinvscost1")
	private java.lang.Float iinvscost1;
	/**iinvscost2*/
	@Excel(name = "iinvscost2", width = 15)
    @ApiModelProperty(value = "iinvscost2")
	private java.lang.Float iinvscost2;
	/**iinvscost3*/
	@Excel(name = "iinvscost3", width = 15)
    @ApiModelProperty(value = "iinvscost3")
	private java.lang.Float iinvscost3;
	/**bfree3*/
	@Excel(name = "bfree3", width = 15)
    @ApiModelProperty(value = "bfree3")
	private java.lang.Object bfree3;
	/**bfree4*/
	@Excel(name = "bfree4", width = 15)
    @ApiModelProperty(value = "bfree4")
	private java.lang.Object bfree4;
	/**bfree5*/
	@Excel(name = "bfree5", width = 15)
    @ApiModelProperty(value = "bfree5")
	private java.lang.Object bfree5;
	/**bfree6*/
	@Excel(name = "bfree6", width = 15)
    @ApiModelProperty(value = "bfree6")
	private java.lang.Object bfree6;
	/**bfree7*/
	@Excel(name = "bfree7", width = 15)
    @ApiModelProperty(value = "bfree7")
	private java.lang.Object bfree7;
	/**bfree8*/
	@Excel(name = "bfree8", width = 15)
    @ApiModelProperty(value = "bfree8")
	private java.lang.Object bfree8;
	/**bfree9*/
	@Excel(name = "bfree9", width = 15)
    @ApiModelProperty(value = "bfree9")
	private java.lang.Object bfree9;
	/**bfree10*/
	@Excel(name = "bfree10", width = 15)
    @ApiModelProperty(value = "bfree10")
	private java.lang.Object bfree10;
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
	/**fsubscribepoint*/
	@Excel(name = "fsubscribepoint", width = 15)
    @ApiModelProperty(value = "fsubscribepoint")
	private java.lang.Float fsubscribepoint;
	/**fvagquantity*/
	@Excel(name = "fvagquantity", width = 15)
    @ApiModelProperty(value = "fvagquantity")
	private java.lang.Float fvagquantity;
	/**cvaluetype*/
	@Excel(name = "cvaluetype", width = 15)
    @ApiModelProperty(value = "cvaluetype")
	private java.lang.String cvaluetype;
	/**bfixexch*/
	@Excel(name = "bfixexch", width = 15)
    @ApiModelProperty(value = "bfixexch")
	private java.lang.Object bfixexch;
	/**foutexcess*/
	@Excel(name = "foutexcess", width = 15)
    @ApiModelProperty(value = "foutexcess")
	private java.lang.Float foutexcess;
	/**finexcess*/
	@Excel(name = "finexcess", width = 15)
    @ApiModelProperty(value = "finexcess")
	private java.lang.Float finexcess;
	/**imassdate*/
	@Excel(name = "imassdate", width = 15)
    @ApiModelProperty(value = "imassdate")
	private java.lang.Integer imassdate;
	/**iwarndays*/
	@Excel(name = "iwarndays", width = 15)
    @ApiModelProperty(value = "iwarndays")
	private java.lang.Integer iwarndays;
	/**fexpensesexch*/
	@Excel(name = "fexpensesexch", width = 15)
    @ApiModelProperty(value = "fexpensesexch")
	private java.lang.Float fexpensesexch;
	/**btrack*/
	@Excel(name = "btrack", width = 15)
    @ApiModelProperty(value = "btrack")
	private java.lang.Object btrack;
	/**bserial*/
	@Excel(name = "bserial", width = 15)
    @ApiModelProperty(value = "bserial")
	private java.lang.Object bserial;
	/**bbarcode*/
	@Excel(name = "bbarcode", width = 15)
    @ApiModelProperty(value = "bbarcode")
	private java.lang.Object bbarcode;
	/**iid*/
	@Excel(name = "iid", width = 15)
    @ApiModelProperty(value = "iid")
	private java.lang.Integer iid;
	/**cbarcode*/
	@Excel(name = "cbarcode", width = 15)
    @ApiModelProperty(value = "cbarcode")
	private java.lang.String cbarcode;
	/**cinvdefine4*/
	@Excel(name = "cinvdefine4", width = 15)
    @ApiModelProperty(value = "cinvdefine4")
	private java.lang.String cinvdefine4;
	/**cinvdefine5*/
	@Excel(name = "cinvdefine5", width = 15)
    @ApiModelProperty(value = "cinvdefine5")
	private java.lang.String cinvdefine5;
	/**cinvdefine6*/
	@Excel(name = "cinvdefine6", width = 15)
    @ApiModelProperty(value = "cinvdefine6")
	private java.lang.String cinvdefine6;
	/**cinvdefine7*/
	@Excel(name = "cinvdefine7", width = 15)
    @ApiModelProperty(value = "cinvdefine7")
	private java.lang.String cinvdefine7;
	/**cinvdefine8*/
	@Excel(name = "cinvdefine8", width = 15)
    @ApiModelProperty(value = "cinvdefine8")
	private java.lang.String cinvdefine8;
	/**cinvdefine9*/
	@Excel(name = "cinvdefine9", width = 15)
    @ApiModelProperty(value = "cinvdefine9")
	private java.lang.String cinvdefine9;
	/**cinvdefine10*/
	@Excel(name = "cinvdefine10", width = 15)
    @ApiModelProperty(value = "cinvdefine10")
	private java.lang.String cinvdefine10;
	/**cinvdefine11*/
	@Excel(name = "cinvdefine11", width = 15)
    @ApiModelProperty(value = "cinvdefine11")
	private java.lang.Integer cinvdefine11;
	/**cinvdefine12*/
	@Excel(name = "cinvdefine12", width = 15)
    @ApiModelProperty(value = "cinvdefine12")
	private java.lang.Integer cinvdefine12;
	/**cinvdefine13*/
	@Excel(name = "cinvdefine13", width = 15)
    @ApiModelProperty(value = "cinvdefine13")
	private java.lang.Float cinvdefine13;
	/**cinvdefine14*/
	@Excel(name = "cinvdefine14", width = 15)
    @ApiModelProperty(value = "cinvdefine14")
	private java.lang.Float cinvdefine14;
	/**cinvdefine15*/
	@Excel(name = "cinvdefine15", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cinvdefine15")
	private java.util.Date cinvdefine15;
	/**cinvdefine16*/
	@Excel(name = "cinvdefine16", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cinvdefine16")
	private java.util.Date cinvdefine16;
	/**igrouptype*/
	@Excel(name = "igrouptype", width = 15)
    @ApiModelProperty(value = "igrouptype")
	private java.lang.Integer igrouptype;
	/**cgroupcode*/
	@Excel(name = "cgroupcode", width = 15)
    @ApiModelProperty(value = "cgroupcode")
	private java.lang.String cgroupcode;
	/**ccomunitcode*/
	@Excel(name = "ccomunitcode", width = 15)
    @ApiModelProperty(value = "ccomunitcode")
	private java.lang.String ccomunitcode;
	/**casscomunitcode*/
	@Excel(name = "casscomunitcode", width = 15)
    @ApiModelProperty(value = "casscomunitcode")
	private java.lang.String casscomunitcode;
	/**csacomunitcode*/
	@Excel(name = "csacomunitcode", width = 15)
    @ApiModelProperty(value = "csacomunitcode")
	private java.lang.String csacomunitcode;
	/**cpucomunitcode*/
	@Excel(name = "cpucomunitcode", width = 15)
    @ApiModelProperty(value = "cpucomunitcode")
	private java.lang.String cpucomunitcode;
	/**cstcomunitcode*/
	@Excel(name = "cstcomunitcode", width = 15)
    @ApiModelProperty(value = "cstcomunitcode")
	private java.lang.String cstcomunitcode;
	/**ccacomunitcode*/
	@Excel(name = "ccacomunitcode", width = 15)
    @ApiModelProperty(value = "ccacomunitcode")
	private java.lang.String ccacomunitcode;
	/**cfrequency*/
	@Excel(name = "cfrequency", width = 15)
    @ApiModelProperty(value = "cfrequency")
	private java.lang.String cfrequency;
	/**ifrequency*/
	@Excel(name = "ifrequency", width = 15)
    @ApiModelProperty(value = "ifrequency")
	private java.lang.Integer ifrequency;
	/**idays*/
	@Excel(name = "idays", width = 15)
    @ApiModelProperty(value = "idays")
	private java.lang.Integer idays;
	/**dlastdate*/
	@Excel(name = "dlastdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlastdate")
	private java.util.Date dlastdate;
	/**iwastage*/
	@Excel(name = "iwastage", width = 15)
    @ApiModelProperty(value = "iwastage")
	private java.lang.Float iwastage;
	/**bsolitude*/
	@Excel(name = "bsolitude", width = 15)
    @ApiModelProperty(value = "bsolitude")
	private java.lang.Object bsolitude;
	/**centerprise*/
	@Excel(name = "centerprise", width = 15)
    @ApiModelProperty(value = "centerprise")
	private java.lang.String centerprise;
	/**caddress*/
	@Excel(name = "caddress", width = 15)
    @ApiModelProperty(value = "caddress")
	private java.lang.String caddress;
	/**cfile*/
	@Excel(name = "cfile", width = 15)
    @ApiModelProperty(value = "cfile")
	private java.lang.String cfile;
	/**clabel*/
	@Excel(name = "clabel", width = 15)
    @ApiModelProperty(value = "clabel")
	private java.lang.String clabel;
	/**ccheckout*/
	@Excel(name = "ccheckout", width = 15)
    @ApiModelProperty(value = "ccheckout")
	private java.lang.String ccheckout;
	/**clicence*/
	@Excel(name = "clicence", width = 15)
    @ApiModelProperty(value = "clicence")
	private java.lang.String clicence;
	/**bspecialties*/
	@Excel(name = "bspecialties", width = 15)
    @ApiModelProperty(value = "bspecialties")
	private java.lang.Object bspecialties;
	/**cdefwarehouse*/
	@Excel(name = "cdefwarehouse", width = 15)
    @ApiModelProperty(value = "cdefwarehouse")
	private java.lang.String cdefwarehouse;
	/**ihighprice*/
	@Excel(name = "ihighprice", width = 15)
    @ApiModelProperty(value = "ihighprice")
	private java.lang.Float ihighprice;
	/**iexpsalerate*/
	@Excel(name = "iexpsalerate", width = 15)
    @ApiModelProperty(value = "iexpsalerate")
	private java.lang.Float iexpsalerate;
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
	/**cmonth*/
	@Excel(name = "cmonth", width = 15)
    @ApiModelProperty(value = "cmonth")
	private java.lang.String cmonth;
	/**iadvancedate*/
	@Excel(name = "iadvancedate", width = 15)
    @ApiModelProperty(value = "iadvancedate")
	private java.lang.Integer iadvancedate;
	/**ccurrencyname*/
	@Excel(name = "ccurrencyname", width = 15)
    @ApiModelProperty(value = "ccurrencyname")
	private java.lang.String ccurrencyname;
	/**cproduceaddress*/
	@Excel(name = "cproduceaddress", width = 15)
    @ApiModelProperty(value = "cproduceaddress")
	private java.lang.String cproduceaddress;
	/**cproducenation*/
	@Excel(name = "cproducenation", width = 15)
    @ApiModelProperty(value = "cproducenation")
	private java.lang.String cproducenation;
	/**cregisterno*/
	@Excel(name = "cregisterno", width = 15)
    @ApiModelProperty(value = "cregisterno")
	private java.lang.String cregisterno;
	/**centerno*/
	@Excel(name = "centerno", width = 15)
    @ApiModelProperty(value = "centerno")
	private java.lang.String centerno;
	/**cpackingtype*/
	@Excel(name = "cpackingtype", width = 15)
    @ApiModelProperty(value = "cpackingtype")
	private java.lang.String cpackingtype;
	/**cenglishname*/
	@Excel(name = "cenglishname", width = 15)
    @ApiModelProperty(value = "cenglishname")
	private java.lang.String cenglishname;
	/**bpropertycheck*/
	@Excel(name = "bpropertycheck", width = 15)
    @ApiModelProperty(value = "bpropertycheck")
	private java.lang.Object bpropertycheck;
	/**cpreparationtype*/
	@Excel(name = "cpreparationtype", width = 15)
    @ApiModelProperty(value = "cpreparationtype")
	private java.lang.String cpreparationtype;
	/**ccommodity*/
	@Excel(name = "ccommodity", width = 15)
    @ApiModelProperty(value = "ccommodity")
	private java.lang.String ccommodity;
	/**irecipebatch*/
	@Excel(name = "irecipebatch", width = 15)
    @ApiModelProperty(value = "irecipebatch")
	private java.lang.Integer irecipebatch;
	/**cnotpatentname*/
	@Excel(name = "cnotpatentname", width = 15)
    @ApiModelProperty(value = "cnotpatentname")
	private java.lang.String cnotpatentname;

	/**bpromotsales*/
	@Excel(name = "bpromotsales", width = 15)
    @ApiModelProperty(value = "bpromotsales")
	private java.lang.Object bpromotsales;
	/**iplanpolicy*/
	@Excel(name = "iplanpolicy", width = 15)
    @ApiModelProperty(value = "iplanpolicy")
	private java.lang.Integer iplanpolicy;
	/**iropmethod*/
	@Excel(name = "iropmethod", width = 15)
    @ApiModelProperty(value = "iropmethod")
	private java.lang.Integer iropmethod;
	/**ibatchrule*/
	@Excel(name = "ibatchrule", width = 15)
    @ApiModelProperty(value = "ibatchrule")
	private java.lang.Integer ibatchrule;
	/**fbatchincrement*/
	@Excel(name = "fbatchincrement", width = 15)
    @ApiModelProperty(value = "fbatchincrement")
	private java.lang.Float fbatchincrement;
	/**iassureprovidedays*/
	@Excel(name = "iassureprovidedays", width = 15)
    @ApiModelProperty(value = "iassureprovidedays")
	private java.lang.Integer iassureprovidedays;
	/**iteststyle*/
	@Excel(name = "iteststyle", width = 15)
    @ApiModelProperty(value = "iteststyle")
	private java.lang.Integer iteststyle;
	/**idtmethod*/
	@Excel(name = "idtmethod", width = 15)
    @ApiModelProperty(value = "idtmethod")
	private java.lang.Integer idtmethod;
	/**fdtrate*/
	@Excel(name = "fdtrate", width = 15)
    @ApiModelProperty(value = "fdtrate")
	private java.lang.Float fdtrate;
	/**fdtnum*/
	@Excel(name = "fdtnum", width = 15)
    @ApiModelProperty(value = "fdtnum")
	private java.lang.Float fdtnum;
	/**cdtunit*/
	@Excel(name = "cdtunit", width = 15)
    @ApiModelProperty(value = "cdtunit")
	private java.lang.String cdtunit;
	/**idtstyle*/
	@Excel(name = "idtstyle", width = 15)
    @ApiModelProperty(value = "idtstyle")
	private java.lang.Integer idtstyle;
	/**iqtmethod*/
	@Excel(name = "iqtmethod", width = 15)
    @ApiModelProperty(value = "iqtmethod")
	private java.lang.Integer iqtmethod;
	/**pictureguid*/
	@Excel(name = "pictureguid", width = 15)
    @ApiModelProperty(value = "pictureguid")
	private java.lang.Object pictureguid;
	/**bplaninv*/
	@Excel(name = "bplaninv", width = 15)
    @ApiModelProperty(value = "bplaninv")
	private java.lang.Object bplaninv;
	/**bproxyforeign*/
	@Excel(name = "bproxyforeign", width = 15)
    @ApiModelProperty(value = "bproxyforeign")
	private java.lang.Object bproxyforeign;
	/**batomodel*/
	@Excel(name = "batomodel", width = 15)
    @ApiModelProperty(value = "batomodel")
	private java.lang.Object batomodel;
	/**bcheckitem*/
	@Excel(name = "bcheckitem", width = 15)
    @ApiModelProperty(value = "bcheckitem")
	private java.lang.Object bcheckitem;
	/**bptomodel*/
	@Excel(name = "bptomodel", width = 15)
    @ApiModelProperty(value = "bptomodel")
	private java.lang.Object bptomodel;
	/**bequipment*/
	@Excel(name = "bequipment", width = 15)
    @ApiModelProperty(value = "bequipment")
	private java.lang.Object bequipment;
	/**cproductunit*/
	@Excel(name = "cproductunit", width = 15)
    @ApiModelProperty(value = "cproductunit")
	private java.lang.String cproductunit;
	/**forderuplimit*/
	@Excel(name = "forderuplimit", width = 15)
    @ApiModelProperty(value = "forderuplimit")
	private java.lang.Float forderuplimit;
	/**cmassunit*/
	@Excel(name = "cmassunit", width = 15)
    @ApiModelProperty(value = "cmassunit")
	private java.lang.Integer cmassunit;
	/**fretailprice*/
	@Excel(name = "fretailprice", width = 15)
    @ApiModelProperty(value = "fretailprice")
	private java.lang.Float fretailprice;
	/**cinvdepcode*/
	@Excel(name = "cinvdepcode", width = 15)
    @ApiModelProperty(value = "cinvdepcode")
	private java.lang.String cinvdepcode;
	/**ialteradvance*/
	@Excel(name = "ialteradvance", width = 15)
    @ApiModelProperty(value = "ialteradvance")
	private java.lang.Integer ialteradvance;
	/**falterbasenum*/
	@Excel(name = "falterbasenum", width = 15)
    @ApiModelProperty(value = "falterbasenum")
	private java.lang.Float falterbasenum;
	/**cplanmethod*/
	@Excel(name = "cplanmethod", width = 15)
    @ApiModelProperty(value = "cplanmethod")
	private java.lang.String cplanmethod;
	/**bmps*/
	@Excel(name = "bmps", width = 15)
    @ApiModelProperty(value = "bmps")
	private java.lang.Object bmps;
	/**brop*/
	@Excel(name = "brop", width = 15)
    @ApiModelProperty(value = "brop")
	private java.lang.Object brop;
	/**breplan*/
	@Excel(name = "breplan", width = 15)
    @ApiModelProperty(value = "breplan")
	private java.lang.Object breplan;
	/**csrpolicy*/
	@Excel(name = "csrpolicy", width = 15)
    @ApiModelProperty(value = "csrpolicy")
	private java.lang.String csrpolicy;
	/**bbillunite*/
	@Excel(name = "bbillunite", width = 15)
    @ApiModelProperty(value = "bbillunite")
	private java.lang.Object bbillunite;
	/**isupplyday*/
	@Excel(name = "isupplyday", width = 15)
    @ApiModelProperty(value = "isupplyday")
	private java.lang.Integer isupplyday;
	/**fsupplymulti*/
	@Excel(name = "fsupplymulti", width = 15)
    @ApiModelProperty(value = "fsupplymulti")
	private java.lang.Float fsupplymulti;
	/**fminsupply*/
	@Excel(name = "fminsupply", width = 15)
    @ApiModelProperty(value = "fminsupply")
	private java.lang.Float fminsupply;
	/**bcutmantissa*/
	@Excel(name = "bcutmantissa", width = 15)
    @ApiModelProperty(value = "bcutmantissa")
	private java.lang.Object bcutmantissa;
	/**cinvpersoncode*/
	@Excel(name = "cinvpersoncode", width = 15)
    @ApiModelProperty(value = "cinvpersoncode")
	private java.lang.String cinvpersoncode;
	/**iinvtfid*/
	@Excel(name = "iinvtfid", width = 15)
    @ApiModelProperty(value = "iinvtfid")
	private java.lang.Integer iinvtfid;
	/**cengineerfigno*/
	@Excel(name = "cengineerfigno", width = 15)
    @ApiModelProperty(value = "cengineerfigno")
	private java.lang.String cengineerfigno;
	/**bintotalcost*/
	@Excel(name = "bintotalcost", width = 15)
    @ApiModelProperty(value = "bintotalcost")
	private java.lang.Object bintotalcost;
	/**isupplytype*/
	@Excel(name = "isupplytype", width = 15)
    @ApiModelProperty(value = "isupplytype")
	private java.lang.Integer isupplytype;
	/**bconfigfree1*/
	@Excel(name = "bconfigfree1", width = 15)
    @ApiModelProperty(value = "bconfigfree1")
	private java.lang.Object bconfigfree1;
	/**bconfigfree2*/
	@Excel(name = "bconfigfree2", width = 15)
    @ApiModelProperty(value = "bconfigfree2")
	private java.lang.Object bconfigfree2;
	/**bconfigfree3*/
	@Excel(name = "bconfigfree3", width = 15)
    @ApiModelProperty(value = "bconfigfree3")
	private java.lang.Object bconfigfree3;
	/**bconfigfree4*/
	@Excel(name = "bconfigfree4", width = 15)
    @ApiModelProperty(value = "bconfigfree4")
	private java.lang.Object bconfigfree4;
	/**bconfigfree5*/
	@Excel(name = "bconfigfree5", width = 15)
    @ApiModelProperty(value = "bconfigfree5")
	private java.lang.Object bconfigfree5;
	/**bconfigfree6*/
	@Excel(name = "bconfigfree6", width = 15)
    @ApiModelProperty(value = "bconfigfree6")
	private java.lang.Object bconfigfree6;
	/**bconfigfree7*/
	@Excel(name = "bconfigfree7", width = 15)
    @ApiModelProperty(value = "bconfigfree7")
	private java.lang.Object bconfigfree7;
	/**bconfigfree8*/
	@Excel(name = "bconfigfree8", width = 15)
    @ApiModelProperty(value = "bconfigfree8")
	private java.lang.Object bconfigfree8;
	/**bconfigfree9*/
	@Excel(name = "bconfigfree9", width = 15)
    @ApiModelProperty(value = "bconfigfree9")
	private java.lang.Object bconfigfree9;
	/**bconfigfree10*/
	@Excel(name = "bconfigfree10", width = 15)
    @ApiModelProperty(value = "bconfigfree10")
	private java.lang.Object bconfigfree10;
	/**idtlevel*/
	@Excel(name = "idtlevel", width = 15)
    @ApiModelProperty(value = "idtlevel")
	private java.lang.Integer idtlevel;
	/**cdtaql*/
	@Excel(name = "cdtaql", width = 15)
    @ApiModelProperty(value = "cdtaql")
	private java.lang.String cdtaql;
	/**bperioddt*/
	@Excel(name = "bperioddt", width = 15)
    @ApiModelProperty(value = "bperioddt")
	private java.lang.Object bperioddt;
	/**cdtperiod*/
	@Excel(name = "cdtperiod", width = 15)
    @ApiModelProperty(value = "cdtperiod")
	private java.lang.String cdtperiod;
	/**ibigmonth*/
	@Excel(name = "ibigmonth", width = 15)
    @ApiModelProperty(value = "ibigmonth")
	private java.lang.Integer ibigmonth;
	/**ibigday*/
	@Excel(name = "ibigday", width = 15)
    @ApiModelProperty(value = "ibigday")
	private java.lang.Integer ibigday;
	/**ismallmonth*/
	@Excel(name = "ismallmonth", width = 15)
    @ApiModelProperty(value = "ismallmonth")
	private java.lang.Integer ismallmonth;
	/**ismallday*/
	@Excel(name = "ismallday", width = 15)
    @ApiModelProperty(value = "ismallday")
	private java.lang.Integer ismallday;
	/**boutinvdt*/
	@Excel(name = "boutinvdt", width = 15)
    @ApiModelProperty(value = "boutinvdt")
	private java.lang.Object boutinvdt;
	/**bbackinvdt*/
	@Excel(name = "bbackinvdt", width = 15)
    @ApiModelProperty(value = "bbackinvdt")
	private java.lang.Object bbackinvdt;
	/**ienddtstyle*/
	@Excel(name = "ienddtstyle", width = 15)
    @ApiModelProperty(value = "ienddtstyle")
	private java.lang.Integer ienddtstyle;
	/**bdtwarninv*/
	@Excel(name = "bdtwarninv", width = 15)
    @ApiModelProperty(value = "bdtwarninv")
	private java.lang.Object bdtwarninv;
	/**fbacktaxrate*/
	@Excel(name = "fbacktaxrate", width = 15)
    @ApiModelProperty(value = "fbacktaxrate")
	private java.lang.Float fbacktaxrate;
	/**cciqcode*/
	@Excel(name = "cciqcode", width = 15)
    @ApiModelProperty(value = "cciqcode")
	private java.lang.String cciqcode;
	/**cwgroupcode*/
	@Excel(name = "cwgroupcode", width = 15)
    @ApiModelProperty(value = "cwgroupcode")
	private java.lang.String cwgroupcode;
	/**cwunit*/
	@Excel(name = "cwunit", width = 15)
    @ApiModelProperty(value = "cwunit")
	private java.lang.String cwunit;
	/**fgrossw*/
	@Excel(name = "fgrossw", width = 15)
    @ApiModelProperty(value = "fgrossw")
	private java.lang.Float fgrossw;
	/**cvgroupcode*/
	@Excel(name = "cvgroupcode", width = 15)
    @ApiModelProperty(value = "cvgroupcode")
	private java.lang.String cvgroupcode;
	/**cvunit*/
	@Excel(name = "cvunit", width = 15)
    @ApiModelProperty(value = "cvunit")
	private java.lang.String cvunit;
	/**flength*/
	@Excel(name = "flength", width = 15)
    @ApiModelProperty(value = "flength")
	private java.lang.Float flength;
	/**fwidth*/
	@Excel(name = "fwidth", width = 15)
    @ApiModelProperty(value = "fwidth")
	private java.lang.Float fwidth;
	/**fheight*/
	@Excel(name = "fheight", width = 15)
    @ApiModelProperty(value = "fheight")
	private java.lang.Float fheight;
	/**idtucounter*/
	@Excel(name = "idtucounter", width = 15)
    @ApiModelProperty(value = "idtucounter")
	private java.lang.Integer idtucounter;
	/**idtdcounter*/
	@Excel(name = "idtdcounter", width = 15)
    @ApiModelProperty(value = "idtdcounter")
	private java.lang.Integer idtdcounter;
	/**ibatchcounter*/
	@Excel(name = "ibatchcounter", width = 15)
    @ApiModelProperty(value = "ibatchcounter")
	private java.lang.Integer ibatchcounter;
	/**cshopunit*/
	@Excel(name = "cshopunit", width = 15)
    @ApiModelProperty(value = "cshopunit")
	private java.lang.String cshopunit;
	/**cpurpersoncode*/
	@Excel(name = "cpurpersoncode", width = 15)
    @ApiModelProperty(value = "cpurpersoncode")
	private java.lang.String cpurpersoncode;
	/**bimportmedicine*/
	@Excel(name = "bimportmedicine", width = 15)
    @ApiModelProperty(value = "bimportmedicine")
	private java.lang.Object bimportmedicine;
	/**bfirstbusimedicine*/
	@Excel(name = "bfirstbusimedicine", width = 15)
    @ApiModelProperty(value = "bfirstbusimedicine")
	private java.lang.Object bfirstbusimedicine;
	/**bforeexpland*/
	@Excel(name = "bforeexpland", width = 15)
    @ApiModelProperty(value = "bforeexpland")
	private java.lang.Object bforeexpland;
	/**cinvplancode*/
	@Excel(name = "cinvplancode", width = 15)
    @ApiModelProperty(value = "cinvplancode")
	private java.lang.String cinvplancode;
	/**fconvertrate*/
	@Excel(name = "fconvertrate", width = 15)
    @ApiModelProperty(value = "fconvertrate")
	private java.lang.Float fconvertrate;
	/**dreplacedate*/
	@Excel(name = "dreplacedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dreplacedate")
	private java.util.Date dreplacedate;
	/**binvmodel*/
	@Excel(name = "binvmodel", width = 15)
    @ApiModelProperty(value = "binvmodel")
	private java.lang.Object binvmodel;
	/**bkccutmantissa*/
	@Excel(name = "bkccutmantissa", width = 15)
    @ApiModelProperty(value = "bkccutmantissa")
	private java.lang.Object bkccutmantissa;
	/**breceiptbydt*/
	@Excel(name = "breceiptbydt", width = 15)
    @ApiModelProperty(value = "breceiptbydt")
	private java.lang.Object breceiptbydt;
	/**iimptaxrate*/
	@Excel(name = "iimptaxrate", width = 15)
    @ApiModelProperty(value = "iimptaxrate")
	private java.lang.Float iimptaxrate;
	/**iexptaxrate*/
	@Excel(name = "iexptaxrate", width = 15)
    @ApiModelProperty(value = "iexptaxrate")
	private java.lang.Float iexptaxrate;
	/**bexpsale*/
	@Excel(name = "bexpsale", width = 15)
    @ApiModelProperty(value = "bexpsale")
	private java.lang.Object bexpsale;
	/**idrawbatch*/
	@Excel(name = "idrawbatch", width = 15)
    @ApiModelProperty(value = "idrawbatch")
	private java.lang.Float idrawbatch;
	/**bcheckbsatp*/
	@Excel(name = "bcheckbsatp", width = 15)
    @ApiModelProperty(value = "bcheckbsatp")
	private java.lang.Object bcheckbsatp;
	/**cinvprojectcode*/
	@Excel(name = "cinvprojectcode", width = 15)
    @ApiModelProperty(value = "cinvprojectcode")
	private java.lang.String cinvprojectcode;
	/**itestrule*/
	@Excel(name = "itestrule", width = 15)
    @ApiModelProperty(value = "itestrule")
	private java.lang.Integer itestrule;
	/**crulecode*/
	@Excel(name = "crulecode", width = 15)
    @ApiModelProperty(value = "crulecode")
	private java.lang.String crulecode;
	/**bcheckfree1*/
	@Excel(name = "bcheckfree1", width = 15)
    @ApiModelProperty(value = "bcheckfree1")
	private java.lang.Object bcheckfree1;
	/**bcheckfree2*/
	@Excel(name = "bcheckfree2", width = 15)
    @ApiModelProperty(value = "bcheckfree2")
	private java.lang.Object bcheckfree2;
	/**bcheckfree3*/
	@Excel(name = "bcheckfree3", width = 15)
    @ApiModelProperty(value = "bcheckfree3")
	private java.lang.Object bcheckfree3;
	/**bcheckfree4*/
	@Excel(name = "bcheckfree4", width = 15)
    @ApiModelProperty(value = "bcheckfree4")
	private java.lang.Object bcheckfree4;
	/**bcheckfree5*/
	@Excel(name = "bcheckfree5", width = 15)
    @ApiModelProperty(value = "bcheckfree5")
	private java.lang.Object bcheckfree5;
	/**bcheckfree6*/
	@Excel(name = "bcheckfree6", width = 15)
    @ApiModelProperty(value = "bcheckfree6")
	private java.lang.Object bcheckfree6;
	/**bcheckfree7*/
	@Excel(name = "bcheckfree7", width = 15)
    @ApiModelProperty(value = "bcheckfree7")
	private java.lang.Object bcheckfree7;
	/**bcheckfree8*/
	@Excel(name = "bcheckfree8", width = 15)
    @ApiModelProperty(value = "bcheckfree8")
	private java.lang.Object bcheckfree8;
	/**bcheckfree9*/
	@Excel(name = "bcheckfree9", width = 15)
    @ApiModelProperty(value = "bcheckfree9")
	private java.lang.Object bcheckfree9;
	/**bcheckfree10*/
	@Excel(name = "bcheckfree10", width = 15)
    @ApiModelProperty(value = "bcheckfree10")
	private java.lang.Object bcheckfree10;
	/**bbommain*/
	@Excel(name = "bbommain", width = 15)
    @ApiModelProperty(value = "bbommain")
	private java.lang.Object bbommain;
	/**bbomsub*/
	@Excel(name = "bbomsub", width = 15)
    @ApiModelProperty(value = "bbomsub")
	private java.lang.Object bbomsub;
	/**bproductbill*/
	@Excel(name = "bproductbill", width = 15)
    @ApiModelProperty(value = "bproductbill")
	private java.lang.Object bproductbill;
	/**icheckatp*/
	@Excel(name = "icheckatp", width = 15)
    @ApiModelProperty(value = "icheckatp")
	private java.lang.Integer icheckatp;
	/**iinvatpid*/
	@Excel(name = "iinvatpid", width = 15)
    @ApiModelProperty(value = "iinvatpid")
	private java.lang.Integer iinvatpid;
	/**iplantfday*/
	@Excel(name = "iplantfday", width = 15)
    @ApiModelProperty(value = "iplantfday")
	private java.lang.Integer iplantfday;
	/**ioverlapday*/
	@Excel(name = "ioverlapday", width = 15)
    @ApiModelProperty(value = "ioverlapday")
	private java.lang.Integer ioverlapday;
	/**bpiece*/
	@Excel(name = "bpiece", width = 15)
    @ApiModelProperty(value = "bpiece")
	private java.lang.Object bpiece;
	/**bsrvitem*/
	@Excel(name = "bsrvitem", width = 15)
    @ApiModelProperty(value = "bsrvitem")
	private java.lang.Object bsrvitem;
	/**bsrvfittings*/
	@Excel(name = "bsrvfittings", width = 15)
    @ApiModelProperty(value = "bsrvfittings")
	private java.lang.Object bsrvfittings;
	/**fmaxsupply*/
	@Excel(name = "fmaxsupply", width = 15)
    @ApiModelProperty(value = "fmaxsupply")
	private java.lang.Float fmaxsupply;
	/**fminsplit*/
	@Excel(name = "fminsplit", width = 15)
    @ApiModelProperty(value = "fminsplit")
	private java.lang.Float fminsplit;
	/**bspecialorder*/
	@Excel(name = "bspecialorder", width = 15)
    @ApiModelProperty(value = "bspecialorder")
	private java.lang.Object bspecialorder;
	/**btracksalebill*/
	@Excel(name = "btracksalebill", width = 15)
    @ApiModelProperty(value = "btracksalebill")
	private java.lang.Object btracksalebill;
	/**cinvmnemcode*/
	@Excel(name = "cinvmnemcode", width = 15)
    @ApiModelProperty(value = "cinvmnemcode")
	private java.lang.String cinvmnemcode;
	/**iplandefault*/
	@Excel(name = "iplandefault", width = 15)
    @ApiModelProperty(value = "iplandefault")
	private java.lang.Integer iplandefault;
	/**ipfbatchqty*/
	@Excel(name = "ipfbatchqty", width = 15)
    @ApiModelProperty(value = "ipfbatchqty")
	private java.lang.Float ipfbatchqty;
	/**iallocateprintdgt*/
	@Excel(name = "iallocateprintdgt", width = 15)
    @ApiModelProperty(value = "iallocateprintdgt")
	private java.lang.Integer iallocateprintdgt;
	/**bcheckbatch*/
	@Excel(name = "bcheckbatch", width = 15)
    @ApiModelProperty(value = "bcheckbatch")
	private java.lang.Object bcheckbatch;
	/**bmngoldpart*/
	@Excel(name = "bmngoldpart", width = 15)
    @ApiModelProperty(value = "bmngoldpart")
	private java.lang.Object bmngoldpart;
	/**ioldpartmngrule*/
	@Excel(name = "ioldpartmngrule", width = 15)
    @ApiModelProperty(value = "ioldpartmngrule")
	private java.lang.Integer ioldpartmngrule;


	@TableField(value = "I_id")
	private java.lang.Integer AutoId;
}
