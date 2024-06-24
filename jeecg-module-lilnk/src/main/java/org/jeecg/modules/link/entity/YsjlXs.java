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
 * @Description: 验收记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@Data
@TableName("ysjl_xs")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ysjl_xs对象", description="验收记录")
public class YsjlXs {
    
	/**djSn*/
	@Excel(name = "djSn", width = 15)
    @ApiModelProperty(value = "djSn")
	private java.lang.Integer djSn;
	/**shdjbh*/
	@Excel(name = "shdjbh", width = 15)
    @ApiModelProperty(value = "shdjbh")
	private java.lang.String shdjbh;
	/**ysdjbh*/
	@Excel(name = "ysdjbh", width = 15)
    @ApiModelProperty(value = "ysdjbh")
	private java.lang.String ysdjbh;
	/**sfzj*/
	@Excel(name = "sfzj", width = 15)
    @ApiModelProperty(value = "sfzj")
	private java.lang.String sfzj;
	/**ph*/
	@Excel(name = "ph", width = 15)
    @ApiModelProperty(value = "ph")
	private java.lang.String ph;
	/**dwmch*/
	@Excel(name = "dwmch", width = 15)
    @ApiModelProperty(value = "dwmch")
	private java.lang.String dwmch;
	/**yansrq*/
	@Excel(name = "yansrq", width = 15)
    @ApiModelProperty(value = "yansrq")
	private java.lang.String yansrq;
	/**jiel*/
	@Excel(name = "jiel", width = 15)
    @ApiModelProperty(value = "jiel")
	private java.lang.String jiel;
	/**shouhsl*/
	@Excel(name = "shouhsl", width = 15)
    @ApiModelProperty(value = "shouhsl")
	private java.math.BigDecimal shouhsl;
	/**djbh*/
	@Excel(name = "djbh", width = 15)
    @ApiModelProperty(value = "djbh")
	private java.lang.String djbh;
	/**djlx*/
	@Excel(name = "djlx", width = 15)
    @ApiModelProperty(value = "djlx")
	private java.lang.String djlx;
	/**dw*/
	@Excel(name = "dw", width = 15)
    @ApiModelProperty(value = "dw")
	private java.lang.String dw;
	/**kaiprq*/
	@Excel(name = "kaiprq", width = 15)
    @ApiModelProperty(value = "kaiprq")
	private java.lang.String kaiprq;
	/**pizhwh*/
	@Excel(name = "pizhwh", width = 15)
    @ApiModelProperty(value = "pizhwh")
	private java.lang.String pizhwh;
	/**shl*/
	@Excel(name = "shl", width = 15)
    @ApiModelProperty(value = "shl")
	private java.math.BigDecimal shl;
	/**daohrq*/
	@Excel(name = "daohrq", width = 15)
    @ApiModelProperty(value = "daohrq")
	private java.lang.String daohrq;
	/**choujshl*/
	@Excel(name = "choujshl", width = 15)
    @ApiModelProperty(value = "choujshl")
	private java.math.BigDecimal choujshl;
	/**pihao*/
	@Excel(name = "pihao", width = 15)
    @ApiModelProperty(value = "pihao")
	private java.lang.String pihao;
	/**baozhiqi*/
	@Excel(name = "baozhiqi", width = 15)
    @ApiModelProperty(value = "baozhiqi")
	private java.lang.String baozhiqi;
	/**sxrq*/
	@Excel(name = "sxrq", width = 15)
    @ApiModelProperty(value = "sxrq")
	private java.lang.String sxrq;
	/**zhilzhk*/
	@Excel(name = "zhilzhk", width = 15)
    @ApiModelProperty(value = "zhilzhk")
	private java.lang.String zhilzhk;
	/**hegzh*/
	@Excel(name = "hegzh", width = 15)
    @ApiModelProperty(value = "hegzh")
	private java.lang.String hegzh;
	/**yanshr*/
	@Excel(name = "yanshr", width = 15)
    @ApiModelProperty(value = "yanshr")
	private java.lang.String yanshr;
	/**baozhshl*/
	@Excel(name = "baozhshl", width = 15)
    @ApiModelProperty(value = "baozhshl")
	private java.lang.Integer baozhshl;
	/**lingsshl*/
	@Excel(name = "lingsshl", width = 15)
    @ApiModelProperty(value = "lingsshl")
	private java.math.BigDecimal lingsshl;
	/**nxzjrk*/
	@Excel(name = "nxzjrk", width = 15)
    @ApiModelProperty(value = "nxzjrk")
	private java.lang.Integer nxzjrk;
	/**spbh*/
	@Excel(name = "spbh", width = 15)
    @ApiModelProperty(value = "spbh")
	private java.lang.String spbh;
	/**spmch*/
	@Excel(name = "spmch", width = 15)
    @ApiModelProperty(value = "spmch")
	private java.lang.String spmch;
	/**shpgg*/
	@Excel(name = "shpgg", width = 15)
    @ApiModelProperty(value = "shpgg")
	private java.lang.String shpgg;
	/**jixing*/
	@Excel(name = "jixing", width = 15)
    @ApiModelProperty(value = "jixing")
	private java.lang.String jixing;
	/**shengccj*/
	@Excel(name = "shengccj", width = 15)
    @ApiModelProperty(value = "shengccj")
	private java.lang.String shengccj;
	/**hegshl*/
	@Excel(name = "hegshl", width = 15)
    @ApiModelProperty(value = "hegshl")
	private java.math.BigDecimal hegshl;
	/**buhgshl*/
	@Excel(name = "buhgshl", width = 15)
    @ApiModelProperty(value = "buhgshl")
	private java.math.BigDecimal buhgshl;
	/**dhrq*/
	@Excel(name = "dhrq", width = 15)
    @ApiModelProperty(value = "dhrq")
	private java.lang.String dhrq;
	/**jianyqk*/
	@Excel(name = "jianyqk", width = 15)
    @ApiModelProperty(value = "jianyqk")
	private java.lang.String jianyqk;
	/**czcs*/
	@Excel(name = "czcs", width = 15)
    @ApiModelProperty(value = "czcs")
	private java.lang.String czcs;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private java.lang.String shzname;
	/**shzid*/
	@Excel(name = "shzid", width = 15)
    @ApiModelProperty(value = "shzid")
	private java.lang.String shzid;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private java.lang.String shzgsid;
	/**nspid*/
	@Excel(name = "nspid", width = 15)
    @ApiModelProperty(value = "nspid")
	private java.lang.Long nspid;
	/**danwbh*/
	@Excel(name = "danwbh", width = 15)
    @ApiModelProperty(value = "danwbh")
	private java.lang.String danwbh;
	/**sscyr*/
	@Excel(name = "sscyr", width = 15)
    @ApiModelProperty(value = "sscyr")
	private java.lang.String sscyr;
	/**njsbj*/
	@Excel(name = "njsbj", width = 15)
    @ApiModelProperty(value = "njsbj")
	private java.lang.String njsbj;
}
