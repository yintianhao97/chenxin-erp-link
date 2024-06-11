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
 * @Description: 发货单子表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Data
@TableName("DispatchLists")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="DispatchLists对象", description="发货单子表")
public class DispatchLists {
    
	/**autoid*/
	@Excel(name = "autoid", width = 15)
    @ApiModelProperty(value = "autoid")
	private java.lang.Integer autoid;
	/**dlid*/
	@Excel(name = "dlid", width = 15)
    @ApiModelProperty(value = "dlid")
	private java.lang.Integer dlid;
	/**icorid*/
	@Excel(name = "icorid", width = 15)
    @ApiModelProperty(value = "icorid")
	private java.lang.Integer icorid;
	/**cwhcode*/
	@Excel(name = "cwhcode", width = 15)
    @ApiModelProperty(value = "cwhcode")
	private java.lang.String cwhcode;
	/**cinvcode*/
	@Excel(name = "cinvcode", width = 15)
    @ApiModelProperty(value = "cinvcode")
	private java.lang.String cinvcode;
	/**iquantity*/
	@Excel(name = "iquantity", width = 15)
    @ApiModelProperty(value = "iquantity")
	private java.math.BigDecimal iquantity;
	/**inum*/
	@Excel(name = "inum", width = 15)
    @ApiModelProperty(value = "inum")
	private java.math.BigDecimal inum;
	/**iquotedprice*/
	@Excel(name = "iquotedprice", width = 15)
    @ApiModelProperty(value = "iquotedprice")
	private java.math.BigDecimal iquotedprice;
	/**iunitprice*/
	@Excel(name = "iunitprice", width = 15)
    @ApiModelProperty(value = "iunitprice")
	private java.math.BigDecimal iunitprice;
	/**itaxunitprice*/
	@Excel(name = "itaxunitprice", width = 15)
    @ApiModelProperty(value = "itaxunitprice")
	private java.math.BigDecimal itaxunitprice;
	/**imoney*/
	@Excel(name = "imoney", width = 15)
    @ApiModelProperty(value = "imoney")
	private java.lang.Object imoney;
	/**itax*/
	@Excel(name = "itax", width = 15)
    @ApiModelProperty(value = "itax")
	private java.lang.Object itax;
	/**isum*/
	@Excel(name = "isum", width = 15)
    @ApiModelProperty(value = "isum")
	private java.lang.Object isum;
	/**idiscount*/
	@Excel(name = "idiscount", width = 15)
    @ApiModelProperty(value = "idiscount")
	private java.lang.Object idiscount;
	/**inatunitprice*/
	@Excel(name = "inatunitprice", width = 15)
    @ApiModelProperty(value = "inatunitprice")
	private java.math.BigDecimal inatunitprice;
	/**inatmoney*/
	@Excel(name = "inatmoney", width = 15)
    @ApiModelProperty(value = "inatmoney")
	private java.lang.Object inatmoney;
	/**inattax*/
	@Excel(name = "inattax", width = 15)
    @ApiModelProperty(value = "inattax")
	private java.lang.Object inattax;
	/**inatsum*/
	@Excel(name = "inatsum", width = 15)
    @ApiModelProperty(value = "inatsum")
	private java.lang.Object inatsum;
	/**inatdiscount*/
	@Excel(name = "inatdiscount", width = 15)
    @ApiModelProperty(value = "inatdiscount")
	private java.lang.Object inatdiscount;
	/**isettlenum*/
	@Excel(name = "isettlenum", width = 15)
    @ApiModelProperty(value = "isettlenum")
	private java.math.BigDecimal isettlenum;
	/**isettlequantity*/
	@Excel(name = "isettlequantity", width = 15)
    @ApiModelProperty(value = "isettlequantity")
	private java.math.BigDecimal isettlequantity;
	/**ibatch*/
	@Excel(name = "ibatch", width = 15)
    @ApiModelProperty(value = "ibatch")
	private java.lang.Integer ibatch;
	/**cbatch*/
	@Excel(name = "cbatch", width = 15)
    @ApiModelProperty(value = "cbatch")
	private java.lang.String cbatch;
	/**bsettleall*/
	@Excel(name = "bsettleall", width = 15)
    @ApiModelProperty(value = "bsettleall")
	private java.lang.Object bsettleall;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**cfree1*/
	@Excel(name = "cfree1", width = 15)
    @ApiModelProperty(value = "cfree1")
	private java.lang.String cfree1;
	/**cfree2*/
	@Excel(name = "cfree2", width = 15)
    @ApiModelProperty(value = "cfree2")
	private java.lang.String cfree2;
	/**itb*/
	@Excel(name = "itb", width = 15)
    @ApiModelProperty(value = "itb")
	private java.lang.Integer itb;
	/**dvdate*/
	@Excel(name = "dvdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvdate")
	private java.util.Date dvdate;
	/**tbquantity*/
	@Excel(name = "tbquantity", width = 15)
    @ApiModelProperty(value = "tbquantity")
	private java.math.BigDecimal tbquantity;
	/**tbnum*/
	@Excel(name = "tbnum", width = 15)
    @ApiModelProperty(value = "tbnum")
	private java.math.BigDecimal tbnum;
	/**isosid*/
	@Excel(name = "isosid", width = 15)
    @ApiModelProperty(value = "isosid")
	private java.lang.Integer isosid;
	/**idlsid*/
	@Excel(name = "idlsid", width = 15)
    @ApiModelProperty(value = "idlsid")
	private java.lang.Integer idlsid;
	/**kl*/
	@Excel(name = "kl", width = 15)
    @ApiModelProperty(value = "kl")
	private java.math.BigDecimal kl;
	/**kl2*/
	@Excel(name = "kl2", width = 15)
    @ApiModelProperty(value = "kl2")
	private java.math.BigDecimal kl2;
	/**cinvname*/
	@Excel(name = "cinvname", width = 15)
    @ApiModelProperty(value = "cinvname")
	private java.lang.String cinvname;
	/**itaxrate*/
	@Excel(name = "itaxrate", width = 15)
    @ApiModelProperty(value = "itaxrate")
	private java.math.BigDecimal itaxrate;
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
	/**foutquantity*/
	@Excel(name = "foutquantity", width = 15)
    @ApiModelProperty(value = "foutquantity")
	private java.math.BigDecimal foutquantity;
	/**foutnum*/
	@Excel(name = "foutnum", width = 15)
    @ApiModelProperty(value = "foutnum")
	private java.math.BigDecimal foutnum;
	/**citemcode*/
	@Excel(name = "citemcode", width = 15)
    @ApiModelProperty(value = "citemcode")
	private java.lang.String citemcode;
	/**citemClass*/
	@Excel(name = "citemClass", width = 15)
    @ApiModelProperty(value = "citemClass")
	private java.lang.String citemClass;
	/**fsalecost*/
	@Excel(name = "fsalecost", width = 15)
    @ApiModelProperty(value = "fsalecost")
	private java.math.BigDecimal fsalecost;
	/**fsaleprice*/
	@Excel(name = "fsaleprice", width = 15)
    @ApiModelProperty(value = "fsaleprice")
	private java.math.BigDecimal fsaleprice;
	/**cvenabbname*/
	@Excel(name = "cvenabbname", width = 15)
    @ApiModelProperty(value = "cvenabbname")
	private java.lang.String cvenabbname;
	/**citemname*/
	@Excel(name = "citemname", width = 15)
    @ApiModelProperty(value = "citemname")
	private java.lang.String citemname;
	/**citemCname*/
	@Excel(name = "citemCname", width = 15)
    @ApiModelProperty(value = "citemCname")
	private java.lang.String citemCname;
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
	/**bisstqc*/
	@Excel(name = "bisstqc", width = 15)
    @ApiModelProperty(value = "bisstqc")
	private java.lang.Object bisstqc;
	/**iinvexchrate*/
	@Excel(name = "iinvexchrate", width = 15)
    @ApiModelProperty(value = "iinvexchrate")
	private java.math.BigDecimal iinvexchrate;
	/**cunitid*/
	@Excel(name = "cunitid", width = 15)
    @ApiModelProperty(value = "cunitid")
	private java.lang.String cunitid;
	/**ccode*/
	@Excel(name = "ccode", width = 15)
    @ApiModelProperty(value = "ccode")
	private java.lang.String ccode;
	/**iretquantity*/
	@Excel(name = "iretquantity", width = 15)
    @ApiModelProperty(value = "iretquantity")
	private java.math.BigDecimal iretquantity;
	/**fensettlequan*/
	@Excel(name = "fensettlequan", width = 15)
    @ApiModelProperty(value = "fensettlequan")
	private java.math.BigDecimal fensettlequan;
	/**fensettlesum*/
	@Excel(name = "fensettlesum", width = 15)
    @ApiModelProperty(value = "fensettlesum")
	private java.lang.Object fensettlesum;
	/**isettleprice*/
	@Excel(name = "isettleprice", width = 15)
    @ApiModelProperty(value = "isettleprice")
	private java.math.BigDecimal isettleprice;
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
	/**dmdate*/
	@Excel(name = "dmdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmdate")
	private java.util.Date dmdate;
	/**bgsp*/
	@Excel(name = "bgsp", width = 15)
    @ApiModelProperty(value = "bgsp")
	private java.lang.Object bgsp;
	/**cgspstate*/
	@Excel(name = "cgspstate", width = 15)
    @ApiModelProperty(value = "cgspstate")
	private java.lang.String cgspstate;
	/**csocode*/
	@Excel(name = "csocode", width = 15)
    @ApiModelProperty(value = "csocode")
	private java.lang.String csocode;
	/**ccorcode*/
	@Excel(name = "ccorcode", width = 15)
    @ApiModelProperty(value = "ccorcode")
	private java.lang.String ccorcode;
	/**ippartseqid*/
	@Excel(name = "ippartseqid", width = 15)
    @ApiModelProperty(value = "ippartseqid")
	private java.lang.Integer ippartseqid;
	/**ippartid*/
	@Excel(name = "ippartid", width = 15)
    @ApiModelProperty(value = "ippartid")
	private java.lang.Integer ippartid;
	/**ippartqty*/
	@Excel(name = "ippartqty", width = 15)
    @ApiModelProperty(value = "ippartqty")
	private java.math.BigDecimal ippartqty;
	/**ccontractid*/
	@Excel(name = "ccontractid", width = 15)
    @ApiModelProperty(value = "ccontractid")
	private java.lang.String ccontractid;
	/**ccontracttagcode*/
	@Excel(name = "ccontracttagcode", width = 15)
    @ApiModelProperty(value = "ccontracttagcode")
	private java.lang.String ccontracttagcode;
	/**ccontractrowguid*/
	@Excel(name = "ccontractrowguid", width = 15)
    @ApiModelProperty(value = "ccontractrowguid")
	private java.lang.Object ccontractrowguid;
	/**imassdate*/
	@Excel(name = "imassdate", width = 15)
    @ApiModelProperty(value = "imassdate")
	private java.lang.Integer imassdate;
	/**cmassunit*/
	@Excel(name = "cmassunit", width = 15)
    @ApiModelProperty(value = "cmassunit")
	private java.lang.Integer cmassunit;
	/**bqaneedcheck*/
	@Excel(name = "bqaneedcheck", width = 15)
    @ApiModelProperty(value = "bqaneedcheck")
	private java.lang.Object bqaneedcheck;
	/**bqaurgency*/
	@Excel(name = "bqaurgency", width = 15)
    @ApiModelProperty(value = "bqaurgency")
	private java.lang.Object bqaurgency;
	/**bqachecking*/
	@Excel(name = "bqachecking", width = 15)
    @ApiModelProperty(value = "bqachecking")
	private java.lang.Object bqachecking;
	/**bqachecked*/
	@Excel(name = "bqachecked", width = 15)
    @ApiModelProperty(value = "bqachecked")
	private java.lang.Object bqachecked;
	/**iqaquantity*/
	@Excel(name = "iqaquantity", width = 15)
    @ApiModelProperty(value = "iqaquantity")
	private java.math.BigDecimal iqaquantity;
	/**iqanum*/
	@Excel(name = "iqanum", width = 15)
    @ApiModelProperty(value = "iqanum")
	private java.math.BigDecimal iqanum;
	/**ccusinvcode*/
	@Excel(name = "ccusinvcode", width = 15)
    @ApiModelProperty(value = "ccusinvcode")
	private java.lang.String ccusinvcode;
	/**ccusinvname*/
	@Excel(name = "ccusinvname", width = 15)
    @ApiModelProperty(value = "ccusinvname")
	private java.lang.String ccusinvname;
	/**fsumsignquantity*/
	@Excel(name = "fsumsignquantity", width = 15)
    @ApiModelProperty(value = "fsumsignquantity")
	private java.math.BigDecimal fsumsignquantity;
	/**fsumsignnum*/
	@Excel(name = "fsumsignnum", width = 15)
    @ApiModelProperty(value = "fsumsignnum")
	private java.math.BigDecimal fsumsignnum;
	/**cbaccounter*/
	@Excel(name = "cbaccounter", width = 15)
    @ApiModelProperty(value = "cbaccounter")
	private java.lang.String cbaccounter;
	/**bcosting*/
	@Excel(name = "bcosting", width = 15)
    @ApiModelProperty(value = "bcosting")
	private java.lang.Object bcosting;
	/**cordercode*/
	@Excel(name = "cordercode", width = 15)
    @ApiModelProperty(value = "cordercode")
	private java.lang.String cordercode;
	/**iorderrowno*/
	@Excel(name = "iorderrowno", width = 15)
    @ApiModelProperty(value = "iorderrowno")
	private java.lang.Integer iorderrowno;
	/**fcusminprice*/
	@Excel(name = "fcusminprice", width = 15)
    @ApiModelProperty(value = "fcusminprice")
	private java.math.BigDecimal fcusminprice;
	/**icostquantity*/
	@Excel(name = "icostquantity", width = 15)
    @ApiModelProperty(value = "icostquantity")
	private java.math.BigDecimal icostquantity;
	/**icostsum*/
	@Excel(name = "icostsum", width = 15)
    @ApiModelProperty(value = "icostsum")
	private java.lang.Object icostsum;
	/**ispecialtype*/
	@Excel(name = "ispecialtype", width = 15)
    @ApiModelProperty(value = "ispecialtype")
	private java.lang.Integer ispecialtype;
	/**cvmivencode*/
	@Excel(name = "cvmivencode", width = 15)
    @ApiModelProperty(value = "cvmivencode")
	private java.lang.String cvmivencode;
	/**iexchsum*/
	@Excel(name = "iexchsum", width = 15)
    @ApiModelProperty(value = "iexchsum")
	private java.lang.Object iexchsum;
	/**imoneysum*/
	@Excel(name = "imoneysum", width = 15)
    @ApiModelProperty(value = "imoneysum")
	private java.lang.Object imoneysum;
	/**irowno*/
	@Excel(name = "irowno", width = 15)
    @ApiModelProperty(value = "irowno")
	private java.lang.Integer irowno;
	/**frettbquantity*/
	@Excel(name = "frettbquantity", width = 15)
    @ApiModelProperty(value = "frettbquantity")
	private java.math.BigDecimal frettbquantity;
	/**fretsum*/
	@Excel(name = "fretsum", width = 15)
    @ApiModelProperty(value = "fretsum")
	private java.math.BigDecimal fretsum;
	/**iexpiratdatecalcu*/
	@Excel(name = "iexpiratdatecalcu", width = 15)
    @ApiModelProperty(value = "iexpiratdatecalcu")
	private java.lang.Integer iexpiratdatecalcu;
	/**dexpirationdate*/
	@Excel(name = "dexpirationdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dexpirationdate")
	private java.util.Date dexpirationdate;
	/**cexpirationdate*/
	@Excel(name = "cexpirationdate", width = 15)
    @ApiModelProperty(value = "cexpirationdate")
	private java.lang.String cexpirationdate;
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
	/**dblpreexchmomey*/
	@Excel(name = "dblpreexchmomey", width = 15)
    @ApiModelProperty(value = "dblpreexchmomey")
	private java.math.BigDecimal dblpreexchmomey;
	/**dblpremomey*/
	@Excel(name = "dblpremomey", width = 15)
    @ApiModelProperty(value = "dblpremomey")
	private java.math.BigDecimal dblpremomey;
	/**idemandtype*/
	@Excel(name = "idemandtype", width = 15)
    @ApiModelProperty(value = "idemandtype")
	private java.lang.Integer idemandtype;
	/**cdemandcode*/
	@Excel(name = "cdemandcode", width = 15)
    @ApiModelProperty(value = "cdemandcode")
	private java.lang.String cdemandcode;
	/**cdemandmemo*/
	@Excel(name = "cdemandmemo", width = 15)
    @ApiModelProperty(value = "cdemandmemo")
	private java.lang.String cdemandmemo;
	/**cdemandid*/
	@Excel(name = "cdemandid", width = 15)
    @ApiModelProperty(value = "cdemandid")
	private java.lang.String cdemandid;
	/**idemandseq*/
	@Excel(name = "idemandseq", width = 15)
    @ApiModelProperty(value = "idemandseq")
	private java.lang.Integer idemandseq;
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**creasoncode*/
	@Excel(name = "creasoncode", width = 15)
    @ApiModelProperty(value = "creasoncode")
	private java.lang.String creasoncode;
	/**cinvsn*/
	@Excel(name = "cinvsn", width = 15)
    @ApiModelProperty(value = "cinvsn")
	private java.lang.String cinvsn;
	/**iinvsncount*/
	@Excel(name = "iinvsncount", width = 15)
    @ApiModelProperty(value = "iinvsncount")
	private java.lang.Integer iinvsncount;
	/**bneedsign*/
	@Excel(name = "bneedsign", width = 15)
    @ApiModelProperty(value = "bneedsign")
	private java.lang.Object bneedsign;
	/**bsignover*/
	@Excel(name = "bsignover", width = 15)
    @ApiModelProperty(value = "bsignover")
	private java.lang.Object bsignover;
	/**bneedloss*/
	@Excel(name = "bneedloss", width = 15)
    @ApiModelProperty(value = "bneedloss")
	private java.lang.Object bneedloss;
	/**flossrate*/
	@Excel(name = "flossrate", width = 15)
    @ApiModelProperty(value = "flossrate")
	private java.math.BigDecimal flossrate;
	/**frlossqty*/
	@Excel(name = "frlossqty", width = 15)
    @ApiModelProperty(value = "frlossqty")
	private java.math.BigDecimal frlossqty;
	/**fulossqty*/
	@Excel(name = "fulossqty", width = 15)
    @ApiModelProperty(value = "fulossqty")
	private java.math.BigDecimal fulossqty;
	/**isettletype*/
	@Excel(name = "isettletype", width = 15)
    @ApiModelProperty(value = "isettletype")
	private java.lang.Integer isettletype;
	/**crelacuscode*/
	@Excel(name = "crelacuscode", width = 15)
    @ApiModelProperty(value = "crelacuscode")
	private java.lang.String crelacuscode;
	/**clossmaker*/
	@Excel(name = "clossmaker", width = 15)
    @ApiModelProperty(value = "clossmaker")
	private java.lang.String clossmaker;
	/**dlossdate*/
	@Excel(name = "dlossdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlossdate")
	private java.util.Date dlossdate;
	/**dlosstime*/
	@Excel(name = "dlosstime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlosstime")
	private java.util.Date dlosstime;
	/**icoridlsid*/
	@Excel(name = "icoridlsid", width = 15)
    @ApiModelProperty(value = "icoridlsid")
	private java.lang.Integer icoridlsid;
	/**fretoutqty*/
	@Excel(name = "fretoutqty", width = 15)
    @ApiModelProperty(value = "fretoutqty")
	private java.math.BigDecimal fretoutqty;
	/**bodyOutid*/
	@Excel(name = "bodyOutid", width = 15)
    @ApiModelProperty(value = "bodyOutid")
	private java.lang.Object bodyOutid;
	/**fveribillqty*/
	@Excel(name = "fveribillqty", width = 15)
    @ApiModelProperty(value = "fveribillqty")
	private java.math.BigDecimal fveribillqty;
	/**fveribillsum*/
	@Excel(name = "fveribillsum", width = 15)
    @ApiModelProperty(value = "fveribillsum")
	private java.lang.Object fveribillsum;
	/**fveriretqty*/
	@Excel(name = "fveriretqty", width = 15)
    @ApiModelProperty(value = "fveriretqty")
	private java.math.BigDecimal fveriretqty;
	/**fveriretsum*/
	@Excel(name = "fveriretsum", width = 15)
    @ApiModelProperty(value = "fveriretsum")
	private java.lang.Object fveriretsum;
	/**flastsettleqty*/
	@Excel(name = "flastsettleqty", width = 15)
    @ApiModelProperty(value = "flastsettleqty")
	private java.math.BigDecimal flastsettleqty;
	/**flastsettlesum*/
	@Excel(name = "flastsettlesum", width = 15)
    @ApiModelProperty(value = "flastsettlesum")
	private java.lang.Object flastsettlesum;
	/**cbookwhcode*/
	@Excel(name = "cbookwhcode", width = 15)
    @ApiModelProperty(value = "cbookwhcode")
	private java.lang.String cbookwhcode;
	/**cinvouchtype*/
	@Excel(name = "cinvouchtype", width = 15)
    @ApiModelProperty(value = "cinvouchtype")
	private java.lang.String cinvouchtype;
	/**cposition*/
	@Excel(name = "cposition", width = 15)
    @ApiModelProperty(value = "cposition")
	private java.lang.String cposition;
	/**fretqtywkp*/
	@Excel(name = "fretqtywkp", width = 15)
    @ApiModelProperty(value = "fretqtywkp")
	private java.math.BigDecimal fretqtywkp;
	/**fretqtyykp*/
	@Excel(name = "fretqtyykp", width = 15)
    @ApiModelProperty(value = "fretqtyykp")
	private java.math.BigDecimal fretqtyykp;
	/**frettbqtyykp*/
	@Excel(name = "frettbqtyykp", width = 15)
    @ApiModelProperty(value = "frettbqtyykp")
	private java.math.BigDecimal frettbqtyykp;
	/**fretsumykp*/
	@Excel(name = "fretsumykp", width = 15)
    @ApiModelProperty(value = "fretsumykp")
	private java.math.BigDecimal fretsumykp;
	/**dkeepdate*/
	@Excel(name = "dkeepdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dkeepdate")
	private java.util.Date dkeepdate;
	/**cscloser*/
	@Excel(name = "cscloser", width = 15)
    @ApiModelProperty(value = "cscloser")
	private java.lang.String cscloser;
	/**isaleoutid*/
	@Excel(name = "isaleoutid", width = 15)
    @ApiModelProperty(value = "isaleoutid")
	private java.lang.Integer isaleoutid;
	/**bsaleprice*/
	@Excel(name = "bsaleprice", width = 15)
    @ApiModelProperty(value = "bsaleprice")
	private java.lang.Object bsaleprice;
	/**bgift*/
	@Excel(name = "bgift", width = 15)
    @ApiModelProperty(value = "bgift")
	private java.lang.Object bgift;
	/**bmpforderclosed*/
	@Excel(name = "bmpforderclosed", width = 15)
    @ApiModelProperty(value = "bmpforderclosed")
	private java.lang.Object bmpforderclosed;
	/**cbsysbarcode*/
	@Excel(name = "cbsysbarcode", width = 15)
    @ApiModelProperty(value = "cbsysbarcode")
	private java.lang.String cbsysbarcode;
	/**fxjquantity*/
	@Excel(name = "fxjquantity", width = 15)
    @ApiModelProperty(value = "fxjquantity")
	private java.lang.Float fxjquantity;
	/**fxjnum*/
	@Excel(name = "fxjnum", width = 15)
    @ApiModelProperty(value = "fxjnum")
	private java.lang.Float fxjnum;
	/**biacreatebill*/
	@Excel(name = "biacreatebill", width = 15)
    @ApiModelProperty(value = "biacreatebill")
	private java.lang.Object biacreatebill;
	/**cparentcode*/
	@Excel(name = "cparentcode", width = 15)
    @ApiModelProperty(value = "cparentcode")
	private java.lang.String cparentcode;
	/**cchildcode*/
	@Excel(name = "cchildcode", width = 15)
    @ApiModelProperty(value = "cchildcode")
	private java.lang.String cchildcode;
	/**fchildqty*/
	@Excel(name = "fchildqty", width = 15)
    @ApiModelProperty(value = "fchildqty")
	private java.math.BigDecimal fchildqty;
	/**fchildrate*/
	@Excel(name = "fchildrate", width = 15)
    @ApiModelProperty(value = "fchildrate")
	private java.math.BigDecimal fchildrate;
	/**icalctype*/
	@Excel(name = "icalctype", width = 15)
    @ApiModelProperty(value = "icalctype")
	private java.lang.Integer icalctype;
	/**fappretwkpqty*/
	@Excel(name = "fappretwkpqty", width = 15)
    @ApiModelProperty(value = "fappretwkpqty")
	private java.math.BigDecimal fappretwkpqty;
	/**fappretwkpsum*/
	@Excel(name = "fappretwkpsum", width = 15)
    @ApiModelProperty(value = "fappretwkpsum")
	private java.math.BigDecimal fappretwkpsum;
	/**fappretykpqty*/
	@Excel(name = "fappretykpqty", width = 15)
    @ApiModelProperty(value = "fappretykpqty")
	private java.math.BigDecimal fappretykpqty;
	/**fappretykpsum*/
	@Excel(name = "fappretykpsum", width = 15)
    @ApiModelProperty(value = "fappretykpsum")
	private java.math.BigDecimal fappretykpsum;
	/**fappretwkptbqty*/
	@Excel(name = "fappretwkptbqty", width = 15)
    @ApiModelProperty(value = "fappretwkptbqty")
	private java.math.BigDecimal fappretwkptbqty;
	/**fappretykptbqty*/
	@Excel(name = "fappretykptbqty", width = 15)
    @ApiModelProperty(value = "fappretykptbqty")
	private java.math.BigDecimal fappretykptbqty;
	/**irtnappid*/
	@Excel(name = "irtnappid", width = 15)
    @ApiModelProperty(value = "irtnappid")
	private java.lang.Integer irtnappid;
	/**crtnappcode*/
	@Excel(name = "crtnappcode", width = 15)
    @ApiModelProperty(value = "crtnappcode")
	private java.lang.String crtnappcode;
	/**fretailrealamount*/
	@Excel(name = "fretailrealamount", width = 15)
    @ApiModelProperty(value = "fretailrealamount")
	private java.math.BigDecimal fretailrealamount;
	/**fretailsettleamount*/
	@Excel(name = "fretailsettleamount", width = 15)
    @ApiModelProperty(value = "fretailsettleamount")
	private java.math.BigDecimal fretailsettleamount;
	/**cfactorycode*/
	@Excel(name = "cfactorycode", width = 15)
    @ApiModelProperty(value = "cfactorycode")
	private java.lang.String cfactorycode;
	/**gcsourceid*/
	@Excel(name = "gcsourceid", width = 15)
    @ApiModelProperty(value = "gcsourceid")
	private java.lang.Integer gcsourceid;
	/**gcsourceids*/
	@Excel(name = "gcsourceids", width = 15)
    @ApiModelProperty(value = "gcsourceids")
	private java.lang.Integer gcsourceids;
}
