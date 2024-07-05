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
 * @Description: 上架记录
 * @Author: jeecg-boot
 * @Date:   2024-07-03
 * @Version: V1.0
 */
@Data
@TableName("sjjl_xs")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="sjjl_xs对象", description="上架记录")
public class SjjlXs {
    
	/**sdydjbh*/
	@Excel(name = "sdydjbh", width = 15)
    @ApiModelProperty(value = "sdydjbh")
	private java.lang.String sdydjbh;
	/**ysdh*/
	@Excel(name = "ysdh", width = 15)
    @ApiModelProperty(value = "ysdh")
	private java.lang.String ysdh;
	/**nydjhh*/
	@Excel(name = "nydjhh", width = 15)
    @ApiModelProperty(value = "nydjhh")
	private java.lang.String nydjhh;
	/**daohwd*/
	@Excel(name = "daohwd", width = 15)
    @ApiModelProperty(value = "daohwd")
	private java.lang.String daohwd;
	/**duiydjbh*/
	@Excel(name = "duiydjbh", width = 15)
    @ApiModelProperty(value = "duiydjbh")
	private java.lang.String duiydjbh;
	/**djSn*/
	@Excel(name = "djSn", width = 15)
    @ApiModelProperty(value = "djSn")
	private java.lang.Integer djSn;
}
