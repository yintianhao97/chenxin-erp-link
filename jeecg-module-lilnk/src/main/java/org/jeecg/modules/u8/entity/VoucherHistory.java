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
 * @Description: 单据code
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@Data
@TableName("VoucherHistory")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="VoucherHistory对象", description="单据code")
public class VoucherHistory {
    
	/**autoid*/
	@Excel(name = "autoid", width = 15)
    @ApiModelProperty(value = "autoid")
	private java.lang.Integer autoid;
	/**cardnumber*/
	@Excel(name = "cardnumber", width = 15)
    @ApiModelProperty(value = "cardnumber")
	private java.lang.String cardnumber;
	/**irdflagseed*/
	@Excel(name = "irdflagseed", width = 15)
    @ApiModelProperty(value = "irdflagseed")
	private java.lang.Integer irdflagseed;
	/**ccontent*/
	@Excel(name = "ccontent", width = 15)
    @ApiModelProperty(value = "ccontent")
	private java.lang.String ccontent;
	/**ccontentrule*/
	@Excel(name = "ccontentrule", width = 15)
    @ApiModelProperty(value = "ccontentrule")
	private java.lang.String ccontentrule;
	/**cseed*/
	@Excel(name = "cseed", width = 15)
    @ApiModelProperty(value = "cseed")
	private java.lang.String cseed;
	/**cnumber*/
	@Excel(name = "cnumber", width = 15)
    @ApiModelProperty(value = "cnumber")
	private java.lang.String cnumber;
	/**bempty*/
	@Excel(name = "bempty", width = 15)
    @ApiModelProperty(value = "bempty")
	private java.lang.Object bempty;
}
