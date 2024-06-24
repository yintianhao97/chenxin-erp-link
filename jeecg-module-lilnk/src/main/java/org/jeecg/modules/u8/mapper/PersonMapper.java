package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 人员表
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@DS("U8")
public interface PersonMapper extends BaseMapper<Person> {
    @Select("select * from Person where cPersonName = #{name}")
    Person getByName(String name);
}
