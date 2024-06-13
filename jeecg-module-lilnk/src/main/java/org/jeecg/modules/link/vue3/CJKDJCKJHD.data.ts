import {BasicColumn} from '/@/components/Table';
import {FormSchema} from '/@/components/Table';
import { rules} from '/@/utils/helper/validator';
import { render } from '/@/utils/common/renderUtils';

export const columns: BasicColumn[] = [
    {
    title: '备用5',
    dataIndex: 'sbeiy5'
   },
   {
    title: '备用6',
    dataIndex: 'sbeiy6'
   },
   {
    title: '备用7',
    dataIndex: 'sbeiy7'
   },
   {
    title: '备用8',
    dataIndex: 'sbeiy8'
   },
   {
    title: '数值备用1',
    dataIndex: 'nbeiy1'
   },
   {
    title: '数值备用2',
    dataIndex: 'nbeiy2'
   },
   {
    title: '数值备用3',
    dataIndex: 'nbeiy3'
   },
   {
    title: '数值备用4',
    dataIndex: 'nbeiy4'
   },
   {
    title: '数值备用5',
    dataIndex: 'nbeiy5'
   },
   {
    title: '数值备用6',
    dataIndex: 'nbeiy6'
   },
   {
    title: '数值备用7',
    dataIndex: 'nbeiy7'
   },
   {
    title: '数值备用8',
    dataIndex: 'nbeiy8'
   },
   {
    title: '内复核人',
    dataIndex: 'snfhrmc'
   },
   {
    title: '拼箱人',
    dataIndex: 'spxrmc'
   },
   {
    title: '是否拆分',
    dataIndex: 'nsfcd'
   },
   {
    title: '仓库ＩＤ',
    dataIndex: 'sgsid'
   },
   {
    title: '下架人',
    dataIndex: 'sxjrmc'
   },
   {
    title: '接收标记(0，未接收；1，接收成功；2，处理失败)',
    dataIndex: 'njsbj'
   },
   {
    title: '接收备注',
    dataIndex: 'sjsbz'
   },
   {
    title: '出库单号(WMS)',
    dataIndex: 'nckdid'
   },
   {
    title: '接口单号(ERP)',
    dataIndex: 'sjkid'
   },
   {
    title: '供应商',
    dataIndex: 'swldwid'
   },
   {
    title: '出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)',
    dataIndex: 'ncklx'
   },
   {
    title: '提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)',
    dataIndex: 'nthfs'
   },
   {
    title: '备注',
    dataIndex: 'sbz'
   },
   {
    title: '业务员名称',
    dataIndex: 'sywymc'
   },
   {
    title: '业务原单号',
    dataIndex: 'sywydh'
   },
   {
    title: '制单日期',
    dataIndex: 'dzdrq'
   },
   {
    title: '发货人名称',
    dataIndex: 'sysr'
   },
   {
    title: '发货日期',
    dataIndex: 'dysrq'
   },
   {
    title: '时间戳',
    dataIndex: 'ssjc'
   },
   {
    title: '冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)',
    dataIndex: 'nchzt'
   },
   {
    title: '制单人',
    dataIndex: 'szdr'
   },
   {
    title: 'combrainTimes',
    dataIndex: 'combrainTimes'
   },
   {
    title: '外复核人名称1',
    dataIndex: 'swfhymc'
   },
   {
    title: '外复核人名称2',
    dataIndex: 'swfhymc2'
   },
   {
    title: '默认1',
    dataIndex: 'nck'
   },
   {
    title: '混箱标示',
    dataIndex: 'shxbs'
   },
   {
    title: '拼箱数',
    dataIndex: 'npxs'
   },
   {
    title: '整件数',
    dataIndex: 'nzjs'
   },
   {
    title: '货主ID',
    dataIndex: 'shzid'
   },
   {
    title: 'shzname',
    dataIndex: 'shzname'
   },
   {
    title: '接口单位ID',
    dataIndex: 'sjkdwid'
   },
   {
    title: '货主公司ID',
    dataIndex: 'shzgsid'
   },
   {
    title: '收货人',
    dataIndex: 'shouhr'
   },
   {
    title: '拼袋数',
    dataIndex: 'npds'
   },
   {
    title: '快递单据号',
    dataIndex: 'skuaiddh'
   },
   {
    title: '复核台ID',
    dataIndex: 'sfhtid'
   },
   {
    title: '备用1',
    dataIndex: 'sbeiy1'
   },
   {
    title: '备用2',
    dataIndex: 'sbeiy2'
   },
   {
    title: '备用3',
    dataIndex: 'sbeiy3'
   },
   {
    title: '备用4',
    dataIndex: 'sbeiy4'
   },
];

export const searchFormSchema: FormSchema[] = [
 {
    label: '备用5',
    field: 'sbeiy5',
    component: 'Input'
  },
 {
    label: '备用6',
    field: 'sbeiy6',
    component: 'Input'
  },
];

