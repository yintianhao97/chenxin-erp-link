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
 * @Description: 复核记录
 * @Author: jeecg-boot
 * @Date:   2024-07-03
 * @Version: V1.0
 */
@Data
@TableName("fhjl_xs")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="fhjl_xs对象", description="复核记录")
public class FhjlXs {
    
	/**nckdid*/
	@Excel(name = "nckdid", width = 15)
    @ApiModelProperty(value = "nckdid")
	private java.lang.Long nckdid;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private java.lang.String shzname;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private java.lang.String shzgsid;
	/**shzid*/
	@Excel(name = "shzid", width = 15)
    @ApiModelProperty(value = "shzid")
	private java.lang.String shzid;
	/**dzdrq*/
	@Excel(name = "dzdrq", width = 15)
    @ApiModelProperty(value = "dzdrq")
	private java.lang.String dzdrq;
	/**dysrq*/
	@Excel(name = "dysrq", width = 15)
    @ApiModelProperty(value = "dysrq")
	private java.lang.String dysrq;
	/**sjkid*/
	@Excel(name = "sjkid", width = 15)
    @ApiModelProperty(value = "sjkid")
	private java.lang.String sjkid;
	/**sywymc*/
	@Excel(name = "sywymc", width = 15)
    @ApiModelProperty(value = "sywymc")
	private java.lang.String sywymc;
	/**sbz*/
	@Excel(name = "sbz", width = 15)
    @ApiModelProperty(value = "sbz")
	private java.lang.String sbz;
	/**sdwmc*/
	@Excel(name = "sdwmc", width = 15)
    @ApiModelProperty(value = "sdwmc")
	private java.lang.String sdwmc;
	/**szwdz*/
	@Excel(name = "szwdz", width = 15)
    @ApiModelProperty(value = "szwdz")
	private java.lang.String szwdz;
	/**sspbm*/
	@Excel(name = "sspbm", width = 15)
    @ApiModelProperty(value = "sspbm")
	private java.lang.String sspbm;
	/**sspmc*/
	@Excel(name = "sspmc", width = 15)
    @ApiModelProperty(value = "sspmc")
	private java.lang.String sspmc;
	/**sspgg*/
	@Excel(name = "sspgg", width = 15)
    @ApiModelProperty(value = "sspgg")
	private java.lang.String sspgg;
	/**sjldw*/
	@Excel(name = "sjldw", width = 15)
    @ApiModelProperty(value = "sjldw")
	private java.lang.String sjldw;
	/**njlgg*/
	@Excel(name = "njlgg", width = 15)
    @ApiModelProperty(value = "njlgg")
	private java.lang.Long njlgg;
	/**sjx*/
	@Excel(name = "sjx", width = 15)
    @ApiModelProperty(value = "sjx")
	private java.lang.String sjx;
	/**spjwh*/
	@Excel(name = "spjwh", width = 15)
    @ApiModelProperty(value = "spjwh")
	private java.lang.String spjwh;
	/**sscyr*/
	@Excel(name = "sscyr", width = 15)
    @ApiModelProperty(value = "sscyr")
	private java.lang.String sscyr;
	/**ssccj*/
	@Excel(name = "ssccj", width = 15)
    @ApiModelProperty(value = "ssccj")
	private java.lang.String ssccj;
	/**sspcd*/
	@Excel(name = "sspcd", width = 15)
    @ApiModelProperty(value = "sspcd")
	private java.lang.String sspcd;
	/**sph*/
	@Excel(name = "sph", width = 15)
    @ApiModelProperty(value = "sph")
	private java.lang.String sph;
	/**sxrq*/
	@Excel(name = "sxrq", width = 15)
    @ApiModelProperty(value = "sxrq")
	private java.lang.String sxrq;
	/**dscrq*/
	@Excel(name = "dscrq", width = 15)
    @ApiModelProperty(value = "dscrq")
	private java.lang.String dscrq;
	/**n4dj*/
	@Excel(name = "n4dj", width = 15)
    @ApiModelProperty(value = "n4dj")
	private java.math.BigDecimal n4dj;
	/**shl*/
	@Excel(name = "shl", width = 15)
    @ApiModelProperty(value = "shl")
	private java.lang.Integer shl;
	/**hsje*/
	@Excel(name = "hsje", width = 15)
    @ApiModelProperty(value = "hsje")
	private java.lang.Integer hsje;
	/**baozhshl*/
	@Excel(name = "baozhshl", width = 15)
    @ApiModelProperty(value = "baozhshl")
	private java.lang.Integer baozhshl;
	/**lingsshl*/
	@Excel(name = "lingsshl", width = 15)
    @ApiModelProperty(value = "lingsshl")
	private java.lang.Integer lingsshl;
	/**swfhymc*/
	@Excel(name = "swfhymc", width = 15)
    @ApiModelProperty(value = "swfhymc")
	private java.lang.String swfhymc;
	/**swfhymc2*/
	@Excel(name = "swfhymc2", width = 15)
    @ApiModelProperty(value = "swfhymc2")
	private java.lang.String swfhymc2;
	/**djlx*/
	@Excel(name = "djlx", width = 15)
    @ApiModelProperty(value = "djlx")
	private java.lang.String djlx;
	/**nhh*/
	@Excel(name = "nhh", width = 15)
    @ApiModelProperty(value = "nhh")
	private java.lang.Integer nhh;
}
