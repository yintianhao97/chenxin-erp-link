package org.jeecg.modules.u8.mapper;

import java.util.Date;
import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.u8.entity.Gsp_VouchUnsalable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 采购退货出库质量复核记录单主
 * @Author: jeecg-boot
 * @Date:   2024-06-25
 * @Version: V1.0
 */
@DS("U8")

public interface Gsp_VouchUnsalableMapper extends BaseMapper<Gsp_VouchUnsalable> {
    /**
     *
     *
     * @param id 单据id
     * @param code 单据code
     * @param ddate 单据日期
     * @param cgrkId 采购入库单id
     * @param cgrkCode 采购入库单code
     * @param dhdate 到货日期
     * @param gysCode 供应商code
     * @param thrName 退货人
     * @param zdrName 制单人
     * @return 数据库变化条数
     */
    @Insert("insert into GSP_VOUCHUNSALABLE(ID,cVouchCode,cVouchType,cDepCode,dDate,iRdId,cRdCode,dArvdate,cVenCode,cRdMaker,cMaker,cVerifier,cMemo,cWhCode,bRefer,Vt_id,cDefine1,cDefine2,cDefine3,cDefine4,cDefine5,cDefine6,cDefine7,cDefine8,cDefine9,cDefine10,cDefine11,cDefine12,cDefine13,cDefine14,cDefine15,cDefine16,IsWfControlled,iVerifyState,cCurrentAuditor,cmodifier,dmoddate,dverifydate,dverifysystime,dmodifysystime) " +
            "values(#{id}, #{code},'091',Null,#{ddate},#{cgrkId}, #{cgrkCode},#{dhdate}, #{gysCode}, #{thrName}, #{zdrName},#{shName},Null, #{ckCode},1,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,0,0,Null,Null,Null,#{shDate},#{shTime},Null)")
    int addVouchT(String id, String code, Date ddate, String cgrkId, String cgrkCode, Date dhdate, String gysCode, String thrName, String zdrName, String shName,String ckCode,Date shDate,Date shTime);

}
