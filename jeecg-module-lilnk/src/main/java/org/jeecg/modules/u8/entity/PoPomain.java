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
 * @Description: 采购订单主表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@Data
@TableName("PO_Pomain")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PO_Pomain对象", description="采购订单主表")
public class PoPomain {
    
	/**cpoid*/
	@Excel(name = "cpoid", width = 15)
    @ApiModelProperty(value = "cpoid")
	private java.lang.String cpoid;
	/**dpodate*/
	@Excel(name = "dpodate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dpodate")
	private java.util.Date dpodate;
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**cdepcode*/
	@Excel(name = "cdepcode", width = 15)
    @ApiModelProperty(value = "cdepcode")
	private java.lang.String cdepcode;
	/**cpersoncode*/
	@Excel(name = "cpersoncode", width = 15)
    @ApiModelProperty(value = "cpersoncode")
	private java.lang.String cpersoncode;
	/**cptcode*/
	@Excel(name = "cptcode", width = 15)
    @ApiModelProperty(value = "cptcode")
	private java.lang.String cptcode;
	/**carrivalplace*/
	@Excel(name = "carrivalplace", width = 15)
    @ApiModelProperty(value = "carrivalplace")
	private java.lang.String carrivalplace;
	/**csccode*/
	@Excel(name = "csccode", width = 15)
    @ApiModelProperty(value = "csccode")
	private java.lang.String csccode;
	/**cexchName*/
	@Excel(name = "cexchName", width = 15)
    @ApiModelProperty(value = "cexchName")
	private java.lang.String cexchName;
	/**nflat*/
	@Excel(name = "nflat", width = 15)
    @ApiModelProperty(value = "nflat")
	private java.lang.Float nflat;
	/**itaxrate*/
	@Excel(name = "itaxrate", width = 15)
    @ApiModelProperty(value = "itaxrate")
	private java.lang.Float itaxrate;
	/**cpaycode*/
	@Excel(name = "cpaycode", width = 15)
    @ApiModelProperty(value = "cpaycode")
	private java.lang.String cpaycode;
	/**icost*/
	@Excel(name = "icost", width = 15)
    @ApiModelProperty(value = "icost")
	private java.lang.Object icost;
	/**ibargain*/
	@Excel(name = "ibargain", width = 15)
    @ApiModelProperty(value = "ibargain")
	private java.lang.Object ibargain;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**cstate*/
	@Excel(name = "cstate", width = 15)
    @ApiModelProperty(value = "cstate")
	private java.lang.Integer cstate;
	/**cperiod*/
	@Excel(name = "cperiod", width = 15)
    @ApiModelProperty(value = "cperiod")
	private java.lang.String cperiod;
	/**cmaker*/
	@Excel(name = "cmaker", width = 15)
    @ApiModelProperty(value = "cmaker")
	private java.lang.String cmaker;
	/**cverifier*/
	@Excel(name = "cverifier", width = 15)
    @ApiModelProperty(value = "cverifier")
	private java.lang.String cverifier;
	/**ccloser*/
	@Excel(name = "ccloser", width = 15)
    @ApiModelProperty(value = "ccloser")
	private java.lang.String ccloser;
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
	/**poid*/
	@Excel(name = "poid", width = 15)
    @ApiModelProperty(value = "poid")
	private java.lang.Integer poid;
	/**ivtid*/
	@Excel(name = "ivtid", width = 15)
    @ApiModelProperty(value = "ivtid")
	private java.lang.Integer ivtid;
	/**cchanger*/
	@Excel(name = "cchanger", width = 15)
    @ApiModelProperty(value = "cchanger")
	private java.lang.String cchanger;
	/**cbustype*/
	@Excel(name = "cbustype", width = 15)
    @ApiModelProperty(value = "cbustype")
	private java.lang.String cbustype;
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
	/**clocker*/
	@Excel(name = "clocker", width = 15)
    @ApiModelProperty(value = "clocker")
	private java.lang.String clocker;
	/**idiscounttaxtype*/
	@Excel(name = "idiscounttaxtype", width = 15)
    @ApiModelProperty(value = "idiscounttaxtype")
	private java.lang.Integer idiscounttaxtype;
	/**iverifystateex*/
	@Excel(name = "iverifystateex", width = 15)
    @ApiModelProperty(value = "iverifystateex")
	private java.lang.Integer iverifystateex;
	/**ireturncount*/
	@Excel(name = "ireturncount", width = 15)
    @ApiModelProperty(value = "ireturncount")
	private java.lang.Integer ireturncount;
	/**iswfcontrolled*/
	@Excel(name = "iswfcontrolled", width = 15)
    @ApiModelProperty(value = "iswfcontrolled")
	private java.lang.Object iswfcontrolled;
	/**cmaketime*/
	@Excel(name = "cmaketime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cmaketime")
	private java.util.Date cmaketime;
	/**cmodifytime*/
	@Excel(name = "cmodifytime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cmodifytime")
	private java.util.Date cmodifytime;
	/**caudittime*/
	@Excel(name = "caudittime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "caudittime")
	private java.util.Date caudittime;
	/**cauditdate*/
	@Excel(name = "cauditdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cauditdate")
	private java.util.Date cauditdate;
	/**cmodifydate*/
	@Excel(name = "cmodifydate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cmodifydate")
	private java.util.Date cmodifydate;
	/**creviser*/
	@Excel(name = "creviser", width = 15)
    @ApiModelProperty(value = "creviser")
	private java.lang.String creviser;
	/**cvenpuomprotocol*/
	@Excel(name = "cvenpuomprotocol", width = 15)
    @ApiModelProperty(value = "cvenpuomprotocol")
	private java.lang.String cvenpuomprotocol;
	/**cchangverifier*/
	@Excel(name = "cchangverifier", width = 15)
    @ApiModelProperty(value = "cchangverifier")
	private java.lang.String cchangverifier;
	/**cchangaudittime*/
	@Excel(name = "cchangaudittime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cchangaudittime")
	private java.util.Date cchangaudittime;
	/**cchangauditdate*/
	@Excel(name = "cchangauditdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cchangauditdate")
	private java.util.Date cchangauditdate;
	/**ibgOverflag*/
	@Excel(name = "ibgOverflag", width = 15)
    @ApiModelProperty(value = "ibgOverflag")
	private java.lang.Integer ibgOverflag;
	/**cbgAuditor*/
	@Excel(name = "cbgAuditor", width = 15)
    @ApiModelProperty(value = "cbgAuditor")
	private java.lang.String cbgAuditor;
	/**cbgAudittime*/
	@Excel(name = "cbgAudittime", width = 15)
    @ApiModelProperty(value = "cbgAudittime")
	private java.lang.String cbgAudittime;
	/**controlresult*/
	@Excel(name = "controlresult", width = 15)
    @ApiModelProperty(value = "controlresult")
	private java.lang.Integer controlresult;
	/**iflowid*/
	@Excel(name = "iflowid", width = 15)
    @ApiModelProperty(value = "iflowid")
	private java.lang.Integer iflowid;
	/**iprintcount*/
	@Excel(name = "iprintcount", width = 15)
    @ApiModelProperty(value = "iprintcount")
	private java.lang.Integer iprintcount;
	/**dclosedate*/
	@Excel(name = "dclosedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dclosedate")
	private java.util.Date dclosedate;
	/**dclosetime*/
	@Excel(name = "dclosetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dclosetime")
	private java.util.Date dclosetime;
	/**ccleanver*/
	@Excel(name = "ccleanver", width = 15)
    @ApiModelProperty(value = "ccleanver")
	private java.lang.String ccleanver;
	/**ccontactcode*/
	@Excel(name = "ccontactcode", width = 15)
    @ApiModelProperty(value = "ccontactcode")
	private java.lang.String ccontactcode;
	/**cvenperson*/
	@Excel(name = "cvenperson", width = 15)
    @ApiModelProperty(value = "cvenperson")
	private java.lang.String cvenperson;
	/**cvenbank*/
	@Excel(name = "cvenbank", width = 15)
    @ApiModelProperty(value = "cvenbank")
	private java.lang.String cvenbank;
	/**cvenaccount*/
	@Excel(name = "cvenaccount", width = 15)
    @ApiModelProperty(value = "cvenaccount")
	private java.lang.String cvenaccount;
	/**cappcode*/
	@Excel(name = "cappcode", width = 15)
    @ApiModelProperty(value = "cappcode")
	private java.lang.String cappcode;
	/**csysbarcode*/
	@Excel(name = "csysbarcode", width = 15)
    @ApiModelProperty(value = "csysbarcode")
	private java.lang.String csysbarcode;
	/**ccurrentauditor*/
	@Excel(name = "ccurrentauditor", width = 15)
    @ApiModelProperty(value = "ccurrentauditor")
	private java.lang.String ccurrentauditor;
	/**cgcroutecode*/
	@Excel(name = "cgcroutecode", width = 15)
    @ApiModelProperty(value = "cgcroutecode")
	private java.lang.String cgcroutecode;
	/**bgctransforming*/
	@Excel(name = "bgctransforming", width = 15)
    @ApiModelProperty(value = "bgctransforming")
	private java.lang.Object bgctransforming;
	/**yycRespstatus*/
	@Excel(name = "yycRespstatus", width = 15)
    @ApiModelProperty(value = "yycRespstatus")
	private java.lang.String yycRespstatus;
	/**yycReason*/
	@Excel(name = "yycReason", width = 15)
    @ApiModelProperty(value = "yycReason")
	private java.lang.String yycReason;
	/**csyssource*/
	@Excel(name = "csyssource", width = 15)
    @ApiModelProperty(value = "csyssource")
	private java.lang.String csyssource;
	/**csyssourceid*/
	@Excel(name = "csyssourceid", width = 15)
    @ApiModelProperty(value = "csyssourceid")
	private java.lang.String csyssourceid;
	/**clshwhcode*/
	@Excel(name = "clshwhcode", width = 15)
    @ApiModelProperty(value = "clshwhcode")
	private java.lang.String clshwhcode;
}
