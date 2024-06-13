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
      
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="njsbj" label="接收标记(0，未接收；1，接收成功；2，处理失败)">
          <a-input placeholder="请输入接收标记(0，未接收；1，接收成功；2，处理失败)" v-model="model.njsbj" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjsbz" label="接收备注">
          <a-input placeholder="请输入接收备注" v-model="model.sjsbz" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nrkdid" label="入库单号(WMS)">
          <a-input placeholder="请输入入库单号(WMS)" v-model="model.nrkdid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjkid" label="接口单号(ERP)">
          <a-input placeholder="请输入接口单号(ERP)" v-model="model.sjkid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="swldwid" label="供应商">
          <a-input placeholder="请输入供应商" v-model="model.swldwid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nrkfs" label="入库方式">
          <a-input placeholder="请输入入库方式" v-model="model.nrkfs" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nrklx" label="入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)">
          <a-input placeholder="请输入入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)" v-model="model.nrklx" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbz" label="备注">
          <a-input placeholder="请输入备注" v-model="model.sbz" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sywymc" label="业务员名称">
          <a-input placeholder="请输入业务员名称" v-model="model.sywymc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dzdrq" label="制单日期">
          <a-date-picker v-model="model.dzdrq"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ssjc" label="时间戳">
          <a-input placeholder="请输入时间戳" v-model="model.ssjc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="szdr" label="制单人">
          <a-input placeholder="请输入制单人" v-model="model.szdr" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="combrainTimes" label="combrainTimes">
          <a-input placeholder="请输入combrainTimes" v-model="model.combrainTimes" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nck" label="默认1">
          <a-input placeholder="请输入默认1" v-model="model.nck" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzid" label="货主ID">
          <a-input placeholder="请输入货主ID" v-model="model.shzid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzname" label="货主名称">
          <a-input placeholder="请输入货主名称" v-model="model.shzname" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjkdwid" label="接口单位ID">
          <a-input placeholder="请输入接口单位ID" v-model="model.sjkdwid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzgsid" label="货主公司ID">
          <a-input placeholder="请输入货主公司ID" v-model="model.shzgsid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sxgjkid" label="ERP接口单据号">
          <a-input placeholder="请输入ERP接口单据号" v-model="model.sxgjkid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy1" label="备用1">
          <a-input placeholder="请输入备用1" v-model="model.sbeiy1" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy2" label="备用2">
          <a-input placeholder="请输入备用2" v-model="model.sbeiy2" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy3" label="备用3">
          <a-input placeholder="请输入备用3" v-model="model.sbeiy3" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy4" label="备用4">
          <a-input placeholder="请输入备用4" v-model="model.sbeiy4" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy5" label="备用5">
          <a-input placeholder="请输入备用5" v-model="model.sbeiy5" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy6" label="备用6">
          <a-input placeholder="请输入备用6" v-model="model.sbeiy6" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy7" label="备用7">
          <a-input placeholder="请输入备用7" v-model="model.sbeiy7" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbeiy8" label="备用8">
          <a-input placeholder="请输入备用8" v-model="model.sbeiy8" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy1" label="数值备用1">
          <a-input placeholder="请输入数值备用1" v-model="model.nbeiy1" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy2" label="数值备用2">
          <a-input placeholder="请输入数值备用2" v-model="model.nbeiy2" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy3" label="数值备用3">
          <a-input placeholder="请输入数值备用3" v-model="model.nbeiy3" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy4" label="数值备用4">
          <a-input placeholder="请输入数值备用4" v-model="model.nbeiy4" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy5" label="数值备用5">
          <a-input placeholder="请输入数值备用5" v-model="model.nbeiy5" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy6" label="数值备用6">
          <a-input placeholder="请输入数值备用6" v-model="model.nbeiy6" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy7" label="数值备用7">
          <a-input placeholder="请输入数值备用7" v-model="model.nbeiy7" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nbeiy8" label="数值备用8">
          <a-input placeholder="请输入数值备用8" v-model="model.nbeiy8" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sgsid" label="分仓id">
          <a-input placeholder="请输入分仓id" v-model="model.sgsid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ssjy" label="上架人">
          <a-input placeholder="请输入上架人" v-model="model.ssjy" />
        </a-form-model-item>
		
      </a-form-model>
    </a-spin>
  </j-modal>
</template>

<script>
  import { httpAction } from '@/api/manage'
  import moment from "moment"

  export default {
    name: "CJKDJRKDModal",
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
        njsbj:[{ required: true, message: '请输入接收标记(0，未接收；1，接收成功；2，处理失败)!' }],
        sjkid:[{ required: true, message: '请输入接口单号(ERP)!' }],
        swldwid:[{ required: true, message: '请输入供应商!' }],
        nrklx:[{ required: true, message: '请输入入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)!' }],
        sywymc:[{ required: true, message: '请输入业务员名称!' }],
        dzdrq:[{ required: true, message: '请输入制单日期!' }],
        szdr:[{ required: true, message: '请输入制单人!' }],
        shzid:[{ required: true, message: '请输入货主ID!' }],
        sjkdwid:[{ required: true, message: '请输入接口单位ID!' }],
        shzgsid:[{ required: true, message: '请输入货主公司ID!' }],
        },
        url: {
          add: "/link/cJKDJRKD/add",
          edit: "/link/cJKDJRKD/edit",
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