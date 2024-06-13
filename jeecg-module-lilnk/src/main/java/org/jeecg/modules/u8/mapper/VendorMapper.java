package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Customer;
import org.jeecg.modules.u8.entity.Vendor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 供应商档案
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@DS("U8")
public interface VendorMapper extends BaseMapper<Vendor> {

    @Select("SELECT *\n" +
            "FROM Vendor\n" +
            "WHERE Vendor.cVenCode NOT IN (SELECT ErpID FROM u8Link..VendorLink);")
    List<Vendor> selectNoSyn();

}
