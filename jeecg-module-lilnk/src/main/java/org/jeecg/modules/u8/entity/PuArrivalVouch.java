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
 * @Description: 采购到货退货主表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
@Data
@TableName("PU_ArrivalVouch")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PU_ArrivalVouch对象", description="采购到货退货主表")
public class PuArrivalVouch {
    
	/**ivtid*/
	@Excel(name = "ivtid", width = 15)
    @ApiModelProperty(value = "ivtid")
	private java.lang.Integer ivtid;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**ccode*/
	@Excel(name = "ccode", width = 15)
    @ApiModelProperty(value = "ccode")
	private java.lang.String ccode;
	/**cptcode*/
	@Excel(name = "cptcode", width = 15)
    @ApiModelProperty(value = "cptcode")
	private java.lang.String cptcode;
	/**ddate*/
	@Excel(name = "ddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddate")
	private java.util.Date ddate;
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
	/**cpaycode*/
	@Excel(name = "cpaycode", width = 15)
    @ApiModelProperty(value = "cpaycode")
	private java.lang.String cpaycode;
	/**csccode*/
	@Excel(name = "csccode", width = 15)
    @ApiModelProperty(value = "csccode")
	private java.lang.String csccode;
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
	private java.math.BigDecimal itaxrate;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**cbustype*/
	@Excel(name = "cbustype", width = 15)
    @ApiModelProperty(value = "cbustype")
	private java.lang.String cbustype;
	/**cmaker*/
	@Excel(name = "cmaker", width = 15)
    @ApiModelProperty(value = "cmaker")
	private java.lang.String cmaker;
	/**bnegative*/
	@Excel(name = "bnegative", width = 15)
    @ApiModelProperty(value = "bnegative")
	private java.lang.Integer bnegative;
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
	/**ccloser*/
	@Excel(name = "ccloser", width = 15)
    @ApiModelProperty(value = "ccloser")
	private java.lang.String ccloser;
	/**idiscounttaxtype*/
	@Excel(name = "idiscounttaxtype", width = 15)
    @ApiModelProperty(value = "idiscounttaxtype")
	private java.lang.Integer idiscounttaxtype;
	/**ibilltype*/
	@Excel(name = "ibilltype", width = 15)
    @ApiModelProperty(value = "ibilltype")
	private java.lang.Integer ibilltype;
	/**cvouchtype*/
	@Excel(name = "cvouchtype", width = 15)
    @ApiModelProperty(value = "cvouchtype")
	private java.lang.String cvouchtype;
	/**cgeneralordercode*/
	@Excel(name = "cgeneralordercode", width = 15)
    @ApiModelProperty(value = "cgeneralordercode")
	private java.lang.String cgeneralordercode;
	/**ctmcode*/
	@Excel(name = "ctmcode", width = 15)
    @ApiModelProperty(value = "ctmcode")
	private java.lang.String ctmcode;
	/**cincotermcode*/
	@Excel(name = "cincotermcode", width = 15)
    @ApiModelProperty(value = "cincotermcode")
	private java.lang.String cincotermcode;
	/**ctransordercode*/
	@Excel(name = "ctransordercode", width = 15)
    @ApiModelProperty(value = "ctransordercode")
	private java.lang.String ctransordercode;
	/**dportdate*/
	@Excel(name = "dportdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dportdate")
	private java.util.Date dportdate;
	/**csportcode*/
	@Excel(name = "csportcode", width = 15)
    @ApiModelProperty(value = "csportcode")
	private java.lang.String csportcode;
	/**caportcode*/
	@Excel(name = "caportcode", width = 15)
    @ApiModelProperty(value = "caportcode")
	private java.lang.String caportcode;
	/**csvencode*/
	@Excel(name = "csvencode", width = 15)
    @ApiModelProperty(value = "csvencode")
	private java.lang.String csvencode;
	/**carrivalplace*/
	@Excel(name = "carrivalplace", width = 15)
    @ApiModelProperty(value = "carrivalplace")
	private java.lang.String carrivalplace;
	/**dclosedate*/
	@Excel(name = "dclosedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dclosedate")
	private java.util.Date dclosedate;
	/**idec*/
	@Excel(name = "idec", width = 15)
    @ApiModelProperty(value = "idec")
	private java.lang.Integer idec;
	/**bcal*/
	@Excel(name = "bcal", width = 15)
    @ApiModelProperty(value = "bcal")
	private java.lang.Object bcal;
	/**guid*/
	@Excel(name = "guid", width = 15)
    @ApiModelProperty(value = "guid")
	private java.lang.String guid;
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
	/**iverifystate*/
	@Excel(name = "iverifystate", width = 15)
    @ApiModelProperty(value = "iverifystate")
	private java.lang.Integer iverifystate;
	/**cauditdate*/
	@Excel(name = "cauditdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cauditdate")
	private java.util.Date cauditdate;
	/**caudittime*/
	@Excel(name = "caudittime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "caudittime")
	private java.util.Date caudittime;
	/**cverifier*/
	@Excel(name = "cverifier", width = 15)
    @ApiModelProperty(value = "cverifier")
	private java.lang.String cverifier;
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
	/**cvenpuomprotocol*/
	@Excel(name = "cvenpuomprotocol", width = 15)
    @ApiModelProperty(value = "cvenpuomprotocol")
	private java.lang.String cvenpuomprotocol;
	/**cchanger*/
	@Excel(name = "cchanger", width = 15)
    @ApiModelProperty(value = "cchanger")
	private java.lang.String cchanger;
	/**iflowid*/
	@Excel(name = "iflowid", width = 15)
    @ApiModelProperty(value = "iflowid")
	private java.lang.Integer iflowid;
	/**iprintcount*/
	@Excel(name = "iprintcount", width = 15)
    @ApiModelProperty(value = "iprintcount")
	private java.lang.Integer iprintcount;
	/**ccleanver*/
	@Excel(name = "ccleanver", width = 15)
    @ApiModelProperty(value = "ccleanver")
	private java.lang.String ccleanver;
	/**cpocode*/
	@Excel(name = "cpocode", width = 15)
    @ApiModelProperty(value = "cpocode")
	private java.lang.String cpocode;
	/**csysbarcode*/
	@Excel(name = "csysbarcode", width = 15)
    @ApiModelProperty(value = "csysbarcode")
	private java.lang.String csysbarcode;
	/**ccurrentauditor*/
	@Excel(name = "ccurrentauditor", width = 15)
    @ApiModelProperty(value = "ccurrentauditor")
	private java.lang.String ccurrentauditor;
}
