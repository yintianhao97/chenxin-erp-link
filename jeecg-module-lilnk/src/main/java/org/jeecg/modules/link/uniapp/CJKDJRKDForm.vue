<template>
    <view>
        <!--标题和返回-->
		<cu-custom :bgColor="NavBarColor" isBack :backRouterName="backRouteName">
			<block slot="backText">返回</block>
			<block slot="content">上架汇总</block>
		</cu-custom>
		 <!--表单区域-->
		<view>
			<form>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">接收标记(0，未接收；1，接收成功；2，处理失败)：</text></view>
                  <input  placeholder="请输入接收标记(0，未接收；1，接收成功；2，处理失败)" v-model="model.njsbj"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">接收备注：</text></view>
                  <input  placeholder="请输入接收备注" v-model="model.sjsbz"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">入库单号(WMS)：</text></view>
                  <input  placeholder="请输入入库单号(WMS)" v-model="model.nrkdid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">接口单号(ERP)：</text></view>
                  <input  placeholder="请输入接口单号(ERP)" v-model="model.sjkid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">供应商：</text></view>
                  <input  placeholder="请输入供应商" v-model="model.swldwid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">入库方式：</text></view>
                  <input  placeholder="请输入入库方式" v-model="model.nrkfs"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)：</text></view>
                  <input  placeholder="请输入入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)" v-model="model.nrklx"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备注：</text></view>
                  <input  placeholder="请输入备注" v-model="model.sbz"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">业务员名称：</text></view>
                  <input  placeholder="请输入业务员名称" v-model="model.sywymc"/>
                </view>
              </view>
              <my-date label="制单日期：" fields="day" v-model="model.dzdrq" placeholder="请输入制单日期"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">时间戳：</text></view>
                  <input  placeholder="请输入时间戳" v-model="model.ssjc"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">制单人：</text></view>
                  <input  placeholder="请输入制单人" v-model="model.szdr"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">combrainTimes：</text></view>
                  <input  placeholder="请输入combrainTimes" v-model="model.combrainTimes"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">默认1：</text></view>
                  <input  placeholder="请输入默认1" v-model="model.nck"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">货主ID：</text></view>
                  <input  placeholder="请输入货主ID" v-model="model.shzid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">货主名称：</text></view>
                  <input  placeholder="请输入货主名称" v-model="model.shzname"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">接口单位ID：</text></view>
                  <input  placeholder="请输入接口单位ID" v-model="model.sjkdwid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">货主公司ID：</text></view>
                  <input  placeholder="请输入货主公司ID" v-model="model.shzgsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ERP接口单据号：</text></view>
                  <input  placeholder="请输入ERP接口单据号" v-model="model.sxgjkid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用1：</text></view>
                  <input  placeholder="请输入备用1" v-model="model.sbeiy1"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用2：</text></view>
                  <input  placeholder="请输入备用2" v-model="model.sbeiy2"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用3：</text></view>
                  <input  placeholder="请输入备用3" v-model="model.sbeiy3"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用4：</text></view>
                  <input  placeholder="请输入备用4" v-model="model.sbeiy4"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用5：</text></view>
                  <input  placeholder="请输入备用5" v-model="model.sbeiy5"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用6：</text></view>
                  <input  placeholder="请输入备用6" v-model="model.sbeiy6"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用7：</text></view>
                  <input  placeholder="请输入备用7" v-model="model.sbeiy7"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">备用8：</text></view>
                  <input  placeholder="请输入备用8" v-model="model.sbeiy8"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用1：</text></view>
                  <input  placeholder="请输入数值备用1" v-model="model.nbeiy1"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用2：</text></view>
                  <input  placeholder="请输入数值备用2" v-model="model.nbeiy2"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用3：</text></view>
                  <input  placeholder="请输入数值备用3" v-model="model.nbeiy3"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用4：</text></view>
                  <input  placeholder="请输入数值备用4" v-model="model.nbeiy4"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用5：</text></view>
                  <input  placeholder="请输入数值备用5" v-model="model.nbeiy5"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用6：</text></view>
                  <input  placeholder="请输入数值备用6" v-model="model.nbeiy6"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用7：</text></view>
                  <input  placeholder="请输入数值备用7" v-model="model.nbeiy7"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">数值备用8：</text></view>
                  <input  placeholder="请输入数值备用8" v-model="model.nbeiy8"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">分仓id：</text></view>
                  <input  placeholder="请输入分仓id" v-model="model.sgsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">上架人：</text></view>
                  <input  placeholder="请输入上架人" v-model="model.ssjy"/>
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
        name: "CJKDJRKDForm",
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
                  queryById: "/link/cJKDJRKD/queryById",
                  add: "/link/cJKDJRKD/add",
                  edit: "/link/cJKDJRKD/edit",
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
