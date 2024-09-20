package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    @Select("SELECT SHDJBH\n" +
            "FROM shjl_xs\n" +
            "where IS_TQ !=1\n" +
            "GROUP BY SHDJBH")
    List<String> getCodeListGroupCode();

    @Select("select * FROM shjl_xs where SHDJBH = #{code}")
    List<ShjlXs> getListByCode(String code);

    @Select("update shjl_xs\n" +
            "set IS_TQ = 1\n" +
            "where SHDJBH = #{code}")
    int updateIsTqInt(String code);
}
