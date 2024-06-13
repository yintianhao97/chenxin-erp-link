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
 * @Description: 下架汇总
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@Data
@TableName("CJK_DJ_CKJHD")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_DJ_CKJHD对象", description="下架汇总")
public class CJKDJCKJHD {
    
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
	/**内复核人*/
	@Excel(name = "内复核人", width = 15)
    @ApiModelProperty(value = "内复核人")
	private java.lang.String snfhrmc;
	/**拼箱人*/
	@Excel(name = "拼箱人", width = 15)
    @ApiModelProperty(value = "拼箱人")
	private java.lang.String spxrmc;
	/**是否拆分*/
	@Excel(name = "是否拆分", width = 15)
    @ApiModelProperty(value = "是否拆分")
	private java.lang.Integer nsfcd;
	/**仓库ＩＤ*/
	@Excel(name = "仓库ＩＤ", width = 15)
    @ApiModelProperty(value = "仓库ＩＤ")
	private java.lang.String sgsid;
	/**下架人*/
	@Excel(name = "下架人", width = 15)
    @ApiModelProperty(value = "下架人")
	private java.lang.String sxjrmc;
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
	/**出库单号(WMS)*/
	@Excel(name = "出库单号(WMS)", width = 15)
    @ApiModelProperty(value = "出库单号(WMS)")
	private java.lang.Long nckdid;
	/**接口单号(ERP)*/
	@Excel(name = "接口单号(ERP)", width = 15)
    @ApiModelProperty(value = "接口单号(ERP)")
	private java.lang.String sjkid;
	/**供应商*/
	@Excel(name = "供应商", width = 15)
    @ApiModelProperty(value = "供应商")
	private java.lang.String swldwid;
	/**出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)*/
	@Excel(name = "出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)", width = 15)
    @ApiModelProperty(value = "出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)")
	private java.lang.Long ncklx;
	/**提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)*/
	@Excel(name = "提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)", width = 15)
    @ApiModelProperty(value = "提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)")
	private java.lang.Long nthfs;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
	private java.lang.String sbz;
	/**业务员名称*/
	@Excel(name = "业务员名称", width = 15)
    @ApiModelProperty(value = "业务员名称")
	private java.lang.String sywymc;
	/**业务原单号*/
	@Excel(name = "业务原单号", width = 15)
    @ApiModelProperty(value = "业务原单号")
	private java.lang.String sywydh;
	/**制单日期*/
	@Excel(name = "制单日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "制单日期")
	private java.util.Date dzdrq;
	/**发货人名称*/
	@Excel(name = "发货人名称", width = 15)
    @ApiModelProperty(value = "发货人名称")
	private java.lang.String sysr;
	/**发货日期*/
	@Excel(name = "发货日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "发货日期")
	private java.util.Date dysrq;
	/**时间戳*/
	@Excel(name = "时间戳", width = 15)
    @ApiModelProperty(value = "时间戳")
	private java.lang.String ssjc;
	/**冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)*/
	@Excel(name = "冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)", width = 15)
    @ApiModelProperty(value = "冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)")
	private java.lang.Integer nchzt;
	/**制单人*/
	@Excel(name = "制单人", width = 15)
    @ApiModelProperty(value = "制单人")
	private java.lang.String szdr;
	/**combrainTimes*/
	@Excel(name = "combrainTimes", width = 15)
    @ApiModelProperty(value = "combrainTimes")
	private java.lang.String combrainTimes;
	/**外复核人名称1*/
	@Excel(name = "外复核人名称1", width = 15)
    @ApiModelProperty(value = "外复核人名称1")
	private java.lang.String swfhymc;
	/**外复核人名称2*/
	@Excel(name = "外复核人名称2", width = 15)
    @ApiModelProperty(value = "外复核人名称2")
	private java.lang.String swfhymc2;
	/**默认1*/
	@Excel(name = "默认1", width = 15)
    @ApiModelProperty(value = "默认1")
	private java.lang.Integer nck;
	/**混箱标示*/
	@Excel(name = "混箱标示", width = 15)
    @ApiModelProperty(value = "混箱标示")
	private java.lang.String shxbs;
	/**拼箱数*/
	@Excel(name = "拼箱数", width = 15)
    @ApiModelProperty(value = "拼箱数")
	private java.lang.Long npxs;
	/**整件数*/
	@Excel(name = "整件数", width = 15)
    @ApiModelProperty(value = "整件数")
	private java.lang.Long nzjs;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private java.lang.String shzname;
	/**接口单位ID*/
	@Excel(name = "接口单位ID", width = 15)
    @ApiModelProperty(value = "接口单位ID")
	private java.lang.String sjkdwid;
	/**货主公司ID*/
	@Excel(name = "货主公司ID", width = 15)
    @ApiModelProperty(value = "货主公司ID")
	private java.lang.String shzgsid;
	/**收货人*/
	@Excel(name = "收货人", width = 15)
    @ApiModelProperty(value = "收货人")
	private java.lang.String shouhr;
	/**拼袋数*/
	@Excel(name = "拼袋数", width = 15)
    @ApiModelProperty(value = "拼袋数")
	private java.lang.Integer npds;
	/**快递单据号*/
	@Excel(name = "快递单据号", width = 15)
    @ApiModelProperty(value = "快递单据号")
	private java.lang.String skuaiddh;
	/**复核台ID*/
	@Excel(name = "复核台ID", width = 15)
    @ApiModelProperty(value = "复核台ID")
	private java.lang.String sfhtid;
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
}
