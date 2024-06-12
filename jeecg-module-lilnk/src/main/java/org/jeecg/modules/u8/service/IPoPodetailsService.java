package org.jeecg.modules.u8.service;

import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.PoPodetails;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 采购订单辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-11
 * @Version: V1.0
 */
public interface IPoPodetailsService extends IService<PoPodetails> {
    public List<PoPodetails> selectById(Integer id);
}
