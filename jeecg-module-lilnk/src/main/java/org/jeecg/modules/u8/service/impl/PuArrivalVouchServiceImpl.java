package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.PuArrivalVouch;
import org.jeecg.modules.u8.mapper.PuArrivalVouchMapper;
import org.jeecg.modules.u8.service.IPuArrivalVouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 采购到货退货主表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
@Service
public class PuArrivalVouchServiceImpl extends ServiceImpl<PuArrivalVouchMapper, PuArrivalVouch> implements IPuArrivalVouchService {
    @Autowired
    private PuArrivalVouchMapper puArrivalVouchMapper;

    @Override
    public PuArrivalVouch getDaoHuoByCode(String code) {
        return puArrivalVouchMapper.getDaoHuoByCode(code);
    }

    @Override
    public List<PuArrivalVouch> getTuiHuo() {
        return puArrivalVouchMapper.getTuiHuo();
    }
}
