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
 * @Description: 采购订单辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@Data
@TableName("PO_Podetails")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PO_Podetails对象", description="采购订单辅表")
public class PoPodetails {
    
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**cpoid*/
	@Excel(name = "cpoid", width = 15)
    @ApiModelProperty(value = "cpoid")
	private java.lang.String cpoid;
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
	/**darrivedate*/
	@Excel(name = "darrivedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "darrivedate")
	private java.util.Date darrivedate;
	/**ireceivedqty*/
	@Excel(name = "ireceivedqty", width = 15)
    @ApiModelProperty(value = "ireceivedqty")
	private java.math.BigDecimal ireceivedqty;
	/**ireceivednum*/
	@Excel(name = "ireceivednum", width = 15)
    @ApiModelProperty(value = "ireceivednum")
	private java.math.BigDecimal ireceivednum;
	/**ireceivedmoney*/
	@Excel(name = "ireceivedmoney", width = 15)
    @ApiModelProperty(value = "ireceivedmoney")
	private java.lang.Object ireceivedmoney;
	/**iinvqty*/
	@Excel(name = "iinvqty", width = 15)
    @ApiModelProperty(value = "iinvqty")
	private java.math.BigDecimal iinvqty;
	/**iinvnum*/
	@Excel(name = "iinvnum", width = 15)
    @ApiModelProperty(value = "iinvnum")
	private java.math.BigDecimal iinvnum;
	/**iinvmoney*/
	@Excel(name = "iinvmoney", width = 15)
    @ApiModelProperty(value = "iinvmoney")
	private java.lang.Object iinvmoney;
	/**cfree1*/
	@Excel(name = "cfree1", width = 15)
    @ApiModelProperty(value = "cfree1")
	private java.lang.String cfree1;
	/**cfree2*/
	@Excel(name = "cfree2", width = 15)
    @ApiModelProperty(value = "cfree2")
	private java.lang.String cfree2;
	/**inatinvmoney*/
	@Excel(name = "inatinvmoney", width = 15)
    @ApiModelProperty(value = "inatinvmoney")
	private java.lang.Object inatinvmoney;
	/**ioritotal*/
	@Excel(name = "ioritotal", width = 15)
    @ApiModelProperty(value = "ioritotal")
	private java.lang.Object ioritotal;
	/**itotal*/
	@Excel(name = "itotal", width = 15)
    @ApiModelProperty(value = "itotal")
	private java.lang.Object itotal;
	/**ipertaxrate*/
	@Excel(name = "ipertaxrate", width = 15)
    @ApiModelProperty(value = "ipertaxrate")
	private java.math.BigDecimal ipertaxrate;
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
	/**iflag*/
	@Excel(name = "iflag", width = 15)
    @ApiModelProperty(value = "iflag")
	private java.lang.Integer iflag;
	/**citemcode*/
	@Excel(name = "citemcode", width = 15)
    @ApiModelProperty(value = "citemcode")
	private java.lang.String citemcode;
	/**citemClass*/
	@Excel(name = "citemClass", width = 15)
    @ApiModelProperty(value = "citemClass")
	private java.lang.String citemClass;
	/**ppcids*/
	@Excel(name = "ppcids", width = 15)
    @ApiModelProperty(value = "ppcids")
	private java.lang.Integer ppcids;
	/**citemname*/
	@Excel(name = "citemname", width = 15)
    @ApiModelProperty(value = "citemname")
	private java.lang.String citemname;
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
	/**bgsp*/
	@Excel(name = "bgsp", width = 15)
    @ApiModelProperty(value = "bgsp")
	private java.lang.Integer bgsp;
	/**poid*/
	@Excel(name = "poid", width = 15)
    @ApiModelProperty(value = "poid")
	private java.lang.Integer poid;
	/**cunitid*/
	@Excel(name = "cunitid", width = 15)
    @ApiModelProperty(value = "cunitid")
	private java.lang.String cunitid;
	/**itaxprice*/
	@Excel(name = "itaxprice", width = 15)
    @ApiModelProperty(value = "itaxprice")
	private java.math.BigDecimal itaxprice;
	/**iarrqty*/
	@Excel(name = "iarrqty", width = 15)
    @ApiModelProperty(value = "iarrqty")
	private java.math.BigDecimal iarrqty;
	/**iarrnum*/
	@Excel(name = "iarrnum", width = 15)
    @ApiModelProperty(value = "iarrnum")
	private java.math.BigDecimal iarrnum;
	/**iarrmoney*/
	@Excel(name = "iarrmoney", width = 15)
    @ApiModelProperty(value = "iarrmoney")
	private java.lang.Object iarrmoney;
	/**inatarrmoney*/
	@Excel(name = "inatarrmoney", width = 15)
    @ApiModelProperty(value = "inatarrmoney")
	private java.lang.Object inatarrmoney;
	/**iappids*/
	@Excel(name = "iappids", width = 15)
    @ApiModelProperty(value = "iappids")
	private java.lang.Integer iappids;
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
	/**isosid*/
	@Excel(name = "isosid", width = 15)
    @ApiModelProperty(value = "isosid")
	private java.lang.Integer isosid;
	/**btaxcost*/
	@Excel(name = "btaxcost", width = 15)
    @ApiModelProperty(value = "btaxcost")
	private java.lang.Object btaxcost;
	/**csource*/
	@Excel(name = "csource", width = 15)
    @ApiModelProperty(value = "csource")
	private java.lang.String csource;
	/**cbcloser*/
	@Excel(name = "cbcloser", width = 15)
    @ApiModelProperty(value = "cbcloser")
	private java.lang.String cbcloser;
	/**ippartid*/
	@Excel(name = "ippartid", width = 15)
    @ApiModelProperty(value = "ippartid")
	private java.lang.Integer ippartid;
	/**ipquantity*/
	@Excel(name = "ipquantity", width = 15)
    @ApiModelProperty(value = "ipquantity")
	private java.math.BigDecimal ipquantity;
	/**iptoseq*/
	@Excel(name = "iptoseq", width = 15)
    @ApiModelProperty(value = "iptoseq")
	private java.lang.Integer iptoseq;
	/**sotype*/
	@Excel(name = "sotype", width = 15)
    @ApiModelProperty(value = "sotype")
	private java.lang.Integer sotype;
	/**sodid*/
	@Excel(name = "sodid", width = 15)
    @ApiModelProperty(value = "sodid")
	private java.lang.String sodid;
	/**contractrowguid*/
	@Excel(name = "contractrowguid", width = 15)
    @ApiModelProperty(value = "contractrowguid")
	private java.lang.Object contractrowguid;
	/**cupsocode*/
	@Excel(name = "cupsocode", width = 15)
    @ApiModelProperty(value = "cupsocode")
	private java.lang.String cupsocode;
	/**iinvmpcost*/
	@Excel(name = "iinvmpcost", width = 15)
    @ApiModelProperty(value = "iinvmpcost")
	private java.math.BigDecimal iinvmpcost;
	/**contractcode*/
	@Excel(name = "contractcode", width = 15)
    @ApiModelProperty(value = "contractcode")
	private java.lang.String contractcode;
	/**contractrowno*/
	@Excel(name = "contractrowno", width = 15)
    @ApiModelProperty(value = "contractrowno")
	private java.lang.String contractrowno;
	/**fpovalidquantity*/
	@Excel(name = "fpovalidquantity", width = 15)
    @ApiModelProperty(value = "fpovalidquantity")
	private java.math.BigDecimal fpovalidquantity;
	/**fpovalidnum*/
	@Excel(name = "fpovalidnum", width = 15)
    @ApiModelProperty(value = "fpovalidnum")
	private java.math.BigDecimal fpovalidnum;
	/**fpoarrquantity*/
	@Excel(name = "fpoarrquantity", width = 15)
    @ApiModelProperty(value = "fpoarrquantity")
	private java.math.BigDecimal fpoarrquantity;
	/**fpoarrnum*/
	@Excel(name = "fpoarrnum", width = 15)
    @ApiModelProperty(value = "fpoarrnum")
	private java.math.BigDecimal fpoarrnum;
	/**fporetquantity*/
	@Excel(name = "fporetquantity", width = 15)
    @ApiModelProperty(value = "fporetquantity")
	private java.math.BigDecimal fporetquantity;
	/**fporetnum*/
	@Excel(name = "fporetnum", width = 15)
    @ApiModelProperty(value = "fporetnum")
	private java.math.BigDecimal fporetnum;
	/**fporefusequantity*/
	@Excel(name = "fporefusequantity", width = 15)
    @ApiModelProperty(value = "fporefusequantity")
	private java.math.BigDecimal fporefusequantity;
	/**fporefusenum*/
	@Excel(name = "fporefusenum", width = 15)
    @ApiModelProperty(value = "fporefusenum")
	private java.math.BigDecimal fporefusenum;
	/**dufts*/
    @ApiModelProperty(value = "dufts")
	private java.util.Date dufts;
	/**iorderdid*/
	@Excel(name = "iorderdid", width = 15)
    @ApiModelProperty(value = "iorderdid")
	private java.lang.Integer iorderdid;
	/**iordertype*/
	@Excel(name = "iordertype", width = 15)
    @ApiModelProperty(value = "iordertype")
	private java.lang.Integer iordertype;
	/**csoordercode*/
	@Excel(name = "csoordercode", width = 15)
    @ApiModelProperty(value = "csoordercode")
	private java.lang.String csoordercode;
	/**iorderseq*/
	@Excel(name = "iorderseq", width = 15)
    @ApiModelProperty(value = "iorderseq")
	private java.lang.Integer iorderseq;
	/**cbclosetime*/
	@Excel(name = "cbclosetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cbclosetime")
	private java.util.Date cbclosetime;
	/**cbclosedate*/
	@Excel(name = "cbclosedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cbclosedate")
	private java.util.Date cbclosedate;
	/**cbgItemcode*/
	@Excel(name = "cbgItemcode", width = 15)
    @ApiModelProperty(value = "cbgItemcode")
	private java.lang.String cbgItemcode;
	/**cbgItemname*/
	@Excel(name = "cbgItemname", width = 15)
    @ApiModelProperty(value = "cbgItemname")
	private java.lang.String cbgItemname;
	/**cbgCaliberkey1*/
	@Excel(name = "cbgCaliberkey1", width = 15)
    @ApiModelProperty(value = "cbgCaliberkey1")
	private java.lang.String cbgCaliberkey1;
	/**cbgCaliberkeyname1*/
	@Excel(name = "cbgCaliberkeyname1", width = 15)
    @ApiModelProperty(value = "cbgCaliberkeyname1")
	private java.lang.String cbgCaliberkeyname1;
	/**cbgCaliberkey2*/
	@Excel(name = "cbgCaliberkey2", width = 15)
    @ApiModelProperty(value = "cbgCaliberkey2")
	private java.lang.String cbgCaliberkey2;
	/**cbgCaliberkeyname2*/
	@Excel(name = "cbgCaliberkeyname2", width = 15)
    @ApiModelProperty(value = "cbgCaliberkeyname2")
	private java.lang.String cbgCaliberkeyname2;
	/**cbgCaliberkey3*/
	@Excel(name = "cbgCaliberkey3", width = 15)
    @ApiModelProperty(value = "cbgCaliberkey3")
	private java.lang.String cbgCaliberkey3;
	/**cbgCaliberkeyname3*/
	@Excel(name = "cbgCaliberkeyname3", width = 15)
    @ApiModelProperty(value = "cbgCaliberkeyname3")
	private java.lang.String cbgCaliberkeyname3;
	/**cbgCalibercode1*/
	@Excel(name = "cbgCalibercode1", width = 15)
    @ApiModelProperty(value = "cbgCalibercode1")
	private java.lang.String cbgCalibercode1;
	/**cbgCalibername1*/
	@Excel(name = "cbgCalibername1", width = 15)
    @ApiModelProperty(value = "cbgCalibername1")
	private java.lang.String cbgCalibername1;
	/**cbgCalibercode2*/
	@Excel(name = "cbgCalibercode2", width = 15)
    @ApiModelProperty(value = "cbgCalibercode2")
	private java.lang.String cbgCalibercode2;
	/**cbgCalibername2*/
	@Excel(name = "cbgCalibername2", width = 15)
    @ApiModelProperty(value = "cbgCalibername2")
	private java.lang.String cbgCalibername2;
	/**cbgCalibercode3*/
	@Excel(name = "cbgCalibercode3", width = 15)
    @ApiModelProperty(value = "cbgCalibercode3")
	private java.lang.String cbgCalibercode3;
	/**cbgCalibername3*/
	@Excel(name = "cbgCalibername3", width = 15)
    @ApiModelProperty(value = "cbgCalibername3")
	private java.lang.String cbgCalibername3;
	/**ibgCtrl*/
	@Excel(name = "ibgCtrl", width = 15)
    @ApiModelProperty(value = "ibgCtrl")
	private java.lang.Integer ibgCtrl;
	/**cbgAuditopinion*/
	@Excel(name = "cbgAuditopinion", width = 15)
    @ApiModelProperty(value = "cbgAuditopinion")
	private java.lang.String cbgAuditopinion;
	/**fexquantity*/
	@Excel(name = "fexquantity", width = 15)
    @ApiModelProperty(value = "fexquantity")
	private java.math.BigDecimal fexquantity;
	/**fexnum*/
	@Excel(name = "fexnum", width = 15)
    @ApiModelProperty(value = "fexnum")
	private java.math.BigDecimal fexnum;
	/**ivouchrowno*/
	@Excel(name = "ivouchrowno", width = 15)
    @ApiModelProperty(value = "ivouchrowno")
	private java.lang.Integer ivouchrowno;
	/**cbgCaliberkey4*/
	@Excel(name = "cbgCaliberkey4", width = 15)
    @ApiModelProperty(value = "cbgCaliberkey4")
	private java.lang.String cbgCaliberkey4;
	/**cbgCaliberkeyname4*/
	@Excel(name = "cbgCaliberkeyname4", width = 15)
    @ApiModelProperty(value = "cbgCaliberkeyname4")
	private java.lang.String cbgCaliberkeyname4;
	/**cbgCaliberkey5*/
	@Excel(name = "cbgCaliberkey5", width = 15)
    @ApiModelProperty(value = "cbgCaliberkey5")
	private java.lang.String cbgCaliberkey5;
	/**cbgCaliberkeyname5*/
	@Excel(name = "cbgCaliberkeyname5", width = 15)
    @ApiModelProperty(value = "cbgCaliberkeyname5")
	private java.lang.String cbgCaliberkeyname5;
	/**cbgCaliberkey6*/
	@Excel(name = "cbgCaliberkey6", width = 15)
    @ApiModelProperty(value = "cbgCaliberkey6")
	private java.lang.String cbgCaliberkey6;
	/**cbgCaliberkeyname6*/
	@Excel(name = "cbgCaliberkeyname6", width = 15)
    @ApiModelProperty(value = "cbgCaliberkeyname6")
	private java.lang.String cbgCaliberkeyname6;
	/**cbgCalibercode4*/
	@Excel(name = "cbgCalibercode4", width = 15)
    @ApiModelProperty(value = "cbgCalibercode4")
	private java.lang.String cbgCalibercode4;
	/**cbgCalibername4*/
	@Excel(name = "cbgCalibername4", width = 15)
    @ApiModelProperty(value = "cbgCalibername4")
	private java.lang.String cbgCalibername4;
	/**cbgCalibercode5*/
	@Excel(name = "cbgCalibercode5", width = 15)
    @ApiModelProperty(value = "cbgCalibercode5")
	private java.lang.String cbgCalibercode5;
	/**cbgCalibername5*/
	@Excel(name = "cbgCalibername5", width = 15)
    @ApiModelProperty(value = "cbgCalibername5")
	private java.lang.String cbgCalibername5;
	/**cbgCalibercode6*/
	@Excel(name = "cbgCalibercode6", width = 15)
    @ApiModelProperty(value = "cbgCalibercode6")
	private java.lang.String cbgCalibercode6;
	/**cbgCalibername6*/
	@Excel(name = "cbgCalibername6", width = 15)
    @ApiModelProperty(value = "cbgCalibername6")
	private java.lang.String cbgCalibername6;
	/**csocode*/
	@Excel(name = "csocode", width = 15)
    @ApiModelProperty(value = "csocode")
	private java.lang.String csocode;
	/**irowno*/
	@Excel(name = "irowno", width = 15)
    @ApiModelProperty(value = "irowno")
	private java.lang.Integer irowno;
	/**freceivedqty*/
	@Excel(name = "freceivedqty", width = 15)
    @ApiModelProperty(value = "freceivedqty")
	private java.math.BigDecimal freceivedqty;
	/**freceivednum*/
	@Excel(name = "freceivednum", width = 15)
    @ApiModelProperty(value = "freceivednum")
	private java.math.BigDecimal freceivednum;
	/**cxjspdids*/
	@Excel(name = "cxjspdids", width = 15)
    @ApiModelProperty(value = "cxjspdids")
	private java.lang.String cxjspdids;
	/**cbmemo*/
	@Excel(name = "cbmemo", width = 15)
    @ApiModelProperty(value = "cbmemo")
	private java.lang.String cbmemo;
	/**cbsysbarcode*/
	@Excel(name = "cbsysbarcode", width = 15)
    @ApiModelProperty(value = "cbsysbarcode")
	private java.lang.String cbsysbarcode;
	/**planlotnumber*/
	@Excel(name = "planlotnumber", width = 15)
    @ApiModelProperty(value = "planlotnumber")
	private java.lang.String planlotnumber;
	/**bgift*/
	@Excel(name = "bgift", width = 15)
    @ApiModelProperty(value = "bgift")
	private java.lang.Integer bgift;
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
	/**gcupcardnum*/
	@Excel(name = "gcupcardnum", width = 15)
    @ApiModelProperty(value = "gcupcardnum")
	private java.lang.String gcupcardnum;
	/**gcupid*/
	@Excel(name = "gcupid", width = 15)
    @ApiModelProperty(value = "gcupid")
	private java.lang.Integer gcupid;
	/**gcupids*/
	@Excel(name = "gcupids", width = 15)
    @ApiModelProperty(value = "gcupids")
	private java.lang.Integer gcupids;
	/**yycInvname*/
	@Excel(name = "yycInvname", width = 15)
    @ApiModelProperty(value = "yycInvname")
	private java.lang.String yycInvname;
	/**clsbwhcode*/
	@Excel(name = "clsbwhcode", width = 15)
    @ApiModelProperty(value = "clsbwhcode")
	private java.lang.String clsbwhcode;
	/**csyssourceautoid*/
	@Excel(name = "csyssourceautoid", width = 15)
    @ApiModelProperty(value = "csyssourceautoid")
	private java.lang.String csyssourceautoid;
}
