package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Rdrecord32;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 销售出库主
 * @Author: jeecg-boot
 * @Date:   2024-06-19
 * @Version: V1.0
 */
@DS("U8")
public interface Rdrecord32Mapper extends BaseMapper<Rdrecord32> {
    @Select("select * from rdrecord32 where id = #{id}")
    Rdrecord32 getById(String id);
}
