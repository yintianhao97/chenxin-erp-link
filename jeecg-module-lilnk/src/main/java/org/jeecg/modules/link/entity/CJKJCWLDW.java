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
 * @Description: 单位资料
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Data
@TableName("CJK_JC_WLDW")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_JC_WLDW对象", description="单位资料")
public class CJKJCWLDW {
    
	/**中文名称*/
	@Excel(name = "中文名称", width = 15)
    @ApiModelProperty(value = "中文名称")
	private java.lang.String sdwmc;
	/**中文地址*/
	@Excel(name = "中文地址", width = 15)
    @ApiModelProperty(value = "中文地址")
	private java.lang.String szwdz;
	/**邮政编码*/
	@Excel(name = "邮政编码", width = 15)
    @ApiModelProperty(value = "邮政编码")
	private java.lang.String syzbm;
	/**传真号码*/
	@Excel(name = "传真号码", width = 15)
    @ApiModelProperty(value = "传真号码")
	private java.lang.String sczhm;
	/**联系电话*/
	@Excel(name = "联系电话", width = 15)
    @ApiModelProperty(value = "联系电话")
	private java.lang.String slxdh;
	/**有效标记*/
	@Excel(name = "有效标记", width = 15)
    @ApiModelProperty(value = "有效标记")
	private java.lang.Integer nyxbj;
	/**助记码*/
	@Excel(name = "助记码", width = 15)
    @ApiModelProperty(value = "助记码")
	private java.lang.String szjm;
	/**往来属性(0：供应商，1：客户，2：货主)*/
	@Excel(name = "往来属性(0：供应商，1：客户，2：货主)", width = 15)
    @ApiModelProperty(value = "往来属性(0：供应商，1：客户，2：货主)")
	private java.lang.Integer nwlsx;
	/**是否货主(0否 1是)*/
	@Excel(name = "是否货主(0否 1是)", width = 15)
    @ApiModelProperty(value = "是否货主(0否 1是)")
	private java.lang.Integer nsfhz;
	/**联系人名称*/
	@Excel(name = "联系人名称", width = 15)
    @ApiModelProperty(value = "联系人名称")
	private java.lang.String slxr;
	/**法人代表*/
	@Excel(name = "法人代表", width = 15)
    @ApiModelProperty(value = "法人代表")
	private java.lang.String sfrdb;
	/**电子监管网单位ID*/
	@Excel(name = "电子监管网单位ID", width = 15)
    @ApiModelProperty(value = "电子监管网单位ID")
	private java.lang.String sdzjgwid;
	/**时间戳*/
	@Excel(name = "时间戳", width = 15)
    @ApiModelProperty(value = "时间戳")
	private java.lang.String ssjc;
	/**线路编号*/
	@Excel(name = "线路编号", width = 15)
    @ApiModelProperty(value = "线路编号")
	private java.lang.String sxlid;
	/**单位编号*/
	@Excel(name = "单位编号", width = 15)
    @ApiModelProperty(value = "单位编号")
	private java.lang.String sjkdwbh;
	/**货主公司ID*/
	@Excel(name = "货主公司ID", width = 15)
    @ApiModelProperty(value = "货主公司ID")
	private java.lang.String shzgsid;
	/**开户银行*/
	@Excel(name = "开户银行", width = 15)
    @ApiModelProperty(value = "开户银行")
	private java.lang.String skhyh;
	/**开户账号*/
	@Excel(name = "开户账号", width = 15)
    @ApiModelProperty(value = "开户账号")
	private java.lang.String szh;
	/**统一社会信用代码*/
	@Excel(name = "统一社会信用代码", width = 15)
    @ApiModelProperty(value = "统一社会信用代码")
	private java.lang.String ssh;
	/**备用1*/
	@Excel(name = "备用1", width = 15)
    @ApiModelProperty(value = "备用1")
	private java.lang.String sbeiy1;
	/**备用2*/
	@Excel(name = "备用2", width = 15)
    @ApiModelProperty(value = "备用2")
	private java.lang.String sbeiy2;
	/**备用3*/
	@Excel(name = "备用3", width = 15)
    @ApiModelProperty(value = "备用3")
	private java.lang.String sbeiy3;
	/**备用4*/
	@Excel(name = "备用4", width = 15)
    @ApiModelProperty(value = "备用4")
	private java.lang.String sbeiy4;
	/**备用5*/
	@Excel(name = "备用5", width = 15)
    @ApiModelProperty(value = "备用5")
	private java.lang.String sbeiy5;
	/**备用6*/
	@Excel(name = "备用6", width = 15)
    @ApiModelProperty(value = "备用6")
	private java.lang.String sbeiy6;
	/**备用7*/
	@Excel(name = "备用7", width = 15)
    @ApiModelProperty(value = "备用7")
	private java.lang.String sbeiy7;
	/**备用8*/
	@Excel(name = "备用8", width = 15)
    @ApiModelProperty(value = "备用8")
	private java.lang.String sbeiy8;
	/**数值备用1*/
	@Excel(name = "数值备用1", width = 15)
    @ApiModelProperty(value = "数值备用1")
	private java.math.BigDecimal nbeiy1;
	/**数值备用2*/
	@Excel(name = "数值备用2", width = 15)
    @ApiModelProperty(value = "数值备用2")
	private java.math.BigDecimal nbeiy2;
	/**数值备用3*/
	@Excel(name = "数值备用3", width = 15)
    @ApiModelProperty(value = "数值备用3")
	private java.math.BigDecimal nbeiy3;
	/**数值备用4*/
	@Excel(name = "数值备用4", width = 15)
    @ApiModelProperty(value = "数值备用4")
	private java.math.BigDecimal nbeiy4;
	/**数值备用5*/
	@Excel(name = "数值备用5", width = 15)
    @ApiModelProperty(value = "数值备用5")
	private java.math.BigDecimal nbeiy5;
	/**数值备用6*/
	@Excel(name = "数值备用6", width = 15)
    @ApiModelProperty(value = "数值备用6")
	private java.math.BigDecimal nbeiy6;
	/**数值备用7*/
	@Excel(name = "数值备用7", width = 15)
    @ApiModelProperty(value = "数值备用7")
	private java.math.BigDecimal nbeiy7;
	/**数值备用8*/
	@Excel(name = "数值备用8", width = 15)
    @ApiModelProperty(value = "数值备用8")
	private java.math.BigDecimal nbeiy8;
	/**sckfbk*/
	@Excel(name = "sckfbk", width = 15)
    @ApiModelProperty(value = "sckfbk")
	private java.lang.String sckfbk;
	/**更新时间*/
	@Excel(name = "更新时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间")
	private java.util.Date dgxsj;
	/**省份*/
	@Excel(name = "省份", width = 15)
    @ApiModelProperty(value = "省份")
	private java.lang.String shengfen;
	/**市*/
	@Excel(name = "市", width = 15)
    @ApiModelProperty(value = "市")
	private java.lang.String shiqu;
	/**县区*/
	@Excel(name = "县区", width = 15)
    @ApiModelProperty(value = "县区")
	private java.lang.String xianqu;
	/**乡镇*/
	@Excel(name = "乡镇", width = 15)
    @ApiModelProperty(value = "乡镇")
	private java.lang.String xiaozhen;
	/**详细地址*/
	@Excel(name = "详细地址", width = 15)
    @ApiModelProperty(value = "详细地址")
	private java.lang.String xiangxdz;
	/**接口序号*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "接口序号")
	private java.lang.Long id;
	/**更新标记(0，更新；1新增；2，废弃)*/
	@Excel(name = "更新标记(0，更新；1新增；2，废弃)", width = 15)
    @ApiModelProperty(value = "更新标记(0，更新；1新增；2，废弃)")
	private java.lang.Integer ngxbj;
	/**接收标记(0，未接收；1，接收成功；2，处理失败)*/
	@Excel(name = "接收标记(0，未接收；1，接收成功；2，处理失败)", width = 15)
    @ApiModelProperty(value = "接收标记(0，未接收；1，接收成功；2，处理失败)")
	private java.lang.Integer njsbj;
	/**接收备注*/
	@Excel(name = "接收备注", width = 15)
    @ApiModelProperty(value = "接收备注")
	private java.lang.String sjsbz;
	/**单位代码*/
	@Excel(name = "单位代码", width = 15)
    @ApiModelProperty(value = "单位代码")
	private java.lang.String swldwid;
}
