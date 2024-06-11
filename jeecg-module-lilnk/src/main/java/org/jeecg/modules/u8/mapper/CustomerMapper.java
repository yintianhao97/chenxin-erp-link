package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 客户档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface CustomerMapper extends BaseMapper<Customer> {
    @Select("SELECT *\n" +
            "FROM Customer\n" +
            "WHERE Customer.cCusCode NOT IN (SELECT ErpID FROM u8Link..CustomerLink);")
    List<Customer> selectNoSyn();
}
