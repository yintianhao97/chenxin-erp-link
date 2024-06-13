package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.Vendor;
import org.jeecg.modules.u8.mapper.VendorMapper;
import org.jeecg.modules.u8.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 供应商档案
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@Service
public class VendorServiceImpl extends ServiceImpl<VendorMapper, Vendor> implements IVendorService {
    @Autowired
    private VendorMapper vendorMapper;
    @Override
    public List<Vendor> selectNoSyn() {
        return vendorMapper.selectNoSyn();
    }
}
