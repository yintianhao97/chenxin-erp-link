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
 * @Description: 销售出库质量符合单辅
 * @Author: jeecg-boot
 * @Date:   2024-06-19
 * @Version: V1.0
 */
@Data
@TableName("GSP_VouchsNote")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GSP_VouchsNote对象", description="销售出库质量符合单辅")
public class GspVouchsNote {
    
	/**autoid*/
	@Excel(name = "autoid", width = 15)
    @ApiModelProperty(value = "autoid")
	private java.lang.Integer autoid;
	/**ccheckcode*/
	@Excel(name = "ccheckcode", width = 15)
    @ApiModelProperty(value = "ccheckcode")
	private java.lang.String ccheckcode;
	/**darvdate*/
	@Excel(name = "darvdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "darvdate")
	private java.util.Date darvdate;
	/**cinvcode*/
	@Excel(name = "cinvcode", width = 15)
    @ApiModelProperty(value = "cinvcode")
	private java.lang.String cinvcode;
	/**cbatch*/
	@Excel(name = "cbatch", width = 15)
    @ApiModelProperty(value = "cbatch")
	private java.lang.String cbatch;
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**ddateT*/
	@Excel(name = "ddateT", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddateT")
	private java.util.Date ddateT;
	/**fquantity*/
	@Excel(name = "fquantity", width = 15)
    @ApiModelProperty(value = "fquantity")
	private java.math.BigDecimal fquantity;
	/**creason*/
	@Excel(name = "creason", width = 15)
    @ApiModelProperty(value = "creason")
	private java.lang.String creason;
	/**cplace*/
	@Excel(name = "cplace", width = 15)
    @ApiModelProperty(value = "cplace")
	private java.lang.String cplace;
	/**cresult*/
	@Excel(name = "cresult", width = 15)
    @ApiModelProperty(value = "cresult")
	private java.lang.String cresult;
	/**cperson*/
	@Excel(name = "cperson", width = 15)
    @ApiModelProperty(value = "cperson")
	private java.lang.String cperson;
	/**cstime*/
	@Excel(name = "cstime", width = 15)
    @ApiModelProperty(value = "cstime")
	private java.lang.String cstime;
	/**cetime*/
	@Excel(name = "cetime", width = 15)
    @ApiModelProperty(value = "cetime")
	private java.lang.String cetime;
	/**cstandtime*/
	@Excel(name = "cstandtime", width = 15)
    @ApiModelProperty(value = "cstandtime")
	private java.lang.String cstandtime;
	/**cfacttime*/
	@Excel(name = "cfacttime", width = 15)
    @ApiModelProperty(value = "cfacttime")
	private java.lang.String cfacttime;
	/**dprodate*/
	@Excel(name = "dprodate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dprodate")
	private java.util.Date dprodate;
	/**cposition*/
	@Excel(name = "cposition", width = 15)
    @ApiModelProperty(value = "cposition")
	private java.lang.String cposition;
	/**cwhcode*/
	@Excel(name = "cwhcode", width = 15)
    @ApiModelProperty(value = "cwhcode")
	private java.lang.String cwhcode;
	/**coutinstance*/
	@Excel(name = "coutinstance", width = 15)
    @ApiModelProperty(value = "coutinstance")
	private java.lang.String coutinstance;
	/**cvaldate*/
	@Excel(name = "cvaldate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cvaldate")
	private java.util.Date cvaldate;
	/**cpivot*/
	@Excel(name = "cpivot", width = 15)
    @ApiModelProperty(value = "cpivot")
	private java.lang.String cpivot;
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**serialnumber*/
	@Excel(name = "serialnumber", width = 15)
    @ApiModelProperty(value = "serialnumber")
	private java.lang.Integer serialnumber;
	/**isbsid*/
	@Excel(name = "isbsid", width = 15)
    @ApiModelProperty(value = "isbsid")
	private java.lang.Integer isbsid;
	/**idlsid*/
	@Excel(name = "idlsid", width = 15)
    @ApiModelProperty(value = "idlsid")
	private java.lang.Integer idlsid;
	/**cstatus*/
	@Excel(name = "cstatus", width = 15)
    @ApiModelProperty(value = "cstatus")
	private java.lang.String cstatus;
	/**bflag*/
	@Excel(name = "bflag", width = 15)
    @ApiModelProperty(value = "bflag")
	private java.lang.Object bflag;
	/**icodeT*/
	@Excel(name = "icodeT", width = 15)
    @ApiModelProperty(value = "icodeT")
	private java.lang.Integer icodeT;
	/**ccuscode*/
	@Excel(name = "ccuscode", width = 15)
    @ApiModelProperty(value = "ccuscode")
	private java.lang.String ccuscode;
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
	/**cunitid*/
	@Excel(name = "cunitid", width = 15)
    @ApiModelProperty(value = "cunitid")
	private java.lang.String cunitid;
	/**fquantitys*/
	@Excel(name = "fquantitys", width = 15)
    @ApiModelProperty(value = "fquantitys")
	private java.math.BigDecimal fquantitys;
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
	/**cwhcodes*/
	@Excel(name = "cwhcodes", width = 15)
    @ApiModelProperty(value = "cwhcodes")
	private java.lang.String cwhcodes;
	/**imassdate*/
	@Excel(name = "imassdate", width = 15)
    @ApiModelProperty(value = "imassdate")
	private java.lang.Integer imassdate;
	/**cmassunit*/
	@Excel(name = "cmassunit", width = 15)
    @ApiModelProperty(value = "cmassunit")
	private java.lang.Integer cmassunit;
	/**icode*/
	@Excel(name = "icode", width = 15)
    @ApiModelProperty(value = "icode")
	private java.lang.Integer icode;
	/**ccode*/
	@Excel(name = "ccode", width = 15)
    @ApiModelProperty(value = "ccode")
	private java.lang.String ccode;
	/**cshipper*/
	@Excel(name = "cshipper", width = 15)
    @ApiModelProperty(value = "cshipper")
	private java.lang.String cshipper;
	/**cprocess*/
	@Excel(name = "cprocess", width = 15)
    @ApiModelProperty(value = "cprocess")
	private java.lang.String cprocess;
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
	/**ibigmonth*/
	@Excel(name = "ibigmonth", width = 15)
    @ApiModelProperty(value = "ibigmonth")
	private java.lang.Integer ibigmonth;
	/**ibigday*/
	@Excel(name = "ibigday", width = 15)
    @ApiModelProperty(value = "ibigday")
	private java.lang.Integer ibigday;
	/**bzdyh*/
	@Excel(name = "bzdyh", width = 15)
    @ApiModelProperty(value = "bzdyh")
	private java.lang.Object bzdyh;
	/**cchecker1*/
	@Excel(name = "cchecker1", width = 15)
    @ApiModelProperty(value = "cchecker1")
	private java.lang.String cchecker1;
	/**cchecker2*/
	@Excel(name = "cchecker2", width = 15)
    @ApiModelProperty(value = "cchecker2")
	private java.lang.String cchecker2;
	/**ddatebegin*/
	@Excel(name = "ddatebegin", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddatebegin")
	private java.util.Date ddatebegin;
	/**ddateend*/
	@Excel(name = "ddateend", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "ddateend")
	private java.util.Date ddateend;
}
