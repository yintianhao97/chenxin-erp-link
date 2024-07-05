package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.Inventory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 存货档案
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
public interface IInventoryService extends IService<Inventory> {
    List<Inventory> selectNoSyn();

    Long getHuanSuanLv(String unitCode);
}
