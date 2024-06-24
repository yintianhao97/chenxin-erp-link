package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.PoPodetails;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购订单辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
@DS("U8")
public interface PoPodetailsMapper extends BaseMapper<PoPodetails> {

    @Select("select * from PO_Podetails where poid = #{id}")
    public List<PoPodetails> selectById(@Param("id") Integer id);

    @Select("select d.*\n" +
            "from PO_Pomain m\n" +
            "join PO_Podetails d on m.POID=d.POID\n" +
            "where m.cPOID=#{code} and d.ivouchrowno=#{row}")
    PoPodetails getByCodeRow(String code,  String row);
}
