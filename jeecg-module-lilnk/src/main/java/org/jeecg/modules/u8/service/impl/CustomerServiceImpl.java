package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.Customer;
import org.jeecg.modules.u8.mapper.CustomerMapper;
import org.jeecg.modules.u8.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 客户档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> selectNoSyn() {
        return customerMapper.selectNoSyn();
    }
}
