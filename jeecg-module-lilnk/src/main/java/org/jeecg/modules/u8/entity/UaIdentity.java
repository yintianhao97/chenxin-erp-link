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
 * @Description: 单据id
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@Data
@TableName("UA_Identity")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UA_Identity对象", description="单据id")
public class UaIdentity {
    
	/**caccId*/
	@Excel(name = "caccId", width = 15)
    @ApiModelProperty(value = "caccId")
	private java.lang.String caccId;
	/**cvouchtype*/
	@Excel(name = "cvouchtype", width = 15)
    @ApiModelProperty(value = "cvouchtype")
	private java.lang.String cvouchtype;
	/**ifatherid*/
	@Excel(name = "ifatherid", width = 15)
    @ApiModelProperty(value = "ifatherid")
	private java.lang.Integer ifatherid;
	/**ichildid*/
	@Excel(name = "ichildid", width = 15)
    @ApiModelProperty(value = "ichildid")
	private java.lang.Integer ichildid;
}
