package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.ComputationUnit;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 计量单位
 * @Author: jeecg-boot
 * @Date:   2024-07-01
 * @Version: V1.0
 */
public interface IComputationUnitService extends IService<ComputationUnit> {
    ComputationUnit selectByCode(String code);
}
