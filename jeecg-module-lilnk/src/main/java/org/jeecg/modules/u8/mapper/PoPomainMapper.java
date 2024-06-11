package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.PoPomain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购订单主表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@DS("U8")
public interface PoPomainMapper extends BaseMapper<PoPomain> {

}
