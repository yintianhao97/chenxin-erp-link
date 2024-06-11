package org.jeecg.modules.link.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.link.entity.linkAutoId;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: linkAutoId
 * @Author: jeecg-boot
 * @Date:   2024-05-25
 * @Version: V1.0
 */
public interface linkAutoIdMapper extends BaseMapper<linkAutoId> {

    @Update("UPDATE link_autoId set Customer_ID = Customer_ID + 1")
    int uptateCustomerIdAdd();

    @Update("UPDATE link_autoId set Inventory_ID = Inventory_ID + 1")
    int uptateInventoryIdAdd();
    @Select("select * from link_autoId where ID = 1")
    linkAutoId selectBy1();
}
