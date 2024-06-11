package org.jeecg.modules.u8.service;

import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.Rdrecords10;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 产成品入库附
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
public interface IRdrecords10Service extends IService<Rdrecords10> {

    List<Rdrecords10> selectByMainId(String id);

}
