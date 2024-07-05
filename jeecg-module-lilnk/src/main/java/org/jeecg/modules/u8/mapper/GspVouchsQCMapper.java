package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.GspVouchQC;
import org.jeecg.modules.u8.entity.GspVouchsQC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 入库验收记录辅
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@DS("U8")
public interface GspVouchsQCMapper extends BaseMapper<GspVouchsQC> {

    @Select("select * from Gsp_vouchsqc where id = #{tid}")
    List<GspVouchsQC> selectByTid(String tid);

    @Select("SELECT *\n" +
            "FROM GSP_VouchsQC\n" +
            "WHERE id = #{id} and REVERSE(SUBSTRING(REVERSE(CBSYSBARCODE), 1, CHARINDEX('|', REVERSE(CBSYSBARCODE)) - 1)) = #{row};")
    List<GspVouchsQC> selectByIdAndRow(String id, String row);
}
