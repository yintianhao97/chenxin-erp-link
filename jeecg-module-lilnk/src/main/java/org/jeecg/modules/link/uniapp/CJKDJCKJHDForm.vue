<template>
    <view>
        <!--标题和返回-->
		<cu-custom :bgColor="NavBarColor" isBack :backRouterName="backRouteName">
			<block slot="backText">返回</block>
			<block slot="content">下架汇总</block>
		</cu-custom>
		 <!--表单区域-->
		<view>
			<form>
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
                  <view class="title"><text space="ensp">内复核人：</text></view>
                  <input  placeholder="请输入内复核人" v-model="model.snfhrmc"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">拼箱人：</text></view>
                  <input  placeholder="请输入拼箱人" v-model="model.spxrmc"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">是否拆分：</text></view>
                  <input  placeholder="请输入是否拆分" v-model="model.nsfcd"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">仓库ＩＤ：</text></view>
                  <input  placeholder="请输入仓库ＩＤ" v-model="model.sgsid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">下架人：</text></view>
                  <input  placeholder="请输入下架人" v-model="model.sxjrmc"/>
                </view>
              </view>
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
                  <view class="title"><text space="ensp">出库单号(WMS)：</text></view>
                  <input  placeholder="请输入出库单号(WMS)" v-model="model.nckdid"/>
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
                  <view class="title"><text space="ensp">出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)：</text></view>
                  <input  placeholder="请输入出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)" v-model="model.ncklx"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)：</text></view>
                  <input  placeholder="请输入提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)" v-model="model.nthfs"/>
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
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">业务原单号：</text></view>
                  <input  placeholder="请输入业务原单号" v-model="model.sywydh"/>
                </view>
              </view>
              <my-date label="制单日期：" fields="day" v-model="model.dzdrq" placeholder="请输入制单日期"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">发货人名称：</text></view>
                  <input  placeholder="请输入发货人名称" v-model="model.sysr"/>
                </view>
              </view>
              <my-date label="发货日期：" fields="day" v-model="model.dysrq" placeholder="请输入发货日期"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">时间戳：</text></view>
                  <input  placeholder="请输入时间戳" v-model="model.ssjc"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)：</text></view>
                  <input  placeholder="请输入冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)" v-model="model.nchzt"/>
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
                  <view class="title"><text space="ensp">外复核人名称1：</text></view>
                  <input  placeholder="请输入外复核人名称1" v-model="model.swfhymc"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">外复核人名称2：</text></view>
                  <input  placeholder="请输入外复核人名称2" v-model="model.swfhymc2"/>
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
                  <view class="title"><text space="ensp">混箱标示：</text></view>
                  <input  placeholder="请输入混箱标示" v-model="model.shxbs"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">拼箱数：</text></view>
                  <input  placeholder="请输入拼箱数" v-model="model.npxs"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">整件数：</text></view>
                  <input  placeholder="请输入整件数" v-model="model.nzjs"/>
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
                  <view class="title"><text space="ensp">收货人：</text></view>
                  <input  placeholder="请输入收货人" v-model="model.shouhr"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">拼袋数：</text></view>
                  <input  placeholder="请输入拼袋数" v-model="model.npds"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">快递单据号：</text></view>
                  <input  placeholder="请输入快递单据号" v-model="model.skuaiddh"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">复核台ID：</text></view>
                  <input  placeholder="请输入复核台ID" v-model="model.sfhtid"/>
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
        name: "CJKDJCKJHDForm",
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
                  queryById: "/link/cJKDJCKJHD/queryById",
                  add: "/link/cJKDJCKJHD/add",
                  edit: "/link/cJKDJCKJHD/edit",
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
