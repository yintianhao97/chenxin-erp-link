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
 * @Description: 人员表
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@Data
@TableName("Person")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Person对象", description="人员表")
public class Person {
    
	/**cpersoncode*/
	@Excel(name = "cpersoncode", width = 15)
    @ApiModelProperty(value = "cpersoncode")
	private java.lang.String cpersoncode;
	/**cpersonname*/
	@Excel(name = "cpersonname", width = 15)
    @ApiModelProperty(value = "cpersonname")
	private java.lang.String cpersonname;
	/**cdepcode*/
	@Excel(name = "cdepcode", width = 15)
    @ApiModelProperty(value = "cdepcode")
	private java.lang.String cdepcode;
	/**cpersonprop*/
	@Excel(name = "cpersonprop", width = 15)
    @ApiModelProperty(value = "cpersonprop")
	private java.lang.String cpersonprop;
	/**fcreditquantity*/
	@Excel(name = "fcreditquantity", width = 15)
    @ApiModelProperty(value = "fcreditquantity")
	private java.lang.Float fcreditquantity;
	/**icredate*/
	@Excel(name = "icredate", width = 15)
    @ApiModelProperty(value = "icredate")
	private java.lang.Integer icredate;
	/**ccregrade*/
	@Excel(name = "ccregrade", width = 15)
    @ApiModelProperty(value = "ccregrade")
	private java.lang.String ccregrade;
	/**ilowrate*/
	@Excel(name = "ilowrate", width = 15)
    @ApiModelProperty(value = "ilowrate")
	private java.lang.Float ilowrate;
	/**coffergrade*/
	@Excel(name = "coffergrade", width = 15)
    @ApiModelProperty(value = "coffergrade")
	private java.lang.String coffergrade;
	/**iofferrate*/
	@Excel(name = "iofferrate", width = 15)
    @ApiModelProperty(value = "iofferrate")
	private java.lang.Float iofferrate;

	/**cpersonemail*/
	@Excel(name = "cpersonemail", width = 15)
    @ApiModelProperty(value = "cpersonemail")
	private java.lang.String cpersonemail;
	/**cpersonphone*/
	@Excel(name = "cpersonphone", width = 15)
    @ApiModelProperty(value = "cpersonphone")
	private java.lang.String cpersonphone;
	/**dpvaliddate*/
	@Excel(name = "dpvaliddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dpvaliddate")
	private java.util.Date dpvaliddate;
	/**dpinvaliddate*/
	@Excel(name = "dpinvaliddate", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "dpinvaliddate")
	private java.util.Date dpinvaliddate;
}
