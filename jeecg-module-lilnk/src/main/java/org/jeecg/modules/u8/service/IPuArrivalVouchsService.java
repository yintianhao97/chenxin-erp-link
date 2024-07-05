package org.jeecg.modules.u8.service;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.u8.entity.PuArrivalVouchs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 采购到货退货辅表
 * @Author: jeecg-boot
 * @Date:   2024-06-13
 * @Version: V1.0
 */
public interface IPuArrivalVouchsService extends IService<PuArrivalVouchs> {



    List<PuArrivalVouchs> getDaohuoFByID(String id);


    int updateYanShou(String autoid, Long shishou, Long hege, Long buhege, Long leijibaojian, Long leijibaojianjian);

}
