package org.jeecg.modules.u8.mapper;

import java.util.Date;
import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.jeecg.modules.u8.entity.GspVouchNote;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 销售出库质量符合单主
 * @Author: jeecg-boot
 * @Date:   2024-06-19
 * @Version: V1.0
 */
@DS("U8")
public interface GspVouchNoteMapper extends BaseMapper<GspVouchNote> {
    @Update("insert into GSP_VouchNote(ID,NOTEID,CDEPCODE,DDATE,CMAKER,CVERIFIER,ICODE,CCODE,CCHAR,CNUMBER,CSORT,CVOUCHTYPE,CPRINCIPAL,DSUMDATE,CPERSONLIST,CMIND,CUNITCODE,CPAGE,CMEMO,IVTID,BREFER,CSHIPPER,CDEFINE1,CDEFINE2,CDEFINE3,CDEFINE4,CDEFINE5,CDEFINE6,CDEFINE7,CDEFINE8,CDEFINE9,CDEFINE10,CDEFINE11,CDEFINE12,CDEFINE13,CDEFINE14,CDEFINE15,CDEFINE16,cPersonName,IsWfControlled,iVerifyState,cCurrentAuditor,cmodifier,dmoddate,dverifydate,dverifysystime,dmodifysystime,IPLANTYPE) values(#{id}, #{code}, #{bumen},'2023-08-19', #{cmaker},'demo',Null,Null,Null,Null,Null,'010',Null,Null,Null,Null,Null,Null,Null,230,1,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,0,0,Null,Null,Null,#{date},#{date},Null,Null)")
    int addVouchNote(String id, String code, String cmaker, String bumen, Date date);
}
