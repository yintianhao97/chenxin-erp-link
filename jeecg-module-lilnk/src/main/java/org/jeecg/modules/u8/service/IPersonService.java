package org.jeecg.modules.u8.service;

import org.jeecg.modules.u8.entity.Person;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 人员表
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
public interface IPersonService extends IService<Person> {
    Person getByName(String name);

    String getCodeByName(String name);
}
