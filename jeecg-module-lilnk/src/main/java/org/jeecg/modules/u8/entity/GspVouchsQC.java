package org.jeecg.modules.u8.entity;

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
 * @Description: 入库验收记录辅
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@Data
@TableName("GSP_VouchsQC")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GSP_VouchsQC对象", description="入库验收记录辅")
public class GspVouchsQC {
    
	/**autoid*/
	@Excel(name = "autoid", width = 15)
    @ApiModelProperty(value = "autoid")
	private java.lang.Integer autoid;
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**cinvcode*/
	@Excel(name = "cinvcode", width = 15)
    @ApiModelProperty(value = "cinvcode")
	private java.lang.String cinvcode;
	/**fquantity*/
	@Excel(name = "fquantity", width = 15)
    @ApiModelProperty(value = "fquantity")
	private java.math.BigDecimal fquantity;
	/**farvquantity*/
	@Excel(name = "farvquantity", width = 15)
    @ApiModelProperty(value = "farvquantity")
	private java.math.BigDecimal farvquantity;
	/**dprodate*/
	@Excel(name = "dprodate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dprodate")
	private java.util.Date dprodate;
	/**dvdate*/
	@Excel(name = "dvdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvdate")
	private java.util.Date dvdate;
	/**cvaldate*/
	@Excel(name = "cvaldate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cvaldate")
	private java.util.Date cvaldate;
	/**fboxquantity*/
	@Excel(name = "fboxquantity", width = 15)
    @ApiModelProperty(value = "fboxquantity")
	private java.math.BigDecimal fboxquantity;
	/**cstorecond*/
	@Excel(name = "cstorecond", width = 15)
    @ApiModelProperty(value = "cstorecond")
	private java.lang.String cstorecond;
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**coutinstance*/
	@Excel(name = "coutinstance", width = 15)
    @ApiModelProperty(value = "coutinstance")
	private java.lang.String coutinstance;
	/**cpack*/
	@Excel(name = "cpack", width = 15)
    @ApiModelProperty(value = "cpack")
	private java.lang.String cpack;
	/**cconclusion*/
	@Excel(name = "cconclusion", width = 15)
    @ApiModelProperty(value = "cconclusion")
	private java.lang.String cconclusion;
	/**cchecker*/
	@Excel(name = "cchecker", width = 15)
    @ApiModelProperty(value = "cchecker")
	private java.lang.String cchecker;
	/**ddateT*/
	@Excel(name = "ddateT", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddateT")
	private java.util.Date ddateT;
	/**cmind*/
	@Excel(name = "cmind", width = 15)
    @ApiModelProperty(value = "cmind")
	private java.lang.String cmind;
	/**cglass*/
	@Excel(name = "cglass", width = 15)
    @ApiModelProperty(value = "cglass")
	private java.lang.String cglass;
	/**cthread*/
	@Excel(name = "cthread", width = 15)
    @ApiModelProperty(value = "cthread")
	private java.lang.String cthread;
	/**ccharcoal*/
	@Excel(name = "ccharcoal", width = 15)
    @ApiModelProperty(value = "ccharcoal")
	private java.lang.String ccharcoal;
	/**cwhiteblock*/
	@Excel(name = "cwhiteblock", width = 15)
    @ApiModelProperty(value = "cwhiteblock")
	private java.lang.String cwhiteblock;
	/**cmuddy*/
	@Excel(name = "cmuddy", width = 15)
    @ApiModelProperty(value = "cmuddy")
	private java.lang.String cmuddy;
	/**cwhitepoint*/
	@Excel(name = "cwhitepoint", width = 15)
    @ApiModelProperty(value = "cwhitepoint")
	private java.lang.String cwhitepoint;
	/**cother*/
	@Excel(name = "cother", width = 15)
    @ApiModelProperty(value = "cother")
	private java.lang.String cother;
	/**felgquantity*/
	@Excel(name = "felgquantity", width = 15)
    @ApiModelProperty(value = "felgquantity")
	private java.math.BigDecimal felgquantity;
	/**fnelgquantity*/
	@Excel(name = "fnelgquantity", width = 15)
    @ApiModelProperty(value = "fnelgquantity")
	private java.math.BigDecimal fnelgquantity;
	/**fnelgrate*/
	@Excel(name = "fnelgrate", width = 15)
    @ApiModelProperty(value = "fnelgrate")
	private java.math.BigDecimal fnelgrate;
	/**cchinatitle*/
	@Excel(name = "cchinatitle", width = 15)
    @ApiModelProperty(value = "cchinatitle")
	private java.lang.String cchinatitle;
	/**cchinaexplain*/
	@Excel(name = "cchinaexplain", width = 15)
    @ApiModelProperty(value = "cchinaexplain")
	private java.lang.String cchinaexplain;
	/**cpackspec*/
	@Excel(name = "cpackspec", width = 15)
    @ApiModelProperty(value = "cpackspec")
	private java.lang.String cpackspec;
	/**cbackreason*/
	@Excel(name = "cbackreason", width = 15)
    @ApiModelProperty(value = "cbackreason")
	private java.lang.String cbackreason;
	/**bspecial*/
	@Excel(name = "bspecial", width = 15)
    @ApiModelProperty(value = "bspecial")
	private java.lang.Object bspecial;
	/**bname*/
	@Excel(name = "bname", width = 15)
    @ApiModelProperty(value = "bname")
	private java.lang.Object bname;
	/**bspec*/
	@Excel(name = "bspec", width = 15)
    @ApiModelProperty(value = "bspec")
	private java.lang.Object bspec;
	/**bproc*/
	@Excel(name = "bproc", width = 15)
    @ApiModelProperty(value = "bproc")
	private java.lang.Object bproc;
	/**cdepmind*/
	@Excel(name = "cdepmind", width = 15)
    @ApiModelProperty(value = "cdepmind")
	private java.lang.String cdepmind;
	/**fprice*/
	@Excel(name = "fprice", width = 15)
    @ApiModelProperty(value = "fprice")
	private java.math.BigDecimal fprice;
	/**ccheckstand*/
	@Excel(name = "ccheckstand", width = 15)
    @ApiModelProperty(value = "ccheckstand")
	private java.lang.String ccheckstand;
	/**cbatch*/
	@Excel(name = "cbatch", width = 15)
    @ApiModelProperty(value = "cbatch")
	private java.lang.String cbatch;
	/**cbatchs*/
	@Excel(name = "cbatchs", width = 15)
    @ApiModelProperty(value = "cbatchs")
	private java.lang.String cbatchs;
	/**bfinish*/
	@Excel(name = "bfinish", width = 15)
    @ApiModelProperty(value = "bfinish")
	private java.lang.Object bfinish;
	/**fpartquantity*/
	@Excel(name = "fpartquantity", width = 15)
    @ApiModelProperty(value = "fpartquantity")
	private java.math.BigDecimal fpartquantity;
	/**ccuscode*/
	@Excel(name = "ccuscode", width = 15)
    @ApiModelProperty(value = "ccuscode")
	private java.lang.String ccuscode;
	/**cmastername*/
	@Excel(name = "cmastername", width = 15)
    @ApiModelProperty(value = "cmastername")
	private java.lang.String cmastername;
	/**cmastermind*/
	@Excel(name = "cmastermind", width = 15)
    @ApiModelProperty(value = "cmastermind")
	private java.lang.String cmastermind;
	/**dmasterdate*/
	@Excel(name = "dmasterdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmasterdate")
	private java.util.Date dmasterdate;
	/**bflag*/
	@Excel(name = "bflag", width = 15)
    @ApiModelProperty(value = "bflag")
	private java.lang.Object bflag;
	/**cmemoT*/
	@Excel(name = "cmemoT", width = 15)
    @ApiModelProperty(value = "cmemoT")
	private java.lang.String cmemoT;
	/**cdefine22*/
	@Excel(name = "cdefine22", width = 15)
    @ApiModelProperty(value = "cdefine22")
	private java.lang.String cdefine22;
	/**cdefine23*/
	@Excel(name = "cdefine23", width = 15)
    @ApiModelProperty(value = "cdefine23")
	private java.lang.String cdefine23;
	/**cdefine24*/
	@Excel(name = "cdefine24", width = 15)
    @ApiModelProperty(value = "cdefine24")
	private java.lang.String cdefine24;
	/**cdefine25*/
	@Excel(name = "cdefine25", width = 15)
    @ApiModelProperty(value = "cdefine25")
	private java.lang.String cdefine25;
	/**cdefine26*/
	@Excel(name = "cdefine26", width = 15)
    @ApiModelProperty(value = "cdefine26")
	private java.math.BigDecimal cdefine26;
	/**cdefine27*/
	@Excel(name = "cdefine27", width = 15)
    @ApiModelProperty(value = "cdefine27")
	private java.math.BigDecimal cdefine27;
	/**cdefine28*/
	@Excel(name = "cdefine28", width = 15)
    @ApiModelProperty(value = "cdefine28")
	private java.lang.String cdefine28;
	/**cdefine29*/
	@Excel(name = "cdefine29", width = 15)
    @ApiModelProperty(value = "cdefine29")
	private java.lang.String cdefine29;
	/**cdefine30*/
	@Excel(name = "cdefine30", width = 15)
    @ApiModelProperty(value = "cdefine30")
	private java.lang.String cdefine30;
	/**cdefine31*/
	@Excel(name = "cdefine31", width = 15)
    @ApiModelProperty(value = "cdefine31")
	private java.lang.String cdefine31;
	/**cdefine32*/
	@Excel(name = "cdefine32", width = 15)
    @ApiModelProperty(value = "cdefine32")
	private java.lang.String cdefine32;
	/**cdefine33*/
	@Excel(name = "cdefine33", width = 15)
    @ApiModelProperty(value = "cdefine33")
	private java.lang.String cdefine33;
	/**cdefine34*/
	@Excel(name = "cdefine34", width = 15)
    @ApiModelProperty(value = "cdefine34")
	private java.lang.Integer cdefine34;
	/**cdefine35*/
	@Excel(name = "cdefine35", width = 15)
    @ApiModelProperty(value = "cdefine35")
	private java.lang.Integer cdefine35;
	/**cdefine36*/
	@Excel(name = "cdefine36", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cdefine36")
	private java.util.Date cdefine36;
	/**cdefine37*/
	@Excel(name = "cdefine37", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cdefine37")
	private java.util.Date cdefine37;
	/**icodeT*/
	@Excel(name = "icodeT", width = 15)
    @ApiModelProperty(value = "icodeT")
	private java.lang.Integer icodeT;
	/**cfree1*/
	@Excel(name = "cfree1", width = 15)
    @ApiModelProperty(value = "cfree1")
	private java.lang.String cfree1;
	/**cfree2*/
	@Excel(name = "cfree2", width = 15)
    @ApiModelProperty(value = "cfree2")
	private java.lang.String cfree2;
	/**cfree3*/
	@Excel(name = "cfree3", width = 15)
    @ApiModelProperty(value = "cfree3")
	private java.lang.String cfree3;
	/**cfree4*/
	@Excel(name = "cfree4", width = 15)
    @ApiModelProperty(value = "cfree4")
	private java.lang.String cfree4;
	/**cfree5*/
	@Excel(name = "cfree5", width = 15)
    @ApiModelProperty(value = "cfree5")
	private java.lang.String cfree5;
	/**cfree6*/
	@Excel(name = "cfree6", width = 15)
    @ApiModelProperty(value = "cfree6")
	private java.lang.String cfree6;
	/**cfree7*/
	@Excel(name = "cfree7", width = 15)
    @ApiModelProperty(value = "cfree7")
	private java.lang.String cfree7;
	/**cfree8*/
	@Excel(name = "cfree8", width = 15)
    @ApiModelProperty(value = "cfree8")
	private java.lang.String cfree8;
	/**cfree9*/
	@Excel(name = "cfree9", width = 15)
    @ApiModelProperty(value = "cfree9")
	private java.lang.String cfree9;
	/**cfree10*/
	@Excel(name = "cfree10", width = 15)
    @ApiModelProperty(value = "cfree10")
	private java.lang.String cfree10;
	/**bcheck*/
	@Excel(name = "bcheck", width = 15)
    @ApiModelProperty(value = "bcheck")
	private java.lang.Object bcheck;
	/**cunitid*/
	@Excel(name = "cunitid", width = 15)
    @ApiModelProperty(value = "cunitid")
	private java.lang.String cunitid;
	/**farvquantitys*/
	@Excel(name = "farvquantitys", width = 15)
    @ApiModelProperty(value = "farvquantitys")
	private java.math.BigDecimal farvquantitys;
	/**fboxquantitys*/
	@Excel(name = "fboxquantitys", width = 15)
    @ApiModelProperty(value = "fboxquantitys")
	private java.math.BigDecimal fboxquantitys;
	/**felgquantitys*/
	@Excel(name = "felgquantitys", width = 15)
    @ApiModelProperty(value = "felgquantitys")
	private java.math.BigDecimal felgquantitys;
	/**fnelgquantitys*/
	@Excel(name = "fnelgquantitys", width = 15)
    @ApiModelProperty(value = "fnelgquantitys")
	private java.math.BigDecimal fnelgquantitys;
	/**fpartquantitys*/
	@Excel(name = "fpartquantitys", width = 15)
    @ApiModelProperty(value = "fpartquantitys")
	private java.math.BigDecimal fpartquantitys;
	/**fquantitys*/
	@Excel(name = "fquantitys", width = 15)
    @ApiModelProperty(value = "fquantitys")
	private java.math.BigDecimal fquantitys;
	/**fsum*/
	@Excel(name = "fsum", width = 15)
    @ApiModelProperty(value = "fsum")
	private java.math.BigDecimal fsum;
	/**faccqty*/
	@Excel(name = "faccqty", width = 15)
    @ApiModelProperty(value = "faccqty")
	private java.math.BigDecimal faccqty;
	/**faccqtys*/
	@Excel(name = "faccqtys", width = 15)
    @ApiModelProperty(value = "faccqtys")
	private java.math.BigDecimal faccqtys;
	/**doutdate*/
	@Excel(name = "doutdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "doutdate")
	private java.util.Date doutdate;
	/**fsampleqty*/
	@Excel(name = "fsampleqty", width = 15)
    @ApiModelProperty(value = "fsampleqty")
	private java.math.BigDecimal fsampleqty;
	/**fsampleqtys*/
	@Excel(name = "fsampleqtys", width = 15)
    @ApiModelProperty(value = "fsampleqtys")
	private java.math.BigDecimal fsampleqtys;
	/**bmakescrap*/
	@Excel(name = "bmakescrap", width = 15)
    @ApiModelProperty(value = "bmakescrap")
	private java.lang.Object bmakescrap;
	/**bmakepurin*/
	@Excel(name = "bmakepurin", width = 15)
    @ApiModelProperty(value = "bmakepurin")
	private java.lang.Object bmakepurin;
	/**bmakesaleout*/
	@Excel(name = "bmakesaleout", width = 15)
    @ApiModelProperty(value = "bmakesaleout")
	private java.lang.Object bmakesaleout;
	/**ireport*/
	@Excel(name = "ireport", width = 15)
    @ApiModelProperty(value = "ireport")
	private java.lang.Integer ireport;
	/**cwhcode*/
	@Excel(name = "cwhcode", width = 15)
    @ApiModelProperty(value = "cwhcode")
	private java.lang.String cwhcode;
	/**imassdate*/
	@Excel(name = "imassdate", width = 15)
    @ApiModelProperty(value = "imassdate")
	private java.lang.Integer imassdate;
	/**cmassunit*/
	@Excel(name = "cmassunit", width = 15)
    @ApiModelProperty(value = "cmassunit")
	private java.lang.Integer cmassunit;
	/**contractrowguid*/
	@Excel(name = "contractrowguid", width = 15)
    @ApiModelProperty(value = "contractrowguid")
	private java.lang.String contractrowguid;
	/**contractcode*/
	@Excel(name = "contractcode", width = 15)
    @ApiModelProperty(value = "contractcode")
	private java.lang.String contractcode;
	/**cordercode*/
	@Excel(name = "cordercode", width = 15)
    @ApiModelProperty(value = "cordercode")
	private java.lang.String cordercode;
	/**frefusequantity*/
	@Excel(name = "frefusequantity", width = 15)
    @ApiModelProperty(value = "frefusequantity")
	private java.math.BigDecimal frefusequantity;
	/**frefusenum*/
	@Excel(name = "frefusenum", width = 15)
    @ApiModelProperty(value = "frefusenum")
	private java.math.BigDecimal frefusenum;
	/**iqcidT*/
	@Excel(name = "iqcidT", width = 15)
    @ApiModelProperty(value = "iqcidT")
	private java.lang.Integer iqcidT;
	/**dvaldate*/
	@Excel(name = "dvaldate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvaldate")
	private java.util.Date dvaldate;
	/**cbatchproperty1*/
	@Excel(name = "cbatchproperty1", width = 15)
    @ApiModelProperty(value = "cbatchproperty1")
	private java.math.BigDecimal cbatchproperty1;
	/**cbatchproperty2*/
	@Excel(name = "cbatchproperty2", width = 15)
    @ApiModelProperty(value = "cbatchproperty2")
	private java.math.BigDecimal cbatchproperty2;
	/**cbatchproperty3*/
	@Excel(name = "cbatchproperty3", width = 15)
    @ApiModelProperty(value = "cbatchproperty3")
	private java.math.BigDecimal cbatchproperty3;
	/**cbatchproperty4*/
	@Excel(name = "cbatchproperty4", width = 15)
    @ApiModelProperty(value = "cbatchproperty4")
	private java.math.BigDecimal cbatchproperty4;
	/**cbatchproperty5*/
	@Excel(name = "cbatchproperty5", width = 15)
    @ApiModelProperty(value = "cbatchproperty5")
	private java.math.BigDecimal cbatchproperty5;
	/**cbatchproperty6*/
	@Excel(name = "cbatchproperty6", width = 15)
    @ApiModelProperty(value = "cbatchproperty6")
	private java.lang.String cbatchproperty6;
	/**cbatchproperty7*/
	@Excel(name = "cbatchproperty7", width = 15)
    @ApiModelProperty(value = "cbatchproperty7")
	private java.lang.String cbatchproperty7;
	/**cbatchproperty8*/
	@Excel(name = "cbatchproperty8", width = 15)
    @ApiModelProperty(value = "cbatchproperty8")
	private java.lang.String cbatchproperty8;
	/**cbatchproperty9*/
	@Excel(name = "cbatchproperty9", width = 15)
    @ApiModelProperty(value = "cbatchproperty9")
	private java.lang.String cbatchproperty9;
	/**cbatchproperty10*/
	@Excel(name = "cbatchproperty10", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cbatchproperty10")
	private java.util.Date cbatchproperty10;
	/**fstqty*/
	@Excel(name = "fstqty", width = 15)
    @ApiModelProperty(value = "fstqty")
	private java.math.BigDecimal fstqty;
	/**fstnum*/
	@Excel(name = "fstnum", width = 15)
    @ApiModelProperty(value = "fstnum")
	private java.math.BigDecimal fstnum;
	/**fstsqty*/
	@Excel(name = "fstsqty", width = 15)
    @ApiModelProperty(value = "fstsqty")
	private java.math.BigDecimal fstsqty;
	/**fstsnum*/
	@Excel(name = "fstsnum", width = 15)
    @ApiModelProperty(value = "fstsnum")
	private java.math.BigDecimal fstsnum;
	/**cposition*/
	@Excel(name = "cposition", width = 15)
    @ApiModelProperty(value = "cposition")
	private java.lang.String cposition;
	/**cchecker1*/
	@Excel(name = "cchecker1", width = 15)
    @ApiModelProperty(value = "cchecker1")
	private java.lang.String cchecker1;
	/**cchecker2*/
	@Excel(name = "cchecker2", width = 15)
    @ApiModelProperty(value = "cchecker2")
	private java.lang.String cchecker2;
	/**bmakescrapin*/
	@Excel(name = "bmakescrapin", width = 15)
    @ApiModelProperty(value = "bmakescrapin")
	private java.lang.Object bmakescrapin;
	/**cbsysbarcode*/
	@Excel(name = "cbsysbarcode", width = 15)
    @ApiModelProperty(value = "cbsysbarcode")
	private java.lang.String cbsysbarcode;
	/**inum*/
	@Excel(name = "inum", width = 15)
    @ApiModelProperty(value = "inum")
	private java.math.BigDecimal inum;
	/**bgift*/
	@Excel(name = "bgift", width = 15)
    @ApiModelProperty(value = "bgift")
	private java.lang.Integer bgift;
}
