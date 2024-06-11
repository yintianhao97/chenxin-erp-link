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
 * @Description: linkAutoId
 * @Author: jeecg-boot
 * @Date:   2024-05-25
 * @Version: V1.0
 */
@Data
@TableName("link_autoId")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="link_autoId对象", description="linkAutoId")
public class linkAutoId {
    
	/**inventoryId*/
	@Excel(name = "inventoryId", width = 15)
    @ApiModelProperty(value = "inventoryId")
	private java.lang.Integer inventoryId;
	/**customerId*/
	@Excel(name = "customerId", width = 15)
    @ApiModelProperty(value = "customerId")
	private java.lang.Integer customerId;
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
}
