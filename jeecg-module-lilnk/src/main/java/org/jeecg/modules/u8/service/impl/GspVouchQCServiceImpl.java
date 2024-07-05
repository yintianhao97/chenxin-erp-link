package org.jeecg.modules.u8.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jeecg.modules.u8.entity.GspVouchQC;
import org.jeecg.modules.u8.mapper.GspVouchQCMapper;
import org.jeecg.modules.u8.service.IGspVouchQCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 入库验收记录主
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@Service
public class GspVouchQCServiceImpl extends ServiceImpl<GspVouchQCMapper, GspVouchQC> implements IGspVouchQCService {
    @Autowired
    private GspVouchQCMapper gspVouchQCMapper;
    @Override
    public GspVouchQC getByCodeCai(String code) {
        GspVouchQC gspVouchQC = gspVouchQCMapper.selectOne(new QueryWrapper<GspVouchQC>().eq("QCID", code).eq("CVOUCHTYPE", "001"));
        return gspVouchQC;
    }
}
