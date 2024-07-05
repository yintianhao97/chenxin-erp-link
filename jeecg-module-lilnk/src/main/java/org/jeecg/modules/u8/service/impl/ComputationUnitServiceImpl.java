package org.jeecg.modules.u8.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.modules.u8.entity.ComputationUnit;
import org.jeecg.modules.u8.mapper.ComputationUnitMapper;
import org.jeecg.modules.u8.service.IComputationUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 计量单位
 * @Author: jeecg-boot
 * @Date:   2024-07-01
 * @Version: V1.0
 */
@Service
public class ComputationUnitServiceImpl extends ServiceImpl<ComputationUnitMapper, ComputationUnit> implements IComputationUnitService {
    @Autowired
    private ComputationUnitMapper computationUnitMapper;
    @Override
    public ComputationUnit selectByCode(String code) {
        return computationUnitMapper.selectOne(new QueryWrapper<ComputationUnit>().eq("cComunitCode", code));
    }
}
