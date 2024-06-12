package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.PoPomain;
import org.jeecg.modules.u8.mapper.PoPomainMapper;
import org.jeecg.modules.u8.service.IPoPomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 采购订单主表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@Service
public class PoPomainServiceImpl extends ServiceImpl<PoPomainMapper, PoPomain> implements IPoPomainService {
    @Autowired
    private PoPomainMapper poPomainMapper;

    @Override
    public List<PoPomain> selectNoSyn() {
        return poPomainMapper.selectNoSyn();
    }
}
