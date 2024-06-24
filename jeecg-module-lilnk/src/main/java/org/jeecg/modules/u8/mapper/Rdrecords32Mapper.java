package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Rdrecords32;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 销售出库辅
 * @Author: jeecg-boot
 * @Date: 2024-06-19
 * @Version: V1.0
 */
@DS("U8")
public interface Rdrecords32Mapper extends BaseMapper<Rdrecords32> {
    @Select("select * from rdrecords32  where cbdlcode  = #{cbdlcode} ")
    List<Rdrecords32> getByCbdlcode(String cbdlcode);
}
