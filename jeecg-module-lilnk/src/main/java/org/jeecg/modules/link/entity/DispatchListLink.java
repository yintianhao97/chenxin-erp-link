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
 * @Description: DispatchListLink
 * @Author: jeecg-boot
 * @Date:   2024-05-24
 * @Version: V1.0
 */
@Data
@TableName("DispatchListLink")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="DispatchListLink对象", description="DispatchListLink")
public class DispatchListLink {
    
	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
	private String id;
	/**date*/
    @ApiModelProperty(value = "date")
	private java.util.Date date;
	/**erpid*/
	@Excel(name = "erpid", width = 15)
    @ApiModelProperty(value = "erpid")
	private String erpid;
}
