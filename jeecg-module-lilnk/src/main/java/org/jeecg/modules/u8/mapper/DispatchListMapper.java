package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.DispatchList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 发货单主表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface DispatchListMapper extends BaseMapper<DispatchList> {
    @Select("SELECT DispatchList.*\n" +
            "FROM DispatchList\n" +
            "JOIN DispatchLists ON DispatchList.DLID = DispatchLists.DLID\n" +
            "WHERE DispatchList.cVouchType = '05' AND DispatchList.DLID NOT IN (SELECT ErpID FROM u8Link..DispatchListLink) and DispatchLists.cInvCode = 'C03048'")
    List<DispatchList> listType05();



}
