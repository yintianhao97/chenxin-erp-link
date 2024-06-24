package org.jeecg.modules.u8.mapper;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.u8.entity.UaIdentity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 单据id
 * @Author: jeecg-boot
 * @Date:   2024-06-18
 * @Version: V1.0
 */
@DS("U8sys")
public interface UaIdentityMapper extends BaseMapper<UaIdentity> {
    /**
     * 更新iFatherId
     * @param cVouchType
     * @param cAccId
     * @return
     */
    @Update("update UA_Identity set iFatherId = iFatherId+1 where cVouchType = #{cVouchType} and cAcc_Id = #{cAccId}")
    int iFatherIdAdd(String cVouchType,String cAccId);

    /**
     * 更新iChildId
     * @param cVouchType
     * @param cAccId
     * @return
     */
    @Update("update UA_Identity set iChildId = iChildId+1 where cVouchType = #{cVouchType} and cAcc_Id = #{cAccId}")
    int iChildIdAdd(String cVouchType,String cAccId);

    /**
     * 更新iFatherId和iChildId
     * @param cVouchType
     * @param cAccId
     * @return
     */
    @Update("update UA_Identity set iFatherId = iFatherId+1,iChildId = iChildId+1 where cVouchType = #{cVouchType} and cAcc_Id = #{cAccId}")
    int iFatherIdAndIChildIdAdd(String cVouchType,String cAccId);

}
