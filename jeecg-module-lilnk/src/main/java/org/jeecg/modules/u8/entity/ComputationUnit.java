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
 * @Description: 计量单位
 * @Author: jeecg-boot
 * @Date:   2024-07-01
 * @Version: V1.0
 */
@Data
@TableName("ComputationUnit")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ComputationUnit对象", description="计量单位")
public class ComputationUnit {
    
	/**ccomunitcode*/
	@Excel(name = "ccomunitcode", width = 15)
    @ApiModelProperty(value = "ccomunitcode")
	private java.lang.String ccomunitcode;
	/**ccomunitname*/
	@Excel(name = "ccomunitname", width = 15)
    @ApiModelProperty(value = "ccomunitname")
	private java.lang.String ccomunitname;
	/**cgroupcode*/
	@Excel(name = "cgroupcode", width = 15)
    @ApiModelProperty(value = "cgroupcode")
	private java.lang.String cgroupcode;
	/**cbarcode*/
	@Excel(name = "cbarcode", width = 15)
    @ApiModelProperty(value = "cbarcode")
	private java.lang.String cbarcode;
	/**bmainunit*/
	@Excel(name = "bmainunit", width = 15)
    @ApiModelProperty(value = "bmainunit")
	private java.lang.Object bmainunit;
	/**ichangrate*/
	@Excel(name = "ichangrate", width = 15)
    @ApiModelProperty(value = "ichangrate")
	private java.math.BigDecimal ichangrate;
	/**iproportion*/
	@Excel(name = "iproportion", width = 15)
    @ApiModelProperty(value = "iproportion")
	private java.lang.Float iproportion;
	/**inumber*/
	@Excel(name = "inumber", width = 15)
    @ApiModelProperty(value = "inumber")
	private java.lang.Integer inumber;

	/**censingular*/
	@Excel(name = "censingular", width = 15)
    @ApiModelProperty(value = "censingular")
	private java.lang.String censingular;
	/**cenplural*/
	@Excel(name = "cenplural", width = 15)
    @ApiModelProperty(value = "cenplural")
	private java.lang.String cenplural;
	/**cunitrefinvcode*/
	@Excel(name = "cunitrefinvcode", width = 15)
    @ApiModelProperty(value = "cunitrefinvcode")
	private java.lang.String cunitrefinvcode;
}
