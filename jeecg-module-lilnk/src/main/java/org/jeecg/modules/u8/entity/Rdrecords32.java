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
 * @Description: 销售出库辅
 * @Author: jeecg-boot
 * @Date:   2024-06-19
 * @Version: V1.0
 */
@Data
@TableName("rdrecords32")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="rdrecords32对象", description="销售出库辅")
public class Rdrecords32 {
    
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
	/**inum*/
	@Excel(name = "inum", width = 15)
    @ApiModelProperty(value = "inum")
	private java.math.BigDecimal inum;
	/**iquantity*/
	@Excel(name = "iquantity", width = 15)
    @ApiModelProperty(value = "iquantity")
	private java.math.BigDecimal iquantity;
	/**iunitcost*/
	@Excel(name = "iunitcost", width = 15)
    @ApiModelProperty(value = "iunitcost")
	private java.math.BigDecimal iunitcost;
	/**iprice*/
	@Excel(name = "iprice", width = 15)
    @ApiModelProperty(value = "iprice")
	private java.lang.Object iprice;
	/**iaprice*/
	@Excel(name = "iaprice", width = 15)
    @ApiModelProperty(value = "iaprice")
	private java.lang.Object iaprice;
	/**ipunitcost*/
	@Excel(name = "ipunitcost", width = 15)
    @ApiModelProperty(value = "ipunitcost")
	private java.math.BigDecimal ipunitcost;
	/**ipprice*/
	@Excel(name = "ipprice", width = 15)
    @ApiModelProperty(value = "ipprice")
	private java.lang.Object ipprice;
	/**cbatch*/
	@Excel(name = "cbatch", width = 15)
    @ApiModelProperty(value = "cbatch")
	private java.lang.String cbatch;
	/**cvouchcode*/
	@Excel(name = "cvouchcode", width = 15)
    @ApiModelProperty(value = "cvouchcode")
	private java.lang.Integer cvouchcode;
	/**cinvouchcode*/
	@Excel(name = "cinvouchcode", width = 15)
    @ApiModelProperty(value = "cinvouchcode")
	private java.lang.String cinvouchcode;
	/**cinvouchtype*/
	@Excel(name = "cinvouchtype", width = 15)
    @ApiModelProperty(value = "cinvouchtype")
	private java.lang.String cinvouchtype;
	/**isoutquantity*/
	@Excel(name = "isoutquantity", width = 15)
    @ApiModelProperty(value = "isoutquantity")
	private java.math.BigDecimal isoutquantity;
	/**isoutnum*/
	@Excel(name = "isoutnum", width = 15)
    @ApiModelProperty(value = "isoutnum")
	private java.math.BigDecimal isoutnum;
	/**coutvouchid*/
	@Excel(name = "coutvouchid", width = 15)
    @ApiModelProperty(value = "coutvouchid")
	private java.lang.Integer coutvouchid;
	/**coutvouchtype*/
	@Excel(name = "coutvouchtype", width = 15)
    @ApiModelProperty(value = "coutvouchtype")
	private java.lang.String coutvouchtype;
	/**isredoutquantity*/
	@Excel(name = "isredoutquantity", width = 15)
    @ApiModelProperty(value = "isredoutquantity")
	private java.math.BigDecimal isredoutquantity;
	/**isredoutnum*/
	@Excel(name = "isredoutnum", width = 15)
    @ApiModelProperty(value = "isredoutnum")
	private java.math.BigDecimal isredoutnum;
	/**cfree1*/
	@Excel(name = "cfree1", width = 15)
    @ApiModelProperty(value = "cfree1")
	private java.lang.String cfree1;
	/**cfree2*/
	@Excel(name = "cfree2", width = 15)
    @ApiModelProperty(value = "cfree2")
	private java.lang.String cfree2;
	/**iflag*/
	@Excel(name = "iflag", width = 15)
    @ApiModelProperty(value = "iflag")
	private java.lang.Integer iflag;
	/**ifnum*/
	@Excel(name = "ifnum", width = 15)
    @ApiModelProperty(value = "ifnum")
	private java.math.BigDecimal ifnum;
	/**ifquantity*/
	@Excel(name = "ifquantity", width = 15)
    @ApiModelProperty(value = "ifquantity")
	private java.math.BigDecimal ifquantity;
	/**dvdate*/
	@Excel(name = "dvdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvdate")
	private java.util.Date dvdate;
	/**cposition*/
	@Excel(name = "cposition", width = 15)
    @ApiModelProperty(value = "cposition")
	private java.lang.String cposition;
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
	private java.lang.Float cdefine26;
	/**cdefine27*/
	@Excel(name = "cdefine27", width = 15)
    @ApiModelProperty(value = "cdefine27")
	private java.lang.Float cdefine27;
	/**citemClass*/
	@Excel(name = "citemClass", width = 15)
    @ApiModelProperty(value = "citemClass")
	private java.lang.String citemClass;
	/**citemcode*/
	@Excel(name = "citemcode", width = 15)
    @ApiModelProperty(value = "citemcode")
	private java.lang.String citemcode;
	/**idlsid*/
	@Excel(name = "idlsid", width = 15)
    @ApiModelProperty(value = "idlsid")
	private java.lang.Integer idlsid;
	/**isbsid*/
	@Excel(name = "isbsid", width = 15)
    @ApiModelProperty(value = "isbsid")
	private java.lang.Integer isbsid;
	/**isendquantity*/
	@Excel(name = "isendquantity", width = 15)
    @ApiModelProperty(value = "isendquantity")
	private java.math.BigDecimal isendquantity;
	/**isendnum*/
	@Excel(name = "isendnum", width = 15)
    @ApiModelProperty(value = "isendnum")
	private java.math.BigDecimal isendnum;
	/**iensid*/
	@Excel(name = "iensid", width = 15)
    @ApiModelProperty(value = "iensid")
	private java.lang.Integer iensid;
	/**cname*/
	@Excel(name = "cname", width = 15)
    @ApiModelProperty(value = "cname")
	private java.lang.String cname;
	/**citemcname*/
	@Excel(name = "citemcname", width = 15)
    @ApiModelProperty(value = "citemcname")
	private java.lang.String citemcname;
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
	/**cbarcode*/
	@Excel(name = "cbarcode", width = 15)
    @ApiModelProperty(value = "cbarcode")
	private java.lang.String cbarcode;
	/**inquantity*/
	@Excel(name = "inquantity", width = 15)
    @ApiModelProperty(value = "inquantity")
	private java.math.BigDecimal inquantity;
	/**innum*/
	@Excel(name = "innum", width = 15)
    @ApiModelProperty(value = "innum")
	private java.math.BigDecimal innum;
	/**cassunit*/
	@Excel(name = "cassunit", width = 15)
    @ApiModelProperty(value = "cassunit")
	private java.lang.String cassunit;
	/**dmadedate*/
	@Excel(name = "dmadedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmadedate")
	private java.util.Date dmadedate;
	/**imassdate*/
	@Excel(name = "imassdate", width = 15)
    @ApiModelProperty(value = "imassdate")
	private java.lang.Integer imassdate;
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
	/**icheckids*/
	@Excel(name = "icheckids", width = 15)
    @ApiModelProperty(value = "icheckids")
	private java.lang.Integer icheckids;
	/**cbvencode*/
	@Excel(name = "cbvencode", width = 15)
    @ApiModelProperty(value = "cbvencode")
	private java.lang.String cbvencode;
	/**bgsp*/
	@Excel(name = "bgsp", width = 15)
    @ApiModelProperty(value = "bgsp")
	private java.lang.Object bgsp;
	/**cgspstate*/
	@Excel(name = "cgspstate", width = 15)
    @ApiModelProperty(value = "cgspstate")
	private java.lang.String cgspstate;
	/**ccheckcode*/
	@Excel(name = "ccheckcode", width = 15)
    @ApiModelProperty(value = "ccheckcode")
	private java.lang.String ccheckcode;
	/**icheckidbaks*/
	@Excel(name = "icheckidbaks", width = 15)
    @ApiModelProperty(value = "icheckidbaks")
	private java.lang.Integer icheckidbaks;
	/**crejectcode*/
	@Excel(name = "crejectcode", width = 15)
    @ApiModelProperty(value = "crejectcode")
	private java.lang.String crejectcode;
	/**irejectids*/
	@Excel(name = "irejectids", width = 15)
    @ApiModelProperty(value = "irejectids")
	private java.lang.Integer irejectids;
	/**ccheckpersoncode*/
	@Excel(name = "ccheckpersoncode", width = 15)
    @ApiModelProperty(value = "ccheckpersoncode")
	private java.lang.String ccheckpersoncode;
	/**dcheckdate*/
	@Excel(name = "dcheckdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dcheckdate")
	private java.util.Date dcheckdate;
	/**cmassunit*/
	@Excel(name = "cmassunit", width = 15)
    @ApiModelProperty(value = "cmassunit")
	private java.lang.Integer cmassunit;
	/**irefundinspectflag*/
	@Excel(name = "irefundinspectflag", width = 15)
    @ApiModelProperty(value = "irefundinspectflag")
	private java.lang.Integer irefundinspectflag;
	/**strcontractid*/
	@Excel(name = "strcontractid", width = 15)
    @ApiModelProperty(value = "strcontractid")
	private java.lang.String strcontractid;
	/**strcode*/
	@Excel(name = "strcode", width = 15)
    @ApiModelProperty(value = "strcode")
	private java.lang.String strcode;
	/**bchecked*/
	@Excel(name = "bchecked", width = 15)
    @ApiModelProperty(value = "bchecked")
	private java.lang.Object bchecked;
	/**ieqdid*/
	@Excel(name = "ieqdid", width = 15)
    @ApiModelProperty(value = "ieqdid")
	private java.lang.Integer ieqdid;
	/**blpusefree*/
	@Excel(name = "blpusefree", width = 15)
    @ApiModelProperty(value = "blpusefree")
	private java.lang.Object blpusefree;
	/**irsrowno*/
	@Excel(name = "irsrowno", width = 15)
    @ApiModelProperty(value = "irsrowno")
	private java.lang.Integer irsrowno;
	/**ioritrackid*/
	@Excel(name = "ioritrackid", width = 15)
    @ApiModelProperty(value = "ioritrackid")
	private java.lang.Integer ioritrackid;
	/**coritracktype*/
	@Excel(name = "coritracktype", width = 15)
    @ApiModelProperty(value = "coritracktype")
	private java.lang.String coritracktype;
	/**cbaccounter*/
	@Excel(name = "cbaccounter", width = 15)
    @ApiModelProperty(value = "cbaccounter")
	private java.lang.String cbaccounter;
	/**dbkeepdate*/
	@Excel(name = "dbkeepdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dbkeepdate")
	private java.util.Date dbkeepdate;
	/**bcosting*/
	@Excel(name = "bcosting", width = 15)
    @ApiModelProperty(value = "bcosting")
	private java.lang.Object bcosting;
	/**bvmiused*/
	@Excel(name = "bvmiused", width = 15)
    @ApiModelProperty(value = "bvmiused")
	private java.lang.Object bvmiused;
	/**ivmisettlequantity*/
	@Excel(name = "ivmisettlequantity", width = 15)
    @ApiModelProperty(value = "ivmisettlequantity")
	private java.math.BigDecimal ivmisettlequantity;
	/**ivmisettlenum*/
	@Excel(name = "ivmisettlenum", width = 15)
    @ApiModelProperty(value = "ivmisettlenum")
	private java.math.BigDecimal ivmisettlenum;
	/**cvmivencode*/
	@Excel(name = "cvmivencode", width = 15)
    @ApiModelProperty(value = "cvmivencode")
	private java.lang.String cvmivencode;
	/**iinvsncount*/
	@Excel(name = "iinvsncount", width = 15)
    @ApiModelProperty(value = "iinvsncount")
	private java.lang.Integer iinvsncount;
	/**cwhpersoncode*/
	@Excel(name = "cwhpersoncode", width = 15)
    @ApiModelProperty(value = "cwhpersoncode")
	private java.lang.String cwhpersoncode;
	/**cwhpersonname*/
	@Excel(name = "cwhpersonname", width = 15)
    @ApiModelProperty(value = "cwhpersonname")
	private java.lang.String cwhpersonname;
	/**cserviceoid*/
	@Excel(name = "cserviceoid", width = 15)
    @ApiModelProperty(value = "cserviceoid")
	private java.lang.String cserviceoid;
	/**cbserviceoid*/
	@Excel(name = "cbserviceoid", width = 15)
    @ApiModelProperty(value = "cbserviceoid")
	private java.lang.String cbserviceoid;
	/**iinvexchrate*/
	@Excel(name = "iinvexchrate", width = 15)
    @ApiModelProperty(value = "iinvexchrate")
	private java.math.BigDecimal iinvexchrate;
	/**cbdlcode*/
	@Excel(name = "cbdlcode", width = 15)
    @ApiModelProperty(value = "cbdlcode")
	private java.lang.String cbdlcode;
	/**corufts*/
	@Excel(name = "corufts", width = 15)
    @ApiModelProperty(value = "corufts")
	private java.lang.String corufts;
	/**strcontractguid*/
	@Excel(name = "strcontractguid", width = 15)
    @ApiModelProperty(value = "strcontractguid")
	private java.lang.Object strcontractguid;
	/**iexpiratdatecalcu*/
	@Excel(name = "iexpiratdatecalcu", width = 15)
    @ApiModelProperty(value = "iexpiratdatecalcu")
	private java.lang.Integer iexpiratdatecalcu;
	/**cexpirationdate*/
	@Excel(name = "cexpirationdate", width = 15)
    @ApiModelProperty(value = "cexpirationdate")
	private java.lang.String cexpirationdate;
	/**dexpirationdate*/
	@Excel(name = "dexpirationdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dexpirationdate")
	private java.util.Date dexpirationdate;
	/**cciqbookcode*/
	@Excel(name = "cciqbookcode", width = 15)
    @ApiModelProperty(value = "cciqbookcode")
	private java.lang.String cciqbookcode;
	/**ibondedsumqty*/
	@Excel(name = "ibondedsumqty", width = 15)
    @ApiModelProperty(value = "ibondedsumqty")
	private java.math.BigDecimal ibondedsumqty;
	/**ccusinvcode*/
	@Excel(name = "ccusinvcode", width = 15)
    @ApiModelProperty(value = "ccusinvcode")
	private java.lang.String ccusinvcode;
	/**ccusinvname*/
	@Excel(name = "ccusinvname", width = 15)
    @ApiModelProperty(value = "ccusinvname")
	private java.lang.String ccusinvname;
	/**iorderdid*/
	@Excel(name = "iorderdid", width = 15)
    @ApiModelProperty(value = "iorderdid")
	private java.lang.Integer iorderdid;
	/**iordertype*/
	@Excel(name = "iordertype", width = 15)
    @ApiModelProperty(value = "iordertype")
	private java.lang.Integer iordertype;
	/**iordercode*/
	@Excel(name = "iordercode", width = 15)
    @ApiModelProperty(value = "iordercode")
	private java.lang.String iordercode;
	/**iorderseq*/
	@Excel(name = "iorderseq", width = 15)
    @ApiModelProperty(value = "iorderseq")
	private java.lang.Integer iorderseq;
	/**ipesodid*/
	@Excel(name = "ipesodid", width = 15)
    @ApiModelProperty(value = "ipesodid")
	private java.lang.String ipesodid;
	/**ipesotype*/
	@Excel(name = "ipesotype", width = 15)
    @ApiModelProperty(value = "ipesotype")
	private java.lang.Integer ipesotype;
	/**cpesocode*/
	@Excel(name = "cpesocode", width = 15)
    @ApiModelProperty(value = "cpesocode")
	private java.lang.String cpesocode;
	/**ipesoseq*/
	@Excel(name = "ipesoseq", width = 15)
    @ApiModelProperty(value = "ipesoseq")
	private java.lang.Integer ipesoseq;
	/**isodid*/
	@Excel(name = "isodid", width = 15)
    @ApiModelProperty(value = "isodid")
	private java.lang.String isodid;
	/**isotype*/
	@Excel(name = "isotype", width = 15)
    @ApiModelProperty(value = "isotype")
	private java.lang.Integer isotype;
	/**csocode*/
	@Excel(name = "csocode", width = 15)
    @ApiModelProperty(value = "csocode")
	private java.lang.String csocode;
	/**isoseq*/
	@Excel(name = "isoseq", width = 15)
    @ApiModelProperty(value = "isoseq")
	private java.lang.Integer isoseq;
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
	/**cbmemo*/
	@Excel(name = "cbmemo", width = 15)
    @ApiModelProperty(value = "cbmemo")
	private java.lang.String cbmemo;
	/**irowno*/
	@Excel(name = "irowno", width = 15)
    @ApiModelProperty(value = "irowno")
	private java.lang.Integer irowno;
	/**strowguid*/
	@Excel(name = "strowguid", width = 15)
    @ApiModelProperty(value = "strowguid")
	private java.lang.Object strowguid;

