package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.PoPodetails;
import org.jeecg.modules.u8.mapper.PoPodetailsMapper;
import org.jeecg.modules.u8.service.IPoPodetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 采购订单辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@Service
public class PoPodetailsServiceImpl extends ServiceImpl<PoPodetailsMapper, PoPodetails> implements IPoPodetailsService {
    @Autowired
    private PoPodetailsMapper poPodetailsMapper;
    @Override
    public List<PoPodetails> selectById(Integer id) {
        return poPodetailsMapper.selectById(id);
    }
}
