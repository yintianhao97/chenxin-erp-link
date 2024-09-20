package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Select("select * from SJJL_Xs where DUIYDJBH  LIKE '%T' and IS_TQ!=1")
    List<SjjlXs> selectTui();

    @Select("select * from SJJL_Xs where DUIYDJBH  NOT LIKE '%T' and IS_TQ!=1")
    List<SjjlXs> selectChu();


    @Select("select YSDH from SJJL_Xs where DUIYDJBH  NOT LIKE '%T' and IS_TQ!=1 ORDER BY YSDH")
    List<String> selectChuOrder();

    @Select("select * from SJJL_Xs WHERE YSDH = #{YSDH} and IS_TQ!=1;")
    List<String> selectByYsdh(String YSDH);





    //DELETE FROM SJJL_Xs
    //WHERE SDYDJBH = #{};

    @Delete("DELETE FROM SJJL_Xs\n" +
            "WHERE SDYDJBH = #{SDYDJBH};")
    int deleteBysdydjbh(String SDYDJBH);


    @Delete("DELETE FROM SJJL_Xs\n" +
            "WHERE YSDH = #{YSDH};")
    int deleteByYSDH(String YSDH);




    //DELETE FROM SJJL_Xs
    //WHERE SDYDJBH = #{};    update SJJL_Xs set IS_TQ=1

    @Update("update SJJL_Xs set IS_TQ=1 WHERE SDYDJBH = #{SDYDJBH};")
    int update1Bysdydjbh(String SDYDJBH);


    @Update("update SJJL_Xs set IS_TQ=1 WHERE YSDH = #{YSDH};")
    int update1ByYSDH(String YSDH);
}
