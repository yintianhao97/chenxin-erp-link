<template>
  <j-modal
    :title="title"
    :width="800"
    :visible="visible"
    :confirmLoading="confirmLoading"
    switchFullscreen
    @ok="handleOk"
    @cancel="handleCancel"
    cancelText="关闭">
    
    <a-spin :spinning="confirmLoading">
      <a-form-model ref="form" :model="model" :rules="validatorRules">
      
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="autoid" label="autoid">
          <a-input-number v-model="model.autoid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cwhcode" label="cwhcode">
          <a-input placeholder="请输入cwhcode" v-model="model.cwhcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cinvcode" label="cinvcode">
          <a-input placeholder="请输入cinvcode" v-model="model.cinvcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="inum" label="inum">
          <a-input-number v-model="model.inum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iquantity" label="iquantity">
          <a-input-number v-model="model.iquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ioricost" label="ioricost">
          <a-input-number v-model="model.ioricost"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ioritaxcost" label="ioritaxcost">
          <a-input-number v-model="model.ioritaxcost"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iorimoney" label="iorimoney">
          <a-input placeholder="请输入iorimoney" v-model="model.iorimoney" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ioritaxprice" label="ioritaxprice">
          <a-input placeholder="请输入ioritaxprice" v-model="model.ioritaxprice" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iorisum" label="iorisum">
          <a-input placeholder="请输入iorisum" v-model="model.iorisum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="icost" label="icost">
          <a-input-number v-model="model.icost"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="imoney" label="imoney">
          <a-input placeholder="请输入imoney" v-model="model.imoney" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="itaxprice" label="itaxprice">
          <a-input placeholder="请输入itaxprice" v-model="model.itaxprice" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="isum" label="isum">
          <a-input placeholder="请输入isum" v-model="model.isum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree1" label="cfree1">
          <a-input placeholder="请输入cfree1" v-model="model.cfree1" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree2" label="cfree2">
          <a-input placeholder="请输入cfree2" v-model="model.cfree2" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree3" label="cfree3">
          <a-input placeholder="请输入cfree3" v-model="model.cfree3" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree4" label="cfree4">
          <a-input placeholder="请输入cfree4" v-model="model.cfree4" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree5" label="cfree5">
          <a-input placeholder="请输入cfree5" v-model="model.cfree5" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree6" label="cfree6">
          <a-input placeholder="请输入cfree6" v-model="model.cfree6" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree7" label="cfree7">
          <a-input placeholder="请输入cfree7" v-model="model.cfree7" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree8" label="cfree8">
          <a-input placeholder="请输入cfree8" v-model="model.cfree8" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree9" label="cfree9">
          <a-input placeholder="请输入cfree9" v-model="model.cfree9" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfree10" label="cfree10">
          <a-input placeholder="请输入cfree10" v-model="model.cfree10" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="itaxrate" label="itaxrate">
          <a-input-number v-model="model.itaxrate"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine22" label="cdefine22">
          <a-input placeholder="请输入cdefine22" v-model="model.cdefine22" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine23" label="cdefine23">
          <a-input placeholder="请输入cdefine23" v-model="model.cdefine23" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine24" label="cdefine24">
          <a-input placeholder="请输入cdefine24" v-model="model.cdefine24" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine25" label="cdefine25">
          <a-input placeholder="请输入cdefine25" v-model="model.cdefine25" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine26" label="cdefine26">
          <a-input placeholder="请输入cdefine26" v-model="model.cdefine26" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine27" label="cdefine27">
          <a-input placeholder="请输入cdefine27" v-model="model.cdefine27" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine28" label="cdefine28">
          <a-input placeholder="请输入cdefine28" v-model="model.cdefine28" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine29" label="cdefine29">
          <a-input placeholder="请输入cdefine29" v-model="model.cdefine29" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine30" label="cdefine30">
          <a-input placeholder="请输入cdefine30" v-model="model.cdefine30" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine31" label="cdefine31">
          <a-input placeholder="请输入cdefine31" v-model="model.cdefine31" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine32" label="cdefine32">
          <a-input placeholder="请输入cdefine32" v-model="model.cdefine32" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine33" label="cdefine33">
          <a-input placeholder="请输入cdefine33" v-model="model.cdefine33" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine34" label="cdefine34">
          <a-input-number v-model="model.cdefine34"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine35" label="cdefine35">
          <a-input-number v-model="model.cdefine35"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine36" label="cdefine36">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cdefine36" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine37" label="cdefine37">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cdefine37" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="citemClass" label="citemClass">
          <a-input placeholder="请输入citemClass" v-model="model.citemClass" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="citemcode" label="citemcode">
          <a-input placeholder="请输入citemcode" v-model="model.citemcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iposid" label="iposid">
          <a-input-number v-model="model.iposid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="citemname" label="citemname">
          <a-input placeholder="请输入citemname" v-model="model.citemname" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cunitid" label="cunitid">
          <a-input placeholder="请输入cunitid" v-model="model.cunitid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fvalidinquan" label="fvalidinquan">
          <a-input-number v-model="model.fvalidinquan"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fkpquantity" label="fkpquantity">
          <a-input-number v-model="model.fkpquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="frealquantity" label="frealquantity">
          <a-input-number v-model="model.frealquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fvalidquantity" label="fvalidquantity">
          <a-input-number v-model="model.fvalidquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="finvalidquantity" label="finvalidquantity">
          <a-input-number v-model="model.finvalidquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ccloser" label="ccloser">
          <a-input placeholder="请输入ccloser" v-model="model.ccloser" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="icorid" label="icorid">
          <a-input-number v-model="model.icorid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fretquantity" label="fretquantity">
          <a-input-number v-model="model.fretquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="finvalidinquan" label="finvalidinquan">
          <a-input-number v-model="model.finvalidinquan"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="bgsp" label="bgsp">
          <a-input placeholder="请输入bgsp" v-model="model.bgsp" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatch" label="cbatch">
          <a-input placeholder="请输入cbatch" v-model="model.cbatch" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dvdate" label="dvdate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.dvdate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dpdate" label="dpdate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.dpdate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="frefusequantity" label="frefusequantity">
          <a-input-number v-model="model.frefusequantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cgspstate" label="cgspstate">
          <a-input placeholder="请输入cgspstate" v-model="model.cgspstate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fvalidnum" label="fvalidnum">
          <a-input placeholder="请输入fvalidnum" v-model="model.fvalidnum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fvalidinnum" label="fvalidinnum">
          <a-input placeholder="请输入fvalidinnum" v-model="model.fvalidinnum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="finvalidnum" label="finvalidnum">
          <a-input placeholder="请输入finvalidnum" v-model="model.finvalidnum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="frealnum" label="frealnum">
          <a-input placeholder="请输入frealnum" v-model="model.frealnum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="btaxcost" label="btaxcost">
          <a-input placeholder="请输入btaxcost" v-model="model.btaxcost" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="binspect" label="binspect">
          <a-input placeholder="请输入binspect" v-model="model.binspect" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="frefusenum" label="frefusenum">
          <a-input-number v-model="model.frefusenum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ippartid" label="ippartid">
          <a-input-number v-model="model.ippartid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ipquantity" label="ipquantity">
          <a-input placeholder="请输入ipquantity" v-model="model.ipquantity" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iptoseq" label="iptoseq">
          <a-input-number v-model="model.iptoseq"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sodid" label="sodid">
          <a-input placeholder="请输入sodid" v-model="model.sodid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sotype" label="sotype">
          <a-input placeholder="请输入sotype" v-model="model.sotype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="contractrowguid" label="contractrowguid">
          <a-input placeholder="请输入contractrowguid" v-model="model.contractrowguid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="imassdate" label="imassdate">
          <a-input-number v-model="model.imassdate"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmassunit" label="cmassunit">
          <a-input placeholder="请输入cmassunit" v-model="model.cmassunit" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="bexigency" label="bexigency">
          <a-input placeholder="请输入bexigency" v-model="model.bexigency" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbcloser" label="cbcloser">
          <a-input placeholder="请输入cbcloser" v-model="model.cbcloser" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fsumrefusequantity" label="fsumrefusequantity">
          <a-input-number v-model="model.fsumrefusequantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fsumrefusenum" label="fsumrefusenum">
          <a-input-number v-model="model.fsumrefusenum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fretnum" label="fretnum">
          <a-input-number v-model="model.fretnum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fdtquantity" label="fdtquantity">
          <a-input-number v-model="model.fdtquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="finvalidinnum" label="finvalidinnum">
          <a-input-number v-model="model.finvalidinnum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fdegradequantity" label="fdegradequantity">
          <a-input-number v-model="model.fdegradequantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fdegradenum" label="fdegradenum">
          <a-input-number v-model="model.fdegradenum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fdegradeinquantity" label="fdegradeinquantity">
          <a-input-number v-model="model.fdegradeinquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fdegradeinnum" label="fdegradeinnum">
          <a-input-number v-model="model.fdegradeinnum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="finspectquantity" label="finspectquantity">
          <a-input-number v-model="model.finspectquantity"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="finspectnum" label="finspectnum">
          <a-input-number v-model="model.finspectnum"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iinvmpcost" label="iinvmpcost">
          <a-input-number v-model="model.iinvmpcost"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="guids" label="guids">
          <a-input placeholder="请输入guids" v-model="model.guids" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iinvexchrate" label="iinvexchrate">
          <a-input-number v-model="model.iinvexchrate"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="objectidSource" label="objectidSource">
          <a-input placeholder="请输入objectidSource" v-model="model.objectidSource" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="autoidSource" label="autoidSource">
          <a-input-number v-model="model.autoidSource"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="uftsSource" label="uftsSource">
          <a-input placeholder="请输入uftsSource" v-model="model.uftsSource" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="irownoSource" label="irownoSource">
          <a-input-number v-model="model.irownoSource"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="csocode" label="csocode">
          <a-input placeholder="请输入csocode" v-model="model.csocode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="isorowno" label="isorowno">
          <a-input-number v-model="model.isorowno"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iorderid" label="iorderid">
          <a-input-number v-model="model.iorderid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cordercode" label="cordercode">
          <a-input placeholder="请输入cordercode" v-model="model.cordercode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iorderrowno" label="iorderrowno">
          <a-input-number v-model="model.iorderrowno"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dlineclosedate" label="dlineclosedate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.dlineclosedate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="contractcode" label="contractcode">
          <a-input placeholder="请输入contractcode" v-model="model.contractcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="contractrowno" label="contractrowno">
          <a-input placeholder="请输入contractrowno" v-model="model.contractrowno" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="rejectsource" label="rejectsource">
          <a-input placeholder="请输入rejectsource" v-model="model.rejectsource" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iciqbookid" label="iciqbookid">
          <a-input-number v-model="model.iciqbookid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cciqbookcode" label="cciqbookcode">
          <a-input placeholder="请输入cciqbookcode" v-model="model.cciqbookcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cciqcode" label="cciqcode">
          <a-input placeholder="请输入cciqcode" v-model="model.cciqcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fciqchangrate" label="fciqchangrate">
          <a-input placeholder="请输入fciqchangrate" v-model="model.fciqchangrate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="irejectautoid" label="irejectautoid">
          <a-input-number v-model="model.irejectautoid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iexpiratdatecalcu" label="iexpiratdatecalcu">
          <a-input placeholder="请输入iexpiratdatecalcu" v-model="model.iexpiratdatecalcu" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cexpirationdate" label="cexpirationdate">
          <a-input placeholder="请输入cexpirationdate" v-model="model.cexpirationdate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dexpirationdate" label="dexpirationdate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.dexpirationdate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cupsocode" label="cupsocode">
          <a-input placeholder="请输入cupsocode" v-model="model.cupsocode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iorderdid" label="iorderdid">
          <a-input-number v-model="model.iorderdid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iordertype" label="iordertype">
          <a-input placeholder="请输入iordertype" v-model="model.iordertype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="csoordercode" label="csoordercode">
          <a-input placeholder="请输入csoordercode" v-model="model.csoordercode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iorderseq" label="iorderseq">
          <a-input-number v-model="model.iorderseq"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty1" label="cbatchproperty1">
          <a-input-number v-model="model.cbatchproperty1"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty2" label="cbatchproperty2">
          <a-input-number v-model="model.cbatchproperty2"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty3" label="cbatchproperty3">
          <a-input-number v-model="model.cbatchproperty3"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty4" label="cbatchproperty4">
          <a-input-number v-model="model.cbatchproperty4"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty5" label="cbatchproperty5">
          <a-input-number v-model="model.cbatchproperty5"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty6" label="cbatchproperty6">
          <a-input placeholder="请输入cbatchproperty6" v-model="model.cbatchproperty6" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty7" label="cbatchproperty7">
          <a-input placeholder="请输入cbatchproperty7" v-model="model.cbatchproperty7" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty8" label="cbatchproperty8">
          <a-input placeholder="请输入cbatchproperty8" v-model="model.cbatchproperty8" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty9" label="cbatchproperty9">
          <a-input placeholder="请输入cbatchproperty9" v-model="model.cbatchproperty9" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbatchproperty10" label="cbatchproperty10">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cbatchproperty10" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ivouchrowno" label="ivouchrowno">
          <a-input-number v-model="model.ivouchrowno"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="irowno" label="irowno">
          <a-input-number v-model="model.irowno"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbmemo" label="cbmemo">
          <a-input placeholder="请输入cbmemo" v-model="model.cbmemo" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbsysbarcode" label="cbsysbarcode">
          <a-input placeholder="请输入cbsysbarcode" v-model="model.cbsysbarcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="carrivalcode" label="carrivalcode">
          <a-input placeholder="请输入carrivalcode" v-model="model.carrivalcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ipickedquantity" label="ipickedquantity">
          <a-input placeholder="请输入ipickedquantity" v-model="model.ipickedquantity" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ipickednum" label="ipickednum">
          <a-input placeholder="请输入ipickednum" v-model="model.ipickednum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="isourcemocode" label="isourcemocode">
          <a-input placeholder="请输入isourcemocode" v-model="model.isourcemocode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="isourcemodetailsid" label="isourcemodetailsid">
          <a-input-number v-model="model.isourcemodetailsid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="freworkquantity" label="freworkquantity">
          <a-input placeholder="请输入freworkquantity" v-model="model.freworkquantity" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="freworknum" label="freworknum">
          <a-input placeholder="请输入freworknum" v-model="model.freworknum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fsumreworkquantity" label="fsumreworkquantity">
          <a-input placeholder="请输入fsumreworkquantity" v-model="model.fsumreworkquantity" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="fsumreworknum" label="fsumreworknum">
          <a-input placeholder="请输入fsumreworknum" v-model="model.fsumreworknum" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iproducttype" label="iproducttype">
          <a-input placeholder="请输入iproducttype" v-model="model.iproducttype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmaininvcode" label="cmaininvcode">
          <a-input placeholder="请输入cmaininvcode" v-model="model.cmaininvcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="imainmodetailsid" label="imainmodetailsid">
          <a-input-number v-model="model.imainmodetailsid"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="planlotnumber" label="planlotnumber">
          <a-input placeholder="请输入planlotnumber" v-model="model.planlotnumber" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="bgift" label="bgift">
          <a-input placeholder="请输入bgift" v-model="model.bgift" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cfactorycode" label="cfactorycode">
          <a-input placeholder="请输入cfactorycode" v-model="model.cfactorycode" />
        </a-form-model-item>
		
      </a-form-model>
    </a-spin>
  </j-modal>
