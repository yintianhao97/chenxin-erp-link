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
 * @Description: 上架汇总
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@Data
@TableName("CJK_DJ_RKD")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_DJ_RKD对象", description="上架汇总")
public class CJKDJRKD {
    
	/**接口序号*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "接口序号")
	private java.lang.Long id;
	/**接收标记(0，未接收；1，接收成功；2，处理失败)*/
	@Excel(name = "接收标记(0，未接收；1，接收成功；2，处理失败)", width = 15)
    @ApiModelProperty(value = "接收标记(0，未接收；1，接收成功；2，处理失败)")
	private java.lang.Integer njsbj;
	/**接收备注*/
	@Excel(name = "接收备注", width = 15)
    @ApiModelProperty(value = "接收备注")
	private java.lang.String sjsbz;
	/**入库单号(WMS)*/
	@Excel(name = "入库单号(WMS)", width = 15)
    @ApiModelProperty(value = "入库单号(WMS)")
	private java.lang.Long nrkdid;
	/**接口单号(ERP)*/
	@Excel(name = "接口单号(ERP)", width = 15)
    @ApiModelProperty(value = "接口单号(ERP)")
	private java.lang.String sjkid;
	/**供应商*/
	@Excel(name = "供应商", width = 15)
    @ApiModelProperty(value = "供应商")
	private java.lang.String swldwid;
	/**入库方式*/
	@Excel(name = "入库方式", width = 15)
    @ApiModelProperty(value = "入库方式")
	private java.lang.Integer nrkfs;
	/**入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)*/
	@Excel(name = "入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)", width = 15)
    @ApiModelProperty(value = "入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)")
	private java.lang.Integer nrklx;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
	private java.lang.String sbz;
	/**业务员名称*/
	@Excel(name = "业务员名称", width = 15)
    @ApiModelProperty(value = "业务员名称")
	private java.lang.String sywymc;
	/**制单日期*/
	@Excel(name = "制单日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "制单日期")
	private java.util.Date dzdrq;
	/**时间戳*/
	@Excel(name = "时间戳", width = 15)
    @ApiModelProperty(value = "时间戳")
	private java.lang.String ssjc;
	/**制单人*/
	@Excel(name = "制单人", width = 15)
    @ApiModelProperty(value = "制单人")
	private java.lang.String szdr;
	/**combrainTimes*/
	@Excel(name = "combrainTimes", width = 15)
    @ApiModelProperty(value = "combrainTimes")
	private java.lang.String combrainTimes;
	/**默认1*/
	@Excel(name = "默认1", width = 15)
    @ApiModelProperty(value = "默认1")
	private java.lang.Integer nck;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**货主名称*/
	@Excel(name = "货主名称", width = 15)
    @ApiModelProperty(value = "货主名称")
	private java.lang.String shzname;
	/**接口单位ID*/
	@Excel(name = "接口单位ID", width = 15)
    @ApiModelProperty(value = "接口单位ID")
	private java.lang.String sjkdwid;
	/**货主公司ID*/
	@Excel(name = "货主公司ID", width = 15)
    @ApiModelProperty(value = "货主公司ID")
	private java.lang.String shzgsid;
	/**ERP接口单据号*/
	@Excel(name = "ERP接口单据号", width = 15)
    @ApiModelProperty(value = "ERP接口单据号")
	private java.lang.String sxgjkid;
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
	/**分仓id*/
	@Excel(name = "分仓id", width = 15)
    @ApiModelProperty(value = "分仓id")
	private java.lang.String sgsid;
	/**上架人*/
	@Excel(name = "上架人", width = 15)
    @ApiModelProperty(value = "上架人")
	private java.lang.String ssjy;
}
