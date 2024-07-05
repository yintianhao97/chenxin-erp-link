package org.jeecg.modules.link.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.link.entity.CJKDJCKJHD;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 下架汇总
 * @Author: jeecg-boot
 * @Date:   2024-06-12
 * @Version: V1.0
 */
@DS("link")
public interface CJKDJCKJHDMapper extends BaseMapper<CJKDJCKJHD> {


//    -- 采购退货
//    select * from CJK_DJ_CKJHD where SHZGSID = 'HXS' and NCKLX = '8' and  NJSBJ = '0';
    @Select("select * from CJK_DJ_CKJHD where SHZGSID = 'HXS' and NCKLX = '8' and  NJSBJ = '0'")
   List<CJKDJCKJHD> selectCJKDJCKJHDTui();


//-- 销售发货
//    select * from CJK_DJ_CKJHD where SHZGSID = 'HXS' and NCKLX = '2' and  NJSBJ = '0'
    @Select("select * from CJK_DJ_CKJHD where SHZGSID = 'HXS' and NCKLX = '2' and  NJSBJ = '0'")
    List<CJKDJCKJHD> selectCJKDJCKJHDFa();
}
