package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.DispatchLists;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 发货单子表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface DispatchListsMapper extends BaseMapper<DispatchLists> {
    @Select("select * from DispatchLists where DLID = #{id}")
    List<DispatchLists> selectByDLID(@Param("id")String id);

    @Select("select * from DispatchLists where DLID = #{id} and irowno = #{row}")
    DispatchLists selectByDLIDAndRow(String id,String row);
}
