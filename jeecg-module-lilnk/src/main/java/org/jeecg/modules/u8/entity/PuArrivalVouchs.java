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
 * @Description: 采购到货退货辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
@Data
@TableName("PU_ArrivalVouchs")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PU_ArrivalVouchs对象", description="采购到货退货辅表")
public class PuArrivalVouchs {
    
	/**autoid*/
	@Excel(name = "autoid", width = 15)
    @ApiModelProperty(value = "autoid")
	private java.lang.Integer autoid;
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**cwhcode*/
	@Excel(name = "cwhcode", width = 15)
    @ApiModelProperty(value = "cwhcode")
	private java.lang.String cwhcode;
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
	/**ioricost*/
	@Excel(name = "ioricost", width = 15)
    @ApiModelProperty(value = "ioricost")
	private java.math.BigDecimal ioricost;
	/**ioritaxcost*/
	@Excel(name = "ioritaxcost", width = 15)
    @ApiModelProperty(value = "ioritaxcost")
	private java.math.BigDecimal ioritaxcost;
	/**iorimoney*/
	@Excel(name = "iorimoney", width = 15)
    @ApiModelProperty(value = "iorimoney")
	private java.lang.Object iorimoney;
	/**ioritaxprice*/
	@Excel(name = "ioritaxprice", width = 15)
    @ApiModelProperty(value = "ioritaxprice")
	private java.lang.Object ioritaxprice;
	/**iorisum*/
	@Excel(name = "iorisum", width = 15)
    @ApiModelProperty(value = "iorisum")
	private java.lang.Object iorisum;
	/**icost*/
	@Excel(name = "icost", width = 15)
    @ApiModelProperty(value = "icost")
	private java.math.BigDecimal icost;
	/**imoney*/
	@Excel(name = "imoney", width = 15)
    @ApiModelProperty(value = "imoney")
	private java.lang.Object imoney;
	/**itaxprice*/
	@Excel(name = "itaxprice", width = 15)
    @ApiModelProperty(value = "itaxprice")
	private java.lang.Object itaxprice;
	/**isum*/
	@Excel(name = "isum", width = 15)
    @ApiModelProperty(value = "isum")
	private java.lang.Object isum;
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
	/**citemClass*/
	@Excel(name = "citemClass", width = 15)
    @ApiModelProperty(value = "citemClass")
	private java.lang.String citemClass;
	/**citemcode*/
	@Excel(name = "citemcode", width = 15)
    @ApiModelProperty(value = "citemcode")
	private java.lang.String citemcode;
	/**iposid*/
	@Excel(name = "iposid", width = 15)
    @ApiModelProperty(value = "iposid")
	private java.lang.Integer iposid;
	/**citemname*/
	@Excel(name = "citemname", width = 15)
    @ApiModelProperty(value = "citemname")
	private java.lang.String citemname;
	/**cunitid*/
	@Excel(name = "cunitid", width = 15)
    @ApiModelProperty(value = "cunitid")
	private java.lang.String cunitid;
	/**fvalidinquan*/
	@Excel(name = "fvalidinquan", width = 15)
    @ApiModelProperty(value = "fvalidinquan")
	private java.math.BigDecimal fvalidinquan;
	/**fkpquantity*/
	@Excel(name = "fkpquantity", width = 15)
    @ApiModelProperty(value = "fkpquantity")
	private java.math.BigDecimal fkpquantity;
	/**frealquantity*/
	@Excel(name = "frealquantity", width = 15)
    @ApiModelProperty(value = "frealquantity")
	private java.math.BigDecimal frealquantity;
	/**fvalidquantity*/
	@Excel(name = "fvalidquantity", width = 15)
    @ApiModelProperty(value = "fvalidquantity")
	private java.math.BigDecimal fvalidquantity;
	/**finvalidquantity*/
	@Excel(name = "finvalidquantity", width = 15)
    @ApiModelProperty(value = "finvalidquantity")
	private java.math.BigDecimal finvalidquantity;
	/**ccloser*/
	@Excel(name = "ccloser", width = 15)
    @ApiModelProperty(value = "ccloser")
	private java.lang.String ccloser;
	/**icorid*/
	@Excel(name = "icorid", width = 15)
    @ApiModelProperty(value = "icorid")
	private java.lang.Integer icorid;
	/**fretquantity*/
	@Excel(name = "fretquantity", width = 15)
    @ApiModelProperty(value = "fretquantity")
	private java.math.BigDecimal fretquantity;
	/**finvalidinquan*/
	@Excel(name = "finvalidinquan", width = 15)
    @ApiModelProperty(value = "finvalidinquan")
	private java.math.BigDecimal finvalidinquan;
	/**bgsp*/
	@Excel(name = "bgsp", width = 15)
    @ApiModelProperty(value = "bgsp")
	private java.lang.Integer bgsp;
	/**cbatch*/
	@Excel(name = "cbatch", width = 15)
    @ApiModelProperty(value = "cbatch")
	private java.lang.String cbatch;
	/**dvdate*/
	@Excel(name = "dvdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvdate")
	private java.util.Date dvdate;
	/**dpdate*/
	@Excel(name = "dpdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dpdate")
	private java.util.Date dpdate;
	/**frefusequantity*/
	@Excel(name = "frefusequantity", width = 15)
    @ApiModelProperty(value = "frefusequantity")
	private java.math.BigDecimal frefusequantity;
	/**cgspstate*/
	@Excel(name = "cgspstate", width = 15)
    @ApiModelProperty(value = "cgspstate")
	private java.lang.String cgspstate;
	/**fvalidnum*/
	@Excel(name = "fvalidnum", width = 15)
    @ApiModelProperty(value = "fvalidnum")
	private java.math.BigDecimal fvalidnum;
	/**fvalidinnum*/
	@Excel(name = "fvalidinnum", width = 15)
    @ApiModelProperty(value = "fvalidinnum")
	private java.math.BigDecimal fvalidinnum;
	/**finvalidnum*/
	@Excel(name = "finvalidnum", width = 15)
    @ApiModelProperty(value = "finvalidnum")
	private java.math.BigDecimal finvalidnum;
	/**frealnum*/
	@Excel(name = "frealnum", width = 15)
    @ApiModelProperty(value = "frealnum")
	private java.math.BigDecimal frealnum;
	/**btaxcost*/
	@Excel(name = "btaxcost", width = 15)
    @ApiModelProperty(value = "btaxcost")
	private java.lang.Object btaxcost;
	/**binspect*/
	@Excel(name = "binspect", width = 15)
    @ApiModelProperty(value = "binspect")
	private java.lang.Integer binspect;
	/**frefusenum*/
	@Excel(name = "frefusenum", width = 15)
    @ApiModelProperty(value = "frefusenum")
	private java.math.BigDecimal frefusenum;
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
	/**sodid*/
	@Excel(name = "sodid", width = 15)
    @ApiModelProperty(value = "sodid")
	private java.lang.String sodid;
	/**sotype*/
	@Excel(name = "sotype", width = 15)
    @ApiModelProperty(value = "sotype")
	private java.lang.Integer sotype;
	/**contractrowguid*/
	@Excel(name = "contractrowguid", width = 15)
    @ApiModelProperty(value = "contractrowguid")
	private java.lang.Object contractrowguid;
	/**imassdate*/
	@Excel(name = "imassdate", width = 15)
    @ApiModelProperty(value = "imassdate")
	private java.lang.Integer imassdate;
	/**cmassunit*/
	@Excel(name = "cmassunit", width = 15)
    @ApiModelProperty(value = "cmassunit")
	private java.lang.Integer cmassunit;
	/**bexigency*/
	@Excel(name = "bexigency", width = 15)
    @ApiModelProperty(value = "bexigency")
	private java.lang.Integer bexigency;
	/**cbcloser*/
	@Excel(name = "cbcloser", width = 15)
    @ApiModelProperty(value = "cbcloser")
	private java.lang.String cbcloser;
	/**fsumrefusequantity*/
	@Excel(name = "fsumrefusequantity", width = 15)
    @ApiModelProperty(value = "fsumrefusequantity")
	private java.math.BigDecimal fsumrefusequantity;
	/**fsumrefusenum*/
	@Excel(name = "fsumrefusenum", width = 15)
    @ApiModelProperty(value = "fsumrefusenum")
	private java.math.BigDecimal fsumrefusenum;
	/**fretnum*/
	@Excel(name = "fretnum", width = 15)
    @ApiModelProperty(value = "fretnum")
	private java.math.BigDecimal fretnum;
	/**fdtquantity*/
	@Excel(name = "fdtquantity", width = 15)
    @ApiModelProperty(value = "fdtquantity")
	private java.math.BigDecimal fdtquantity;
	/**finvalidinnum*/
	@Excel(name = "finvalidinnum", width = 15)
    @ApiModelProperty(value = "finvalidinnum")
	private java.math.BigDecimal finvalidinnum;
	/**fdegradequantity*/
	@Excel(name = "fdegradequantity", width = 15)
    @ApiModelProperty(value = "fdegradequantity")
	private java.math.BigDecimal fdegradequantity;
	/**fdegradenum*/
	@Excel(name = "fdegradenum", width = 15)
    @ApiModelProperty(value = "fdegradenum")
	private java.math.BigDecimal fdegradenum;
	/**fdegradeinquantity*/
	@Excel(name = "fdegradeinquantity", width = 15)
    @ApiModelProperty(value = "fdegradeinquantity")
	private java.math.BigDecimal fdegradeinquantity;
	/**fdegradeinnum*/
	@Excel(name = "fdegradeinnum", width = 15)
    @ApiModelProperty(value = "fdegradeinnum")
	private java.math.BigDecimal fdegradeinnum;
	/**finspectquantity*/
	@Excel(name = "finspectquantity", width = 15)
    @ApiModelProperty(value = "finspectquantity")
	private java.math.BigDecimal finspectquantity;
	/**finspectnum*/
	@Excel(name = "finspectnum", width = 15)
    @ApiModelProperty(value = "finspectnum")
	private java.math.BigDecimal finspectnum;
	/**iinvmpcost*/
	@Excel(name = "iinvmpcost", width = 15)
    @ApiModelProperty(value = "iinvmpcost")
	private java.math.BigDecimal iinvmpcost;
	/**guids*/
	@Excel(name = "guids", width = 15)
    @ApiModelProperty(value = "guids")
	private java.lang.String guids;
	/**iinvexchrate*/
	@Excel(name = "iinvexchrate", width = 15)
    @ApiModelProperty(value = "iinvexchrate")
	private java.math.BigDecimal iinvexchrate;
	/**objectidSource*/
	@Excel(name = "objectidSource", width = 15)
    @ApiModelProperty(value = "objectidSource")
	private java.lang.String objectidSource;
	/**autoidSource*/
	@Excel(name = "autoidSource", width = 15)
    @ApiModelProperty(value = "autoidSource")
	private java.lang.Integer autoidSource;
	/**uftsSource*/
	@Excel(name = "uftsSource", width = 15)
    @ApiModelProperty(value = "uftsSource")
	private java.lang.String uftsSource;
	/**irownoSource*/
	@Excel(name = "irownoSource", width = 15)
    @ApiModelProperty(value = "irownoSource")
	private java.lang.Integer irownoSource;
	/**csocode*/
	@Excel(name = "csocode", width = 15)
    @ApiModelProperty(value = "csocode")
	private java.lang.String csocode;
	/**isorowno*/
	@Excel(name = "isorowno", width = 15)
    @ApiModelProperty(value = "isorowno")
	private java.lang.Integer isorowno;
	/**iorderid*/
	@Excel(name = "iorderid", width = 15)
    @ApiModelProperty(value = "iorderid")
	private java.lang.Integer iorderid;
	/**cordercode*/
	@Excel(name = "cordercode", width = 15)
    @ApiModelProperty(value = "cordercode")
	private java.lang.String cordercode;
	/**iorderrowno*/
	@Excel(name = "iorderrowno", width = 15)
    @ApiModelProperty(value = "iorderrowno")
	private java.lang.Integer iorderrowno;
	/**dlineclosedate*/
	@Excel(name = "dlineclosedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlineclosedate")
	private java.util.Date dlineclosedate;
	/**contractcode*/
	@Excel(name = "contractcode", width = 15)
    @ApiModelProperty(value = "contractcode")
	private java.lang.String contractcode;
	/**contractrowno*/
	@Excel(name = "contractrowno", width = 15)
    @ApiModelProperty(value = "contractrowno")
	private java.lang.String contractrowno;
	/**rejectsource*/
	@Excel(name = "rejectsource", width = 15)
    @ApiModelProperty(value = "rejectsource")
	private java.lang.Object rejectsource;
	/**iciqbookid*/
	@Excel(name = "iciqbookid", width = 15)
    @ApiModelProperty(value = "iciqbookid")
	private java.lang.Integer iciqbookid;
	/**cciqbookcode*/
	@Excel(name = "cciqbookcode", width = 15)
    @ApiModelProperty(value = "cciqbookcode")
	private java.lang.String cciqbookcode;
	/**cciqcode*/
	@Excel(name = "cciqcode", width = 15)
    @ApiModelProperty(value = "cciqcode")
	private java.lang.String cciqcode;
	/**fciqchangrate*/
	@Excel(name = "fciqchangrate", width = 15)
    @ApiModelProperty(value = "fciqchangrate")
	private java.math.BigDecimal fciqchangrate;
	/**irejectautoid*/
	@Excel(name = "irejectautoid", width = 15)
    @ApiModelProperty(value = "irejectautoid")
	private java.lang.Integer irejectautoid;
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
	/**cupsocode*/
	@Excel(name = "cupsocode", width = 15)
    @ApiModelProperty(value = "cupsocode")
	private java.lang.String cupsocode;
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
	/**ivouchrowno*/
	@Excel(name = "ivouchrowno", width = 15)
    @ApiModelProperty(value = "ivouchrowno")
	private java.lang.Integer ivouchrowno;
	/**irowno*/
	@Excel(name = "irowno", width = 15)
    @ApiModelProperty(value = "irowno")
	private java.lang.Integer irowno;
	/**cbmemo*/
	@Excel(name = "cbmemo", width = 15)
    @ApiModelProperty(value = "cbmemo")
	private java.lang.String cbmemo;
	/**cbsysbarcode*/
	@Excel(name = "cbsysbarcode", width = 15)
    @ApiModelProperty(value = "cbsysbarcode")
	private java.lang.String cbsysbarcode;
	/**carrivalcode*/
	@Excel(name = "carrivalcode", width = 15)
    @ApiModelProperty(value = "carrivalcode")
	private java.lang.String carrivalcode;
	/**ipickedquantity*/
	@Excel(name = "ipickedquantity", width = 15)
    @ApiModelProperty(value = "ipickedquantity")
	private java.lang.Float ipickedquantity;
	/**ipickednum*/
	@Excel(name = "ipickednum", width = 15)
    @ApiModelProperty(value = "ipickednum")
	private java.lang.Float ipickednum;
	/**isourcemocode*/
	@Excel(name = "isourcemocode", width = 15)
    @ApiModelProperty(value = "isourcemocode")
	private java.lang.String isourcemocode;
	/**isourcemodetailsid*/
	@Excel(name = "isourcemodetailsid", width = 15)
    @ApiModelProperty(value = "isourcemodetailsid")
	private java.lang.Integer isourcemodetailsid;
	/**freworkquantity*/
	@Excel(name = "freworkquantity", width = 15)
    @ApiModelProperty(value = "freworkquantity")
	private java.math.BigDecimal freworkquantity;
	/**freworknum*/
	@Excel(name = "freworknum", width = 15)
    @ApiModelProperty(value = "freworknum")
	private java.math.BigDecimal freworknum;
	/**fsumreworkquantity*/
	@Excel(name = "fsumreworkquantity", width = 15)
    @ApiModelProperty(value = "fsumreworkquantity")
	private java.math.BigDecimal fsumreworkquantity;
	/**fsumreworknum*/
	@Excel(name = "fsumreworknum", width = 15)
    @ApiModelProperty(value = "fsumreworknum")
	private java.math.BigDecimal fsumreworknum;
	/**iproducttype*/
	@Excel(name = "iproducttype", width = 15)
    @ApiModelProperty(value = "iproducttype")
	private java.lang.Integer iproducttype;
	/**cmaininvcode*/
	@Excel(name = "cmaininvcode", width = 15)
    @ApiModelProperty(value = "cmaininvcode")
	private java.lang.String cmaininvcode;
	/**imainmodetailsid*/
	@Excel(name = "imainmodetailsid", width = 15)
    @ApiModelProperty(value = "imainmodetailsid")
	private java.lang.Integer imainmodetailsid;
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
}
