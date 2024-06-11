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
 * @Description: 商品资料
 * @Author: jeecg-boot
 * @Date:   2024-05-20
 * @Version: V1.0
 */
@Data
@TableName("CJK_JC_SPXX")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CJK_JC_SPXX对象", description="商品资料")
public class CJKJCSPXX {
    
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
	/**ERP商品内码*/
	@Excel(name = "ERP商品内码", width = 15)
    @ApiModelProperty(value = "ERP商品内码")
	private java.lang.String sjkspid;
	/**商品编码*/
	@Excel(name = "商品编码", width = 15)
    @ApiModelProperty(value = "商品编码")
	private java.lang.String sspbm;
	/**商品名称*/
	@Excel(name = "商品名称", width = 15)
    @ApiModelProperty(value = "商品名称")
	private java.lang.String sspmc;
	/**商品规格*/
	@Excel(name = "商品规格", width = 15)
    @ApiModelProperty(value = "商品规格")
	private java.lang.String sspgg;
	/**商品产地*/
	@Excel(name = "商品产地", width = 15)
    @ApiModelProperty(value = "商品产地")
	private java.lang.String sspcd;
	/**助记码*/
	@Excel(name = "助记码", width = 15)
    @ApiModelProperty(value = "助记码")
	private java.lang.String szjm;
	/**有效标记(0无效1有效)*/
	@Excel(name = "有效标记(0无效1有效)", width = 15)
    @ApiModelProperty(value = "有效标记(0无效1有效)")
	private java.lang.Long nyxbj;
	/**批准文号*/
	@Excel(name = "批准文号", width = 15)
    @ApiModelProperty(value = "批准文号")
	private java.lang.String spjwh;
	/**生产厂家*/
	@Excel(name = "生产厂家", width = 15)
    @ApiModelProperty(value = "生产厂家")
	private java.lang.String ssccj;
	/**中包装规格(箱,条,盒)*/
	@Excel(name = "中包装规格(箱,条,盒)", width = 15)
    @ApiModelProperty(value = "中包装规格(箱,条,盒)")
	private java.lang.Long n4zbzgg;
	/**计量规格*/
	@Excel(name = "计量规格", width = 15)
    @ApiModelProperty(value = "计量规格")
	private java.lang.Long njlgg;
	/**是否监管*/
	@Excel(name = "是否监管", width = 15)
    @ApiModelProperty(value = "是否监管")
	private java.lang.Integer nsfjg;
	/**包装单位名称*/
	@Excel(name = "包装单位名称", width = 15)
    @ApiModelProperty(value = "包装单位名称")
	private java.lang.String sjldw;
	/**时间戳*/
	@Excel(name = "时间戳", width = 15)
    @ApiModelProperty(value = "时间戳")
	private java.lang.String ssjc;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
	private java.lang.String sbz;
	/**创建日期*/
	@Excel(name = "创建日期", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "创建日期")
	private java.util.Date dcjrq;
	/**更新时间（最后更新）*/
	@Excel(name = "更新时间（最后更新）", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间（最后更新）")
	private java.util.Date dgxrq;
	/**是否精神药品(0否    1是)*/
	@Excel(name = "是否精神药品(0否    1是)", width = 15)
    @ApiModelProperty(value = "是否精神药品(0否    1是)")
	private java.lang.Integer njsyp;
	/**是否冷藏(0否    1是)*/
	@Excel(name = "是否冷藏(0否    1是)", width = 15)
    @ApiModelProperty(value = "是否冷藏(0否    1是)")
	private java.lang.Integer nncbj;
	/**是否中药(0否    1是)*/
	@Excel(name = "是否中药(0否    1是)", width = 15)
    @ApiModelProperty(value = "是否中药(0否    1是)")
	private java.lang.Integer nsfzy;
	/**是否异型包装(0否    1是)*/
	@Excel(name = "是否异型包装(0否    1是)", width = 15)
    @ApiModelProperty(value = "是否异型包装(0否    1是)")
	private java.lang.Integer nyxbz;
	/**GMP达标(0否    1是)*/
	@Excel(name = "GMP达标(0否    1是)", width = 15)
    @ApiModelProperty(value = "GMP达标(0否    1是)")
	private java.lang.Integer ngmpbj;
	/**GSP管理(0否    1是)*/
	@Excel(name = "GSP管理(0否    1是)", width = 15)
    @ApiModelProperty(value = "GSP管理(0否    1是)")
	private java.lang.Integer ngspbj;
	/**首营状态(0否    1是)*/
	@Excel(name = "首营状态(0否    1是)", width = 15)
    @ApiModelProperty(value = "首营状态(0否    1是)")
	private java.lang.Integer nsybj;
	/**sspfq*/
	@Excel(name = "sspfq", width = 15)
    @ApiModelProperty(value = "sspfq")
	private java.lang.String sspfq;
	/**分组类型*/
	@Excel(name = "分组类型", width = 15)
    @ApiModelProperty(value = "分组类型")
	private java.lang.String sfzlx;
	/**n4c*/
	@Excel(name = "n4c", width = 15)
    @ApiModelProperty(value = "n4c")
	private java.math.BigDecimal n4c;
	/**n4k*/
	@Excel(name = "n4k", width = 15)
    @ApiModelProperty(value = "n4k")
	private java.math.BigDecimal n4k;
	/**n4g*/
	@Excel(name = "n4g", width = 15)
    @ApiModelProperty(value = "n4g")
	private java.math.BigDecimal n4g;
	/**sjx*/
	@Excel(name = "sjx", width = 15)
    @ApiModelProperty(value = "sjx")
	private java.lang.String sjx;
	/**ssptm*/
	@Excel(name = "ssptm", width = 15)
    @ApiModelProperty(value = "ssptm")
	private java.lang.String ssptm;
	/**重点养护*/
	@Excel(name = "重点养护", width = 15)
    @ApiModelProperty(value = "重点养护")
	private java.lang.Integer nzdyh;
	/**类型*/
	@Excel(name = "类型", width = 15)
    @ApiModelProperty(value = "类型")
	private java.lang.Integer nlx;
	/**货主公司ID*/
	@Excel(name = "货主公司ID", width = 15)
    @ApiModelProperty(value = "货主公司ID")
	private java.lang.String shzgsid;
	/**n4yxq*/
	@Excel(name = "n4yxq", width = 15)
    @ApiModelProperty(value = "n4yxq")
	private java.math.BigDecimal n4yxq;
	/**pizhwhxq*/
	@Excel(name = "pizhwhxq", width = 15)
    @ApiModelProperty(value = "pizhwhxq")
	private java.lang.String pizhwhxq;
	/**sscyr*/
	@Excel(name = "sscyr", width = 15)
    @ApiModelProperty(value = "sscyr")
	private java.lang.String sscyr;
	/**shoutf*/
	@Excel(name = "shoutf", width = 15)
    @ApiModelProperty(value = "shoutf")
	private java.lang.String shoutf;
	/**拣货包装*/
	@Excel(name = "拣货包装", width = 15)
    @ApiModelProperty(value = "拣货包装")
	private java.lang.Integer njhbz;
	/**sbeiy1*/
	@Excel(name = "sbeiy1", width = 15)
    @ApiModelProperty(value = "sbeiy1")
	private java.lang.String sbeiy1;
	/**sbeiy2*/
	@Excel(name = "sbeiy2", width = 15)
    @ApiModelProperty(value = "sbeiy2")
	private java.lang.String sbeiy2;
	/**sbeiy3*/
	@Excel(name = "sbeiy3", width = 15)
    @ApiModelProperty(value = "sbeiy3")
	private java.lang.String sbeiy3;
	/**sbeiy4*/
	@Excel(name = "sbeiy4", width = 15)
    @ApiModelProperty(value = "sbeiy4")
	private java.lang.String sbeiy4;
	/**sbeiy5*/
	@Excel(name = "sbeiy5", width = 15)
    @ApiModelProperty(value = "sbeiy5")
	private java.lang.String sbeiy5;
	/**sbeiy6*/
	@Excel(name = "sbeiy6", width = 15)
    @ApiModelProperty(value = "sbeiy6")
	private java.lang.String sbeiy6;
	/**sbeiy7*/
	@Excel(name = "sbeiy7", width = 15)
    @ApiModelProperty(value = "sbeiy7")
	private java.lang.String sbeiy7;
	/**sbeiy8*/
	@Excel(name = "sbeiy8", width = 15)
    @ApiModelProperty(value = "sbeiy8")
	private java.lang.String sbeiy8;
	/**nbeiy1*/
	@Excel(name = "nbeiy1", width = 15)
    @ApiModelProperty(value = "nbeiy1")
	private java.math.BigDecimal nbeiy1;
	/**nbeiy2*/
	@Excel(name = "nbeiy2", width = 15)
    @ApiModelProperty(value = "nbeiy2")
	private java.math.BigDecimal nbeiy2;
	/**nbeiy3*/
	@Excel(name = "nbeiy3", width = 15)
    @ApiModelProperty(value = "nbeiy3")
	private java.math.BigDecimal nbeiy3;
	/**nbeiy4*/
	@Excel(name = "nbeiy4", width = 15)
    @ApiModelProperty(value = "nbeiy4")
	private java.math.BigDecimal nbeiy4;
	/**nbeiy5*/
	@Excel(name = "nbeiy5", width = 15)
    @ApiModelProperty(value = "nbeiy5")
	private java.math.BigDecimal nbeiy5;
	/**nbeiy6*/
	@Excel(name = "nbeiy6", width = 15)
    @ApiModelProperty(value = "nbeiy6")
	private java.math.BigDecimal nbeiy6;
	/**nbeiy7*/
	@Excel(name = "nbeiy7", width = 15)
    @ApiModelProperty(value = "nbeiy7")
	private java.math.BigDecimal nbeiy7;
	/**nbeiy8*/
	@Excel(name = "nbeiy8", width = 15)
    @ApiModelProperty(value = "nbeiy8")
	private java.math.BigDecimal nbeiy8;
	/**接口序号*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "接口序号")
	private java.lang.Long id;
}
