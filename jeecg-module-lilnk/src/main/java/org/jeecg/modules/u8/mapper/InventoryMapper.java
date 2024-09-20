package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Inventory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 存货档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface InventoryMapper extends BaseMapper<Inventory> {
    @Select("SELECT *\n" +
            "FROM Inventory\n" +
            "WHERE  Inventory.cInvCode NOT IN (SELECT ErpID FROM u8Link..InventoryLink) and cInvCCode not LIKE  '20004%' and cInvCCode not LIKE  '20006%' and cInvCCode not LIKE  '20008%'\n")
    List<Inventory> selectNoSyn();


    @Select("select iChangRate  FROM  computationUnit where cComunitCode = #{unitCode}")
    Long getHuanSuanLv(String unitCode);

    @Select("select * from Inventory where  cInvCode = 'C03048'")
    Inventory selectCodeC03048();

}
