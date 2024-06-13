<template>
    <view>
        <!--标题和返回-->
		<cu-custom :bgColor="NavBarColor" isBack :backRouterName="backRouteName">
			<block slot="backText">返回</block>
			<block slot="content">采购到货退货主表</block>
		</cu-custom>
		 <!--表单区域-->
		<view>
			<form>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ivtid：</text></view>
                  <input type="number" placeholder="请输入ivtid" v-model="model.ivtid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ufts：</text></view>
                  <input  placeholder="请输入ufts" v-model="model.ufts"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ccode：</text></view>
                  <input  placeholder="请输入ccode" v-model="model.ccode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cptcode：</text></view>
                  <input  placeholder="请输入cptcode" v-model="model.cptcode"/>
                </view>
              </view>
              <my-date label="ddate：" v-model="model.ddate" placeholder="请输入ddate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cvencode：</text></view>
                  <input  placeholder="请输入cvencode" v-model="model.cvencode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdepcode：</text></view>
                  <input  placeholder="请输入cdepcode" v-model="model.cdepcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cpersoncode：</text></view>
                  <input  placeholder="请输入cpersoncode" v-model="model.cpersoncode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cpaycode：</text></view>
                  <input  placeholder="请输入cpaycode" v-model="model.cpaycode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">csccode：</text></view>
                  <input  placeholder="请输入csccode" v-model="model.csccode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cexchName：</text></view>
                  <input  placeholder="请输入cexchName" v-model="model.cexchName"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iexchrate：</text></view>
                  <input  placeholder="请输入iexchrate" v-model="model.iexchrate"/>
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
                  <view class="title"><text space="ensp">cmemo：</text></view>
                  <input  placeholder="请输入cmemo" v-model="model.cmemo"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cbustype：</text></view>
                  <input  placeholder="请输入cbustype" v-model="model.cbustype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cmaker：</text></view>
                  <input  placeholder="请输入cmaker" v-model="model.cmaker"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">bnegative：</text></view>
                  <input type="number" placeholder="请输入bnegative" v-model="model.bnegative"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine1：</text></view>
                  <input  placeholder="请输入cdefine1" v-model="model.cdefine1"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine2：</text></view>
                  <input  placeholder="请输入cdefine2" v-model="model.cdefine2"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine3：</text></view>
                  <input  placeholder="请输入cdefine3" v-model="model.cdefine3"/>
                </view>
              </view>
              <my-date label="cdefine4：" v-model="model.cdefine4" placeholder="请输入cdefine4"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine5：</text></view>
                  <input type="number" placeholder="请输入cdefine5" v-model="model.cdefine5"/>
                </view>
              </view>
              <my-date label="cdefine6：" v-model="model.cdefine6" placeholder="请输入cdefine6"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine7：</text></view>
                  <input  placeholder="请输入cdefine7" v-model="model.cdefine7"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine8：</text></view>
                  <input  placeholder="请输入cdefine8" v-model="model.cdefine8"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine9：</text></view>
                  <input  placeholder="请输入cdefine9" v-model="model.cdefine9"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine10：</text></view>
                  <input  placeholder="请输入cdefine10" v-model="model.cdefine10"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine11：</text></view>
                  <input  placeholder="请输入cdefine11" v-model="model.cdefine11"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine12：</text></view>
                  <input  placeholder="请输入cdefine12" v-model="model.cdefine12"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine13：</text></view>
                  <input  placeholder="请输入cdefine13" v-model="model.cdefine13"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine14：</text></view>
                  <input  placeholder="请输入cdefine14" v-model="model.cdefine14"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine15：</text></view>
                  <input type="number" placeholder="请输入cdefine15" v-model="model.cdefine15"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cdefine16：</text></view>
                  <input  placeholder="请输入cdefine16" v-model="model.cdefine16"/>
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
                  <view class="title"><text space="ensp">idiscounttaxtype：</text></view>
                  <input  placeholder="请输入idiscounttaxtype" v-model="model.idiscounttaxtype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ibilltype：</text></view>
                  <input  placeholder="请输入ibilltype" v-model="model.ibilltype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cvouchtype：</text></view>
                  <input  placeholder="请输入cvouchtype" v-model="model.cvouchtype"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cgeneralordercode：</text></view>
                  <input  placeholder="请输入cgeneralordercode" v-model="model.cgeneralordercode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ctmcode：</text></view>
                  <input  placeholder="请输入ctmcode" v-model="model.ctmcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cincotermcode：</text></view>
                  <input  placeholder="请输入cincotermcode" v-model="model.cincotermcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ctransordercode：</text></view>
                  <input  placeholder="请输入ctransordercode" v-model="model.ctransordercode"/>
                </view>
              </view>
              <my-date label="dportdate：" v-model="model.dportdate" placeholder="请输入dportdate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">csportcode：</text></view>
                  <input  placeholder="请输入csportcode" v-model="model.csportcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">caportcode：</text></view>
                  <input  placeholder="请输入caportcode" v-model="model.caportcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">csvencode：</text></view>
                  <input  placeholder="请输入csvencode" v-model="model.csvencode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">carrivalplace：</text></view>
                  <input  placeholder="请输入carrivalplace" v-model="model.carrivalplace"/>
                </view>
              </view>
              <my-date label="dclosedate：" v-model="model.dclosedate" placeholder="请输入dclosedate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">idec：</text></view>
                  <input type="number" placeholder="请输入idec" v-model="model.idec"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">bcal：</text></view>
                  <input  placeholder="请输入bcal" v-model="model.bcal"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">guid：</text></view>
                  <input  placeholder="请输入guid" v-model="model.guid"/>
                </view>
              </view>
              <my-date label="cmaketime：" v-model="model.cmaketime" placeholder="请输入cmaketime"></my-date>
              <my-date label="cmodifytime：" v-model="model.cmodifytime" placeholder="请输入cmodifytime"></my-date>
              <my-date label="cmodifydate：" v-model="model.cmodifydate" placeholder="请输入cmodifydate"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">creviser：</text></view>
                  <input  placeholder="请输入creviser" v-model="model.creviser"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iverifystate：</text></view>
                  <input type="number" placeholder="请输入iverifystate" v-model="model.iverifystate"/>
                </view>
              </view>
              <my-date label="cauditdate：" v-model="model.cauditdate" placeholder="请输入cauditdate"></my-date>
              <my-date label="caudittime：" v-model="model.caudittime" placeholder="请输入caudittime"></my-date>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cverifier：</text></view>
                  <input  placeholder="请输入cverifier" v-model="model.cverifier"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iverifystateex：</text></view>
                  <input type="number" placeholder="请输入iverifystateex" v-model="model.iverifystateex"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ireturncount：</text></view>
                  <input type="number" placeholder="请输入ireturncount" v-model="model.ireturncount"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iswfcontrolled：</text></view>
                  <input  placeholder="请输入iswfcontrolled" v-model="model.iswfcontrolled"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cvenpuomprotocol：</text></view>
                  <input  placeholder="请输入cvenpuomprotocol" v-model="model.cvenpuomprotocol"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cchanger：</text></view>
                  <input  placeholder="请输入cchanger" v-model="model.cchanger"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iflowid：</text></view>
                  <input type="number" placeholder="请输入iflowid" v-model="model.iflowid"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">iprintcount：</text></view>
                  <input type="number" placeholder="请输入iprintcount" v-model="model.iprintcount"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ccleanver：</text></view>
                  <input  placeholder="请输入ccleanver" v-model="model.ccleanver"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">cpocode：</text></view>
                  <input  placeholder="请输入cpocode" v-model="model.cpocode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">csysbarcode：</text></view>
                  <input  placeholder="请输入csysbarcode" v-model="model.csysbarcode"/>
                </view>
              </view>
              <view class="cu-form-group">
                <view class="flex align-center">
                  <view class="title"><text space="ensp">ccurrentauditor：</text></view>
                  <input  placeholder="请输入ccurrentauditor" v-model="model.ccurrentauditor"/>
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
        name: "PuArrivalVouchForm",
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
                  queryById: "/u8/puArrivalVouch/queryById",
                  add: "/u8/puArrivalVouch/add",
                  edit: "/u8/puArrivalVouch/edit",
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
