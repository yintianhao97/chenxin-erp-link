package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.PuArrivalVouchs;
import org.jeecg.modules.u8.mapper.PuArrivalVouchsMapper;
import org.jeecg.modules.u8.service.IPuArrivalVouchsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 采购到货退货辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
@Service
public class PuArrivalVouchsServiceImpl extends ServiceImpl<PuArrivalVouchsMapper, PuArrivalVouchs> implements IPuArrivalVouchsService {
    @Autowired
    private PuArrivalVouchsMapper puArrivalVouchsMapper;
    @Override
    public List<PuArrivalVouchs> getDaohuoFByID(String id) {
        return puArrivalVouchsMapper.getDaohuoFByID(id);
    }

    @Override
    public int updateYanShou(String autoid, Long shishou, Long hege, Long buhege, Long leijibaojian, Long leijibaojianjian) {
      return   puArrivalVouchsMapper.updateYanShou(autoid, shishou, hege, buhege, leijibaojian, leijibaojianjian);
    }
}
