package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.GspVouchsQC;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 入库验收记录辅
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
public interface IGspVouchsQCService extends IService<GspVouchsQC> {
    List<GspVouchsQC> selectByIdAndRow(String id, String row);


    List<GspVouchsQC> selectByTid(String tid);
}
