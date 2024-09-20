package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.PuArrivalVouch;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购到货退货主表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
@DS("U8")
public interface PuArrivalVouchMapper extends BaseMapper<PuArrivalVouch> {

    @Select("select * from PU_ArrivalVouch where iBillType = 0 and cCode = #{code} ")
    PuArrivalVouch getDaoHuoByCode(String code);

    @Select("select * from PU_ArrivalVouch where id = #{id} ")
    PuArrivalVouch getVouchById(String id);

    /**
     *
     * @return
     */
    @Select("select m.* from PU_ArrivalVouch  m\n" +
            "join PU_ArrivalVouch_extradefine d on m.id=d.id\n" +
            "where d.chdefine15 = '山东天瑞' and m.cAuditDate is not null and m.bNegative= N'1'  and m.cBusType <> N'委外加工' and isnull(m.cvouchtype,'') <> N'IM26' and isnull(m.cvouchtype,'') <> N'IM27' and m.iBillType = N'1' and m.ID NOT IN (SELECT ErpID FROM u8Link..TuiHuoLink);\n")
    List<PuArrivalVouch> getTuiHuo();


}
