<template>
  <a-card :bordered="false">

    <!-- 查询区域 -->
    <div class="table-page-search-wrapper">
      <a-form layout="inline" @keyup.enter.native="searchQuery">
        <a-row :gutter="24">

          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="行号">
              <a-input placeholder="请输入行号" v-model="queryParam.nhh"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="接口单号(ERP)">
              <a-input placeholder="请输入接口单号(ERP)" v-model="queryParam.sjkid"></a-input>
            </a-form-item>
          </a-col>
        <template v-if="toggleSearchStatus">
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="接口商品内码(ERP)">
              <a-input placeholder="请输入接口商品内码(ERP)" v-model="queryParam.sjkspid"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="出库单号(WMS)">
              <a-input placeholder="请输入出库单号(WMS)" v-model="queryParam.nckdid"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="商品内码">
              <a-input placeholder="请输入商品内码" v-model="queryParam.nspid"></a-input>
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
      <a-button type="primary" icon="download" @click="handleExportXls('下架明细')">导出</a-button>
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
    <cJKDJCKJHDMX-modal ref="modalForm" @ok="modalFormOk"></cJKDJCKJHDMX-modal>
  </a-card>
</template>

<script>
  import '@/assets/less/TableExpand.less'
  import CJKDJCKJHDMXModal from './modules/CJKDJCKJHDMXModal'
  import { JeecgListMixin } from '@/mixins/JeecgListMixin'

  export default {
    name: "CJKDJCKJHDMXList",
    mixins:[JeecgListMixin],
    components: {
      CJKDJCKJHDMXModal
    },
    data () {
      return {
        description: '下架明细管理页面',
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
            title: '行号',
            align:"center",
            dataIndex: 'nhh'
           },
		   {
            title: '接口单号(ERP)',
            align:"center",
            dataIndex: 'sjkid'
           },
		   {
            title: '接口商品内码(ERP)',
            align:"center",
            dataIndex: 'sjkspid'
           },
		   {
            title: '出库单号(WMS)',
            align:"center",
            dataIndex: 'nckdid'
           },
		   {
            title: '商品内码',
            align:"center",
            dataIndex: 'nspid'
           },
		   {
            title: '计量规格',
            align:"center",
            dataIndex: 'njlgg'
           },
		   {
            title: '计划数量',
            align:"center",
            dataIndex: 'n4jhsl'
           },
		   {
            title: '发货数量',
            align:"center",
            dataIndex: 'n4sjsl'
           },
		   {
            title: '冲红数量',
            align:"center",
            dataIndex: 'n4lsslCh'
           },
		   {
            title: '批号(如果没有批号默认0000)',
            align:"center",
            dataIndex: 'sph'
           },
		   {
            title: '灭菌批号',
            align:"center",
            dataIndex: 'smjph'
           },
		   {
            title: '生产日期',
            align:"center",
            dataIndex: 'dscrq'
           },
		   {
            title: '有效期至',
            align:"center",
            dataIndex: 'dyxqz'
           },
		   {
            title: 'ERP行号',
            align:"center",
            dataIndex: 'nyhh'
           },
		   {
            title: '时间戳',
            align:"center",
            dataIndex: 'ssjc'
           },
		   {
            title: '货主ID',
            align:"center",
            dataIndex: 'shzid'
           },
		   {
            title: 'shzname',
            align:"center",
            dataIndex: 'shzname'
           },
		   {
            title: 'nzjftLssl',
            align:"center",
            dataIndex: 'nzjftLssl'
           },
		   {
            title: '备用1',
            align:"center",
            dataIndex: 'sbeiy1'
           },
		   {
            title: '备用2',
            align:"center",
            dataIndex: 'sbeiy2'
           },
		   {
            title: '备用3',
            align:"center",
            dataIndex: 'sbeiy3'
           },
		   {
            title: '备用4',
            align:"center",
            dataIndex: 'sbeiy4'
           },
		   {
            title: '备用5',
            align:"center",
            dataIndex: 'sbeiy5'
           },
		   {
            title: '备用6',
            align:"center",
            dataIndex: 'sbeiy6'
           },
		   {
            title: '备用7',
            align:"center",
            dataIndex: 'sbeiy7'
           },
		   {
            title: '备用8',
            align:"center",
            dataIndex: 'sbeiy8'
           },
		   {
            title: '数值备用1',
            align:"center",
            dataIndex: 'nbeiy1'
           },
		   {
            title: '数值备用2',
            align:"center",
            dataIndex: 'nbeiy2'
           },
		   {
            title: '数值备用3',
            align:"center",
            dataIndex: 'nbeiy3'
           },
		   {
            title: '数值备用4',
            align:"center",
            dataIndex: 'nbeiy4'
           },
		   {
            title: '数值备用5',
            align:"center",
            dataIndex: 'nbeiy5'
           },
		   {
            title: '数值备用6',
            align:"center",
            dataIndex: 'nbeiy6'
           },
		   {
            title: '数值备用7',
            align:"center",
            dataIndex: 'nbeiy7'
           },
		   {
            title: '数值备用8',
            align:"center",
            dataIndex: 'nbeiy8'
           },
		   {
            title: 'njsbj',
            align:"center",
            dataIndex: 'njsbj'
           },
		   {
            title: 'shzgsid',
            align:"center",
            dataIndex: 'shzgsid'
           },
          {
            title: '操作',
            dataIndex: 'action',
            align:"center",
            scopedSlots: { customRender: 'action' },
          }
        ],
		url: {
          list: "/link/cJKDJCKJHDMX/list",
          delete: "/link/cJKDJCKJHDMX/delete",
          deleteBatch: "/link/cJKDJCKJHDMX/deleteBatch",
          exportXlsUrl: "link/cJKDJCKJHDMX/exportXls",
          importExcelUrl: "link/cJKDJCKJHDMX/importExcel",
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