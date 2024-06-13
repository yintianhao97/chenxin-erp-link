package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.Vendor;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 供应商档案
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
public interface IVendorService extends IService<Vendor> {

    List<Vendor> selectNoSyn();
}
