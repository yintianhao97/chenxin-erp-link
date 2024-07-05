package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.ComputationUnit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 计量单位
 * @Author: jeecg-boot
 * @Date:   2024-07-01
 * @Version: V1.0
 */
@DS("U8")
public interface ComputationUnitMapper extends BaseMapper<ComputationUnit> {

}
