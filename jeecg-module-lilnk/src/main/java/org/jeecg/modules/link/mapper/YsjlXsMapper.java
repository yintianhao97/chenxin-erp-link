package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.link.entity.ShjlXs;
import org.jeecg.modules.link.entity.YsjlXs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 验收记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@DS("link")
public interface YsjlXsMapper extends BaseMapper<YsjlXs> {

    @Select("SELECT ysdjbh FROM ysjl_xs WHERE DJLX =1 AND IS_TQ !=1 GROUP BY ysdjbh")
    List<String> getCodeListGroupCodeCai();


    @Select("SELECT ysdjbh FROM ysjl_xs WHERE DJLX =2 AND IS_TQ !=1 GROUP BY ysdjbh")
    List<String> getCodeListGroupCodeTui();


    @Select("select * FROM ysjl_xs where ysdjbh = #{code}")
    List<YsjlXs> getListByCode(String code);

    @Update("update ysjl_xs set IS_TQ = 1 where YSDJBH = #{ysdjbh}")
    int updateIsTq(String ysdjbh);
}
