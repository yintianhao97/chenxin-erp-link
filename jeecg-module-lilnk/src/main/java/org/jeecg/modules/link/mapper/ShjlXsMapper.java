package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.link.entity.ShjlXs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 收货记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@DS("link")
public interface ShjlXsMapper extends BaseMapper<ShjlXs> {

}
