<template>
  <a-card :bordered="false">

    <!-- 查询区域 -->
    <div class="table-page-search-wrapper">
      <a-form layout="inline" @keyup.enter.native="searchQuery">
        <a-row :gutter="24">

          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="autoid">
              <a-input placeholder="请输入autoid" v-model="queryParam.autoid"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="cwhcode">
              <a-input placeholder="请输入cwhcode" v-model="queryParam.cwhcode"></a-input>
            </a-form-item>
          </a-col>
        <template v-if="toggleSearchStatus">
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="cinvcode">
              <a-input placeholder="请输入cinvcode" v-model="queryParam.cinvcode"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="inum">
              <a-input placeholder="请输入inum" v-model="queryParam.inum"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="iquantity">
              <a-input placeholder="请输入iquantity" v-model="queryParam.iquantity"></a-input>
            </a-form-item>
          </a-col>
          </template>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <span style="float: left;overflow: hidden;" class="table-page-search-submitButtons">
              <a-button type="primary" @click="searchQuery" icon="search">查询</a-button>
              <a-button type="primary" @click="searchReset" icon="reload" style="margin-left: 8px">重置</a-button>
              <a @click="handleToggleSearch" style="margin-left: 8px">
                {{ toggleSearchStatus ? '收起' : '展开' }}
                <a-icon :type="toggleSearchStatus ? 'up' : 'down'"/>
              </a>
            </span>
          </a-col>

        </a-row>
      </a-form>
    </div>

    <!-- 操作按钮区域 -->
    <div class="table-operator">
      <a-button @click="handleAdd" type="primary" icon="plus">新增</a-button>
      <a-button type="primary" icon="download" @click="handleExportXls('采购到货退货辅表')">导出</a-button>
      <a-upload name="file" :showUploadList="false" :multiple="false" :headers="tokenHeader" :action="importExcelUrl" @change="handleImportExcel">
        <a-button type="primary" icon="import">导入</a-button>
      </a-upload>
      <a-dropdown v-if="selectedRowKeys.length > 0">
        <a-menu slot="overlay">
          <a-menu-item key="1" @click="batchDel"><a-icon type="delete"/>删除</a-menu-item>
        </a-menu>
        <a-button style="margin-left: 8px"> 批量操作 <a-icon type="down" /></a-button>
      </a-dropdown>
    </div>

    <!-- table区域-begin -->
    <div>
      <div class="ant-alert ant-alert-info" style="margin-bottom: 16px;">
        <i class="anticon anticon-info-circle ant-alert-icon"></i> 已选择 <a style="font-weight: 600">{{ selectedRowKeys.length }}</a>项
        <a style="margin-left: 24px" @click="onClearSelected">清空</a>
      </div>

      <a-table
        ref="table"
        size="middle"
        bordered
        rowKey="id"
        :columns="columns"
        :dataSource="dataSource"
        :pagination="ipagination"
        :loading="loading"
        class="j-table-force-nowrap"
        :rowSelection="{selectedRowKeys: selectedRowKeys, onChange: onSelectChange}"
        @change="handleTableChange">

        <span slot="action" slot-scope="text, record">
          <a @click="handleEdit(record)">编辑</a>

          <a-divider type="vertical" />
          <a-dropdown>
            <a class="ant-dropdown-link">更多 <a-icon type="down" /></a>
            <a-menu slot="overlay">
              <a-menu-item>
                <a-popconfirm title="确定删除吗?" @confirm="() => handleDelete(record.id)">
                  <a>删除</a>
                </a-popconfirm>
              </a-menu-item>
            </a-menu>
          </a-dropdown>
        </span>

      </a-table>
    </div>
    <!-- table区域-end -->

    <!-- 表单区域 -->
    <puArrivalVouchs-modal ref="modalForm" @ok="modalFormOk"></puArrivalVouchs-modal>
  </a-card>
</template>

