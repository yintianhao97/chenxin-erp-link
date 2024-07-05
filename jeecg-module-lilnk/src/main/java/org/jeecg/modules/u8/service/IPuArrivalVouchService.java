package org.jeecg.modules.u8.service;

import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.PuArrivalVouch;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 采购到货退货主表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
public interface IPuArrivalVouchService extends IService<PuArrivalVouch> {

    PuArrivalVouch getDaoHuoByCode(String code);



    List<PuArrivalVouch> getTuiHuo();
}
