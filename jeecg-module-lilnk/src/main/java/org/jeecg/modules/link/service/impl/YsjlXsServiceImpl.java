package org.jeecg.modules.link.service.impl;

import org.jeecg.modules.link.entity.ShjlXs;
import org.jeecg.modules.link.entity.YsjlXs;
import org.jeecg.modules.link.mapper.YsjlXsMapper;
import org.jeecg.modules.link.service.IYsjlXsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 验收记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@Service
public class YsjlXsServiceImpl extends ServiceImpl<YsjlXsMapper, YsjlXs> implements IYsjlXsService {
    @Autowired
    private YsjlXsMapper ysjlXsMapper;
    /*@Override
    public List<String> getCodeListGroupCode() {
        return ysjlXsMapper.getCodeListGroupCode();
    }*/

    @Override
    public List<String> getCodeListGroupCodeCai() {
        return ysjlXsMapper.getCodeListGroupCodeCai();
    }

    @Override
    public List<String> getCodeListGroupCodeTui() {
        return ysjlXsMapper.getCodeListGroupCodeTui();
    }

    @Override
    public int updateIsTq(String ysdjbh) {
        return ysjlXsMapper.updateIsTq(ysdjbh);
    }

    @Override
    public List<YsjlXs> getListByCode(String code) {
        return ysjlXsMapper.getListByCode(code);
    }
}
