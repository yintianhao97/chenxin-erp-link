package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.DispatchList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 发货单主表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
public interface IDispatchListService extends IService<DispatchList> {
    List<DispatchList> listType05();
}
