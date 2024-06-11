package org.jeecg.modules.u8.service;

import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.DispatchLists;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 发货单子表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
public interface IDispatchListsService extends IService<DispatchLists> {
    List<DispatchLists> selectById(String id);
}
