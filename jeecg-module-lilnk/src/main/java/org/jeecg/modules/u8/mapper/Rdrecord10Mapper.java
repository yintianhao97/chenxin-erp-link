package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.u8.entity.Rdrecord10;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 产成品入库主
 * @Author: jeecg-boot
 * @Date:   2024-05-21
 * @Version: V1.0
 */
@DS("U8")
public interface Rdrecord10Mapper extends BaseMapper<Rdrecord10> {

    @Select("SELECT Rdrecord10.*\n" +
            "FROM Rdrecord10\n" +
            "JOIN Rdrecords10 ON Rdrecord10.id = Rdrecords10.id\n" +
            "WHERE Rdrecord10.ID NOT IN (SELECT ErpID FROM u8Link..Rdrecord10Link) and Rdrecords10.cInvCode = 'C03048'")
    List<Rdrecord10> selectNoSyn();


/*    @Select("SELECT *\n" +
            "FROM Rdrecord10\n" +
            "WHERE Rdrecord10.ID NOT IN (SELECT ErpID FROM u8Link..Rdrecord10Link)")
    List<Rdrecord10> selectNoSyn();*/
}
