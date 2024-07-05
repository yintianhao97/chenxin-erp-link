package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.GspVouchQC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 入库验收记录主
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@DS("U8")
public interface GspVouchQCMapper extends BaseMapper<GspVouchQC> {
    @Select("select * from GSP_VouchQC where QCID = #{vouchCode} ")
    GspVouchQC selectVouchByCode(String vouchCode);





}
