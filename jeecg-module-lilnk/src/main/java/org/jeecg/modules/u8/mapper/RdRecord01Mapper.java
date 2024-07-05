package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.RdRecord01;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购入库主
 * @Author: jeecg-boot
 * @Date:   2024-06-27
 * @Version: V1.0
 */
@DS("U8")
public interface RdRecord01Mapper extends BaseMapper<RdRecord01> {
    @Select("select * from RdRecord01 where id = #{id}")
    RdRecord01 selectTById(String id);
}
