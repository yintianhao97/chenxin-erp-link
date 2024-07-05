package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.link.entity.SjjlXs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 上架记录
 * @Author: jeecg-boot
 * @Date:   2024-07-03
 * @Version: V1.0
 */
@DS("link")
public interface SjjlXsMapper extends BaseMapper<SjjlXs> {

    @Select("select * from SJJL_Xs where DUIYDJBH  LIKE '%T'")
    List<SjjlXs> selectTui();

    @Select("select * from SJJL_Xs where DUIYDJBH  NOT LIKE '%T'")
    List<SjjlXs> selectChu();

    //DELETE FROM SJJL_Xs
    //WHERE SDYDJBH = #{};

    @Delete("DELETE FROM SJJL_Xs\n" +
            "WHERE SDYDJBH = #{SDYDJBH};")
    int deleteBysdydjbh(String SDYDJBH);


    @Delete("DELETE FROM SJJL_Xs\n" +
            "WHERE YSDH = #{YSDH};")
    int deleteByYSDH(String YSDH);
}
