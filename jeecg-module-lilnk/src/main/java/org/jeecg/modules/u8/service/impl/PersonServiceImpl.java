package org.jeecg.modules.u8.service.impl;

import org.jeecg.modules.u8.entity.Person;
import org.jeecg.modules.u8.mapper.PersonMapper;
import org.jeecg.modules.u8.service.IPersonService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 人员表
 * @Author: jeecg-boot
 * @Date:   2024-06-20
 * @Version: V1.0
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
