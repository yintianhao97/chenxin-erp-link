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
 * @Description: 入库汇总
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Data
@TableName("CJK_WMS_RKHZ")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_WMS_RKHZ对象", description="入库汇总")
public class CJKWMSRKHZ {
    
	/**nbeiy8*/
	@Excel(name = "nbeiy8", width = 15)
    @ApiModelProperty(value = "nbeiy8")
	private java.math.BigDecimal nbeiy8;
	/**sjkid*/
	@Excel(name = "sjkid", width = 15)
    @ApiModelProperty(value = "sjkid")
	private java.lang.String sjkid;
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
	/**单据编号 */
	@Excel(name = "单据编号 ", width = 15)
    @ApiModelProperty(value = "单据编号 ")
	private java.lang.String djbh;
	/**单据类型，1入库，2销售退回,3仓库调拨*/
	@Excel(name = "单据类型，1入库，2销售退回,3仓库调拨", width = 15)
    @ApiModelProperty(value = "单据类型，1入库，2销售退回,3仓库调拨")
	private java.lang.String djlx;
	/**日期*/
	@Excel(name = "日期", width = 15)
    @ApiModelProperty(value = "日期")
	private java.lang.String rq;
	/**单位内码*/
	@Excel(name = "单位内码", width = 15)
    @ApiModelProperty(value = "单位内码")
	private java.lang.String dwbh;
	/**默认 ‘否’*/
	@Excel(name = "默认 ‘否’", width = 15)
    @ApiModelProperty(value = "默认 ‘否’")
	private java.lang.String isZx;
	/**时间*/
	@Excel(name = "时间", width = 15)
    @ApiModelProperty(value = "时间")
	private java.lang.String ontime;
	/**操作员名*/
	@Excel(name = "操作员名", width = 15)
    @ApiModelProperty(value = "操作员名")
	private java.lang.String username;
	/**shenhe*/
	@Excel(name = "shenhe", width = 15)
    @ApiModelProperty(value = "shenhe")
	private java.lang.String shenhe;
	/**shenhrq*/
	@Excel(name = "shenhrq", width = 15)
    @ApiModelProperty(value = "shenhrq")
	private java.lang.String shenhrq;
	/**shenhr*/
	@Excel(name = "shenhr", width = 15)
    @ApiModelProperty(value = "shenhr")
	private java.lang.String shenhr;
	/**货主ID*/
	@Excel(name = "货主ID", width = 15)
    @ApiModelProperty(value = "货主ID")
	private java.lang.String shzid;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
	private java.lang.String beizhu;
	/**运输方式*/
	@Excel(name = "运输方式", width = 15)
    @ApiModelProperty(value = "运输方式")
	private java.lang.String yunshfs;
	/**承运方式*/
	@Excel(name = "承运方式", width = 15)
    @ApiModelProperty(value = "承运方式")
	private java.lang.String chyfs;
	/**业务员*/
	@Excel(name = "业务员", width = 15)
    @ApiModelProperty(value = "业务员")
	private java.lang.String ywy;
	/**预到货日期*/
	@Excel(name = "预到货日期", width = 15)
    @ApiModelProperty(value = "预到货日期")
	private java.lang.String ydhrq;
	/**默认 0*/
	@Excel(name = "默认 0", width = 15)
    @ApiModelProperty(value = "默认 0")
	private java.lang.Integer njsbj;
	/**供货商业务员，客户采购员*/
	@Excel(name = "供货商业务员，客户采购员", width = 15)
    @ApiModelProperty(value = "供货商业务员，客户采购员")
	private java.lang.String duifywy;
	/**是否越库*/
	@Excel(name = "是否越库", width = 15)
    @ApiModelProperty(value = "是否越库")
	private java.lang.String isYk;
	/**货主公司ID*/
	@Excel(name = "货主公司ID", width = 15)
    @ApiModelProperty(value = "货主公司ID")
	private java.lang.String shzgsid;
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
}
