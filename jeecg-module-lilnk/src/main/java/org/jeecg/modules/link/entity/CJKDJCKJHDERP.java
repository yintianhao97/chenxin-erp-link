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
 * @Description: 销售订单汇总
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Data
@TableName("CJK_DJ_CKJHD_ERP")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_DJ_CKJHD_ERP对象", description="销售订单汇总")
public class CJKDJCKJHDERP {
    
	/**单位地址ID*/
	@Excel(name = "单位地址ID", width = 15)
    @ApiModelProperty(value = "单位地址ID")
	private java.lang.String addressid;
	/**更新时间*/
	@Excel(name = "更新时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间")
	private java.util.Date dgxsj;
	/**仓库ID*/
	@Excel(name = "仓库ID", width = 15)
    @ApiModelProperty(value = "仓库ID")
	private java.lang.String sgsid;
	/**0线下，1B端，2C端*/
	@Excel(name = "0线下，1B端，2C端", width = 15)
    @ApiModelProperty(value = "0线下，1B端，2C端")
	private java.lang.Integer ndjlx;
	/**省*/
	@Excel(name = "省", width = 15)
    @ApiModelProperty(value = "省")
	private java.lang.String shengfen;
	/**市*/
	@Excel(name = "市", width = 15)
    @ApiModelProperty(value = "市")
	private java.lang.String shiqu;
	/**县区*/
	@Excel(name = "县区", width = 15)
    @ApiModelProperty(value = "县区")
	private java.lang.String xianqu;
	/**乡镇*/
	@Excel(name = "乡镇", width = 15)
    @ApiModelProperty(value = "乡镇")
	private java.lang.String xiaozhen;
	/**详细地址*/
	@Excel(name = "详细地址", width = 15)
    @ApiModelProperty(value = "详细地址")
	private java.lang.String xiangxdz;
	/**收货人电话*/
	@Excel(name = "收货人电话", width = 15)
    @ApiModelProperty(value = "收货人电话")
	private java.lang.String sshrdh;
	/**物流编号*/
	@Excel(name = "物流编号", width = 15)
    @ApiModelProperty(value = "物流编号")
	private java.lang.String comcode;
	/**1菜鸟，2京东(宙斯)，3京东开放平台，4快递100*/
	@Excel(name = "1菜鸟，2京东(宙斯)，3京东开放平台，4快递100", width = 15)
    @ApiModelProperty(value = "1菜鸟，2京东(宙斯)，3京东开放平台，4快递100")
	private java.lang.String ptType;
	/**id,唯一号*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id,唯一号")
	private java.lang.Long id;
	/**njsbj*/
	@Excel(name = "njsbj", width = 15)
    @ApiModelProperty(value = "njsbj")
	private java.lang.Integer njsbj;
	/**默认为0*/
	@Excel(name = "默认为0", width = 15)
    @ApiModelProperty(value = "默认为0")
	private java.lang.String sjsbz;
	/**nckdid*/
	@Excel(name = "nckdid", width = 15)
    @ApiModelProperty(value = "nckdid")
	private java.lang.Long nckdid;
	/**接口ID*/
	@Excel(name = "接口ID", width = 15)
    @ApiModelProperty(value = "接口ID")
	private java.lang.String sjkid;
	/**单位ID*/
	@Excel(name = "单位ID", width = 15)
    @ApiModelProperty(value = "单位ID")
	private java.lang.String swldwid;
	/**出库类型(2 销售出库 ,6 越库出库 ,8 采退合格 )*/
	@Excel(name = "出库类型(2 销售出库 ,6 越库出库 ,8 采退合格 )", width = 15)
    @ApiModelProperty(value = "出库类型(2 销售出库 ,6 越库出库 ,8 采退合格 )")
	private java.lang.Long ncklx;
	/**提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送 4：托运 5：自提)*/
	@Excel(name = "提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送 4：托运 5：自提)", width = 15)
    @ApiModelProperty(value = "提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送 4：托运 5：自提)")
	private java.lang.Long nthfs;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
	private java.lang.String sbz;
	/**业务员*/
	@Excel(name = "业务员", width = 15)
    @ApiModelProperty(value = "业务员")
	private java.lang.String sywymc;
	/**sywydh*/
	@Excel(name = "sywydh", width = 15)
    @ApiModelProperty(value = "sywydh")
	private java.lang.String sywydh;
	/**日期*/
	@Excel(name = "日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "日期")
	private java.util.Date dzdrq;
	/**sysr*/
	@Excel(name = "sysr", width = 15)
    @ApiModelProperty(value = "sysr")
	private java.lang.String sysr;
	/**dysrq*/
	@Excel(name = "dysrq", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "dysrq")
	private java.util.Date dysrq;
	/**时间*/
	@Excel(name = "时间", width = 15)
    @ApiModelProperty(value = "时间")
	private java.lang.String ssjc;
	/**nchzt*/
	@Excel(name = "nchzt", width = 15)
    @ApiModelProperty(value = "nchzt")
	private java.lang.Integer nchzt;
	/**制单人*/
	@Excel(name = "制单人", width = 15)
    @ApiModelProperty(value = "制单人")
	private java.lang.String szdr;
	/**combrainTimes*/
	@Excel(name = "combrainTimes", width = 15)
    @ApiModelProperty(value = "combrainTimes")
	private java.lang.String combrainTimes;
	/**合箱标识*/
	@Excel(name = "合箱标识", width = 15)
    @ApiModelProperty(value = "合箱标识")
	private java.lang.String shxbs;
	/**默认1*/
	@Excel(name = "默认1", width = 15)
    @ApiModelProperty(value = "默认1")
	private java.lang.Integer nck;
	/**部门名称*/
	@Excel(name = "部门名称", width = 15)
    @ApiModelProperty(value = "部门名称")
	private java.lang.String sbm;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**货主名*/
	@Excel(name = "货主名", width = 15)
    @ApiModelProperty(value = "货主名")
	private java.lang.String shzname;
	/**货主公司ID*/
	@Excel(name = "货主公司ID", width = 15)
    @ApiModelProperty(value = "货主公司ID")
	private java.lang.String shzgsid;
	/**收货人*/
	@Excel(name = "收货人", width = 15)
    @ApiModelProperty(value = "收货人")
	private java.lang.String shouhr;
	/**收货地址*/
	@Excel(name = "收货地址", width = 15)
    @ApiModelProperty(value = "收货地址")
	private java.lang.String szwdz;
	/**快递站点*/
	@Excel(name = "快递站点", width = 15)
    @ApiModelProperty(value = "快递站点")
	private java.lang.String sshhzd;
	/**快递名称*/
	@Excel(name = "快递名称", width = 15)
    @ApiModelProperty(value = "快递名称")
	private java.lang.String skuandmc;
	/**运费付款方式*/
	@Excel(name = "运费付款方式", width = 15)
    @ApiModelProperty(value = "运费付款方式")
	private java.lang.String syunffkfs;
	/**是否合单*/
	@Excel(name = "是否合单", width = 15)
    @ApiModelProperty(value = "是否合单")
	private java.lang.Integer ishdjh;
	/**是否打印随货同行，1打印，0不打印*/
	@Excel(name = "是否打印随货同行，1打印，0不打印", width = 15)
    @ApiModelProperty(value = "是否打印随货同行，1打印，0不打印")
	private java.lang.Integer nsfshtx;
	/**是否打印合同，1打印，0不打印*/
	@Excel(name = "是否打印合同，1打印，0不打印", width = 15)
    @ApiModelProperty(value = "是否打印合同，1打印，0不打印")
	private java.lang.Integer nsfht;
	/**是否打印商品质资图片，1打印，0不打印*/
	@Excel(name = "是否打印商品质资图片，1打印，0不打印", width = 15)
    @ApiModelProperty(value = "是否打印商品质资图片，1打印，0不打印")
	private java.lang.Integer nsfspzz;
	/**是否打印药检报告，1打印，0不打印*/
	@Excel(name = "是否打印药检报告，1打印，0不打印", width = 15)
    @ApiModelProperty(value = "是否打印药检报告，1打印，0不打印")
	private java.lang.Integer nsfyj;
	/**是否送货上门，1上门，0不上门*/
	@Excel(name = "是否送货上门，1上门，0不上门", width = 15)
    @ApiModelProperty(value = "是否送货上门，1上门，0不上门")
	private java.lang.Integer nsfshsm;
	/**仓库地址*/
	@Excel(name = "仓库地址", width = 15)
    @ApiModelProperty(value = "仓库地址")
	private java.lang.String sckdz;
	/**发票类型*/
	@Excel(name = "发票类型", width = 15)
    @ApiModelProperty(value = "发票类型")
	private java.lang.String fplx;
	/**协同收货地址*/
	@Excel(name = "协同收货地址", width = 15)
    @ApiModelProperty(value = "协同收货地址")
	private java.lang.String xtshouhdz;
	/**发票是否随货0不随货，1随货*/
	@Excel(name = "发票是否随货0不随货，1随货", width = 15)
    @ApiModelProperty(value = "发票是否随货0不随货，1随货")
	private java.lang.Integer nsffpsh;
	/**是否准备资料0否，1是*/
	@Excel(name = "是否准备资料0否，1是", width = 15)
    @ApiModelProperty(value = "是否准备资料0否，1是")
	private java.lang.String isZiliao;
	/**时间 09:10:20*/
	@Excel(name = "时间 09:10:20", width = 15)
    @ApiModelProperty(value = "时间 09:10:20")
	private java.lang.String ontime;
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
}
