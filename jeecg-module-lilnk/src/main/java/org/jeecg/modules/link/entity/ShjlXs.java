package org.jeecg.modules.link.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("shjl_xs")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="shjl_xs对象", description="收货记录")
public class ShjlXs {
    
	/**shdjbh*/
	@Excel(name = "shdjbh", width = 15)
    @ApiModelProperty(value = "shdjbh")
	private String shdjbh;
	/**ddDjSn*/
	@Excel(name = "ddDjSn", width = 15)
    @ApiModelProperty(value = "ddDjSn")
	private Integer ddDjSn;
	/**isTq*/
	@Excel(name = "isTq", width = 15)
    @ApiModelProperty(value = "isTq")
	private Integer isTq;
	/**qiyunrq*/
	@Excel(name = "qiyunrq", width = 15)
    @ApiModelProperty(value = "qiyunrq")
	private String qiyunrq;
	/**daohrq*/
	@Excel(name = "daohrq", width = 15)
    @ApiModelProperty(value = "daohrq")
	private String daohrq;
	/**qiywd*/
	@Excel(name = "qiywd", width = 15)
    @ApiModelProperty(value = "qiywd")
	private String qiywd;
	/**chph*/
	@Excel(name = "chph", width = 15)
    @ApiModelProperty(value = "chph")
	private String chph;
	/**daohwd*/
	@Excel(name = "daohwd", width = 15)
    @ApiModelProperty(value = "daohwd")
	private String daohwd;
	/**yunsgj*/
	@Excel(name = "yunsgj", width = 15)
    @ApiModelProperty(value = "yunsgj")
	private String yunsgj;
	/**danwbh*/
	@Excel(name = "danwbh", width = 15)
    @ApiModelProperty(value = "danwbh")
	private String danwbh;
	/**dwmch*/
	@Excel(name = "dwmch", width = 15)
    @ApiModelProperty(value = "dwmch")
	private String dwmch;
	/**ontime*/
	@Excel(name = "ontime", width = 15)
    @ApiModelProperty(value = "ontime")
	private String ontime;
	/**bm*/
	@Excel(name = "bm", width = 15)
    @ApiModelProperty(value = "bm")
	private String bm;
	/**rq*/
	@Excel(name = "rq", width = 15)
    @ApiModelProperty(value = "rq")
	private String rq;
	/**username*/
	@Excel(name = "username", width = 15)
    @ApiModelProperty(value = "username")
	private String username;
	/**ywy*/
	@Excel(name = "ywy", width = 15)
    @ApiModelProperty(value = "ywy")
	private String ywy;
	/**je*/
	@Excel(name = "je", width = 15)
    @ApiModelProperty(value = "je")
	private java.math.BigDecimal je;
	/**she*/
	@Excel(name = "she", width = 15)
    @ApiModelProperty(value = "she")
	private java.math.BigDecimal she;
	/**hsje*/
	@Excel(name = "hsje", width = 15)
    @ApiModelProperty(value = "hsje")
	private java.math.BigDecimal hsje;
	/**spmch*/
	@Excel(name = "spmch", width = 15)
    @ApiModelProperty(value = "spmch")
	private String spmch;
	/**spbh*/
	@Excel(name = "spbh", width = 15)
    @ApiModelProperty(value = "spbh")
	private String spbh;
	/**shpgg*/
	@Excel(name = "shpgg", width = 15)
    @ApiModelProperty(value = "shpgg")
	private String shpgg;
	/**dw*/
	@Excel(name = "dw", width = 15)
    @ApiModelProperty(value = "dw")
	private String dw;
	/**shengccj*/
	@Excel(name = "shengccj", width = 15)
    @ApiModelProperty(value = "shengccj")
	private String shengccj;
	/**shpchd*/
	@Excel(name = "shpchd", width = 15)
    @ApiModelProperty(value = "shpchd")
	private String shpchd;
	/**jixing*/
	@Excel(name = "jixing", width = 15)
    @ApiModelProperty(value = "jixing")
	private String jixing;
	/**pizhwh*/
	@Excel(name = "pizhwh", width = 15)
    @ApiModelProperty(value = "pizhwh")
	private String pizhwh;
	/**chuclx*/
	@Excel(name = "chuclx", width = 15)
    @ApiModelProperty(value = "chuclx")
	private String chuclx;
	/**djbh*/
	@Excel(name = "djbh", width = 15)
    @ApiModelProperty(value = "djbh")
	private String djbh;
	/**spid*/
	@Excel(name = "spid", width = 15)
    @ApiModelProperty(value = "spid")
	private String spid;
	/**djSn*/
	@Excel(name = "djSn", width = 15)
    @ApiModelProperty(value = "djSn")
	private Integer djSn;
	/**djSort*/
	@Excel(name = "djSort", width = 15)
    @ApiModelProperty(value = "djSort")
	private Integer djSort;
	/**recnum*/
	@Excel(name = "recnum", width = 15)
    @ApiModelProperty(value = "recnum")
	private Integer recnum;
	/**baozhshl*/
	@Excel(name = "baozhshl", width = 15)
    @ApiModelProperty(value = "baozhshl")
	private Integer baozhshl;
	/**lingsshl*/
	@Excel(name = "lingsshl", width = 15)
    @ApiModelProperty(value = "lingsshl")
	private java.math.BigDecimal lingsshl;
	/**shl*/
	@Excel(name = "shl", width = 15)
    @ApiModelProperty(value = "shl")
	private java.math.BigDecimal shl;
	/**jsshl*/
	@Excel(name = "jsshl", width = 15)
    @ApiModelProperty(value = "jsshl")
	private java.math.BigDecimal jsshl;
	/**dj*/
	@Excel(name = "dj", width = 15)
    @ApiModelProperty(value = "dj")
	private java.math.BigDecimal dj;
	/**hshj*/
	@Excel(name = "hshj", width = 15)
    @ApiModelProperty(value = "hshj")
	private java.math.BigDecimal hshj;
	/**pihao*/
	@Excel(name = "pihao", width = 15)
    @ApiModelProperty(value = "pihao")
	private String pihao;
	/**ph*/
	@Excel(name = "ph", width = 15)
    @ApiModelProperty(value = "ph")
	private String ph;
	/**sxrq*/
	@Excel(name = "sxrq", width = 15)
    @ApiModelProperty(value = "sxrq")
	private String sxrq;
	/**baozhiqi*/
	@Excel(name = "baozhiqi", width = 15)
    @ApiModelProperty(value = "baozhiqi")
	private String baozhiqi;
	/**shzid*/
	@Excel(name = "shzid", width = 15)
    @ApiModelProperty(value = "shzid")
	private String shzid;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private String shzname;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private String shzgsid;
	/**njsbj*/
	@Excel(name = "njsbj", width = 15)
    @ApiModelProperty(value = "njsbj")
	private String njsbj;

	@TableField(exist = false)
	private String js;
}
