<template>
  <a-card :bordered="false">

    <!-- 查询区域 -->
    <div class="table-page-search-wrapper">
      <a-form layout="inline" @keyup.enter.native="searchQuery">
        <a-row :gutter="24">

          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="ivtid">
              <a-input placeholder="请输入ivtid" v-model="queryParam.ivtid"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="ufts">
              <a-input placeholder="请输入ufts" v-model="queryParam.ufts"></a-input>
            </a-form-item>
          </a-col>
        <template v-if="toggleSearchStatus">
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="ccode">
              <a-input placeholder="请输入ccode" v-model="queryParam.ccode"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="cptcode">
              <a-input placeholder="请输入cptcode" v-model="queryParam.cptcode"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="ddate">
              <a-input placeholder="请输入ddate" v-model="queryParam.ddate"></a-input>
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
      <a-button type="primary" icon="download" @click="handleExportXls('采购到货退货主表')">导出</a-button>
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
    <puArrivalVouch-modal ref="modalForm" @ok="modalFormOk"></puArrivalVouch-modal>
  </a-card>
</template>

<script>
  import '@/assets/less/TableExpand.less'
  import PuArrivalVouchModal from './modules/PuArrivalVouchModal'
  import { JeecgListMixin } from '@/mixins/JeecgListMixin'

  export default {
    name: "PuArrivalVouchList",
    mixins:[JeecgListMixin],
    components: {
      PuArrivalVouchModal
    },
    data () {
      return {
        description: '采购到货退货主表管理页面',
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
            title: 'ivtid',
            align:"center",
            dataIndex: 'ivtid'
           },
		   {
            title: 'ufts',
            align:"center",
            dataIndex: 'ufts'
           },
		   {
            title: 'ccode',
            align:"center",
            dataIndex: 'ccode'
           },
		   {
            title: 'cptcode',
            align:"center",
            dataIndex: 'cptcode'
           },
		   {
            title: 'ddate',
            align:"center",
            dataIndex: 'ddate'
           },
		   {
            title: 'cvencode',
            align:"center",
            dataIndex: 'cvencode'
           },
		   {
            title: 'cdepcode',
            align:"center",
            dataIndex: 'cdepcode'
           },
		   {
            title: 'cpersoncode',
            align:"center",
            dataIndex: 'cpersoncode'
           },
		   {
            title: 'cpaycode',
            align:"center",
            dataIndex: 'cpaycode'
           },
		   {
            title: 'csccode',
            align:"center",
            dataIndex: 'csccode'
           },
		   {
            title: 'cexchName',
            align:"center",
            dataIndex: 'cexchName'
           },
		   {
            title: 'iexchrate',
            align:"center",
            dataIndex: 'iexchrate'
           },
		   {
            title: 'itaxrate',
            align:"center",
            dataIndex: 'itaxrate'
           },
		   {
            title: 'cmemo',
            align:"center",
            dataIndex: 'cmemo'
           },
		   {
            title: 'cbustype',
            align:"center",
            dataIndex: 'cbustype'
           },
		   {
            title: 'cmaker',
            align:"center",
            dataIndex: 'cmaker'
           },
		   {
            title: 'bnegative',
            align:"center",
            dataIndex: 'bnegative'
           },
		   {
            title: 'cdefine1',
            align:"center",
            dataIndex: 'cdefine1'
           },
		   {
            title: 'cdefine2',
            align:"center",
            dataIndex: 'cdefine2'
           },
		   {
            title: 'cdefine3',
            align:"center",
            dataIndex: 'cdefine3'
           },
		   {
            title: 'cdefine4',
            align:"center",
            dataIndex: 'cdefine4'
           },
		   {
            title: 'cdefine5',
            align:"center",
            dataIndex: 'cdefine5'
           },
		   {
            title: 'cdefine6',
            align:"center",
            dataIndex: 'cdefine6'
           },
		   {
            title: 'cdefine7',
            align:"center",
            dataIndex: 'cdefine7'
           },
		   {
            title: 'cdefine8',
            align:"center",
            dataIndex: 'cdefine8'
           },
		   {
            title: 'cdefine9',
            align:"center",
            dataIndex: 'cdefine9'
           },
		   {
            title: 'cdefine10',
            align:"center",
            dataIndex: 'cdefine10'
           },
		   {
            title: 'cdefine11',
            align:"center",
            dataIndex: 'cdefine11'
           },
		   {
            title: 'cdefine12',
            align:"center",
            dataIndex: 'cdefine12'
           },
		   {
            title: 'cdefine13',
            align:"center",
            dataIndex: 'cdefine13'
           },
		   {
            title: 'cdefine14',
            align:"center",
            dataIndex: 'cdefine14'
           },
		   {
            title: 'cdefine15',
            align:"center",
            dataIndex: 'cdefine15'
           },
		   {
            title: 'cdefine16',
            align:"center",
            dataIndex: 'cdefine16'
           },
		   {
            title: 'ccloser',
            align:"center",
            dataIndex: 'ccloser'
           },
		   {
            title: 'idiscounttaxtype',
            align:"center",
            dataIndex: 'idiscounttaxtype'
           },
		   {
            title: 'ibilltype',
            align:"center",
            dataIndex: 'ibilltype'
           },
		   {
            title: 'cvouchtype',
            align:"center",
            dataIndex: 'cvouchtype'
           },
		   {
            title: 'cgeneralordercode',
            align:"center",
            dataIndex: 'cgeneralordercode'
           },
		   {
            title: 'ctmcode',
            align:"center",
            dataIndex: 'ctmcode'
           },
		   {
            title: 'cincotermcode',
            align:"center",
            dataIndex: 'cincotermcode'
           },
		   {
            title: 'ctransordercode',
            align:"center",
            dataIndex: 'ctransordercode'
           },
		   {
            title: 'dportdate',
            align:"center",
            dataIndex: 'dportdate'
           },
		   {
            title: 'csportcode',
            align:"center",
            dataIndex: 'csportcode'
           },
		   {
            title: 'caportcode',
            align:"center",
            dataIndex: 'caportcode'
           },
		   {
            title: 'csvencode',
            align:"center",
            dataIndex: 'csvencode'
           },
		   {
            title: 'carrivalplace',
            align:"center",
            dataIndex: 'carrivalplace'
           },
		   {
            title: 'dclosedate',
            align:"center",
            dataIndex: 'dclosedate'
           },
		   {
            title: 'idec',
            align:"center",
            dataIndex: 'idec'
           },
		   {
            title: 'bcal',
            align:"center",
            dataIndex: 'bcal'
           },
		   {
            title: 'guid',
            align:"center",
            dataIndex: 'guid'
           },
		   {
            title: 'cmaketime',
            align:"center",
            dataIndex: 'cmaketime'
           },
		   {
            title: 'cmodifytime',
            align:"center",
            dataIndex: 'cmodifytime'
           },
		   {
            title: 'cmodifydate',
            align:"center",
            dataIndex: 'cmodifydate'
           },
		   {
            title: 'creviser',
            align:"center",
            dataIndex: 'creviser'
           },
		   {
            title: 'iverifystate',
            align:"center",
            dataIndex: 'iverifystate'
           },
		   {
            title: 'cauditdate',
            align:"center",
            dataIndex: 'cauditdate'
           },
		   {
            title: 'caudittime',
            align:"center",
            dataIndex: 'caudittime'
           },
		   {
            title: 'cverifier',
            align:"center",
            dataIndex: 'cverifier'
           },
		   {
            title: 'iverifystateex',
            align:"center",
            dataIndex: 'iverifystateex'
           },
		   {
            title: 'ireturncount',
            align:"center",
            dataIndex: 'ireturncount'
           },
		   {
            title: 'iswfcontrolled',
            align:"center",
            dataIndex: 'iswfcontrolled'
           },
		   {
            title: 'cvenpuomprotocol',
            align:"center",
            dataIndex: 'cvenpuomprotocol'
           },
		   {
            title: 'cchanger',
            align:"center",
            dataIndex: 'cchanger'
           },
		   {
            title: 'iflowid',
            align:"center",
            dataIndex: 'iflowid'
           },
		   {
            title: 'iprintcount',
            align:"center",
            dataIndex: 'iprintcount'
           },
		   {
            title: 'ccleanver',
            align:"center",
            dataIndex: 'ccleanver'
           },
		   {
            title: 'cpocode',
            align:"center",
            dataIndex: 'cpocode'
           },
		   {
            title: 'csysbarcode',
            align:"center",
            dataIndex: 'csysbarcode'
           },
		   {
            title: 'ccurrentauditor',
            align:"center",
            dataIndex: 'ccurrentauditor'
           },
          {
            title: '操作',
            dataIndex: 'action',
            align:"center",
            scopedSlots: { customRender: 'action' },
          }
        ],
		url: {
          list: "/u8/puArrivalVouch/list",
          delete: "/u8/puArrivalVouch/delete",
          deleteBatch: "/u8/puArrivalVouch/deleteBatch",
          exportXlsUrl: "u8/puArrivalVouch/exportXls",
          importExcelUrl: "u8/puArrivalVouch/importExcel",
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