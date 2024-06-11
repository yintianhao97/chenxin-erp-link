package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.Rdrecord10;
import org.jeecg.modules.u8.mapper.Rdrecord10Mapper;
import org.jeecg.modules.u8.service.IRdrecord10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 产成品入库主
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Service
public class Rdrecord10ServiceImpl extends ServiceImpl<Rdrecord10Mapper, Rdrecord10> implements IRdrecord10Service {
    @Autowired
    private Rdrecord10Mapper rdrecord10Mapper;
    @Override
    public List<Rdrecord10> selectNoSyn() {
        return rdrecord10Mapper.selectNoSyn();
    }
}
