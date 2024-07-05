package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.RdRecords01;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购入库辅
 * @Author: jeecg-boot
 * @Date:   2024-06-27
 * @Version: V1.0
 */
@DS("U8")
public interface RdRecords01Mapper extends BaseMapper<RdRecords01> {

    @Select("select * from RdRecords01 where id = #{id}")
    List<RdRecords01> selectBById(String id);
}
