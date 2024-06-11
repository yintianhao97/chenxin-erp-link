package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.Rdrecords10;
import org.jeecg.modules.u8.mapper.Rdrecords10Mapper;
import org.jeecg.modules.u8.service.IRdrecords10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 产成品入库附
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Service
public class Rdrecords10ServiceImpl extends ServiceImpl<Rdrecords10Mapper, Rdrecords10> implements IRdrecords10Service {
    @Autowired
    private Rdrecords10Mapper rdrecords10Mapper;
    @Override
    public List<Rdrecords10> selectByMainId(String id) {
        return rdrecords10Mapper.selectByMainId(id);
    }
}
