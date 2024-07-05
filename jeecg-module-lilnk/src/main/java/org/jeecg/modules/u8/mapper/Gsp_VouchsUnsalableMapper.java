package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.Gsp_VouchsUnsalable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购退货出库质量复核记录单辅
 * @Author: jeecg-boot
 * @Date:   2024-06-25
 * @Version: V1.0
 */
@DS("U8")
public interface Gsp_VouchsUnsalableMapper extends BaseMapper<Gsp_VouchsUnsalable> {

}
