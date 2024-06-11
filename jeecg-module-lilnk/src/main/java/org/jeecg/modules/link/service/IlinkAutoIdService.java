package org.jeecg.modules.link.service;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.link.entity.linkAutoId;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: linkAutoId
 * @Author: jeecg-boot
 * @Date:   2024-05-25
 * @Version: V1.0
 */
public interface IlinkAutoIdService extends IService<linkAutoId> {
    int uptateCustomerIdAdd();

    int uptateInventoryIdAdd();
    linkAutoId selectBy1();
}