export const formSchema: FormSchema[] = [
  // TODO 主键隐藏字段，目前写死为ID
  {label: '', field: 'id', component: 'Input', show: false},
  {
    label: '备用5',
    field: 'sbeiy5',
    component: 'Input',
  },
  {
    label: '备用6',
    field: 'sbeiy6',
    component: 'Input',
  },
  {
    label: '备用7',
    field: 'sbeiy7',
    component: 'Input',
  },
  {
    label: '备用8',
    field: 'sbeiy8',
    component: 'Input',
  },
  {
    label: '数值备用1',
    field: 'nbeiy1',
    component: 'Input',
  },
  {
    label: '数值备用2',
    field: 'nbeiy2',
    component: 'Input',
  },
  {
    label: '数值备用3',
    field: 'nbeiy3',
    component: 'Input',
  },
  {
    label: '数值备用4',
    field: 'nbeiy4',
    component: 'Input',
  },
  {
    label: '数值备用5',
    field: 'nbeiy5',
    component: 'Input',
  },
  {
    label: '数值备用6',
    field: 'nbeiy6',
    component: 'Input',
  },
  {
    label: '数值备用7',
    field: 'nbeiy7',
    component: 'Input',
  },
  {
    label: '数值备用8',
    field: 'nbeiy8',
    component: 'Input',
  },
  {
    label: '内复核人',
    field: 'snfhrmc',
    component: 'Input',
  },
  {
    label: '拼箱人',
    field: 'spxrmc',
    component: 'Input',
  },
  {
    label: '是否拆分',
    field: 'nsfcd',
    component: 'Input',
  },
  {
    label: '仓库ＩＤ',
    field: 'sgsid',
    component: 'Input',
  },
  {
    label: '下架人',
    field: 'sxjrmc',
    component: 'Input',
  },
  {
    label: '接收标记(0，未接收；1，接收成功；2，处理失败)',
    field: 'njsbj',
    component: 'Input',
  },
  {
    label: '接收备注',
    field: 'sjsbz',
    component: 'Input',
  },
  {
    label: '出库单号(WMS)',
    field: 'nckdid',
    component: 'Input',
  },
  {
    label: '接口单号(ERP)',
    field: 'sjkid',
    component: 'Input',
  },
  {
    label: '供应商',
    field: 'swldwid',
    component: 'Input',
  },
  {
    label: '出库类型(1 正常销售2 指定批号  5退回越库  6 越库发货  7 KK 8 采退合格  9 采退退货)',
    field: 'ncklx',
    component: 'Input',
  },
  {
    label: '提货方式(0未定义  1：集团连锁 2：市外配送  3：市内配送4：托运 5：自提)',
    field: 'nthfs',
    component: 'Input',
  },
  {
    label: '备注',
    field: 'sbz',
    component: 'Input',
  },
  {
    label: '业务员名称',
    field: 'sywymc',
    component: 'Input',
  },
  {
    label: '业务原单号',
    field: 'sywydh',
    component: 'Input',
  },
  {
    label: '制单日期',
    field: 'dzdrq',
    component: 'DatePicker'
  },
  {
    label: '发货人名称',
    field: 'sysr',
    component: 'Input',
  },
  {
    label: '发货日期',
    field: 'dysrq',
    component: 'DatePicker'
  },
  {
    label: '时间戳',
    field: 'ssjc',
    component: 'Input',
  },
  {
    label: '冲红状态 (0:不冲红 1:整单冲红 2:部分冲红)',
    field: 'nchzt',
    component: 'Input',
  },
  {
    label: '制单人',
    field: 'szdr',
    component: 'Input',
  },
  {
    label: 'combrainTimes',
    field: 'combrainTimes',
    component: 'Input',
  },
  {
    label: '外复核人名称1',
    field: 'swfhymc',
    component: 'Input',
  },
  {
    label: '外复核人名称2',
    field: 'swfhymc2',
    component: 'Input',
  },
  {
    label: '默认1',
    field: 'nck',
    component: 'Input',
  },
  {
    label: '混箱标示',
    field: 'shxbs',
    component: 'Input',
  },
  {
    label: '拼箱数',
    field: 'npxs',
    component: 'Input',
  },
  {
    label: '整件数',
    field: 'nzjs',
    component: 'Input',
  },
  {
    label: '货主ID',
    field: 'shzid',
    component: 'Input',
  },
  {
    label: 'shzname',
    field: 'shzname',
    component: 'Input',
  },
  {
    label: '接口单位ID',
    field: 'sjkdwid',
    component: 'Input',
  },
  {
    label: '货主公司ID',
    field: 'shzgsid',
    component: 'Input',
  },
  {
    label: '收货人',
    field: 'shouhr',
    component: 'Input',
  },
  {
    label: '拼袋数',
    field: 'npds',
    component: 'Input',
  },
  {
    label: '快递单据号',
    field: 'skuaiddh',
    component: 'Input',
  },
  {
    label: '复核台ID',
    field: 'sfhtid',
    component: 'Input',
  },
  {
    label: '备用1',
    field: 'sbeiy1',
    component: 'Input',
  },
  {
    label: '备用2',
    field: 'sbeiy2',
    component: 'Input',
  },
  {
    label: '备用3',
    field: 'sbeiy3',
    component: 'Input',
  },
  {
    label: '备用4',
    field: 'sbeiy4',
    component: 'Input',
  },
];
