package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Rdrecords10;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 产成品入库附
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface Rdrecords10Mapper extends BaseMapper<Rdrecords10> {
    @Select("select * from Rdrecords10 where ID = #{id}")
    List<Rdrecords10> selectByMainId(@Param("id")String id);
}
