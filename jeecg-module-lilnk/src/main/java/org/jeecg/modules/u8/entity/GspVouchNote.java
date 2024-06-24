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
 * @Description: 销售出库质量符合单主
 * @Author: jeecg-boot
 * @Date:   2024-06-19
 * @Version: V1.0
 */
@Data
@TableName("GSP_VouchNote")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GSP_VouchNote对象", description="销售出库质量符合单主")
public class GspVouchNote {
    
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**noteid*/
	@Excel(name = "noteid", width = 15)
    @ApiModelProperty(value = "noteid")
	private java.lang.String noteid;
	/**cdepcode*/
	@Excel(name = "cdepcode", width = 15)
    @ApiModelProperty(value = "cdepcode")
	private java.lang.String cdepcode;
	/**ddate*/
	@Excel(name = "ddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddate")
	private java.util.Date ddate;
	/**cmaker*/
	@Excel(name = "cmaker", width = 15)
    @ApiModelProperty(value = "cmaker")
	private java.lang.String cmaker;
	/**cverifier*/
	@Excel(name = "cverifier", width = 15)
    @ApiModelProperty(value = "cverifier")
	private java.lang.String cverifier;
	/**icode*/
	@Excel(name = "icode", width = 15)
    @ApiModelProperty(value = "icode")
	private java.lang.Integer icode;
	/**ccode*/
	@Excel(name = "ccode", width = 15)
    @ApiModelProperty(value = "ccode")
	private java.lang.String ccode;
	/**cchar*/
	@Excel(name = "cchar", width = 15)
    @ApiModelProperty(value = "cchar")
	private java.lang.String cchar;
	/**cnumber*/
	@Excel(name = "cnumber", width = 15)
    @ApiModelProperty(value = "cnumber")
	private java.lang.Integer cnumber;
	/**csort*/
	@Excel(name = "csort", width = 15)
    @ApiModelProperty(value = "csort")
	private java.lang.String csort;
	/**cvouchtype*/
	@Excel(name = "cvouchtype", width = 15)
    @ApiModelProperty(value = "cvouchtype")
	private java.lang.String cvouchtype;
	/**cprincipal*/
	@Excel(name = "cprincipal", width = 15)
    @ApiModelProperty(value = "cprincipal")
	private java.lang.String cprincipal;
	/**dsumdate*/
	@Excel(name = "dsumdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dsumdate")
	private java.util.Date dsumdate;
	/**cpersonlist*/
	@Excel(name = "cpersonlist", width = 15)
    @ApiModelProperty(value = "cpersonlist")
	private java.lang.String cpersonlist;
	/**cmind*/
	@Excel(name = "cmind", width = 15)
    @ApiModelProperty(value = "cmind")
	private java.lang.String cmind;
	/**cunitcode*/
	@Excel(name = "cunitcode", width = 15)
    @ApiModelProperty(value = "cunitcode")
	private java.lang.String cunitcode;
	/**cpage*/
	@Excel(name = "cpage", width = 15)
    @ApiModelProperty(value = "cpage")
	private java.lang.Integer cpage;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**ivtid*/
	@Excel(name = "ivtid", width = 15)
    @ApiModelProperty(value = "ivtid")
	private java.lang.Integer ivtid;

	/**brefer*/
	@Excel(name = "brefer", width = 15)
    @ApiModelProperty(value = "brefer")
	private java.lang.Object brefer;
	/**cshipper*/
	@Excel(name = "cshipper", width = 15)
    @ApiModelProperty(value = "cshipper")
	private java.lang.String cshipper;
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
	private java.math.BigDecimal cdefine7;
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
	private java.math.BigDecimal cdefine16;
	/**cpersonname*/
	@Excel(name = "cpersonname", width = 15)
    @ApiModelProperty(value = "cpersonname")
	private java.lang.String cpersonname;
	/**iswfcontrolled*/
	@Excel(name = "iswfcontrolled", width = 15)
    @ApiModelProperty(value = "iswfcontrolled")
	private java.lang.Integer iswfcontrolled;
	/**ireturncount*/
	@Excel(name = "ireturncount", width = 15)
    @ApiModelProperty(value = "ireturncount")
	private java.lang.Integer ireturncount;
	/**iverifystate*/
	@Excel(name = "iverifystate", width = 15)
    @ApiModelProperty(value = "iverifystate")
	private java.lang.Integer iverifystate;
	/**iverifystatenew*/
	@Excel(name = "iverifystatenew", width = 15)
    @ApiModelProperty(value = "iverifystatenew")
	private java.lang.Integer iverifystatenew;
	/**ccurrentauditor*/
	@Excel(name = "ccurrentauditor", width = 15)
    @ApiModelProperty(value = "ccurrentauditor")
	private java.lang.String ccurrentauditor;
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
	/**iplantype*/
	@Excel(name = "iplantype", width = 15)
    @ApiModelProperty(value = "iplantype")
	private java.lang.Integer iplantype;
}
