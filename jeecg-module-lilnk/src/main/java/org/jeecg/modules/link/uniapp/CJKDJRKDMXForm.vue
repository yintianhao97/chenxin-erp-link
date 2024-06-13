<template>
    <view>
        <!--标题和返回-->
		<cu-custom :bgColor="NavBarColor" isBack :backRouterName="backRouteName">
			<block slot="backText">返回</block>
			<block slot="content">上架子单据</block>
		</cu-custom>
		 <!--表单区域-->
		<view>
			<form>
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
                  <view class="title"><text space="ensp">sspcd：</text></view>
                  <input  placeholder="请输入sspcd" v-model="model.sspcd"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">shzgsid：</text></view>
                  <input  placeholder="请输入shzgsid" v-model="model.shzgsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">sgsid：</text></view>
                  <input  placeholder="请输入sgsid" v-model="model.sgsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">行号：</text></view>
                  <input  placeholder="请输入行号" v-model="model.nhh"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">接口单据编号(ERP)：</text></view>
                  <input  placeholder="请输入接口单据编号(ERP)" v-model="model.sjkid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">接口商品内码(ERP)：</text></view>
                  <input  placeholder="请输入接口商品内码(ERP)" v-model="model.sjkspid"/>
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
                  <view class="title"><text space="ensp">商品内码(WMS)：</text></view>
                  <input  placeholder="请输入商品内码(WMS)" v-model="model.nspid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">计量规格：</text></view>
                  <input  placeholder="请输入计量规格" v-model="model.njlgg"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">计划数量：</text></view>
                  <input  placeholder="请输入计划数量" v-model="model.n4yssl"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">合格数量：</text></view>
                  <input  placeholder="请输入合格数量" v-model="model.n4sssl"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">批号(如果没有批号默认0000)：</text></view>
                  <input  placeholder="请输入批号(如果没有批号默认0000)" v-model="model.sph"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">灭菌批号：</text></view>
                  <input  placeholder="请输入灭菌批号" v-model="model.smjph"/>
                </view>
              </view>
              <my-date label="生产日期：" fields="day" v-model="model.dscrq" placeholder="请输入生产日期"></my-date>
              <my-date label="有效期至：" fields="day" v-model="model.dyxqz" placeholder="请输入有效期至"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">原行号：</text></view>
                  <input  placeholder="请输入原行号" v-model="model.nyhh"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">冲红数量：</text></view>
                  <input  placeholder="请输入冲红数量" v-model="model.n4lsslCh"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">不合格数量：</text></view>
                  <input  placeholder="请输入不合格数量" v-model="model.n4bhgsl"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">时间戳：</text></view>
                  <input  placeholder="请输入时间戳" v-model="model.ssjc"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ERP总单Id：</text></view>
                  <input  placeholder="请输入ERP总单Id" v-model="model.szdid"/>
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
                  <view class="title"><text space="ensp">shzname：</text></view>
                  <input  placeholder="请输入shzname" v-model="model.shzname"/>
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
                  <view class="title"><text space="ensp">0合格，1不合格：</text></view>
                  <input  placeholder="请输入0合格，1不合格" v-model="model.nbhg"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ERP接口行号：</text></view>
                  <input  placeholder="请输入ERP接口行号" v-model="model.njkhh"/>
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
        name: "CJKDJRKDMXForm",
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
                  queryById: "/link/cJKDJRKDMX/queryById",
                  add: "/link/cJKDJRKDMX/add",
                  edit: "/link/cJKDJRKDMX/edit",
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
