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
      
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nhh" label="行号">
          <a-input placeholder="请输入行号" v-model="model.nhh" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjkid" label="接口单号(ERP)">
          <a-input placeholder="请输入接口单号(ERP)" v-model="model.sjkid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjkspid" label="接口商品内码(ERP)">
          <a-input placeholder="请输入接口商品内码(ERP)" v-model="model.sjkspid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nckdid" label="出库单号(WMS)">
          <a-input placeholder="请输入出库单号(WMS)" v-model="model.nckdid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nspid" label="商品内码">
          <a-input placeholder="请输入商品内码" v-model="model.nspid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="njlgg" label="计量规格">
          <a-input placeholder="请输入计量规格" v-model="model.njlgg" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="n4jhsl" label="计划数量">
          <a-input placeholder="请输入计划数量" v-model="model.n4jhsl" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="n4sjsl" label="发货数量">
          <a-input placeholder="请输入发货数量" v-model="model.n4sjsl" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="n4lsslCh" label="冲红数量">
          <a-input placeholder="请输入冲红数量" v-model="model.n4lsslCh" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sph" label="批号(如果没有批号默认0000)">
          <a-input placeholder="请输入批号(如果没有批号默认0000)" v-model="model.sph" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="smjph" label="灭菌批号">
          <a-input placeholder="请输入灭菌批号" v-model="model.smjph" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dscrq" label="生产日期">
          <a-date-picker v-model="model.dscrq"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dyxqz" label="有效期至">
          <a-date-picker v-model="model.dyxqz"/>
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nyhh" label="ERP行号">
          <a-input placeholder="请输入ERP行号" v-model="model.nyhh" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ssjc" label="时间戳">
          <a-input placeholder="请输入时间戳" v-model="model.ssjc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzid" label="货主ID">
          <a-input placeholder="请输入货主ID" v-model="model.shzid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzname" label="shzname">
          <a-input placeholder="请输入shzname" v-model="model.shzname" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nzjftLssl" label="nzjftLssl">
          <a-input placeholder="请输入nzjftLssl" v-model="model.nzjftLssl" />
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
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="njsbj" label="njsbj">
          <a-input placeholder="请输入njsbj" v-model="model.njsbj" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzgsid" label="shzgsid">
          <a-input placeholder="请输入shzgsid" v-model="model.shzgsid" />
        </a-form-model-item>
		
      </a-form-model>
    </a-spin>
  </j-modal>
</template>

<script>
  import { httpAction } from '@/api/manage'
  import moment from "moment"

  export default {
    name: "CJKDJCKJHDMXModal",
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
        nhh:[{ required: true, message: '请输入行号!' }],
        sjkid:[{ required: true, message: '请输入接口单号(ERP)!' }],
        sjkspid:[{ required: true, message: '请输入接口商品内码(ERP)!' }],
        njlgg:[{ required: true, message: '请输入计量规格!' }],
        n4jhsl:[{ required: true, message: '请输入计划数量!' }],
        n4sjsl:[{ required: true, message: '请输入发货数量!' }],
        n4lsslCh:[{ required: true, message: '请输入冲红数量!' }],
        sph:[{ required: true, message: '请输入批号(如果没有批号默认0000)!' }],
        ssjc:[{ required: true, message: '请输入时间戳!' }],
        shzid:[{ required: true, message: '请输入货主ID!' }],
        shzgsid:[{ required: true, message: '请输入shzgsid!' }],
        },
        url: {
          add: "/link/cJKDJCKJHDMX/add",
          edit: "/link/cJKDJCKJHDMX/edit",
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