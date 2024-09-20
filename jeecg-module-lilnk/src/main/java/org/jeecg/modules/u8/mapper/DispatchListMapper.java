package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.DispatchList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 发货单主表
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface DispatchListMapper extends BaseMapper<DispatchList> {
    @Select("select m.* from DispatchList m\n" +
            "join DispatchList_extradefine d on m.DLID=d.DLID\n" +
            "where d.chdefine15 = '山东天瑞' and m.cVouchType = '05' and m.dverifydate is not null and m.bReturnFlag = '0' and m.DLID NOT IN (SELECT ErpID FROM u8Link..DispatchListLink);\n")
    List<DispatchList> selectNoSynFa();



    @Select("select m.* from DispatchList m\n" +
            "join DispatchList_extradefine d on m.DLID=d.DLID\n" +
            "where  d.chdefine15 = '山东天瑞' and m.cVouchType = '05' and m.dverifydate is not null and isnull(m.bReturnFlag,0)=1 and  isnull(m.bfirst,0)=0 and m.DLID NOT IN (SELECT ErpID FROM u8Link..DispatchListLink);\n")
    List<DispatchList> selectNoSynTui();


    @Select("select * from DispatchList where DLID = #{id}")
    DispatchList getById(String id);

    @Select("select * from DispatchList where cDLCode = #{code}")
    DispatchList getByCode(String code);

}
