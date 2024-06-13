<template>
  <a-drawer
      :title="title"
      :width="800"
      placement="right"
      :closable="false"
      @close="close"
      :visible="visible">

    <a-spin :spinning="confirmLoading">
      <a-form-model ref="form" :model="model" :rules="validatorRules">
      
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
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="snfhrmc" label="内复核人">
          <a-input placeholder="请输入内复核人" v-model="model.snfhrmc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="spxrmc" label="拼箱人">
          <a-input placeholder="请输入拼箱人" v-model="model.spxrmc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nsfcd" label="是否拆分">
          <a-input placeholder="请输入是否拆分" v-model="model.nsfcd" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sgsid" label="仓库ＩＤ">
          <a-input placeholder="请输入仓库ＩＤ" v-model="model.sgsid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sxjrmc" label="下架人">
          <a-input placeholder="请输入下架人" v-model="model.sxjrmc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="njsbj" label="接收标记(0，未接收；1，接收成功；2，处理失败)">
          <a-input placeholder="请输入接收标记(0，未接收；1，接收成功；2，处理失败)" v-model="model.njsbj" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjsbz" label="接收备注">
          <a-input placeholder="请输入接收备注" v-model="model.sjsbz" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nckdid" label="出库单号(WMS)">
          <a-input placeholder="请输入出库单号(WMS)" v-model="model.nckdid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjkid" label="接口单号(ERP)">
          <a-input placeholder="请输入接口单号(ERP)" v-model="model.sjkid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="swldwid" label="供应商">
          <a-input placeholder="请输入供应商" v-model="model.swldwid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ncklx" label="出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)">
          <a-input placeholder="请输入出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)" v-model="model.ncklx" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nthfs" label="提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)">
          <a-input placeholder="请输入提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)" v-model="model.nthfs" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sbz" label="备注">
          <a-input placeholder="请输入备注" v-model="model.sbz" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sywymc" label="业务员名称">
          <a-input placeholder="请输入业务员名称" v-model="model.sywymc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sywydh" label="业务原单号">
          <a-input placeholder="请输入业务原单号" v-model="model.sywydh" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dzdrq" label="制单日期">
          <a-date-picker v-model="model.dzdrq" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sysr" label="发货人名称">
          <a-input placeholder="请输入发货人名称" v-model="model.sysr" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dysrq" label="发货日期">
          <a-date-picker v-model="model.dysrq" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ssjc" label="时间戳">
          <a-input placeholder="请输入时间戳" v-model="model.ssjc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nchzt" label="冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)">
          <a-input placeholder="请输入冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)" v-model="model.nchzt" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="szdr" label="制单人">
          <a-input placeholder="请输入制单人" v-model="model.szdr" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="combrainTimes" label="combrainTimes">
          <a-input placeholder="请输入combrainTimes" v-model="model.combrainTimes" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="swfhymc" label="外复核人名称1">
          <a-input placeholder="请输入外复核人名称1" v-model="model.swfhymc" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="swfhymc2" label="外复核人名称2">
          <a-input placeholder="请输入外复核人名称2" v-model="model.swfhymc2" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nck" label="默认1">
          <a-input placeholder="请输入默认1" v-model="model.nck" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shxbs" label="混箱标示">
          <a-input placeholder="请输入混箱标示" v-model="model.shxbs" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="npxs" label="拼箱数">
          <a-input placeholder="请输入拼箱数" v-model="model.npxs" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="nzjs" label="整件数">
          <a-input placeholder="请输入整件数" v-model="model.nzjs" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzid" label="货主ID">
          <a-input placeholder="请输入货主ID" v-model="model.shzid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzname" label="shzname">
          <a-input placeholder="请输入shzname" v-model="model.shzname" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sjkdwid" label="接口单位ID">
          <a-input placeholder="请输入接口单位ID" v-model="model.sjkdwid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shzgsid" label="货主公司ID">
          <a-input placeholder="请输入货主公司ID" v-model="model.shzgsid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="shouhr" label="收货人">
          <a-input placeholder="请输入收货人" v-model="model.shouhr" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="npds" label="拼袋数">
          <a-input placeholder="请输入拼袋数" v-model="model.npds" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="skuaiddh" label="快递单据号">
          <a-input placeholder="请输入快递单据号" v-model="model.skuaiddh" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="sfhtid" label="复核台ID">
          <a-input placeholder="请输入复核台ID" v-model="model.sfhtid" />
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
		
      </a-form-model>
    </a-spin>

    <div class="drawer-bootom-button">
      <a-button type="primary" @click="handleOk">确定</a-button>
      <a-button type="primary" @click="handleCancel">取消</a-button>
    </div>
  </a-drawer>
</template>

<script>
  import { httpAction } from '@/api/manage'
  import moment from "moment"

  export default {
    name: "CJKDJCKJHDModal",
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
        ncklx:[{ required: true, message: '请输入出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)!' }],
        nthfs:[{ required: true, message: '请输入提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)!' }],
        sywymc:[{ required: true, message: '请输入业务员名称!' }],
        dzdrq:[{ required: true, message: '请输入制单日期!' }],
        ssjc:[{ required: true, message: '请输入时间戳!' }],
        nchzt:[{ required: true, message: '请输入冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)!' }],
        shzid:[{ required: true, message: '请输入货主ID!' }],
        shzgsid:[{ required: true, message: '请输入货主公司ID!' }],
        },
        url: {
          add: "/link/cJKDJCKJHD/add",
          edit: "/link/cJKDJCKJHD/edit",
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
  /**Button按钮间距*/
  .ant-btn {
    margin-left: 30px;
    margin-bottom: 30px;
    float: right;
  }
 /**抽屉按钮样式*/
  .drawer-bootom-button {
    position: absolute;
    bottom: -8px;
    width: 100%;
    border-top: 1px solid #e8e8e8;
    padding: 10px 16px;
    text-align: right;
    left: 0;
    background: #fff;
    border-radius: 0 0 2px 2px;
  }
</style>