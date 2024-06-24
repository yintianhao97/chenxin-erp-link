package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.GspVouchsNote;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 销售出库质量符合单辅
 * @Author: jeecg-boot
 * @Date:   2024-06-19
 * @Version: V1.0
 */
@DS("U8")
public interface GspVouchsNoteMapper extends BaseMapper<GspVouchsNote> {

}
