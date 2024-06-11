package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.Rdrecord10;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 产成品入库主
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
public interface IRdrecord10Service extends IService<Rdrecord10> {
    List<Rdrecord10> selectNoSyn();
}
