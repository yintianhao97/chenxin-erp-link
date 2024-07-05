package org.jeecg.modules.link.service.impl;

import org.jeecg.modules.link.entity.ShjlXs;
import org.jeecg.modules.link.mapper.ShjlXsMapper;
import org.jeecg.modules.link.service.IShjlXsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 收货记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@Service
public class ShjlXsServiceImpl extends ServiceImpl<ShjlXsMapper, ShjlXs> implements IShjlXsService {
    @Autowired
    private ShjlXsMapper shjlXsMapper;

    @Override
    public List<String> getCodeListGroupCode() {
        return shjlXsMapper.getCodeListGroupCode();
    }

    @Override
    public List<ShjlXs> getListByCode(String code) {
        return shjlXsMapper.getListByCode(code);
    }

    @Override
    public int updateIsTqInt(String code) {
        return shjlXsMapper.updateIsTqInt(code);
    }
}
