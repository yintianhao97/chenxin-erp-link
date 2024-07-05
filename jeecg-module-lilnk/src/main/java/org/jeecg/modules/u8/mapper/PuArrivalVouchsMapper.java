package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.u8.entity.PuArrivalVouch;
import org.jeecg.modules.u8.entity.PuArrivalVouchs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购到货退货辅表
 * @Author: jeecg-boot
 * @Date: 2024-06-13
 * @Version: V1.0
 */
@DS("U8")
public interface PuArrivalVouchsMapper extends BaseMapper<PuArrivalVouchs> {

    @Select("select * from PU_ArrivalVouchs where id = #{id}")
    List<PuArrivalVouchs> getDaohuoFByID(String id);


    @Select("select * from PU_ArrivalVouchs where Autoid = #{id}")
    PuArrivalVouchs getDaohuoFByAutoID(String id);


    @Select("select * from PU_ArrivalVouchs where id = #{id} and ivouchrowno = #{row}")
    PuArrivalVouchs getByIdAndRow(String id, String row);


    @Update("UPDATE PU_ArrivalVouchs\n" +
            "SET fRealQuantity = COALESCE(fRealQuantity, 0) + #{shishou},   -- 实收数量 \n" +
            " fValidQuantity = COALESCE(fValidQuantity, 0) + #{hege},    -- 验收数量 - 拒收数量 = 合格数量\n" +
            " finValidQuantity = COALESCE(finValidQuantity, 0) + #{buhege},  -- 不合格数量\n" +
            " fInspectQuantity = COALESCE(fInspectQuantity, 0) + #{leijibaojian}, --累计包间数量\n" +
            " fInspectNum = COALESCE(fInspectNum, 0) + #{leijibaojianjian}  --累计报检件数 \n" +
            "WHERE Autoid = #{autoid}")
    int updateYanShou(String autoid, Long shishou, Long hege, Long buhege, Long leijibaojian, Long leijibaojianjian);
}
