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
 * @Description: 产成品入库主
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Data
@TableName("Rdrecord10")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Rdrecord10对象", description="产成品入库主")
public class Rdrecord10 {
    
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**brdflag*/
	@Excel(name = "brdflag", width = 15)
    @ApiModelProperty(value = "brdflag")
	private java.lang.Integer brdflag;
	/**cvouchtype*/
	@Excel(name = "cvouchtype", width = 15)
    @ApiModelProperty(value = "cvouchtype")
	private java.lang.String cvouchtype;
	/**cbustype*/
	@Excel(name = "cbustype", width = 15)
    @ApiModelProperty(value = "cbustype")
	private java.lang.String cbustype;
	/**csource*/
	@Excel(name = "csource", width = 15)
    @ApiModelProperty(value = "csource")
	private java.lang.String csource;
	/**cbuscode*/
	@Excel(name = "cbuscode", width = 15)
    @ApiModelProperty(value = "cbuscode")
	private java.lang.String cbuscode;
	/**cwhcode*/
	@Excel(name = "cwhcode", width = 15)
    @ApiModelProperty(value = "cwhcode")
	private java.lang.String cwhcode;
	/**ddate*/
	@Excel(name = "ddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddate")
	private java.util.Date ddate;
	/**ccode*/
	@Excel(name = "ccode", width = 15)
    @ApiModelProperty(value = "ccode")
	private java.lang.String ccode;
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
	/**cptcode*/
	@Excel(name = "cptcode", width = 15)
    @ApiModelProperty(value = "cptcode")
	private java.lang.String cptcode;
	/**cstcode*/
	@Excel(name = "cstcode", width = 15)
    @ApiModelProperty(value = "cstcode")
	private java.lang.String cstcode;
	/**ccuscode*/
	@Excel(name = "ccuscode", width = 15)
    @ApiModelProperty(value = "ccuscode")
	private java.lang.String ccuscode;
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**cordercode*/
	@Excel(name = "cordercode", width = 15)
    @ApiModelProperty(value = "cordercode")
	private java.lang.String cordercode;
	/**carvcode*/
	@Excel(name = "carvcode", width = 15)
    @ApiModelProperty(value = "carvcode")
	private java.lang.String carvcode;
	/**cbillcode*/
	@Excel(name = "cbillcode", width = 15)
    @ApiModelProperty(value = "cbillcode")
	private java.lang.Integer cbillcode;
	/**cdlcode*/
	@Excel(name = "cdlcode", width = 15)
    @ApiModelProperty(value = "cdlcode")
	private java.lang.Integer cdlcode;
	/**cprobatch*/
	@Excel(name = "cprobatch", width = 15)
    @ApiModelProperty(value = "cprobatch")
	private java.lang.String cprobatch;
	/**chandler*/
	@Excel(name = "chandler", width = 15)
    @ApiModelProperty(value = "chandler")
	private java.lang.String chandler;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**btransflag*/
	@Excel(name = "btransflag", width = 15)
    @ApiModelProperty(value = "btransflag")
	private java.lang.Object btransflag;
	/**caccounter*/
	@Excel(name = "caccounter", width = 15)
    @ApiModelProperty(value = "caccounter")
	private java.lang.String caccounter;
	/**cmaker*/
	@Excel(name = "cmaker", width = 15)
    @ApiModelProperty(value = "cmaker")
	private java.lang.String cmaker;
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
	/**dkeepdate*/
	@Excel(name = "dkeepdate", width = 15)
    @ApiModelProperty(value = "dkeepdate")
	private java.lang.String dkeepdate;
	/**dveridate*/
	@Excel(name = "dveridate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dveridate")
	private java.util.Date dveridate;
	/**bpufirst*/
	@Excel(name = "bpufirst", width = 15)
    @ApiModelProperty(value = "bpufirst")
	private java.lang.Object bpufirst;
	/**biafirst*/
	@Excel(name = "biafirst", width = 15)
    @ApiModelProperty(value = "biafirst")
	private java.lang.Object biafirst;
	/**imquantity*/
	@Excel(name = "imquantity", width = 15)
    @ApiModelProperty(value = "imquantity")
	private java.lang.Float imquantity;
	/**darvdate*/
	@Excel(name = "darvdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "darvdate")
	private java.util.Date darvdate;
	/**cchkcode*/
	@Excel(name = "cchkcode", width = 15)
    @ApiModelProperty(value = "cchkcode")
	private java.lang.String cchkcode;
	/**dchkdate*/
	@Excel(name = "dchkdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dchkdate")
	private java.util.Date dchkdate;
	/**cchkperson*/
	@Excel(name = "cchkperson", width = 15)
    @ApiModelProperty(value = "cchkperson")
	private java.lang.String cchkperson;
	/**vtId*/
	@Excel(name = "vtId", width = 15)
    @ApiModelProperty(value = "vtId")
	private java.lang.Integer vtId;
	/**bisstqc*/
	@Excel(name = "bisstqc", width = 15)
    @ApiModelProperty(value = "bisstqc")
	private java.lang.Object bisstqc;
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
	/**cmpocode*/
	@Excel(name = "cmpocode", width = 15)
    @ApiModelProperty(value = "cmpocode")
	private java.lang.String cmpocode;
	/**gspcheck*/
	@Excel(name = "gspcheck", width = 15)
    @ApiModelProperty(value = "gspcheck")
	private java.lang.String gspcheck;
	/**ipurorderid*/
	@Excel(name = "ipurorderid", width = 15)
    @ApiModelProperty(value = "ipurorderid")
	private java.lang.Integer ipurorderid;
	/**iproorderid*/
	@Excel(name = "iproorderid", width = 15)
    @ApiModelProperty(value = "iproorderid")
	private java.lang.Integer iproorderid;
	/**iexchrate*/
	@Excel(name = "iexchrate", width = 15)
    @ApiModelProperty(value = "iexchrate")
	private java.lang.Float iexchrate;
	/**cexchName*/
	@Excel(name = "cexchName", width = 15)
    @ApiModelProperty(value = "cexchName")
	private java.lang.String cexchName;
	/**bomfirst*/
	@Excel(name = "bomfirst", width = 15)
    @ApiModelProperty(value = "bomfirst")
	private java.lang.Object bomfirst;
	/**bfrompreyear*/
	@Excel(name = "bfrompreyear", width = 15)
    @ApiModelProperty(value = "bfrompreyear")
	private java.lang.Object bfrompreyear;
	/**bislsquery*/
	@Excel(name = "bislsquery", width = 15)
    @ApiModelProperty(value = "bislsquery")
	private java.lang.Object bislsquery;
	/**biscomplement*/
	@Excel(name = "biscomplement", width = 15)
    @ApiModelProperty(value = "biscomplement")
	private java.lang.Integer biscomplement;
	/**idiscounttaxtype*/
	@Excel(name = "idiscounttaxtype", width = 15)
    @ApiModelProperty(value = "idiscounttaxtype")
	private java.lang.Integer idiscounttaxtype;
	/**ireturncount*/
	@Excel(name = "ireturncount", width = 15)
    @ApiModelProperty(value = "ireturncount")
	private java.lang.Integer ireturncount;
	/**iverifystate*/
	@Excel(name = "iverifystate", width = 15)
    @ApiModelProperty(value = "iverifystate")
	private java.lang.Integer iverifystate;
	/**iswfcontrolled*/
	@Excel(name = "iswfcontrolled", width = 15)
    @ApiModelProperty(value = "iswfcontrolled")
	private java.lang.Integer iswfcontrolled;
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
	/**dnmaketime*/
	@Excel(name = "dnmaketime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dnmaketime")
	private java.util.Date dnmaketime;
	/**dnmodifytime*/
	@Excel(name = "dnmodifytime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dnmodifytime")
	private java.util.Date dnmodifytime;
	/**dnverifytime*/
	@Excel(name = "dnverifytime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dnverifytime")
	private java.util.Date dnverifytime;
	/**bredvouch*/
	@Excel(name = "bredvouch", width = 15)
    @ApiModelProperty(value = "bredvouch")
	private java.lang.Integer bredvouch;
	/**iflowid*/
	@Excel(name = "iflowid", width = 15)
    @ApiModelProperty(value = "iflowid")
	private java.lang.Integer iflowid;
	/**cpzid*/
	@Excel(name = "cpzid", width = 15)
    @ApiModelProperty(value = "cpzid")
	private java.lang.String cpzid;
	/**csourcels*/
	@Excel(name = "csourcels", width = 15)
    @ApiModelProperty(value = "csourcels")
	private java.lang.String csourcels;
	/**csourcecodels*/
	@Excel(name = "csourcecodels", width = 15)
    @ApiModelProperty(value = "csourcecodels")
	private java.lang.String csourcecodels;
	/**iprintcount*/
	@Excel(name = "iprintcount", width = 15)
    @ApiModelProperty(value = "iprintcount")
	private java.lang.Integer iprintcount;
	/**csysbarcode*/
	@Excel(name = "csysbarcode", width = 15)
    @ApiModelProperty(value = "csysbarcode")
	private java.lang.String csysbarcode;
	/**ccurrentauditor*/
	@Excel(name = "ccurrentauditor", width = 15)
    @ApiModelProperty(value = "ccurrentauditor")
	private java.lang.String ccurrentauditor;
	/**outid*/
	@Excel(name = "outid", width = 15)
    @ApiModelProperty(value = "outid")
	private java.lang.Object outid;
	/**cchecksignflag*/
	@Excel(name = "cchecksignflag", width = 15)
    @ApiModelProperty(value = "cchecksignflag")
	private java.lang.String cchecksignflag;
}
