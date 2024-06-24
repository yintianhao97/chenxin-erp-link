package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.DispatchLists;
import org.jeecg.modules.u8.mapper.DispatchListsMapper;
import org.jeecg.modules.u8.service.IDispatchListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 发货单子表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@Service
public class DispatchListsServiceImpl extends ServiceImpl<DispatchListsMapper, DispatchLists> implements IDispatchListsService {
    @Autowired
    private DispatchListsMapper dispatchListsMapper;
    @Override
    public List<DispatchLists> selectById(String id) {
        return dispatchListsMapper.selectByDLID(id);
    }
}
