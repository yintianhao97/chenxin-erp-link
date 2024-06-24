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


}
