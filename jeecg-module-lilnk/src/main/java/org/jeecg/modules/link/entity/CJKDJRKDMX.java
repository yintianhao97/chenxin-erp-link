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
 * @Description: 上架子单据
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@Data
@TableName("CJK_DJ_RKDMX")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_DJ_RKDMX对象", description="上架子单据")
public class CJKDJRKDMX {
    
	/**备用3*/
	@Excel(name = "备用3", width = 15)
    @ApiModelProperty(value = "备用3")
	private java.lang.String sbeiy3;
	/**备用4*/
	@Excel(name = "备用4", width = 15)
    @ApiModelProperty(value = "备用4")
	private java.lang.String sbeiy4;
	/**备用5*/
	@Excel(name = "备用5", width = 15)
    @ApiModelProperty(value = "备用5")
	private java.lang.String sbeiy5;
	/**备用6*/
	@Excel(name = "备用6", width = 15)
    @ApiModelProperty(value = "备用6")
	private java.lang.String sbeiy6;
	/**备用7*/
	@Excel(name = "备用7", width = 15)
    @ApiModelProperty(value = "备用7")
	private java.lang.String sbeiy7;
	/**备用8*/
	@Excel(name = "备用8", width = 15)
    @ApiModelProperty(value = "备用8")
	private java.lang.String sbeiy8;
	/**数值备用1*/
	@Excel(name = "数值备用1", width = 15)
    @ApiModelProperty(value = "数值备用1")
	private java.math.BigDecimal nbeiy1;
	/**数值备用2*/
	@Excel(name = "数值备用2", width = 15)
    @ApiModelProperty(value = "数值备用2")
	private java.math.BigDecimal nbeiy2;
	/**数值备用3*/
	@Excel(name = "数值备用3", width = 15)
    @ApiModelProperty(value = "数值备用3")
	private java.math.BigDecimal nbeiy3;
	/**数值备用4*/
	@Excel(name = "数值备用4", width = 15)
    @ApiModelProperty(value = "数值备用4")
	private java.math.BigDecimal nbeiy4;
	/**数值备用5*/
	@Excel(name = "数值备用5", width = 15)
    @ApiModelProperty(value = "数值备用5")
	private java.math.BigDecimal nbeiy5;
	/**数值备用6*/
	@Excel(name = "数值备用6", width = 15)
    @ApiModelProperty(value = "数值备用6")
	private java.math.BigDecimal nbeiy6;
	/**数值备用7*/
	@Excel(name = "数值备用7", width = 15)
    @ApiModelProperty(value = "数值备用7")
	private java.math.BigDecimal nbeiy7;
	/**数值备用8*/
	@Excel(name = "数值备用8", width = 15)
    @ApiModelProperty(value = "数值备用8")
	private java.math.BigDecimal nbeiy8;
	/**sspcd*/
	@Excel(name = "sspcd", width = 15)
    @ApiModelProperty(value = "sspcd")
	private java.lang.String sspcd;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private java.lang.String shzgsid;
	/**sgsid*/
	@Excel(name = "sgsid", width = 15)
    @ApiModelProperty(value = "sgsid")
	private java.lang.String sgsid;
	/**接口序号*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "接口序号")
	private java.lang.Long id;
	/**行号*/
	@Excel(name = "行号", width = 15)
    @ApiModelProperty(value = "行号")
	private java.lang.Long nhh;
	/**接口单据编号(ERP)*/
	@Excel(name = "接口单据编号(ERP)", width = 15)
    @ApiModelProperty(value = "接口单据编号(ERP)")
	private java.lang.String sjkid;
	/**接口商品内码(ERP)*/
	@Excel(name = "接口商品内码(ERP)", width = 15)
    @ApiModelProperty(value = "接口商品内码(ERP)")
	private java.lang.String sjkspid;
	/**入库单号(WMS)*/
	@Excel(name = "入库单号(WMS)", width = 15)
    @ApiModelProperty(value = "入库单号(WMS)")
	private java.lang.Long nrkdid;
	/**商品内码(WMS)*/
	@Excel(name = "商品内码(WMS)", width = 15)
    @ApiModelProperty(value = "商品内码(WMS)")
	private java.lang.Long nspid;
	/**计量规格*/
	@Excel(name = "计量规格", width = 15)
    @ApiModelProperty(value = "计量规格")
	private java.lang.Long njlgg;
	/**计划数量*/
	@Excel(name = "计划数量", width = 15)
    @ApiModelProperty(value = "计划数量")
	private java.math.BigDecimal n4yssl;
	/**合格数量*/
	@Excel(name = "合格数量", width = 15)
    @ApiModelProperty(value = "合格数量")
	private java.math.BigDecimal n4sssl;
	/**批号(如果没有批号默认0000)*/
	@Excel(name = "批号(如果没有批号默认0000)", width = 15)
    @ApiModelProperty(value = "批号(如果没有批号默认0000)")
	private java.lang.String sph;
	/**灭菌批号*/
	@Excel(name = "灭菌批号", width = 15)
    @ApiModelProperty(value = "灭菌批号")
	private java.lang.String smjph;
	/**生产日期*/
	@Excel(name = "生产日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "生产日期")
	private java.util.Date dscrq;
	/**有效期至*/
	@Excel(name = "有效期至", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "有效期至")
	private java.util.Date dyxqz;
	/**原行号*/
	@Excel(name = "原行号", width = 15)
    @ApiModelProperty(value = "原行号")
	private java.lang.Integer nyhh;
	/**冲红数量*/
	@Excel(name = "冲红数量", width = 15)
    @ApiModelProperty(value = "冲红数量")
	private java.math.BigDecimal n4lsslCh;
	/**不合格数量*/
	@Excel(name = "不合格数量", width = 15)
    @ApiModelProperty(value = "不合格数量")
	private java.math.BigDecimal n4bhgsl;
	/**时间戳*/
	@Excel(name = "时间戳", width = 15)
    @ApiModelProperty(value = "时间戳")
	private java.lang.String ssjc;
	/**ERP总单Id*/
	@Excel(name = "ERP总单Id", width = 15)
    @ApiModelProperty(value = "ERP总单Id")
	private java.lang.Integer szdid;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private java.lang.String shzname;
	/**ERP接口单据号*/
	@Excel(name = "ERP接口单据号", width = 15)
    @ApiModelProperty(value = "ERP接口单据号")
	private java.lang.String sxgjkid;
	/**0合格，1不合格*/
	@Excel(name = "0合格，1不合格", width = 15)
    @ApiModelProperty(value = "0合格，1不合格")
	private java.lang.Integer nbhg;
	/**ERP接口行号*/
	@Excel(name = "ERP接口行号", width = 15)
    @ApiModelProperty(value = "ERP接口行号")
	private java.lang.Integer njkhh;
	/**备用1*/
	@Excel(name = "备用1", width = 15)
    @ApiModelProperty(value = "备用1")
	private java.lang.String sbeiy1;
	/**备用2*/
	@Excel(name = "备用2", width = 15)
    @ApiModelProperty(value = "备用2")
	private java.lang.String sbeiy2;
}
