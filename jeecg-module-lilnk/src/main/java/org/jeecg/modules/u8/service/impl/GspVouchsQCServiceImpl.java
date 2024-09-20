package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.GspVouchsQC;
import org.jeecg.modules.u8.mapper.GspVouchsQCMapper;
import org.jeecg.modules.u8.service.IGspVouchsQCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 入库验收记录辅
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@Service
public class GspVouchsQCServiceImpl extends ServiceImpl<GspVouchsQCMapper, GspVouchsQC> implements IGspVouchsQCService {
    @Autowired
    private GspVouchsQCMapper gspVouchsQCM;
    @Override
    public List<GspVouchsQC> selectByIdAndRow(String id, String row) {
        return gspVouchsQCM.selectByIdAndRow(id, row);
    }

    @Override
    public List<GspVouchsQC> selectByTid(String tid) {
        return gspVouchsQCM.selectByTid(tid);
    }
}