	/**ipreuseqty*/
	@Excel(name = "ipreuseqty", width = 15)
    @ApiModelProperty(value = "ipreuseqty")
	private java.math.BigDecimal ipreuseqty;
	/**ipreuseinum*/
	@Excel(name = "ipreuseinum", width = 15)
    @ApiModelProperty(value = "ipreuseinum")
	private java.math.BigDecimal ipreuseinum;
	/**idebitids*/
	@Excel(name = "idebitids", width = 15)
    @ApiModelProperty(value = "idebitids")
	private java.lang.Integer idebitids;
	/**fsettleqty*/
	@Excel(name = "fsettleqty", width = 15)
    @ApiModelProperty(value = "fsettleqty")
	private java.math.BigDecimal fsettleqty;
	/**fretqtywkp*/
	@Excel(name = "fretqtywkp", width = 15)
    @ApiModelProperty(value = "fretqtywkp")
	private java.math.BigDecimal fretqtywkp;
	/**fretqtyykp*/
	@Excel(name = "fretqtyykp", width = 15)
    @ApiModelProperty(value = "fretqtyykp")
	private java.math.BigDecimal fretqtyykp;
	/**cbsysbarcode*/
	@Excel(name = "cbsysbarcode", width = 15)
    @ApiModelProperty(value = "cbsysbarcode")
	private java.lang.String cbsysbarcode;
	/**biacreatebill*/
	@Excel(name = "biacreatebill", width = 15)
    @ApiModelProperty(value = "biacreatebill")
	private java.lang.Object biacreatebill;
	/**bsaleoutcreatebill*/
	@Excel(name = "bsaleoutcreatebill", width = 15)
    @ApiModelProperty(value = "bsaleoutcreatebill")
	private java.lang.Object bsaleoutcreatebill;
	/**isaleoutid*/
	@Excel(name = "isaleoutid", width = 15)
    @ApiModelProperty(value = "isaleoutid")
	private java.lang.Integer isaleoutid;
	/**bneedbill*/
	@Excel(name = "bneedbill", width = 15)
    @ApiModelProperty(value = "bneedbill")
	private java.lang.Object bneedbill;
	/**iposflag*/
	@Excel(name = "iposflag", width = 15)
    @ApiModelProperty(value = "iposflag")
	private java.lang.Integer iposflag;
	/**bodyOutid*/
	@Excel(name = "bodyOutid", width = 15)
    @ApiModelProperty(value = "bodyOutid")
	private java.lang.Object bodyOutid;
	/**gcsourceid*/
	@Excel(name = "gcsourceid", width = 15)
    @ApiModelProperty(value = "gcsourceid")
	private java.lang.Integer gcsourceid;
	/**gcsourceids*/
	@Excel(name = "gcsourceids", width = 15)
    @ApiModelProperty(value = "gcsourceids")
	private java.lang.Integer gcsourceids;
	/**cconfirmer*/
	@Excel(name = "cconfirmer", width = 15)
    @ApiModelProperty(value = "cconfirmer")
	private java.lang.String cconfirmer;
	/**dconfirmdate*/
	@Excel(name = "dconfirmdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dconfirmdate")
	private java.util.Date dconfirmdate;
	/**fsumpaymoney*/
	@Excel(name = "fsumpaymoney", width = 15)
    @ApiModelProperty(value = "fsumpaymoney")
	private java.lang.Object fsumpaymoney;
}
