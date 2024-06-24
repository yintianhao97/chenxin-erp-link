package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.u8.entity.VoucherHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 单据code
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@DS("U8")
public interface VoucherHistoryMapper extends BaseMapper<VoucherHistory> {

    /**
     *
     * 查询单据编码
     * @param cardNumber
     * @return
     */
    @Select("select cNumber From VoucherHistory Where CardNumber=#{cardNumber} and cContent is NULL")
    String getCoding(String cardNumber);

    /**
     * 创建编码
     * @return
     */
    @Insert("Insert into VoucherHistory(CardNumber,cNumber) values(#{cardNumber},'0')")
    String createCoing(String cardNumber);

    /**
     * 在没有日期规则的单据中获取最大code编码
     * @param cardNumber U8中单据类型标准
     * @return 最大code编码需要拼接
     */
    @Update("update VoucherHistory set cNumber = cNumber+1 where cardNumber = #{cardNumber}")
    int codingAdd(String cardNumber);

    /**
     * 根据日期规则获取单据编码
     * @param cardNumber U8中单据类型标准
     * @param cseed 日期
     * @return 返回最大编码编号需要通过拼接产生真正的code
     */
    @Select("select cNumber as Maxnumber From VoucherHistory Where CardNumber=#{cardNumber} and cContent='制单日期' and cSeed=#{cseed}")
    String getCodingByDate(String cardNumber,String cseed);

    /**
     * 在系统中没有单据号编码规则的时候创建编码规则
     * @param cardNumber U8中单据类型标准
     * @param cseed 日期
     * @return 返回添加条数
     */
    @Insert("Insert into VoucherHistory(cContentRule,CardNumber,cNumber,cContent,cSeed) values('月',#{cardNumber},'0','制单日期',#{cseed})")
    int createCoingByDate(String cardNumber,String cseed);

    /**
     * 根据cardNumber 和制单日期 增加编码
     * @param cardNumber U8中单据类型标准
     * @param cseed 日期
     * @return 返回是否添加成功
     */
    @Update("update VoucherHistory set cNumber = cNumber+1 where cardNumber = #{cardNumber} and cContent='制单日期' and cSeed=#{cseed}")
    int codingAddByDate(String cardNumber,String cseed);

}