</template>

<script>
  import { httpAction } from '@/api/manage'
  import moment from "moment"

  export default {
    name: "PuArrivalVouchsModal",
    data () {
      return {
        title:"操作",
        visible: false,
        model: {},
        labelCol: {
          xs: { span: 24 },
          sm: { span: 5 },
        },
        wrapperCol: {
          xs: { span: 24 },
          sm: { span: 16 },
        },

        confirmLoading: false,
        validatorRules:{
        autoid:[{ required: true, message: '请输入autoid!' }],
        cinvcode:[{ required: true, message: '请输入cinvcode!' }],
        iquantity:[{ required: true, message: '请输入iquantity!' }],
        itaxrate:[{ required: true, message: '请输入itaxrate!' }],
        },
        url: {
          add: "/u8/puArrivalVouchs/add",
          edit: "/u8/puArrivalVouchs/edit",
        },
      }
    },
    created () {
    },
    methods: {
      add () {
        //初始化默认值
        this.edit({});
      },
      edit (record) {
        this.model = Object.assign({}, record);
        this.visible = true;
      },
      close () {
        this.$emit('close');
        this.visible = false;
        this.$refs.form.clearValidate();
      },
      handleOk () {
        const that = this;
        // 触发表单验证
         this.$refs.form.validate(valid => {
          if (valid) {
            that.confirmLoading = true;
            let httpurl = '';
            let method = '';
            if(!this.model.id){
              httpurl+=this.url.add;
              method = 'post';
            }else{
              httpurl+=this.url.edit;
               method = 'put';
            }
            httpAction(httpurl,this.model,method).then((res)=>{
              if(res.success){
                that.$message.success(res.message);
                that.$emit('ok');
              }else{
                that.$message.warning(res.message);
              }
            }).finally(() => {
              that.confirmLoading = false;
              that.close();
            })
          }else{
             return false;
          }
        })
      },
      handleCancel () {
        this.close()
      },


    }
  }
</script>

<style lang="less" scoped>

</style>