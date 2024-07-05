package org.jeecg.modules.link.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 收货记录
 * @Author: jeecg-boot
 * @Date:   2024-07-03
 * @Version: V1.0
 */
@Data
@TableName("ysjl_xs")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ysjl_xs对象", description="收货记录")
public class YsjlXs {
    
	/**djSn*/
	@Excel(name = "djSn", width = 15)
    @ApiModelProperty(value = "djSn")
	private Integer djSn;
	/**shdjbh*/
	@Excel(name = "shdjbh", width = 15)
    @ApiModelProperty(value = "shdjbh")
	private String shdjbh;
	/**ysdjbh*/
	@Excel(name = "ysdjbh", width = 15)
    @ApiModelProperty(value = "ysdjbh")
	private String ysdjbh;
	/**ddDjSn*/
	@Excel(name = "ddDjSn", width = 15)
    @ApiModelProperty(value = "ddDjSn")
	private Integer ddDjSn;
	/**isTq*/
	@Excel(name = "isTq", width = 15)
    @ApiModelProperty(value = "isTq")
	private Integer isTq;
	/**shDjSn*/
	@Excel(name = "shDjSn", width = 15)
    @ApiModelProperty(value = "shDjSn")
	private Integer shDjSn;
	/**sfzj*/
	@Excel(name = "sfzj", width = 15)
    @ApiModelProperty(value = "sfzj")
	private String sfzj;
	/**ph*/
	@Excel(name = "ph", width = 15)
    @ApiModelProperty(value = "ph")
	private String ph;
	/**dwmch*/
	@Excel(name = "dwmch", width = 15)
    @ApiModelProperty(value = "dwmch")
	private String dwmch;
	/**yansrq*/
	@Excel(name = "yansrq", width = 15)
    @ApiModelProperty(value = "yansrq")
	private String yansrq;
	/**jiel*/
	@Excel(name = "jiel", width = 15)
    @ApiModelProperty(value = "jiel")
	private String jiel;
	/**shouhsl*/
	@Excel(name = "shouhsl", width = 15)
    @ApiModelProperty(value = "shouhsl")
	private java.math.BigDecimal shouhsl;
	/**djbh*/
	@Excel(name = "djbh", width = 15)
    @ApiModelProperty(value = "djbh")
	private String djbh;
	/**djlx*/
	@Excel(name = "djlx", width = 15)
    @ApiModelProperty(value = "djlx")
	private String djlx;
	/**dw*/
	@Excel(name = "dw", width = 15)
    @ApiModelProperty(value = "dw")
	private String dw;
	/**kaiprq*/
	@Excel(name = "kaiprq", width = 15)
    @ApiModelProperty(value = "kaiprq")
	private String kaiprq;
	/**pizhwh*/
	@Excel(name = "pizhwh", width = 15)
    @ApiModelProperty(value = "pizhwh")
	private String pizhwh;
	/**shl*/
	@Excel(name = "shl", width = 15)
    @ApiModelProperty(value = "shl")
	private java.math.BigDecimal shl;
	/**daohrq*/
	@Excel(name = "daohrq", width = 15)
    @ApiModelProperty(value = "daohrq")
	private String daohrq;
	/**choujshl*/
	@Excel(name = "choujshl", width = 15)
    @ApiModelProperty(value = "choujshl")
	private java.math.BigDecimal choujshl;
	/**pihao*/
	@Excel(name = "pihao", width = 15)
    @ApiModelProperty(value = "pihao")
	private String pihao;
	/**baozhiqi*/
	@Excel(name = "baozhiqi", width = 15)
    @ApiModelProperty(value = "baozhiqi")
	private String baozhiqi;
	/**sxrq*/
	@Excel(name = "sxrq", width = 15)
    @ApiModelProperty(value = "sxrq")
	private String sxrq;
	/**zhilzhk*/
	@Excel(name = "zhilzhk", width = 15)
    @ApiModelProperty(value = "zhilzhk")
	private String zhilzhk;
	/**hegzh*/
	@Excel(name = "hegzh", width = 15)
    @ApiModelProperty(value = "hegzh")
	private String hegzh;
	/**yanshr*/
	@Excel(name = "yanshr", width = 15)
    @ApiModelProperty(value = "yanshr")
	private String yanshr;
	/**baozhshl*/
	@Excel(name = "baozhshl", width = 15)
    @ApiModelProperty(value = "baozhshl")
	private Integer baozhshl;
	/**lingsshl*/
	@Excel(name = "lingsshl", width = 15)
    @ApiModelProperty(value = "lingsshl")
	private java.math.BigDecimal lingsshl;
	/**nxzjrk*/
	@Excel(name = "nxzjrk", width = 15)
    @ApiModelProperty(value = "nxzjrk")
	private Integer nxzjrk;
	/**spbh*/
	@Excel(name = "spbh", width = 15)
    @ApiModelProperty(value = "spbh")
	private String spbh;
	/**spmch*/
	@Excel(name = "spmch", width = 15)
    @ApiModelProperty(value = "spmch")
	private String spmch;
	/**shpgg*/
	@Excel(name = "shpgg", width = 15)
    @ApiModelProperty(value = "shpgg")
	private String shpgg;
	/**jixing*/
	@Excel(name = "jixing", width = 15)
    @ApiModelProperty(value = "jixing")
	private String jixing;
	/**shengccj*/
	@Excel(name = "shengccj", width = 15)
    @ApiModelProperty(value = "shengccj")
	private String shengccj;
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
	private String dhrq;
	/**jianyqk*/
	@Excel(name = "jianyqk", width = 15)
    @ApiModelProperty(value = "jianyqk")
	private String jianyqk;
	/**czcs*/
	@Excel(name = "czcs", width = 15)
    @ApiModelProperty(value = "czcs")
	private String czcs;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private String shzname;
	/**shzid*/
	@Excel(name = "shzid", width = 15)
    @ApiModelProperty(value = "shzid")
	private String shzid;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private String shzgsid;
	/**nspid*/
	@Excel(name = "nspid", width = 15)
    @ApiModelProperty(value = "nspid")
	private Long nspid;
	/**danwbh*/
	@Excel(name = "danwbh", width = 15)
    @ApiModelProperty(value = "danwbh")
	private String danwbh;
	/**sscyr*/
	@Excel(name = "sscyr", width = 15)
    @ApiModelProperty(value = "sscyr")
	private String sscyr;
	/**njsbj*/
	@Excel(name = "njsbj", width = 15)
    @ApiModelProperty(value = "njsbj")
	private String njsbj;
}
