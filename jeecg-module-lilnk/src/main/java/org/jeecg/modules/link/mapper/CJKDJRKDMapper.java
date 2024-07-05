package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.link.entity.CJKDJRKD;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 上架汇总
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@DS("link")
public interface CJKDJRKDMapper extends BaseMapper<CJKDJRKD> {

    @Select("select * from CJK_DJ_RKD where shzid = 'HXS' and NRKLX = '4' and NJSBJ = '0';")
    List<CJKDJRKD> selectXiaoShouTui();
}
