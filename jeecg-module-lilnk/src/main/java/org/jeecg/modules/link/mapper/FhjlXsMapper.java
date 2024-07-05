package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.link.entity.FhjlXs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 复核记录
 * @Author: jeecg-boot
 * @Date:   2024-07-03
 * @Version: V1.0
 */
@DS("link")
public interface FhjlXsMapper extends BaseMapper<FhjlXs> {




/*    @Select("select * from fhjl_xs where NCKLX = '2' and SWFHYMC !=null and IS_TQ!=1 ;")
    List<FhjlXs> SelectXiaoShouFaHuo();

    @Select("select * from fhjl_xs where NCKLX = '3' and SWFHYMC !=null and IS_TQ!=1;")
    List<FhjlXs> SelectCaiGouTuiHuo();*/

    @Select("select nckdid from fhjl_xs where NCKLX = '2' and SWFHYMC IS NOT NULL and IS_TQ!=1 GROUP BY nckdid;")
    List<String> SelectXiaoShouFaHuo();

    //SWFHYMC IS NOT NULL and
    @Select("select nckdid from fhjl_xs where NCKLX = '3' and SWFHYMC IS NOT NULL and  IS_TQ!=1 GROUP BY nckdid;")
    List<String> SelectCaiGouTuiHuo();



    @Select("SELECT * FROM fhjl_xs WHERE NCKDID = #{nckdid} and IS_TQ!=1;")
    List<FhjlXs> selectByNckdid(String nckdid);



    @Update("update fhjl_xs set IS_TQ=1 where NCKDID = #{nckdid}")
    int updateIsTQ(String nckdid);



}
