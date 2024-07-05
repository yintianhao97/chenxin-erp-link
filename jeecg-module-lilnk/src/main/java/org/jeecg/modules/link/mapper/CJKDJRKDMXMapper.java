package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.link.entity.CJKDJRKD;
import org.jeecg.modules.link.entity.CJKDJRKDMX;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 上架子单据
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@DS("link")
public interface CJKDJRKDMXMapper extends BaseMapper<CJKDJRKDMX> {

    @Select("select * from CJK_DJ_RKDMX where SJKID = #{id}")
    List<CJKDJRKD> selectBycodeID(String id);
}
