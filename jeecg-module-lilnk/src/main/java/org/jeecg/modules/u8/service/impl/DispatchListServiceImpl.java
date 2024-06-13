package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.DispatchList;
import org.jeecg.modules.u8.mapper.DispatchListMapper;
import org.jeecg.modules.u8.service.IDispatchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 发货单主表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Service
public class DispatchListServiceImpl extends ServiceImpl<DispatchListMapper, DispatchList> implements IDispatchListService {
    @Autowired
    private DispatchListMapper dispatchListMapper;

    @Override
    public List<DispatchList> selectNoSynFa() {
        return dispatchListMapper.selectNoSynFa();
    }

    @Override
    public List<DispatchList> selectNoSynTui() {
        return dispatchListMapper.selectNoSynTui();
    }
}
