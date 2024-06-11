package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 客户档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
public interface ICustomerService extends IService<Customer> {
    List<Customer> selectNoSyn();
}
