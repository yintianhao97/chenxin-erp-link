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
 * @Description: 供应商档案
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@Data
@TableName("Vendor")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Vendor对象", description="供应商档案")
public class Vendor {
    
	/**cvencode*/
	@Excel(name = "cvencode", width = 15)
    @ApiModelProperty(value = "cvencode")
	private java.lang.String cvencode;
	/**cvenname*/
	@Excel(name = "cvenname", width = 15)
    @ApiModelProperty(value = "cvenname")
	private java.lang.String cvenname;
	/**cvenabbname*/
	@Excel(name = "cvenabbname", width = 15)
    @ApiModelProperty(value = "cvenabbname")
	private java.lang.String cvenabbname;
	/**cvccode*/
	@Excel(name = "cvccode", width = 15)
    @ApiModelProperty(value = "cvccode")
	private java.lang.String cvccode;
	/**cdccode*/
	@Excel(name = "cdccode", width = 15)
    @ApiModelProperty(value = "cdccode")
	private java.lang.String cdccode;
	/**ctrade*/
	@Excel(name = "ctrade", width = 15)
    @ApiModelProperty(value = "ctrade")
	private java.lang.String ctrade;
	/**cvenaddress*/
	@Excel(name = "cvenaddress", width = 15)
    @ApiModelProperty(value = "cvenaddress")
	private java.lang.String cvenaddress;
	/**cvenpostcode*/
	@Excel(name = "cvenpostcode", width = 15)
    @ApiModelProperty(value = "cvenpostcode")
	private java.lang.String cvenpostcode;
	/**cvenregcode*/
	@Excel(name = "cvenregcode", width = 15)
    @ApiModelProperty(value = "cvenregcode")
	private java.lang.String cvenregcode;
	/**cvenbank*/
	@Excel(name = "cvenbank", width = 15)
    @ApiModelProperty(value = "cvenbank")
	private java.lang.String cvenbank;
	/**cvenaccount*/
	@Excel(name = "cvenaccount", width = 15)
    @ApiModelProperty(value = "cvenaccount")
	private java.lang.String cvenaccount;
	/**dvendevdate*/
	@Excel(name = "dvendevdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvendevdate")
	private java.util.Date dvendevdate;
	/**cvenlperson*/
	@Excel(name = "cvenlperson", width = 15)
    @ApiModelProperty(value = "cvenlperson")
	private java.lang.String cvenlperson;
	/**cvenphone*/
	@Excel(name = "cvenphone", width = 15)
    @ApiModelProperty(value = "cvenphone")
	private java.lang.String cvenphone;
	/**cvenfax*/
	@Excel(name = "cvenfax", width = 15)
    @ApiModelProperty(value = "cvenfax")
	private java.lang.String cvenfax;
	/**cvenemail*/
	@Excel(name = "cvenemail", width = 15)
    @ApiModelProperty(value = "cvenemail")
	private java.lang.String cvenemail;
	/**cvenperson*/
	@Excel(name = "cvenperson", width = 15)
    @ApiModelProperty(value = "cvenperson")
	private java.lang.String cvenperson;
	/**cvenbp*/
	@Excel(name = "cvenbp", width = 15)
    @ApiModelProperty(value = "cvenbp")
	private java.lang.String cvenbp;
	/**cvenhand*/
	@Excel(name = "cvenhand", width = 15)
    @ApiModelProperty(value = "cvenhand")
	private java.lang.String cvenhand;
	/**cvenpperson*/
	@Excel(name = "cvenpperson", width = 15)
    @ApiModelProperty(value = "cvenpperson")
	private java.lang.String cvenpperson;
	/**ivendisrate*/
	@Excel(name = "ivendisrate", width = 15)
    @ApiModelProperty(value = "ivendisrate")
	private java.lang.Float ivendisrate;
	/**ivencregrade*/
	@Excel(name = "ivencregrade", width = 15)
    @ApiModelProperty(value = "ivencregrade")
	private java.lang.String ivencregrade;
	/**ivencreline*/
	@Excel(name = "ivencreline", width = 15)
    @ApiModelProperty(value = "ivencreline")
	private java.lang.Float ivencreline;
	/**ivencredate*/
	@Excel(name = "ivencredate", width = 15)
    @ApiModelProperty(value = "ivencredate")
	private java.lang.Integer ivencredate;
	/**cvenpaycond*/
	@Excel(name = "cvenpaycond", width = 15)
    @ApiModelProperty(value = "cvenpaycond")
	private java.lang.String cvenpaycond;
	/**cveniaddress*/
	@Excel(name = "cveniaddress", width = 15)
    @ApiModelProperty(value = "cveniaddress")
	private java.lang.String cveniaddress;
	/**cvenitype*/
	@Excel(name = "cvenitype", width = 15)
    @ApiModelProperty(value = "cvenitype")
	private java.lang.String cvenitype;
	/**cvenheadcode*/
	@Excel(name = "cvenheadcode", width = 15)
    @ApiModelProperty(value = "cvenheadcode")
	private java.lang.String cvenheadcode;
	/**cvenwhcode*/
	@Excel(name = "cvenwhcode", width = 15)
    @ApiModelProperty(value = "cvenwhcode")
	private java.lang.String cvenwhcode;
	/**cvendepart*/
	@Excel(name = "cvendepart", width = 15)
    @ApiModelProperty(value = "cvendepart")
	private java.lang.String cvendepart;
	/**iapmoney*/
	@Excel(name = "iapmoney", width = 15)
    @ApiModelProperty(value = "iapmoney")
	private java.lang.Float iapmoney;
	/**dlastdate*/
	@Excel(name = "dlastdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlastdate")
	private java.util.Date dlastdate;
	/**ilastmoney*/
	@Excel(name = "ilastmoney", width = 15)
    @ApiModelProperty(value = "ilastmoney")
	private java.lang.Float ilastmoney;
	/**dlrdate*/
	@Excel(name = "dlrdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlrdate")
	private java.util.Date dlrdate;
	/**ilrmoney*/
	@Excel(name = "ilrmoney", width = 15)
    @ApiModelProperty(value = "ilrmoney")
	private java.lang.Float ilrmoney;
	/**denddate*/
	@Excel(name = "denddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "denddate")
	private java.util.Date denddate;
	/**ifrequency*/
	@Excel(name = "ifrequency", width = 15)
    @ApiModelProperty(value = "ifrequency")
	private java.lang.Integer ifrequency;
	/**bventax*/
	@Excel(name = "bventax", width = 15)
    @ApiModelProperty(value = "bventax")
	private java.lang.Object bventax;
	/**cvendefine1*/
	@Excel(name = "cvendefine1", width = 15)
    @ApiModelProperty(value = "cvendefine1")
	private java.lang.String cvendefine1;
	/**cvendefine2*/
	@Excel(name = "cvendefine2", width = 15)
    @ApiModelProperty(value = "cvendefine2")
	private java.lang.String cvendefine2;
	/**cvendefine3*/
	@Excel(name = "cvendefine3", width = 15)
    @ApiModelProperty(value = "cvendefine3")
	private java.lang.String cvendefine3;
	/**ccreateperson*/
	@Excel(name = "ccreateperson", width = 15)
    @ApiModelProperty(value = "ccreateperson")
	private java.lang.String ccreateperson;
	/**cmodifyperson*/
	@Excel(name = "cmodifyperson", width = 15)
    @ApiModelProperty(value = "cmodifyperson")
	private java.lang.String cmodifyperson;
	/**dmodifydate*/
	@Excel(name = "dmodifydate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dmodifydate")
	private java.util.Date dmodifydate;
	/**crelcustomer*/
	@Excel(name = "crelcustomer", width = 15)
    @ApiModelProperty(value = "crelcustomer")
	private java.lang.String crelcustomer;
	/**iid*/
	@Excel(name = "iid", width = 15)
    @ApiModelProperty(value = "iid")
	private java.lang.Integer iid;
	/**cbarcode*/
	@Excel(name = "cbarcode", width = 15)
    @ApiModelProperty(value = "cbarcode")
	private java.lang.String cbarcode;
	/**cvendefine4*/
	@Excel(name = "cvendefine4", width = 15)
    @ApiModelProperty(value = "cvendefine4")
	private java.lang.String cvendefine4;
	/**cvendefine5*/
	@Excel(name = "cvendefine5", width = 15)
    @ApiModelProperty(value = "cvendefine5")
	private java.lang.String cvendefine5;
	/**cvendefine6*/
	@Excel(name = "cvendefine6", width = 15)
    @ApiModelProperty(value = "cvendefine6")
	private java.lang.String cvendefine6;
	/**cvendefine7*/
	@Excel(name = "cvendefine7", width = 15)
    @ApiModelProperty(value = "cvendefine7")
	private java.lang.String cvendefine7;
	/**cvendefine8*/
	@Excel(name = "cvendefine8", width = 15)
    @ApiModelProperty(value = "cvendefine8")
	private java.lang.String cvendefine8;
	/**cvendefine9*/
	@Excel(name = "cvendefine9", width = 15)
    @ApiModelProperty(value = "cvendefine9")
	private java.lang.String cvendefine9;
	/**cvendefine10*/
	@Excel(name = "cvendefine10", width = 15)
    @ApiModelProperty(value = "cvendefine10")
	private java.lang.String cvendefine10;
	/**cvendefine11*/
	@Excel(name = "cvendefine11", width = 15)
    @ApiModelProperty(value = "cvendefine11")
	private java.lang.Integer cvendefine11;
	/**cvendefine12*/
	@Excel(name = "cvendefine12", width = 15)
    @ApiModelProperty(value = "cvendefine12")
	private java.lang.Integer cvendefine12;
	/**cvendefine13*/
	@Excel(name = "cvendefine13", width = 15)
    @ApiModelProperty(value = "cvendefine13")
	private java.lang.Float cvendefine13;
	/**cvendefine14*/
	@Excel(name = "cvendefine14", width = 15)
    @ApiModelProperty(value = "cvendefine14")
	private java.lang.Float cvendefine14;
	/**cvendefine15*/
	@Excel(name = "cvendefine15", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cvendefine15")
	private java.util.Date cvendefine15;
	/**cvendefine16*/
	@Excel(name = "cvendefine16", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "cvendefine16")
	private java.util.Date cvendefine16;
	/**fregistfund*/
	@Excel(name = "fregistfund", width = 15)
    @ApiModelProperty(value = "fregistfund")
	private java.lang.Float fregistfund;
	/**iemployeenum*/
	@Excel(name = "iemployeenum", width = 15)
    @ApiModelProperty(value = "iemployeenum")
	private java.lang.Integer iemployeenum;
	/**igradeabc*/
	@Excel(name = "igradeabc", width = 15)
    @ApiModelProperty(value = "igradeabc")
	private java.lang.Integer igradeabc;
	/**cmemo*/
	@Excel(name = "cmemo", width = 15)
    @ApiModelProperty(value = "cmemo")
	private java.lang.String cmemo;
	/**blicencedate*/
	@Excel(name = "blicencedate", width = 15)
    @ApiModelProperty(value = "blicencedate")
	private java.lang.Object blicencedate;
	/**dlicencesdate*/
	@Excel(name = "dlicencesdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlicencesdate")
	private java.util.Date dlicencesdate;
	/**dlicenceedate*/
	@Excel(name = "dlicenceedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dlicenceedate")
	private java.util.Date dlicenceedate;
	/**ilicenceadays*/
	@Excel(name = "ilicenceadays", width = 15)
    @ApiModelProperty(value = "ilicenceadays")
	private java.lang.Integer ilicenceadays;
	/**bbusinessdate*/
	@Excel(name = "bbusinessdate", width = 15)
    @ApiModelProperty(value = "bbusinessdate")
	private java.lang.Object bbusinessdate;
	/**dbusinesssdate*/
	@Excel(name = "dbusinesssdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dbusinesssdate")
	private java.util.Date dbusinesssdate;
	/**dbusinessedate*/
	@Excel(name = "dbusinessedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dbusinessedate")
	private java.util.Date dbusinessedate;
	/**ibusinessadays*/
	@Excel(name = "ibusinessadays", width = 15)
    @ApiModelProperty(value = "ibusinessadays")
	private java.lang.Integer ibusinessadays;
	/**bproxydate*/
	@Excel(name = "bproxydate", width = 15)
    @ApiModelProperty(value = "bproxydate")
	private java.lang.Object bproxydate;
	/**dproxysdate*/
	@Excel(name = "dproxysdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dproxysdate")
	private java.util.Date dproxysdate;
	/**dproxyedate*/
	@Excel(name = "dproxyedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dproxyedate")
	private java.util.Date dproxyedate;
	/**iproxyadays*/
	@Excel(name = "iproxyadays", width = 15)
    @ApiModelProperty(value = "iproxyadays")
	private java.lang.Integer iproxyadays;
	/**bpassgmp*/
	@Excel(name = "bpassgmp", width = 15)
    @ApiModelProperty(value = "bpassgmp")
	private java.lang.Object bpassgmp;
	/**bvencargo*/
	@Excel(name = "bvencargo", width = 15)
    @ApiModelProperty(value = "bvencargo")
	private java.lang.Object bvencargo;
	/**bproxyforeign*/
	@Excel(name = "bproxyforeign", width = 15)
    @ApiModelProperty(value = "bproxyforeign")
	private java.lang.Object bproxyforeign;
	/**bvenservice*/
	@Excel(name = "bvenservice", width = 15)
    @ApiModelProperty(value = "bvenservice")
	private java.lang.Object bvenservice;
	/**cventradeccode*/
	@Excel(name = "cventradeccode", width = 15)
    @ApiModelProperty(value = "cventradeccode")
	private java.lang.String cventradeccode;
	/**cvenbankcode*/
	@Excel(name = "cvenbankcode", width = 15)
    @ApiModelProperty(value = "cvenbankcode")
	private java.lang.String cvenbankcode;
	/**cvenexchName*/
	@Excel(name = "cvenexchName", width = 15)
    @ApiModelProperty(value = "cvenexchName")
	private java.lang.String cvenexchName;
	/**ivengsptype*/
	@Excel(name = "ivengsptype", width = 15)
    @ApiModelProperty(value = "ivengsptype")
	private java.lang.Integer ivengsptype;
	/**ivengspauth*/
	@Excel(name = "ivengspauth", width = 15)
    @ApiModelProperty(value = "ivengspauth")
	private java.lang.Integer ivengspauth;
	/**cvengspauthno*/
	@Excel(name = "cvengspauthno", width = 15)
    @ApiModelProperty(value = "cvengspauthno")
	private java.lang.String cvengspauthno;
	/**cvenbusinessno*/
	@Excel(name = "cvenbusinessno", width = 15)
    @ApiModelProperty(value = "cvenbusinessno")
	private java.lang.String cvenbusinessno;
	/**cvenlicenceno*/
	@Excel(name = "cvenlicenceno", width = 15)
    @ApiModelProperty(value = "cvenlicenceno")
	private java.lang.String cvenlicenceno;
	/**bvenoverseas*/
	@Excel(name = "bvenoverseas", width = 15)
    @ApiModelProperty(value = "bvenoverseas")
	private java.lang.Object bvenoverseas;
	/**bvenaccperiodmng*/
	@Excel(name = "bvenaccperiodmng", width = 15)
    @ApiModelProperty(value = "bvenaccperiodmng")
	private java.lang.Object bvenaccperiodmng;
	/**cvenpuomprotocol*/
	@Excel(name = "cvenpuomprotocol", width = 15)
    @ApiModelProperty(value = "cvenpuomprotocol")
	private java.lang.String cvenpuomprotocol;
	/**cvenotherprotocol*/
	@Excel(name = "cvenotherprotocol", width = 15)
    @ApiModelProperty(value = "cvenotherprotocol")
	private java.lang.String cvenotherprotocol;
	/**cvencountrycode*/
	@Excel(name = "cvencountrycode", width = 15)
    @ApiModelProperty(value = "cvencountrycode")
	private java.lang.String cvencountrycode;
	/**cvenenname*/
	@Excel(name = "cvenenname", width = 15)
    @ApiModelProperty(value = "cvenenname")
	private java.lang.String cvenenname;
	/**cvenenaddr1*/
	@Excel(name = "cvenenaddr1", width = 15)
    @ApiModelProperty(value = "cvenenaddr1")
	private java.lang.String cvenenaddr1;
	/**cvenenaddr2*/
	@Excel(name = "cvenenaddr2", width = 15)
    @ApiModelProperty(value = "cvenenaddr2")
	private java.lang.String cvenenaddr2;
	/**cvenenaddr3*/
	@Excel(name = "cvenenaddr3", width = 15)
    @ApiModelProperty(value = "cvenenaddr3")
	private java.lang.String cvenenaddr3;
	/**cvenenaddr4*/
	@Excel(name = "cvenenaddr4", width = 15)
    @ApiModelProperty(value = "cvenenaddr4")
	private java.lang.String cvenenaddr4;
	/**cvenportcode*/
	@Excel(name = "cvenportcode", width = 15)
    @ApiModelProperty(value = "cvenportcode")
	private java.lang.String cvenportcode;
	/**cvenprimaryven*/
	@Excel(name = "cvenprimaryven", width = 15)
    @ApiModelProperty(value = "cvenprimaryven")
	private java.lang.String cvenprimaryven;
	/**fvencommisionrate*/
	@Excel(name = "fvencommisionrate", width = 15)
    @ApiModelProperty(value = "fvencommisionrate")
	private java.lang.Float fvencommisionrate;
	/**fveninsuerate*/
	@Excel(name = "fveninsuerate", width = 15)
    @ApiModelProperty(value = "fveninsuerate")
	private java.lang.Float fveninsuerate;
	/**bvenhomebranch*/
	@Excel(name = "bvenhomebranch", width = 15)
    @ApiModelProperty(value = "bvenhomebranch")
	private java.lang.Object bvenhomebranch;
	/**cvenbranchaddr*/
	@Excel(name = "cvenbranchaddr", width = 15)
    @ApiModelProperty(value = "cvenbranchaddr")
	private java.lang.String cvenbranchaddr;
	/**cvenbranchphone*/
	@Excel(name = "cvenbranchphone", width = 15)
    @ApiModelProperty(value = "cvenbranchphone")
	private java.lang.String cvenbranchphone;
	/**cvenbranchperson*/
	@Excel(name = "cvenbranchperson", width = 15)
    @ApiModelProperty(value = "cvenbranchperson")
	private java.lang.String cvenbranchperson;
	/**cvensscode*/
	@Excel(name = "cvensscode", width = 15)
    @ApiModelProperty(value = "cvensscode")
	private java.lang.String cvensscode;
	/**comwhcode*/
	@Excel(name = "comwhcode", width = 15)
    @ApiModelProperty(value = "comwhcode")
	private java.lang.String comwhcode;
	/**cvencmprotocol*/
	@Excel(name = "cvencmprotocol", width = 15)
    @ApiModelProperty(value = "cvencmprotocol")
	private java.lang.String cvencmprotocol;
	/**cvenimprotocol*/
	@Excel(name = "cvenimprotocol", width = 15)
    @ApiModelProperty(value = "cvenimprotocol")
	private java.lang.String cvenimprotocol;
	/**iventaxrate*/
	@Excel(name = "iventaxrate", width = 15)
    @ApiModelProperty(value = "iventaxrate")
	private java.lang.Float iventaxrate;
	/**dvencreatedatetime*/
	@Excel(name = "dvencreatedatetime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvencreatedatetime")
	private java.util.Date dvencreatedatetime;
	/**cvenmnemcode*/
	@Excel(name = "cvenmnemcode", width = 15)
    @ApiModelProperty(value = "cvenmnemcode")
	private java.lang.String cvenmnemcode;
	/**cvencontactcode*/
	@Excel(name = "cvencontactcode", width = 15)
    @ApiModelProperty(value = "cvencontactcode")
	private java.lang.Object cvencontactcode;
	/**cvenbankall*/
	@Excel(name = "cvenbankall", width = 15)
    @ApiModelProperty(value = "cvenbankall")
	private java.lang.String cvenbankall;
	/**bisvenattachfile*/
	@Excel(name = "bisvenattachfile", width = 15)
    @ApiModelProperty(value = "bisvenattachfile")
	private java.lang.Object bisvenattachfile;
	/**clicencerange*/
	@Excel(name = "clicencerange", width = 15)
    @ApiModelProperty(value = "clicencerange")
	private java.lang.String clicencerange;
	/**cbusinessrange*/
	@Excel(name = "cbusinessrange", width = 15)
    @ApiModelProperty(value = "cbusinessrange")
	private java.lang.String cbusinessrange;
	/**cvengsprange*/
	@Excel(name = "cvengsprange", width = 15)
    @ApiModelProperty(value = "cvengsprange")
	private java.lang.String cvengsprange;
	/**dvengspedate*/
	@Excel(name = "dvengspedate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvengspedate")
	private java.util.Date dvengspedate;
	/**dvengspsdate*/
	@Excel(name = "dvengspsdate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dvengspsdate")
	private java.util.Date dvengspsdate;
	/**ivengspadays*/
	@Excel(name = "ivengspadays", width = 15)
    @ApiModelProperty(value = "ivengspadays")
	private java.lang.Integer ivengspadays;
	/**bretail*/
	@Excel(name = "bretail", width = 15)
    @ApiModelProperty(value = "bretail")
	private java.lang.Object bretail;
}
