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
 * @Description: 销售订单明细
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Data
@TableName("CJK_DJ_CKJHDMX_ERP")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_DJ_CKJHDMX_ERP对象", description="销售订单明细")
public class CJKDJCKJHDMXERP {
    
	/**ID*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "ID")
	private java.lang.Long id;
	/**ERP行号*/
	@Excel(name = "ERP行号", width = 15)
    @ApiModelProperty(value = "ERP行号")
	private java.lang.Long nhh;
	/**ERP接口单据号*/
	@Excel(name = "ERP接口单据号", width = 15)
    @ApiModelProperty(value = "ERP接口单据号")
	private java.lang.String sjkid;
	/**ERP接口商品ID*/
	@Excel(name = "ERP接口商品ID", width = 15)
    @ApiModelProperty(value = "ERP接口商品ID")
	private java.lang.String sjkspid;
	/**nckdid*/
	@Excel(name = "nckdid", width = 15)
    @ApiModelProperty(value = "nckdid")
	private java.lang.Long nckdid;
	/**nspid*/
	@Excel(name = "nspid", width = 15)
    @ApiModelProperty(value = "nspid")
	private java.lang.Long nspid;
	/**件装量*/
	@Excel(name = "件装量", width = 15)
    @ApiModelProperty(value = "件装量")
	private java.lang.Long njlgg;
	/**订单数量*/
	@Excel(name = "订单数量", width = 15)
    @ApiModelProperty(value = "订单数量")
	private java.math.BigDecimal n4jhsl;
	/**订单数量*/
	@Excel(name = "订单数量", width = 15)
    @ApiModelProperty(value = "订单数量")
	private java.math.BigDecimal n4sjsl;
	/**n4lsslCh*/
	@Excel(name = "n4lsslCh", width = 15)
    @ApiModelProperty(value = "n4lsslCh")
	private java.math.BigDecimal n4lsslCh;
	/**批号*/
	@Excel(name = "批号", width = 15)
    @ApiModelProperty(value = "批号")
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
	/**有效期*/
	@Excel(name = "有效期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "有效期")
	private java.util.Date dyxqz;
	/**ERP行号*/
	@Excel(name = "ERP行号", width = 15)
    @ApiModelProperty(value = "ERP行号")
	private java.lang.Long nyhh;
	/**时间*/
	@Excel(name = "时间", width = 15)
    @ApiModelProperty(value = "时间")
	private java.lang.String ssjc;
	/**shxbs*/
	@Excel(name = "shxbs", width = 15)
    @ApiModelProperty(value = "shxbs")
	private java.lang.String shxbs;
	/**checkmanid*/
	@Excel(name = "checkmanid", width = 15)
    @ApiModelProperty(value = "checkmanid")
	private java.lang.Integer checkmanid;
	/**checkmanid2*/
	@Excel(name = "checkmanid2", width = 15)
    @ApiModelProperty(value = "checkmanid2")
	private java.lang.Integer checkmanid2;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private java.lang.String shzname;
	/**含税价*/
	@Excel(name = "含税价", width = 15)
    @ApiModelProperty(value = "含税价")
	private java.math.BigDecimal n4dj;
	/**备用1*/
	@Excel(name = "备用1", width = 15)
    @ApiModelProperty(value = "备用1")
	private java.lang.String sbeiy1;
	/**备用2*/
	@Excel(name = "备用2", width = 15)
    @ApiModelProperty(value = "备用2")
	private java.lang.String sbeiy2;
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
	/**sbz*/
	@Excel(name = "sbz", width = 15)
    @ApiModelProperty(value = "sbz")
	private java.lang.String sbz;
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
