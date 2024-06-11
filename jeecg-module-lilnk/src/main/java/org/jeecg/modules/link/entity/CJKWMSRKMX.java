package org.jeecg.modules.link.entity;

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
 * @Description: 入库明细
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Data
@TableName("CJK_WMS_RKMX")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_WMS_RKMX对象", description="入库明细")
public class CJKWMSRKMX {
    
	/**单据编号*/
	@Excel(name = "单据编号", width = 15)
    @ApiModelProperty(value = "单据编号")
	private java.lang.String djbh;
	/**行号*/
	@Excel(name = "行号", width = 15)
    @ApiModelProperty(value = "行号")
	private java.lang.Integer djSn;
	/**商品ID*/
	@Excel(name = "商品ID", width = 15)
    @ApiModelProperty(value = "商品ID")
	private java.lang.String spid;
	/**recnum*/
	@Excel(name = "recnum", width = 15)
    @ApiModelProperty(value = "recnum")
	private java.lang.Integer recnum;
	/**相关单据号*/
	@Excel(name = "相关单据号", width = 15)
    @ApiModelProperty(value = "相关单据号")
	private java.lang.String xgdjbh;
	/**件装量*/
	@Excel(name = "件装量", width = 15)
    @ApiModelProperty(value = "件装量")
	private java.lang.Integer jlgg;
	/**整件数量*/
	@Excel(name = "整件数量", width = 15)
    @ApiModelProperty(value = "整件数量")
	private java.lang.Integer baozhshl;
	/**零货数量*/
	@Excel(name = "零货数量", width = 15)
    @ApiModelProperty(value = "零货数量")
	private java.math.BigDecimal lingsshl;
	/**数量*/
	@Excel(name = "数量", width = 15)
    @ApiModelProperty(value = "数量")
	@TableField(value = "shl")
	private java.math.BigDecimal jkjkjk;
	/**yiwchsl*/
	@Excel(name = "yiwchsl", width = 15)
    @ApiModelProperty(value = "yiwchsl")
	private java.math.BigDecimal yiwchsl;
	/**含税价*/
	@Excel(name = "含税价", width = 15)
    @ApiModelProperty(value = "含税价")
	private java.math.BigDecimal hshj;
	/**单价*/
	@Excel(name = "单价", width = 15)
    @ApiModelProperty(value = "单价")
	private java.math.BigDecimal dj;
	/**金额*/
	@Excel(name = "金额", width = 15)
    @ApiModelProperty(value = "金额")
	private java.math.BigDecimal je;
	/**税额*/
	@Excel(name = "税额", width = 15)
    @ApiModelProperty(value = "税额")
	private java.math.BigDecimal she;
	/**含税金额*/
	@Excel(name = "含税金额", width = 15)
    @ApiModelProperty(value = "含税金额")
	private java.math.BigDecimal hsje;
	/**税率*/
	@Excel(name = "税率", width = 15)
    @ApiModelProperty(value = "税率")
	private java.math.BigDecimal shlv;
	/**批号*/
	@Excel(name = "批号", width = 15)
    @ApiModelProperty(value = "批号")
	private java.lang.String pihao;
	/**生产日期*/
	@Excel(name = "生产日期", width = 15)
    @ApiModelProperty(value = "生产日期")
	private java.lang.String baozhiqi;
	/**有效期*/
	@Excel(name = "有效期", width = 15)
    @ApiModelProperty(value = "有效期")
	private java.lang.String sxrq;
	/**rkzt*/
	@Excel(name = "rkzt", width = 15)
    @ApiModelProperty(value = "rkzt")
	private java.lang.String rkzt;
	/**shzt*/
	@Excel(name = "shzt", width = 15)
    @ApiModelProperty(value = "shzt")
	private java.lang.String shzt;
	/**yszt*/
	@Excel(name = "yszt", width = 15)
    @ApiModelProperty(value = "yszt")
	private java.lang.String yszt;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
	private java.lang.String beizhu;
	/**默认 否*/
	@Excel(name = "默认 否", width = 15)
    @ApiModelProperty(value = "默认 否")
	private java.lang.String isZx;
	/**sbeiy1*/
	@Excel(name = "sbeiy1", width = 15)
    @ApiModelProperty(value = "sbeiy1")
	private java.lang.String sbeiy1;
	/**sbeiy2*/
	@Excel(name = "sbeiy2", width = 15)
    @ApiModelProperty(value = "sbeiy2")
	private java.lang.String sbeiy2;
	/**sbeiy3*/
	@Excel(name = "sbeiy3", width = 15)
    @ApiModelProperty(value = "sbeiy3")
	private java.lang.String sbeiy3;
	/**sbeiy4*/
	@Excel(name = "sbeiy4", width = 15)
    @ApiModelProperty(value = "sbeiy4")
	private java.lang.String sbeiy4;
	/**sbeiy5*/
	@Excel(name = "sbeiy5", width = 15)
    @ApiModelProperty(value = "sbeiy5")
	private java.lang.String sbeiy5;
	/**sbeiy6*/
	@Excel(name = "sbeiy6", width = 15)
    @ApiModelProperty(value = "sbeiy6")
	private java.lang.String sbeiy6;
	/**sbeiy7*/
	@Excel(name = "sbeiy7", width = 15)
    @ApiModelProperty(value = "sbeiy7")
	private java.lang.String sbeiy7;
	/**sbeiy8*/
	@Excel(name = "sbeiy8", width = 15)
    @ApiModelProperty(value = "sbeiy8")
	private java.lang.String sbeiy8;
	/**nbeiy1*/
	@Excel(name = "nbeiy1", width = 15)
    @ApiModelProperty(value = "nbeiy1")
	private java.math.BigDecimal nbeiy1;
	/**nbeiy2*/
	@Excel(name = "nbeiy2", width = 15)
    @ApiModelProperty(value = "nbeiy2")
	private java.math.BigDecimal nbeiy2;
	/**nbeiy3*/
	@Excel(name = "nbeiy3", width = 15)
    @ApiModelProperty(value = "nbeiy3")
	private java.math.BigDecimal nbeiy3;
	/**nbeiy4*/
	@Excel(name = "nbeiy4", width = 15)
    @ApiModelProperty(value = "nbeiy4")
	private java.math.BigDecimal nbeiy4;
	/**nbeiy5*/
	@Excel(name = "nbeiy5", width = 15)
    @ApiModelProperty(value = "nbeiy5")
	private java.math.BigDecimal nbeiy5;
	/**nbeiy6*/
	@Excel(name = "nbeiy6", width = 15)
    @ApiModelProperty(value = "nbeiy6")
	private java.math.BigDecimal nbeiy6;
	/**nbeiy7*/
	@Excel(name = "nbeiy7", width = 15)
    @ApiModelProperty(value = "nbeiy7")
	private java.math.BigDecimal nbeiy7;
	/**nbeiy8*/
	@Excel(name = "nbeiy8", width = 15)
    @ApiModelProperty(value = "nbeiy8")
	private java.math.BigDecimal nbeiy8;
	/**sjkid*/
	@Excel(name = "sjkid", width = 15)
    @ApiModelProperty(value = "sjkid")
	private java.lang.String sjkid;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private java.lang.String shzgsid;
	/**更新时间*/
	@Excel(name = "更新时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间")
	private java.util.Date dgxsj;
	/**sgsid*/
	@Excel(name = "sgsid", width = 15)
    @ApiModelProperty(value = "sgsid")
	private java.lang.String sgsid;
}
