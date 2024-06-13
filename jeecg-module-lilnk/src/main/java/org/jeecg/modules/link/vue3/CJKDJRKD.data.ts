import {BasicColumn} from '/@/components/Table';
import {FormSchema} from '/@/components/Table';
import { rules} from '/@/utils/helper/validator';
import { render } from '/@/utils/common/renderUtils';

export const columns: BasicColumn[] = [
    {
    title: '接收标记(0，未接收；1，接收成功；2，处理失败)',
    dataIndex: 'njsbj'
   },
   {
    title: '接收备注',
    dataIndex: 'sjsbz'
   },
   {
    title: '入库单号(WMS)',
    dataIndex: 'nrkdid'
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
    title: '入库方式',
    dataIndex: 'nrkfs'
   },
   {
    title: '入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)',
    dataIndex: 'nrklx'
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
    title: '制单日期',
    dataIndex: 'dzdrq'
   },
   {
    title: '时间戳',
    dataIndex: 'ssjc'
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
    title: '默认1',
    dataIndex: 'nck'
   },
   {
    title: '货主ID',
    dataIndex: 'shzid'
   },
   {
    title: '货主名称',
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
    title: 'ERP接口单据号',
    dataIndex: 'sxgjkid'
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
    title: '分仓id',
    dataIndex: 'sgsid'
   },
   {
    title: '上架人',
    dataIndex: 'ssjy'
   },
];

export const searchFormSchema: FormSchema[] = [
 {
    label: '接收标记(0，未接收；1，接收成功；2，处理失败)',
    field: 'njsbj',
    component: 'Input'
  },
 {
    label: '接收备注',
    field: 'sjsbz',
    component: 'Input'
  },
];

export const formSchema: FormSchema[] = [
  // TODO 主键隐藏字段，目前写死为ID
  {label: '', field: 'id', component: 'Input', show: false},
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
    label: '入库单号(WMS)',
    field: 'nrkdid',
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
    label: '入库方式',
    field: 'nrkfs',
    component: 'Input',
  },
  {
    label: '入库类型(0 正常入库,1 越库入库 3 销售退回（退货库） 4销售退回（合格库）5退回越库)',
    field: 'nrklx',
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
    label: '制单日期',
    field: 'dzdrq',
    component: 'DatePicker'
  },
  {
    label: '时间戳',
    field: 'ssjc',
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
    label: '默认1',
    field: 'nck',
    component: 'Input',
  },
  {
    label: '货主ID',
    field: 'shzid',
    component: 'Input',
  },
  {
    label: '货主名称',
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
    label: 'ERP接口单据号',
    field: 'sxgjkid',
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
    label: '分仓id',
    field: 'sgsid',
    component: 'Input',
  },
  {
    label: '上架人',
    field: 'ssjy',
    component: 'Input',
  },
];
