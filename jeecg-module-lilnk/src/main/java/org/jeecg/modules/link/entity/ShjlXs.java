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
 * @Description: 收货记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
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
	private java.lang.String shdjbh;
	/**qiyunrq*/
	@Excel(name = "qiyunrq", width = 15)
    @ApiModelProperty(value = "qiyunrq")
	private java.lang.String qiyunrq;
	/**daohrq*/
	@Excel(name = "daohrq", width = 15)
    @ApiModelProperty(value = "daohrq")
	private java.lang.String daohrq;
	/**qiywd*/
	@Excel(name = "qiywd", width = 15)
    @ApiModelProperty(value = "qiywd")
	private java.lang.String qiywd;
	/**chph*/
	@Excel(name = "chph", width = 15)
    @ApiModelProperty(value = "chph")
	private java.lang.String chph;
	/**daohwd*/
	@Excel(name = "daohwd", width = 15)
    @ApiModelProperty(value = "daohwd")
	private java.lang.String daohwd;
	/**yunsgj*/
	@Excel(name = "yunsgj", width = 15)
    @ApiModelProperty(value = "yunsgj")
	private java.lang.String yunsgj;
	/**danwbh*/
	@Excel(name = "danwbh", width = 15)
    @ApiModelProperty(value = "danwbh")
	private java.lang.String danwbh;
	/**dwmch*/
	@Excel(name = "dwmch", width = 15)
    @ApiModelProperty(value = "dwmch")
	private java.lang.String dwmch;
	/**ontime*/
	@Excel(name = "ontime", width = 15)
    @ApiModelProperty(value = "ontime")
	private java.lang.String ontime;
	/**bm*/
	@Excel(name = "bm", width = 15)
    @ApiModelProperty(value = "bm")
	private java.lang.String bm;
	/**rq*/
	@Excel(name = "rq", width = 15)
    @ApiModelProperty(value = "rq")
	private java.lang.String rq;
	/**username*/
	@Excel(name = "username", width = 15)
    @ApiModelProperty(value = "username")
	private java.lang.String username;
	/**ywy*/
	@Excel(name = "ywy", width = 15)
    @ApiModelProperty(value = "ywy")
	private java.lang.String ywy;
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
	private java.lang.String spmch;
	/**spbh*/
	@Excel(name = "spbh", width = 15)
    @ApiModelProperty(value = "spbh")
	private java.lang.String spbh;
	/**shpgg*/
	@Excel(name = "shpgg", width = 15)
    @ApiModelProperty(value = "shpgg")
	private java.lang.String shpgg;
	/**dw*/
	@Excel(name = "dw", width = 15)
    @ApiModelProperty(value = "dw")
	private java.lang.String dw;
	/**shengccj*/
	@Excel(name = "shengccj", width = 15)
    @ApiModelProperty(value = "shengccj")
	private java.lang.String shengccj;
	/**shpchd*/
	@Excel(name = "shpchd", width = 15)
    @ApiModelProperty(value = "shpchd")
	private java.lang.String shpchd;
	/**jixing*/
	@Excel(name = "jixing", width = 15)
    @ApiModelProperty(value = "jixing")
	private java.lang.String jixing;
	/**pizhwh*/
	@Excel(name = "pizhwh", width = 15)
    @ApiModelProperty(value = "pizhwh")
	private java.lang.String pizhwh;
	/**chuclx*/
	@Excel(name = "chuclx", width = 15)
    @ApiModelProperty(value = "chuclx")
	private java.lang.String chuclx;
	/**djbh*/
	@Excel(name = "djbh", width = 15)
    @ApiModelProperty(value = "djbh")
	private java.lang.String djbh;
	/**spid*/
	@Excel(name = "spid", width = 15)
    @ApiModelProperty(value = "spid")
	private java.lang.String spid;
	/**djSn*/
	@Excel(name = "djSn", width = 15)
    @ApiModelProperty(value = "djSn")
	private java.lang.Integer djSn;
	/**djSort*/
	@Excel(name = "djSort", width = 15)
    @ApiModelProperty(value = "djSort")
	private java.lang.Integer djSort;
	/**recnum*/
	@Excel(name = "recnum", width = 15)
    @ApiModelProperty(value = "recnum")
	private java.lang.Integer recnum;
	/**baozhshl*/
	@Excel(name = "baozhshl", width = 15)
    @ApiModelProperty(value = "baozhshl")
	private java.lang.Integer baozhshl;
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
	private java.lang.String pihao;
	/**ph*/
	@Excel(name = "ph", width = 15)
    @ApiModelProperty(value = "ph")
	private java.lang.String ph;
	/**sxrq*/
	@Excel(name = "sxrq", width = 15)
    @ApiModelProperty(value = "sxrq")
	private java.lang.String sxrq;
	/**baozhiqi*/
	@Excel(name = "baozhiqi", width = 15)
    @ApiModelProperty(value = "baozhiqi")
	private java.lang.String baozhiqi;
	/**shzid*/
	@Excel(name = "shzid", width = 15)
    @ApiModelProperty(value = "shzid")
	private java.lang.String shzid;
	/**shzname*/
	@Excel(name = "shzname", width = 15)
    @ApiModelProperty(value = "shzname")
	private java.lang.String shzname;
	/**shzgsid*/
	@Excel(name = "shzgsid", width = 15)
    @ApiModelProperty(value = "shzgsid")
	private java.lang.String shzgsid;
	/**njsbj*/
	@Excel(name = "njsbj", width = 15)
    @ApiModelProperty(value = "njsbj")
	private java.lang.String njsbj;
	@TableField(exist = false)
	private java.lang.String js;
}
