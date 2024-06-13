<template>
  <a-card :bordered="false">

    <!-- 查询区域 -->
    <div class="table-page-search-wrapper">
      <a-form layout="inline" @keyup.enter.native="searchQuery">
        <a-row :gutter="24">

          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="备用5">
              <a-input placeholder="请输入备用5" v-model="queryParam.sbeiy5"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="备用6">
              <a-input placeholder="请输入备用6" v-model="queryParam.sbeiy6"></a-input>
            </a-form-item>
          </a-col>
        <template v-if="toggleSearchStatus">
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="备用7">
              <a-input placeholder="请输入备用7" v-model="queryParam.sbeiy7"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="备用8">
              <a-input placeholder="请输入备用8" v-model="queryParam.sbeiy8"></a-input>
            </a-form-item>
          </a-col>
          <a-col :xl="6" :lg="7" :md="8" :sm="24">
            <a-form-item label="数值备用1">
              <a-input placeholder="请输入数值备用1" v-model="queryParam.nbeiy1"></a-input>
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
      <a-button type="primary" icon="download" @click="handleExportXls('下架汇总')">导出</a-button>
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
    <cJKDJCKJHD-modal ref="modalForm" @ok="modalFormOk"></cJKDJCKJHD-modal>
  </a-card>
</template>

<script>
  import '@/assets/less/TableExpand.less'
  import CJKDJCKJHDModal from './modules/CJKDJCKJHDModal'
  import { JeecgListMixin } from '@/mixins/JeecgListMixin'

  export default {
    name: "CJKDJCKJHDList",
    mixins:[JeecgListMixin],
    components: {
      CJKDJCKJHDModal
    },
    data () {
      return {
        description: '下架汇总管理页面',
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
            title: '内复核人',
            align:"center",
            dataIndex: 'snfhrmc'
           },
		   {
            title: '拼箱人',
            align:"center",
            dataIndex: 'spxrmc'
           },
		   {
            title: '是否拆分',
            align:"center",
            dataIndex: 'nsfcd'
           },
		   {
            title: '仓库ＩＤ',
            align:"center",
            dataIndex: 'sgsid'
           },
		   {
            title: '下架人',
            align:"center",
            dataIndex: 'sxjrmc'
           },
		   {
            title: '接收标记(0，未接收；1，接收成功；2，处理失败)',
            align:"center",
            dataIndex: 'njsbj'
           },
		   {
            title: '接收备注',
            align:"center",
            dataIndex: 'sjsbz'
           },
		   {
            title: '出库单号(WMS)',
            align:"center",
            dataIndex: 'nckdid'
           },
		   {
            title: '接口单号(ERP)',
            align:"center",
            dataIndex: 'sjkid'
           },
		   {
            title: '供应商',
            align:"center",
            dataIndex: 'swldwid'
           },
		   {
            title: '出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)',
            align:"center",
            dataIndex: 'ncklx'
           },
		   {
            title: '提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)',
            align:"center",
            dataIndex: 'nthfs'
           },
		   {
            title: '备注',
            align:"center",
            dataIndex: 'sbz'
           },
		   {
            title: '业务员名称',
            align:"center",
            dataIndex: 'sywymc'
           },
		   {
            title: '业务原单号',
            align:"center",
            dataIndex: 'sywydh'
           },
		   {
            title: '制单日期',
            align:"center",
            dataIndex: 'dzdrq'
           },
		   {
            title: '发货人名称',
            align:"center",
            dataIndex: 'sysr'
           },
		   {
            title: '发货日期',
            align:"center",
            dataIndex: 'dysrq'
           },
		   {
            title: '时间戳',
            align:"center",
            dataIndex: 'ssjc'
           },
		   {
            title: '冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)',
            align:"center",
            dataIndex: 'nchzt'
           },
		   {
            title: '制单人',
            align:"center",
            dataIndex: 'szdr'
           },
		   {
            title: 'combrainTimes',
            align:"center",
            dataIndex: 'combrainTimes'
           },
		   {
            title: '外复核人名称1',
            align:"center",
            dataIndex: 'swfhymc'
           },
		   {
            title: '外复核人名称2',
            align:"center",
            dataIndex: 'swfhymc2'
           },
		   {
            title: '默认1',
            align:"center",
            dataIndex: 'nck'
           },
		   {
            title: '混箱标示',
            align:"center",
            dataIndex: 'shxbs'
           },
		   {
            title: '拼箱数',
            align:"center",
            dataIndex: 'npxs'
           },
		   {
            title: '整件数',
            align:"center",
            dataIndex: 'nzjs'
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
            title: '接口单位ID',
            align:"center",
            dataIndex: 'sjkdwid'
           },
		   {
            title: '货主公司ID',
            align:"center",
            dataIndex: 'shzgsid'
           },
		   {
            title: '收货人',
            align:"center",
            dataIndex: 'shouhr'
           },
		   {
            title: '拼袋数',
            align:"center",
            dataIndex: 'npds'
           },
		   {
            title: '快递单据号',
            align:"center",
            dataIndex: 'skuaiddh'
           },
		   {
            title: '复核台ID',
            align:"center",
            dataIndex: 'sfhtid'
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
            title: '操作',
            dataIndex: 'action',
            align:"center",
            scopedSlots: { customRender: 'action' },
          }
        ],
		url: {
          list: "/link/cJKDJCKJHD/list",
          delete: "/link/cJKDJCKJHD/delete",
          deleteBatch: "/link/cJKDJCKJHD/deleteBatch",
          exportXlsUrl: "link/cJKDJCKJHD/exportXls",
          importExcelUrl: "link/cJKDJCKJHD/importExcel",
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