<template>
    <view>
        <!--标题和返回-->
		<cu-custom :bgColor="NavBarColor" isBack :backRouterName="backRouteName">
			<block slot="backText">返回</block>
			<block slot="content">采购到货退货辅表</block>
		</cu-custom>
		 <!--表单区域-->
		<view>
			<form>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">autoid：</text></view>
                  <input type="number" placeholder="请输入autoid" v-model="model.autoid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cwhcode：</text></view>
                  <input  placeholder="请输入cwhcode" v-model="model.cwhcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cinvcode：</text></view>
                  <input  placeholder="请输入cinvcode" v-model="model.cinvcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">inum：</text></view>
                  <input type="number" placeholder="请输入inum" v-model="model.inum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iquantity：</text></view>
                  <input type="number" placeholder="请输入iquantity" v-model="model.iquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ioricost：</text></view>
                  <input type="number" placeholder="请输入ioricost" v-model="model.ioricost"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ioritaxcost：</text></view>
                  <input type="number" placeholder="请输入ioritaxcost" v-model="model.ioritaxcost"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iorimoney：</text></view>
                  <input  placeholder="请输入iorimoney" v-model="model.iorimoney"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ioritaxprice：</text></view>
                  <input  placeholder="请输入ioritaxprice" v-model="model.ioritaxprice"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iorisum：</text></view>
                  <input  placeholder="请输入iorisum" v-model="model.iorisum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">icost：</text></view>
                  <input type="number" placeholder="请输入icost" v-model="model.icost"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">imoney：</text></view>
                  <input  placeholder="请输入imoney" v-model="model.imoney"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">itaxprice：</text></view>
                  <input  placeholder="请输入itaxprice" v-model="model.itaxprice"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">isum：</text></view>
                  <input  placeholder="请输入isum" v-model="model.isum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree1：</text></view>
                  <input  placeholder="请输入cfree1" v-model="model.cfree1"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree2：</text></view>
                  <input  placeholder="请输入cfree2" v-model="model.cfree2"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree3：</text></view>
                  <input  placeholder="请输入cfree3" v-model="model.cfree3"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree4：</text></view>
                  <input  placeholder="请输入cfree4" v-model="model.cfree4"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree5：</text></view>
                  <input  placeholder="请输入cfree5" v-model="model.cfree5"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree6：</text></view>
                  <input  placeholder="请输入cfree6" v-model="model.cfree6"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree7：</text></view>
                  <input  placeholder="请输入cfree7" v-model="model.cfree7"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree8：</text></view>
                  <input  placeholder="请输入cfree8" v-model="model.cfree8"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree9：</text></view>
                  <input  placeholder="请输入cfree9" v-model="model.cfree9"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfree10：</text></view>
                  <input  placeholder="请输入cfree10" v-model="model.cfree10"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">itaxrate：</text></view>
                  <input type="number" placeholder="请输入itaxrate" v-model="model.itaxrate"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine22：</text></view>
                  <input  placeholder="请输入cdefine22" v-model="model.cdefine22"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine23：</text></view>
                  <input  placeholder="请输入cdefine23" v-model="model.cdefine23"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine24：</text></view>
                  <input  placeholder="请输入cdefine24" v-model="model.cdefine24"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine25：</text></view>
                  <input  placeholder="请输入cdefine25" v-model="model.cdefine25"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine26：</text></view>
                  <input  placeholder="请输入cdefine26" v-model="model.cdefine26"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine27：</text></view>
                  <input  placeholder="请输入cdefine27" v-model="model.cdefine27"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine28：</text></view>
                  <input  placeholder="请输入cdefine28" v-model="model.cdefine28"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine29：</text></view>
                  <input  placeholder="请输入cdefine29" v-model="model.cdefine29"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine30：</text></view>
                  <input  placeholder="请输入cdefine30" v-model="model.cdefine30"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine31：</text></view>
                  <input  placeholder="请输入cdefine31" v-model="model.cdefine31"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine32：</text></view>
                  <input  placeholder="请输入cdefine32" v-model="model.cdefine32"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine33：</text></view>
                  <input  placeholder="请输入cdefine33" v-model="model.cdefine33"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine34：</text></view>
                  <input type="number" placeholder="请输入cdefine34" v-model="model.cdefine34"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine35：</text></view>
                  <input type="number" placeholder="请输入cdefine35" v-model="model.cdefine35"/>
                </view>
              </view>
              <my-date label="cdefine36：" v-model="model.cdefine36" placeholder="请输入cdefine36"></my-date>
              <my-date label="cdefine37：" v-model="model.cdefine37" placeholder="请输入cdefine37"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">citemClass：</text></view>
                  <input  placeholder="请输入citemClass" v-model="model.citemClass"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">citemcode：</text></view>
                  <input  placeholder="请输入citemcode" v-model="model.citemcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iposid：</text></view>
                  <input type="number" placeholder="请输入iposid" v-model="model.iposid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">citemname：</text></view>
                  <input  placeholder="请输入citemname" v-model="model.citemname"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cunitid：</text></view>
                  <input  placeholder="请输入cunitid" v-model="model.cunitid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fvalidinquan：</text></view>
                  <input type="number" placeholder="请输入fvalidinquan" v-model="model.fvalidinquan"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fkpquantity：</text></view>
                  <input type="number" placeholder="请输入fkpquantity" v-model="model.fkpquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">frealquantity：</text></view>
                  <input type="number" placeholder="请输入frealquantity" v-model="model.frealquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fvalidquantity：</text></view>
                  <input type="number" placeholder="请输入fvalidquantity" v-model="model.fvalidquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">finvalidquantity：</text></view>
                  <input type="number" placeholder="请输入finvalidquantity" v-model="model.finvalidquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ccloser：</text></view>
                  <input  placeholder="请输入ccloser" v-model="model.ccloser"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">icorid：</text></view>
                  <input type="number" placeholder="请输入icorid" v-model="model.icorid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fretquantity：</text></view>
                  <input type="number" placeholder="请输入fretquantity" v-model="model.fretquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">finvalidinquan：</text></view>
                  <input type="number" placeholder="请输入finvalidinquan" v-model="model.finvalidinquan"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">bgsp：</text></view>
                  <input  placeholder="请输入bgsp" v-model="model.bgsp"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatch：</text></view>
                  <input  placeholder="请输入cbatch" v-model="model.cbatch"/>
                </view>
              </view>
              <my-date label="dvdate：" v-model="model.dvdate" placeholder="请输入dvdate"></my-date>
              <my-date label="dpdate：" v-model="model.dpdate" placeholder="请输入dpdate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">frefusequantity：</text></view>
                  <input type="number" placeholder="请输入frefusequantity" v-model="model.frefusequantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cgspstate：</text></view>
                  <input  placeholder="请输入cgspstate" v-model="model.cgspstate"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fvalidnum：</text></view>
                  <input  placeholder="请输入fvalidnum" v-model="model.fvalidnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fvalidinnum：</text></view>
                  <input  placeholder="请输入fvalidinnum" v-model="model.fvalidinnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">finvalidnum：</text></view>
                  <input  placeholder="请输入finvalidnum" v-model="model.finvalidnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">frealnum：</text></view>
                  <input  placeholder="请输入frealnum" v-model="model.frealnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">btaxcost：</text></view>
                  <input  placeholder="请输入btaxcost" v-model="model.btaxcost"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">binspect：</text></view>
                  <input  placeholder="请输入binspect" v-model="model.binspect"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">frefusenum：</text></view>
                  <input type="number" placeholder="请输入frefusenum" v-model="model.frefusenum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ippartid：</text></view>
                  <input type="number" placeholder="请输入ippartid" v-model="model.ippartid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ipquantity：</text></view>
                  <input  placeholder="请输入ipquantity" v-model="model.ipquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iptoseq：</text></view>
                  <input type="number" placeholder="请输入iptoseq" v-model="model.iptoseq"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">sodid：</text></view>
                  <input  placeholder="请输入sodid" v-model="model.sodid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">sotype：</text></view>
                  <input  placeholder="请输入sotype" v-model="model.sotype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">contractrowguid：</text></view>
                  <input  placeholder="请输入contractrowguid" v-model="model.contractrowguid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">imassdate：</text></view>
                  <input type="number" placeholder="请输入imassdate" v-model="model.imassdate"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cmassunit：</text></view>
                  <input  placeholder="请输入cmassunit" v-model="model.cmassunit"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">bexigency：</text></view>
                  <input  placeholder="请输入bexigency" v-model="model.bexigency"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbcloser：</text></view>
                  <input  placeholder="请输入cbcloser" v-model="model.cbcloser"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fsumrefusequantity：</text></view>
                  <input type="number" placeholder="请输入fsumrefusequantity" v-model="model.fsumrefusequantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fsumrefusenum：</text></view>
                  <input type="number" placeholder="请输入fsumrefusenum" v-model="model.fsumrefusenum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fretnum：</text></view>
                  <input type="number" placeholder="请输入fretnum" v-model="model.fretnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fdtquantity：</text></view>
                  <input type="number" placeholder="请输入fdtquantity" v-model="model.fdtquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">finvalidinnum：</text></view>
                  <input type="number" placeholder="请输入finvalidinnum" v-model="model.finvalidinnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fdegradequantity：</text></view>
                  <input type="number" placeholder="请输入fdegradequantity" v-model="model.fdegradequantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fdegradenum：</text></view>
                  <input type="number" placeholder="请输入fdegradenum" v-model="model.fdegradenum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fdegradeinquantity：</text></view>
                  <input type="number" placeholder="请输入fdegradeinquantity" v-model="model.fdegradeinquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fdegradeinnum：</text></view>
                  <input type="number" placeholder="请输入fdegradeinnum" v-model="model.fdegradeinnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">finspectquantity：</text></view>
                  <input type="number" placeholder="请输入finspectquantity" v-model="model.finspectquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">finspectnum：</text></view>
                  <input type="number" placeholder="请输入finspectnum" v-model="model.finspectnum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iinvmpcost：</text></view>
                  <input type="number" placeholder="请输入iinvmpcost" v-model="model.iinvmpcost"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">guids：</text></view>
                  <input  placeholder="请输入guids" v-model="model.guids"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iinvexchrate：</text></view>
                  <input type="number" placeholder="请输入iinvexchrate" v-model="model.iinvexchrate"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">objectidSource：</text></view>
                  <input  placeholder="请输入objectidSource" v-model="model.objectidSource"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">autoidSource：</text></view>
                  <input type="number" placeholder="请输入autoidSource" v-model="model.autoidSource"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">uftsSource：</text></view>
                  <input  placeholder="请输入uftsSource" v-model="model.uftsSource"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">irownoSource：</text></view>
                  <input type="number" placeholder="请输入irownoSource" v-model="model.irownoSource"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">csocode：</text></view>
                  <input  placeholder="请输入csocode" v-model="model.csocode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">isorowno：</text></view>
                  <input type="number" placeholder="请输入isorowno" v-model="model.isorowno"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iorderid：</text></view>
                  <input type="number" placeholder="请输入iorderid" v-model="model.iorderid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cordercode：</text></view>
                  <input  placeholder="请输入cordercode" v-model="model.cordercode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iorderrowno：</text></view>
                  <input type="number" placeholder="请输入iorderrowno" v-model="model.iorderrowno"/>
                </view>
              </view>
              <my-date label="dlineclosedate：" v-model="model.dlineclosedate" placeholder="请输入dlineclosedate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">contractcode：</text></view>
                  <input  placeholder="请输入contractcode" v-model="model.contractcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">contractrowno：</text></view>
                  <input  placeholder="请输入contractrowno" v-model="model.contractrowno"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">rejectsource：</text></view>
                  <input  placeholder="请输入rejectsource" v-model="model.rejectsource"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iciqbookid：</text></view>
                  <input type="number" placeholder="请输入iciqbookid" v-model="model.iciqbookid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cciqbookcode：</text></view>
                  <input  placeholder="请输入cciqbookcode" v-model="model.cciqbookcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cciqcode：</text></view>
                  <input  placeholder="请输入cciqcode" v-model="model.cciqcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fciqchangrate：</text></view>
                  <input  placeholder="请输入fciqchangrate" v-model="model.fciqchangrate"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">irejectautoid：</text></view>
                  <input type="number" placeholder="请输入irejectautoid" v-model="model.irejectautoid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iexpiratdatecalcu：</text></view>
                  <input  placeholder="请输入iexpiratdatecalcu" v-model="model.iexpiratdatecalcu"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cexpirationdate：</text></view>
                  <input  placeholder="请输入cexpirationdate" v-model="model.cexpirationdate"/>
                </view>
              </view>
              <my-date label="dexpirationdate：" v-model="model.dexpirationdate" placeholder="请输入dexpirationdate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cupsocode：</text></view>
                  <input  placeholder="请输入cupsocode" v-model="model.cupsocode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iorderdid：</text></view>
                  <input type="number" placeholder="请输入iorderdid" v-model="model.iorderdid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iordertype：</text></view>
                  <input  placeholder="请输入iordertype" v-model="model.iordertype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">csoordercode：</text></view>
                  <input  placeholder="请输入csoordercode" v-model="model.csoordercode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iorderseq：</text></view>
                  <input type="number" placeholder="请输入iorderseq" v-model="model.iorderseq"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty1：</text></view>
                  <input type="number" placeholder="请输入cbatchproperty1" v-model="model.cbatchproperty1"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty2：</text></view>
                  <input type="number" placeholder="请输入cbatchproperty2" v-model="model.cbatchproperty2"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty3：</text></view>
                  <input type="number" placeholder="请输入cbatchproperty3" v-model="model.cbatchproperty3"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty4：</text></view>
                  <input type="number" placeholder="请输入cbatchproperty4" v-model="model.cbatchproperty4"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty5：</text></view>
                  <input type="number" placeholder="请输入cbatchproperty5" v-model="model.cbatchproperty5"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty6：</text></view>
                  <input  placeholder="请输入cbatchproperty6" v-model="model.cbatchproperty6"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty7：</text></view>
                  <input  placeholder="请输入cbatchproperty7" v-model="model.cbatchproperty7"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty8：</text></view>
                  <input  placeholder="请输入cbatchproperty8" v-model="model.cbatchproperty8"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbatchproperty9：</text></view>
                  <input  placeholder="请输入cbatchproperty9" v-model="model.cbatchproperty9"/>
                </view>
              </view>
              <my-date label="cbatchproperty10：" v-model="model.cbatchproperty10" placeholder="请输入cbatchproperty10"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ivouchrowno：</text></view>
                  <input type="number" placeholder="请输入ivouchrowno" v-model="model.ivouchrowno"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">irowno：</text></view>
                  <input type="number" placeholder="请输入irowno" v-model="model.irowno"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbmemo：</text></view>
                  <input  placeholder="请输入cbmemo" v-model="model.cbmemo"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbsysbarcode：</text></view>
                  <input  placeholder="请输入cbsysbarcode" v-model="model.cbsysbarcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">carrivalcode：</text></view>
                  <input  placeholder="请输入carrivalcode" v-model="model.carrivalcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ipickedquantity：</text></view>
                  <input  placeholder="请输入ipickedquantity" v-model="model.ipickedquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ipickednum：</text></view>
                  <input  placeholder="请输入ipickednum" v-model="model.ipickednum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">isourcemocode：</text></view>
                  <input  placeholder="请输入isourcemocode" v-model="model.isourcemocode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">isourcemodetailsid：</text></view>
                  <input type="number" placeholder="请输入isourcemodetailsid" v-model="model.isourcemodetailsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">freworkquantity：</text></view>
                  <input  placeholder="请输入freworkquantity" v-model="model.freworkquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">freworknum：</text></view>
                  <input  placeholder="请输入freworknum" v-model="model.freworknum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fsumreworkquantity：</text></view>
                  <input  placeholder="请输入fsumreworkquantity" v-model="model.fsumreworkquantity"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">fsumreworknum：</text></view>
                  <input  placeholder="请输入fsumreworknum" v-model="model.fsumreworknum"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iproducttype：</text></view>
                  <input  placeholder="请输入iproducttype" v-model="model.iproducttype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cmaininvcode：</text></view>
                  <input  placeholder="请输入cmaininvcode" v-model="model.cmaininvcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">imainmodetailsid：</text></view>
                  <input type="number" placeholder="请输入imainmodetailsid" v-model="model.imainmodetailsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">planlotnumber：</text></view>
                  <input  placeholder="请输入planlotnumber" v-model="model.planlotnumber"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">bgift：</text></view>
                  <input  placeholder="请输入bgift" v-model="model.bgift"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cfactorycode：</text></view>
                  <input  placeholder="请输入cfactorycode" v-model="model.cfactorycode"/>
                </view>
              </view>
				<view class="padding">
					<button class="cu-btn block bg-blue margin-tb-sm lg" @click="onSubmit">
						<text v-if="loading" class="cuIcon-loading2 cuIconfont-spin"></text>提交
					</button>
				</view>
			</form>
		</view>
    </view>
