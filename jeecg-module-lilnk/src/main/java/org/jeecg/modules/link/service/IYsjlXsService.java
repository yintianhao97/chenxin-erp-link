package org.jeecg.modules.link.service;

import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.link.entity.ShjlXs;
import org.jeecg.modules.link.entity.YsjlXs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: 验收记录
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
public interface IYsjlXsService extends IService<YsjlXs> {



    List<String> getCodeListGroupCodeCai();


    List<String> getCodeListGroupCodeTui();




    List<YsjlXs> getListByCode(String code);


    int updateIsTq(String ysdjbh);
}
