package org.jeecg.modules.link.service.impl;

import org.jeecg.modules.link.entity.linkAutoId;
import org.jeecg.modules.link.mapper.linkAutoIdMapper;
import org.jeecg.modules.link.service.IlinkAutoIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: linkAutoId
 * @Author: jeecg-boot
 * @Date:   2024-05-25
 * @Version: V1.0
 */
@Service
public class linkAutoIdServiceImpl extends ServiceImpl<linkAutoIdMapper, linkAutoId> implements IlinkAutoIdService {
    @Autowired
    private linkAutoIdMapper linkAutoIdMapper;

    @Override
    public int uptateCustomerIdAdd() {
        return linkAutoIdMapper.uptateCustomerIdAdd();
    }

    @Override
    public int uptateInventoryIdAdd() {
        return linkAutoIdMapper.uptateInventoryIdAdd();
    }

    @Override
    public linkAutoId selectBy1() {
        return linkAutoIdMapper.selectBy1();
    }
}
