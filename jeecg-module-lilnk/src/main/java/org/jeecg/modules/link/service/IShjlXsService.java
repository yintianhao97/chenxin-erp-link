package org.jeecg.modules.link.service;

import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.link.entity.ShjlXs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 收货记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
public interface IShjlXsService extends IService<ShjlXs> {

    List<String> getCodeListGroupCode();


    List<ShjlXs> getListByCode(String code);


    int updateIsTqInt(String code);
}