<script>
  import '@/assets/less/TableExpand.less'
  import PuArrivalVouchsModal from './modules/PuArrivalVouchsModal'
  import { JeecgListMixin } from '@/mixins/JeecgListMixin'

  export default {
    name: "PuArrivalVouchsList",
    mixins:[JeecgListMixin],
    components: {
      PuArrivalVouchsModal
    },
    data () {
      return {
        description: '采购到货退货辅表管理页面',
        // 表头
        columns: [
          {
            title: '#',
            dataIndex: '',
            key:'rowIndex',
            width:60,
            align:"center",
            customRender:function (t,r,index) {
              return parseInt(index)+1;
            }
           },
		   {
            title: 'autoid',
            align:"center",
            dataIndex: 'autoid'
           },
		   {
            title: 'cwhcode',
            align:"center",
            dataIndex: 'cwhcode'
           },
		   {
            title: 'cinvcode',
            align:"center",
            dataIndex: 'cinvcode'
           },
		   {
            title: 'inum',
            align:"center",
            dataIndex: 'inum'
           },
		   {
            title: 'iquantity',
            align:"center",
            dataIndex: 'iquantity'
           },
		   {
            title: 'ioricost',
            align:"center",
            dataIndex: 'ioricost'
           },
		   {
            title: 'ioritaxcost',
            align:"center",
            dataIndex: 'ioritaxcost'
           },
		   {
            title: 'iorimoney',
            align:"center",
            dataIndex: 'iorimoney'
           },
		   {
            title: 'ioritaxprice',
            align:"center",
            dataIndex: 'ioritaxprice'
           },
		   {
            title: 'iorisum',
            align:"center",
            dataIndex: 'iorisum'
           },
		   {
            title: 'icost',
            align:"center",
            dataIndex: 'icost'
           },
		   {
            title: 'imoney',
            align:"center",
            dataIndex: 'imoney'
           },
		   {
            title: 'itaxprice',
            align:"center",
            dataIndex: 'itaxprice'
           },
		   {
            title: 'isum',
            align:"center",
            dataIndex: 'isum'
           },
		   {
            title: 'cfree1',
            align:"center",
            dataIndex: 'cfree1'
           },
		   {
            title: 'cfree2',
            align:"center",
            dataIndex: 'cfree2'
           },
		   {
            title: 'cfree3',
            align:"center",
            dataIndex: 'cfree3'
           },
		   {
            title: 'cfree4',
            align:"center",
            dataIndex: 'cfree4'
           },
		   {
            title: 'cfree5',
            align:"center",
            dataIndex: 'cfree5'
           },
		   {
            title: 'cfree6',
            align:"center",
            dataIndex: 'cfree6'
           },
		   {
            title: 'cfree7',
            align:"center",
            dataIndex: 'cfree7'
           },
		   {
            title: 'cfree8',
            align:"center",
            dataIndex: 'cfree8'
           },
		   {
            title: 'cfree9',
            align:"center",
            dataIndex: 'cfree9'
           },
		   {
            title: 'cfree10',
            align:"center",
            dataIndex: 'cfree10'
           },
		   {
            title: 'itaxrate',
            align:"center",
            dataIndex: 'itaxrate'
           },
		   {
            title: 'cdefine22',
            align:"center",
            dataIndex: 'cdefine22'
           },
		   {
            title: 'cdefine23',
            align:"center",
            dataIndex: 'cdefine23'
           },
		   {
            title: 'cdefine24',
            align:"center",
            dataIndex: 'cdefine24'
           },
		   {
            title: 'cdefine25',
            align:"center",
            dataIndex: 'cdefine25'
           },
		   {
            title: 'cdefine26',
            align:"center",
            dataIndex: 'cdefine26'
           },
		   {
            title: 'cdefine27',
            align:"center",
            dataIndex: 'cdefine27'
           },
		   {
            title: 'cdefine28',
            align:"center",
            dataIndex: 'cdefine28'
           },
		   {
            title: 'cdefine29',
            align:"center",
            dataIndex: 'cdefine29'
           },
		   {
            title: 'cdefine30',
            align:"center",
            dataIndex: 'cdefine30'
           },
		   {
            title: 'cdefine31',
            align:"center",
            dataIndex: 'cdefine31'
           },
		   {
            title: 'cdefine32',
            align:"center",
            dataIndex: 'cdefine32'
           },
		   {
            title: 'cdefine33',
            align:"center",
            dataIndex: 'cdefine33'
           },
		   {
            title: 'cdefine34',
            align:"center",
            dataIndex: 'cdefine34'
           },
		   {
            title: 'cdefine35',
            align:"center",
            dataIndex: 'cdefine35'
           },
		   {
            title: 'cdefine36',
            align:"center",
            dataIndex: 'cdefine36'
           },
		   {
            title: 'cdefine37',
            align:"center",
            dataIndex: 'cdefine37'
           },
		   {
            title: 'citemClass',
            align:"center",
            dataIndex: 'citemClass'
           },
		   {
            title: 'citemcode',
            align:"center",
            dataIndex: 'citemcode'
           },
		   {
            title: 'iposid',
            align:"center",
            dataIndex: 'iposid'
           },
		   {
            title: 'citemname',
            align:"center",
            dataIndex: 'citemname'
           },
		   {
            title: 'cunitid',
            align:"center",
            dataIndex: 'cunitid'
           },
		   {
            title: 'fvalidinquan',
            align:"center",
            dataIndex: 'fvalidinquan'
           },
		   {
            title: 'fkpquantity',
            align:"center",
            dataIndex: 'fkpquantity'
           },
		   {
            title: 'frealquantity',
            align:"center",
            dataIndex: 'frealquantity'
           },
		   {
            title: 'fvalidquantity',
            align:"center",
            dataIndex: 'fvalidquantity'
           },
		   {
            title: 'finvalidquantity',
            align:"center",
            dataIndex: 'finvalidquantity'
           },
		   {
            title: 'ccloser',
            align:"center",
            dataIndex: 'ccloser'
           },
		   {
            title: 'icorid',
            align:"center",
            dataIndex: 'icorid'
           },
		   {
            title: 'fretquantity',
            align:"center",
            dataIndex: 'fretquantity'
           },
		   {
            title: 'finvalidinquan',
            align:"center",
            dataIndex: 'finvalidinquan'
           },
		   {
            title: 'bgsp',
            align:"center",
            dataIndex: 'bgsp'
           },
		   {
            title: 'cbatch',
            align:"center",
            dataIndex: 'cbatch'
           },
		   {
            title: 'dvdate',
            align:"center",
            dataIndex: 'dvdate'
           },
		   {
            title: 'dpdate',
            align:"center",
            dataIndex: 'dpdate'
           },
		   {
            title: 'frefusequantity',
            align:"center",
            dataIndex: 'frefusequantity'
           },
		   {
            title: 'cgspstate',
            align:"center",
            dataIndex: 'cgspstate'
           },
		   {
            title: 'fvalidnum',
            align:"center",
            dataIndex: 'fvalidnum'
           },
		   {
            title: 'fvalidinnum',
            align:"center",
            dataIndex: 'fvalidinnum'
           },
		   {
            title: 'finvalidnum',
            align:"center",
            dataIndex: 'finvalidnum'
           },
		   {
            title: 'frealnum',
            align:"center",
            dataIndex: 'frealnum'
           },
		   {
            title: 'btaxcost',
            align:"center",
            dataIndex: 'btaxcost'
           },
		   {
            title: 'binspect',
            align:"center",
            dataIndex: 'binspect'
           },
		   {
            title: 'frefusenum',
            align:"center",
            dataIndex: 'frefusenum'
           },
		   {
            title: 'ippartid',
            align:"center",
            dataIndex: 'ippartid'
           },
		   {
            title: 'ipquantity',
            align:"center",
            dataIndex: 'ipquantity'
           },
		   {
            title: 'iptoseq',
            align:"center",
            dataIndex: 'iptoseq'
           },
		   {
            title: 'sodid',
            align:"center",
            dataIndex: 'sodid'
           },
		   {
            title: 'sotype',
            align:"center",
            dataIndex: 'sotype'
           },
		   {
            title: 'contractrowguid',
            align:"center",
            dataIndex: 'contractrowguid'
           },
		   {
            title: 'imassdate',
            align:"center",
            dataIndex: 'imassdate'
           },
		   {
            title: 'cmassunit',
            align:"center",
            dataIndex: 'cmassunit'
           },
		   {
            title: 'bexigency',
            align:"center",
            dataIndex: 'bexigency'
           },
		   {
            title: 'cbcloser',
            align:"center",
            dataIndex: 'cbcloser'
           },
		   {
            title: 'fsumrefusequantity',
            align:"center",
            dataIndex: 'fsumrefusequantity'
           },
		   {
            title: 'fsumrefusenum',
            align:"center",
            dataIndex: 'fsumrefusenum'
           },
		   {
            title: 'fretnum',
            align:"center",
            dataIndex: 'fretnum'
           },
		   {
            title: 'fdtquantity',
            align:"center",
            dataIndex: 'fdtquantity'
           },
		   {
            title: 'finvalidinnum',
            align:"center",
            dataIndex: 'finvalidinnum'
           },
		   {
            title: 'fdegradequantity',
            align:"center",
            dataIndex: 'fdegradequantity'
           },
		   {
            title: 'fdegradenum',
            align:"center",
            dataIndex: 'fdegradenum'
           },
		   {
            title: 'fdegradeinquantity',
            align:"center",
            dataIndex: 'fdegradeinquantity'
           },
		   {
            title: 'fdegradeinnum',
            align:"center",
            dataIndex: 'fdegradeinnum'
           },
		   {
            title: 'finspectquantity',
            align:"center",
            dataIndex: 'finspectquantity'
           },
		   {
            title: 'finspectnum',
            align:"center",
            dataIndex: 'finspectnum'
           },
		   {
            title: 'iinvmpcost',
            align:"center",
            dataIndex: 'iinvmpcost'
           },
		   {
            title: 'guids',
            align:"center",
            dataIndex: 'guids'
           },
		   {
            title: 'iinvexchrate',
            align:"center",
            dataIndex: 'iinvexchrate'
           },
		   {
            title: 'objectidSource',
            align:"center",
            dataIndex: 'objectidSource'
           },
		   {
            title: 'autoidSource',
            align:"center",
            dataIndex: 'autoidSource'
           },
		   {
            title: 'uftsSource',
            align:"center",
            dataIndex: 'uftsSource'
           },
		   {
            title: 'irownoSource',
            align:"center",
            dataIndex: 'irownoSource'
           },
		   {
            title: 'csocode',
            align:"center",
            dataIndex: 'csocode'
           },
		   {
            title: 'isorowno',
            align:"center",
            dataIndex: 'isorowno'
           },
		   {
            title: 'iorderid',
            align:"center",
            dataIndex: 'iorderid'
           },
		   {
            title: 'cordercode',
            align:"center",
            dataIndex: 'cordercode'
           },
		   {
            title: 'iorderrowno',
            align:"center",
            dataIndex: 'iorderrowno'
           },
		   {
            title: 'dlineclosedate',
            align:"center",
            dataIndex: 'dlineclosedate'
           },
		   {
            title: 'contractcode',
            align:"center",
            dataIndex: 'contractcode'
           },
		   {
            title: 'contractrowno',
            align:"center",
            dataIndex: 'contractrowno'
           },
		   {
            title: 'rejectsource',
            align:"center",
            dataIndex: 'rejectsource'
           },
		   {
            title: 'iciqbookid',
            align:"center",
            dataIndex: 'iciqbookid'
           },
		   {
            title: 'cciqbookcode',
            align:"center",
            dataIndex: 'cciqbookcode'
           },
		   {
            title: 'cciqcode',
            align:"center",
            dataIndex: 'cciqcode'
           },
		   {
            title: 'fciqchangrate',
            align:"center",
            dataIndex: 'fciqchangrate'
           },
		   {
            title: 'irejectautoid',
            align:"center",
            dataIndex: 'irejectautoid'
           },
		   {
            title: 'iexpiratdatecalcu',
            align:"center",
            dataIndex: 'iexpiratdatecalcu'
           },
		   {
            title: 'cexpirationdate',
            align:"center",
            dataIndex: 'cexpirationdate'
           },
		   {
            title: 'dexpirationdate',
            align:"center",
            dataIndex: 'dexpirationdate'
           },
		   {
            title: 'cupsocode',
            align:"center",
            dataIndex: 'cupsocode'
           },
		   {
            title: 'iorderdid',
            align:"center",
            dataIndex: 'iorderdid'
           },
		   {
            title: 'iordertype',
            align:"center",
            dataIndex: 'iordertype'
           },
		   {
            title: 'csoordercode',
            align:"center",
            dataIndex: 'csoordercode'
           },
		   {
            title: 'iorderseq',
            align:"center",
            dataIndex: 'iorderseq'
           },
		   {
            title: 'cbatchproperty1',
            align:"center",
            dataIndex: 'cbatchproperty1'
           },
		   {
            title: 'cbatchproperty2',
            align:"center",
            dataIndex: 'cbatchproperty2'
           },
		   {
            title: 'cbatchproperty3',
            align:"center",
            dataIndex: 'cbatchproperty3'
           },
		   {
            title: 'cbatchproperty4',
            align:"center",
            dataIndex: 'cbatchproperty4'
           },
		   {
            title: 'cbatchproperty5',
            align:"center",
            dataIndex: 'cbatchproperty5'
           },
		   {
            title: 'cbatchproperty6',
            align:"center",
            dataIndex: 'cbatchproperty6'
           },
		   {
            title: 'cbatchproperty7',
            align:"center",
            dataIndex: 'cbatchproperty7'
           },
		   {
            title: 'cbatchproperty8',
            align:"center",
            dataIndex: 'cbatchproperty8'
           },
		   {
            title: 'cbatchproperty9',
            align:"center",
            dataIndex: 'cbatchproperty9'
           },
		   {
            title: 'cbatchproperty10',
            align:"center",
            dataIndex: 'cbatchproperty10'
           },
		   {
            title: 'ivouchrowno',
            align:"center",
            dataIndex: 'ivouchrowno'
           },
		   {
            title: 'irowno',
            align:"center",
            dataIndex: 'irowno'
           },
		   {
            title: 'cbmemo',
            align:"center",
            dataIndex: 'cbmemo'
           },
		   {
            title: 'cbsysbarcode',
            align:"center",
            dataIndex: 'cbsysbarcode'
           },
		   {
            title: 'carrivalcode',
            align:"center",
            dataIndex: 'carrivalcode'
           },
		   {
            title: 'ipickedquantity',
            align:"center",
            dataIndex: 'ipickedquantity'
           },
		   {
            title: 'ipickednum',
            align:"center",
            dataIndex: 'ipickednum'
           },
		   {
            title: 'isourcemocode',
            align:"center",
            dataIndex: 'isourcemocode'
           },
		   {
            title: 'isourcemodetailsid',
            align:"center",
            dataIndex: 'isourcemodetailsid'
           },
		   {
            title: 'freworkquantity',
            align:"center",
            dataIndex: 'freworkquantity'
           },
		   {
            title: 'freworknum',
            align:"center",
            dataIndex: 'freworknum'
           },
		   {
            title: 'fsumreworkquantity',
            align:"center",
            dataIndex: 'fsumreworkquantity'
           },
		   {
            title: 'fsumreworknum',
            align:"center",
            dataIndex: 'fsumreworknum'
           },
		   {
            title: 'iproducttype',
            align:"center",
            dataIndex: 'iproducttype'
           },
		   {
            title: 'cmaininvcode',
            align:"center",
            dataIndex: 'cmaininvcode'
           },
		   {
            title: 'imainmodetailsid',
            align:"center",
            dataIndex: 'imainmodetailsid'
           },
		   {
            title: 'planlotnumber',
            align:"center",
            dataIndex: 'planlotnumber'
           },
		   {
            title: 'bgift',
            align:"center",
            dataIndex: 'bgift'
           },
		   {
            title: 'cfactorycode',
            align:"center",
            dataIndex: 'cfactorycode'
           },
          {
            title: '操作',
            dataIndex: 'action',
            align:"center",
            scopedSlots: { customRender: 'action' },
          }
        ],
		url: {
          list: "/u8/puArrivalVouchs/list",
          delete: "/u8/puArrivalVouchs/delete",
          deleteBatch: "/u8/puArrivalVouchs/deleteBatch",
          exportXlsUrl: "u8/puArrivalVouchs/exportXls",
          importExcelUrl: "u8/puArrivalVouchs/importExcel",
       },
    }
  },
  computed: {
    importExcelUrl: function(){
      return `${window._CONFIG['domianURL']}/${this.url.importExcelUrl}`;
    }
  },
    methods: {
     
    }
  }
</script>
<style scoped>
  @import '~@assets/less/common.less';
</style>