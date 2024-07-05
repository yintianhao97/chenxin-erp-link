package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.Inventory;
import org.jeecg.modules.u8.mapper.InventoryMapper;
import org.jeecg.modules.u8.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 存货档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements IInventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;
    @Override
    public List<Inventory> selectNoSyn() {
        return inventoryMapper.selectNoSyn();
    }

    @Override
    public Long getHuanSuanLv(String unitCode) {
        return inventoryMapper.getHuanSuanLv(unitCode);
    }
}