</template>

<script>
    import myDate from '@/components/my-componets/my-date.vue'

    export default {
        name: "PuArrivalVouchsForm",
        components:{myDate},
        props:{
          formData:{
              type:Object,
              default:()=>{},
              required:false
          }
        },
        data(){
            return {
				CustomBar: this.CustomBar,
				NavBarColor: this.NavBarColor,
				loading:false,
                model: {},
                backRouteName:'index',
                url: {
                  queryById: "/u8/puArrivalVouchs/queryById",
                  add: "/u8/puArrivalVouchs/add",
                  edit: "/u8/puArrivalVouchs/edit",
                },
            }
        },
        created(){
             this.initFormData();
        },
        methods:{
           initFormData(){
               if(this.formData){
                    let dataId = this.formData.dataId;
                    this.$http.get(this.url.queryById,{params:{id:dataId}}).then((res)=>{
                        if(res.data.success){
                            console.log("表单数据",res);
                            this.model = res.data.result;
                        }
                    })
                }
            },
            onSubmit() {
                let myForm = {...this.model};
                this.loading = true;
                let url = myForm.id?this.url.edit:this.url.add;
				this.$http.post(url,myForm).then(res=>{
				   console.log("res",res)
				   this.loading = false
				   this.$Router.push({name:this.backRouteName})
				}).catch(()=>{
					this.loading = false
				});
            }
        }
    }
</script>
