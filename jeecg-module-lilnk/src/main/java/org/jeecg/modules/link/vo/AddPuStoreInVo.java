package org.jeecg.modules.link.vo;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AddPuStoreInVo {

    /// <summary>
    /// 部门
    /// </summary>
    private String cDepCode ;

    /// <summary>
    /// 到货单code
    /// </summary>
    private String cbuscode ;


    /// <summary>
    /// 供应商编码
    /// </summary>
    private String cVenCode ;


    /// <summary>
    /// 仓库编码
    /// </summary>
    private String cwhcode ;

    /// <summary>
    /// 采购订单号
    /// </summary>
    private String cordercode ;

    /// <summary>
    /// 采购到货单号
    /// </summary>
    private String carvcode ;

    /// <summary>
    /// 采购到货单ID
    /// </summary>
    private String ipurarriveid ;

    /// <summary>
    /// 业务员编码
    /// </summary>
    private String cpersoncode ;
    /// <summary>
    /// 创建人
    /// </summary>
    private String cMaker ;

    private String cchkcode ;

    /// <summary>
    /// 物料编码
    /// </summary>
    private String cInvCode ;

    /// <summary>
    /// 辅助计量单位
    /// </summary>
    private String cassunit ;

    /// <summary>
    /// cbatch
    /// </summary>
    private String cbatch ;

    /// <summary>
    /// 失效日期
    /// </summary>
    private String dvdate ;

    /// <summary>
    /// 生产日期
    /// </summary>
    private String dmadedate ;


    /// <summary>
    /// 件数
    /// </summary>
    private BigDecimal inum ;

    /// <summary>
    /// 采购到货单行ID
    /// </summary>
    private String iarrsid ;
    /// <summary>
    /// 到货单号
    /// </summary>
    private String cbarvcode ;
    /// <summary>
    /// 订单行id
    /// </summary>
    private String iposid ;
    /// <summary>
    /// 税率
    /// </summary>
    private BigDecimal itaxrate ;
    /// <summary>
    /// 原币含税单价
    /// </summary>
    private BigDecimal ioritaxcost ;

    /// <summary>
    /// 数量
    /// </summary>
    private BigDecimal iQuantity ;


    private String icheckids ;

    private BigDecimal iinvexchrate;
}
