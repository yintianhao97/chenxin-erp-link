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
      
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ivtid" label="ivtid">
          <a-input-number v-model="model.ivtid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ufts" label="ufts">
          <a-input placeholder="请输入ufts" v-model="model.ufts" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ccode" label="ccode">
          <a-input placeholder="请输入ccode" v-model="model.ccode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cptcode" label="cptcode">
          <a-input placeholder="请输入cptcode" v-model="model.cptcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ddate" label="ddate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.ddate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cvencode" label="cvencode">
          <a-input placeholder="请输入cvencode" v-model="model.cvencode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdepcode" label="cdepcode">
          <a-input placeholder="请输入cdepcode" v-model="model.cdepcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cpersoncode" label="cpersoncode">
          <a-input placeholder="请输入cpersoncode" v-model="model.cpersoncode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cpaycode" label="cpaycode">
          <a-input placeholder="请输入cpaycode" v-model="model.cpaycode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="csccode" label="csccode">
          <a-input placeholder="请输入csccode" v-model="model.csccode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cexchName" label="cexchName">
          <a-input placeholder="请输入cexchName" v-model="model.cexchName" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iexchrate" label="iexchrate">
          <a-input placeholder="请输入iexchrate" v-model="model.iexchrate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="itaxrate" label="itaxrate">
          <a-input-number v-model="model.itaxrate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmemo" label="cmemo">
          <a-input placeholder="请输入cmemo" v-model="model.cmemo" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cbustype" label="cbustype">
          <a-input placeholder="请输入cbustype" v-model="model.cbustype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmaker" label="cmaker">
          <a-input placeholder="请输入cmaker" v-model="model.cmaker" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="bnegative" label="bnegative">
          <a-input-number v-model="model.bnegative" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine1" label="cdefine1">
          <a-input placeholder="请输入cdefine1" v-model="model.cdefine1" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine2" label="cdefine2">
          <a-input placeholder="请输入cdefine2" v-model="model.cdefine2" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine3" label="cdefine3">
          <a-input placeholder="请输入cdefine3" v-model="model.cdefine3" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine4" label="cdefine4">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cdefine4" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine5" label="cdefine5">
          <a-input-number v-model="model.cdefine5" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine6" label="cdefine6">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cdefine6" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine7" label="cdefine7">
          <a-input placeholder="请输入cdefine7" v-model="model.cdefine7" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine8" label="cdefine8">
          <a-input placeholder="请输入cdefine8" v-model="model.cdefine8" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine9" label="cdefine9">
          <a-input placeholder="请输入cdefine9" v-model="model.cdefine9" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine10" label="cdefine10">
          <a-input placeholder="请输入cdefine10" v-model="model.cdefine10" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine11" label="cdefine11">
          <a-input placeholder="请输入cdefine11" v-model="model.cdefine11" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine12" label="cdefine12">
          <a-input placeholder="请输入cdefine12" v-model="model.cdefine12" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine13" label="cdefine13">
          <a-input placeholder="请输入cdefine13" v-model="model.cdefine13" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine14" label="cdefine14">
          <a-input placeholder="请输入cdefine14" v-model="model.cdefine14" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine15" label="cdefine15">
          <a-input-number v-model="model.cdefine15" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cdefine16" label="cdefine16">
          <a-input placeholder="请输入cdefine16" v-model="model.cdefine16" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ccloser" label="ccloser">
          <a-input placeholder="请输入ccloser" v-model="model.ccloser" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="idiscounttaxtype" label="idiscounttaxtype">
          <a-input placeholder="请输入idiscounttaxtype" v-model="model.idiscounttaxtype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ibilltype" label="ibilltype">
          <a-input placeholder="请输入ibilltype" v-model="model.ibilltype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cvouchtype" label="cvouchtype">
          <a-input placeholder="请输入cvouchtype" v-model="model.cvouchtype" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cgeneralordercode" label="cgeneralordercode">
          <a-input placeholder="请输入cgeneralordercode" v-model="model.cgeneralordercode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ctmcode" label="ctmcode">
          <a-input placeholder="请输入ctmcode" v-model="model.ctmcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cincotermcode" label="cincotermcode">
          <a-input placeholder="请输入cincotermcode" v-model="model.cincotermcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ctransordercode" label="ctransordercode">
          <a-input placeholder="请输入ctransordercode" v-model="model.ctransordercode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dportdate" label="dportdate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.dportdate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="csportcode" label="csportcode">
          <a-input placeholder="请输入csportcode" v-model="model.csportcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="caportcode" label="caportcode">
          <a-input placeholder="请输入caportcode" v-model="model.caportcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="csvencode" label="csvencode">
          <a-input placeholder="请输入csvencode" v-model="model.csvencode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="carrivalplace" label="carrivalplace">
          <a-input placeholder="请输入carrivalplace" v-model="model.carrivalplace" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="dclosedate" label="dclosedate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.dclosedate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="idec" label="idec">
          <a-input-number v-model="model.idec" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="bcal" label="bcal">
          <a-input placeholder="请输入bcal" v-model="model.bcal" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="guid" label="guid">
          <a-input placeholder="请输入guid" v-model="model.guid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmaketime" label="cmaketime">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cmaketime" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmodifytime" label="cmodifytime">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cmodifytime" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cmodifydate" label="cmodifydate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cmodifydate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="creviser" label="creviser">
          <a-input placeholder="请输入creviser" v-model="model.creviser" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iverifystate" label="iverifystate">
          <a-input-number v-model="model.iverifystate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cauditdate" label="cauditdate">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.cauditdate" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="caudittime" label="caudittime">
          <a-date-picker showTime valueFormat='YYYY-MM-DD HH:mm:ss' v-model="model.caudittime" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cverifier" label="cverifier">
          <a-input placeholder="请输入cverifier" v-model="model.cverifier" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iverifystateex" label="iverifystateex">
          <a-input-number v-model="model.iverifystateex" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ireturncount" label="ireturncount">
          <a-input-number v-model="model.ireturncount" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iswfcontrolled" label="iswfcontrolled">
          <a-input placeholder="请输入iswfcontrolled" v-model="model.iswfcontrolled" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cvenpuomprotocol" label="cvenpuomprotocol">
          <a-input placeholder="请输入cvenpuomprotocol" v-model="model.cvenpuomprotocol" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cchanger" label="cchanger">
          <a-input placeholder="请输入cchanger" v-model="model.cchanger" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iflowid" label="iflowid">
          <a-input-number v-model="model.iflowid" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="iprintcount" label="iprintcount">
          <a-input-number v-model="model.iprintcount" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ccleanver" label="ccleanver">
          <a-input placeholder="请输入ccleanver" v-model="model.ccleanver" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="cpocode" label="cpocode">
          <a-input placeholder="请输入cpocode" v-model="model.cpocode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="csysbarcode" label="csysbarcode">
          <a-input placeholder="请输入csysbarcode" v-model="model.csysbarcode" />
        </a-form-model-item>
        <a-form-model-item :labelCol="labelCol" :wrapperCol="wrapperCol" prop="ccurrentauditor" label="ccurrentauditor">
          <a-input placeholder="请输入ccurrentauditor" v-model="model.ccurrentauditor" />
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
    name: "PuArrivalVouchModal",
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
        ivtid:[{ required: true, message: '请输入ivtid!' }],
        ufts:[{ required: true, message: '请输入ufts!' }],
        ccode:[{ required: true, message: '请输入ccode!' }],
        ddate:[{ required: true, message: '请输入ddate!' }],
        cvencode:[{ required: true, message: '请输入cvencode!' }],
        cexchName:[{ required: true, message: '请输入cexchName!' }],
        cbustype:[{ required: true, message: '请输入cbustype!' }],
        cmaker:[{ required: true, message: '请输入cmaker!' }],
        bnegative:[{ required: true, message: '请输入bnegative!' }],
        ibilltype:[{ required: true, message: '请输入ibilltype!' }],
        },
        url: {
          add: "/u8/puArrivalVouch/add",
          edit: "/u8/puArrivalVouch/edit",
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