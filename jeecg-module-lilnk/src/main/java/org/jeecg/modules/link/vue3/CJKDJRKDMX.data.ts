import {BasicColumn} from '/@/components/Table';
import {FormSchema} from '/@/components/Table';
import { rules} from '/@/utils/helper/validator';
import { render } from '/@/utils/common/renderUtils';

export const columns: BasicColumn[] = [
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
    title: 'sspcd',
    dataIndex: 'sspcd'
   },
   {
    title: 'shzgsid',
    dataIndex: 'shzgsid'
   },
   {
    title: 'sgsid',
    dataIndex: 'sgsid'
   },
   {
    title: '行号',
    dataIndex: 'nhh'
   },
   {
    title: '接口单据编号(ERP)',
    dataIndex: 'sjkid'
   },
   {
    title: '接口商品内码(ERP)',
    dataIndex: 'sjkspid'
   },
   {
    title: '入库单号(WMS)',
    dataIndex: 'nrkdid'
   },
   {
    title: '商品内码(WMS)',
    dataIndex: 'nspid'
   },
   {
    title: '计量规格',
    dataIndex: 'njlgg'
   },
   {
    title: '计划数量',
    dataIndex: 'n4yssl'
   },
   {
    title: '合格数量',
    dataIndex: 'n4sssl'
   },
   {
    title: '批号(如果没有批号默认0000)',
    dataIndex: 'sph'
   },
   {
    title: '灭菌批号',
    dataIndex: 'smjph'
   },
   {
    title: '生产日期',
    dataIndex: 'dscrq'
   },
   {
    title: '有效期至',
    dataIndex: 'dyxqz'
   },
   {
    title: '原行号',
    dataIndex: 'nyhh'
   },
   {
    title: '冲红数量',
    dataIndex: 'n4lsslCh'
   },
   {
    title: '不合格数量',
    dataIndex: 'n4bhgsl'
   },
   {
    title: '时间戳',
    dataIndex: 'ssjc'
   },
   {
    title: 'ERP总单Id',
    dataIndex: 'szdid'
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
    title: 'ERP接口单据号',
    dataIndex: 'sxgjkid'
   },
   {
    title: '0合格，1不合格',
    dataIndex: 'nbhg'
   },
   {
    title: 'ERP接口行号',
    dataIndex: 'njkhh'
   },
   {
    title: '备用1',
    dataIndex: 'sbeiy1'
   },
   {
    title: '备用2',
    dataIndex: 'sbeiy2'
   },
];

export const searchFormSchema: FormSchema[] = [
 {
    label: '备用3',
    field: 'sbeiy3',
    component: 'Input'
  },
 {
    label: '备用4',
    field: 'sbeiy4',
    component: 'Input'
  },
];

export const formSchema: FormSchema[] = [
  // TODO 主键隐藏字段，目前写死为ID
  {label: '', field: 'id', component: 'Input', show: false},
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
    label: 'sspcd',
    field: 'sspcd',
    component: 'Input',
  },
  {
    label: 'shzgsid',
    field: 'shzgsid',
    component: 'Input',
  },
  {
    label: 'sgsid',
    field: 'sgsid',
    component: 'Input',
  },
  {
    label: '行号',
    field: 'nhh',
    component: 'Input',
  },
  {
    label: '接口单据编号(ERP)',
    field: 'sjkid',
    component: 'Input',
  },
  {
    label: '接口商品内码(ERP)',
    field: 'sjkspid',
    component: 'Input',
  },
  {
    label: '入库单号(WMS)',
    field: 'nrkdid',
    component: 'Input',
  },
  {
    label: '商品内码(WMS)',
    field: 'nspid',
    component: 'Input',
  },
  {
    label: '计量规格',
    field: 'njlgg',
    component: 'Input',
  },
  {
    label: '计划数量',
    field: 'n4yssl',
    component: 'Input',
  },
  {
    label: '合格数量',
    field: 'n4sssl',
    component: 'Input',
  },
  {
    label: '批号(如果没有批号默认0000)',
    field: 'sph',
    component: 'Input',
  },
  {
    label: '灭菌批号',
    field: 'smjph',
    component: 'Input',
  },
  {
    label: '生产日期',
    field: 'dscrq',
    component: 'DatePicker'
  },
  {
    label: '有效期至',
    field: 'dyxqz',
    component: 'DatePicker'
  },
  {
    label: '原行号',
    field: 'nyhh',
    component: 'Input',
  },
  {
    label: '冲红数量',
    field: 'n4lsslCh',
    component: 'Input',
  },
  {
    label: '不合格数量',
    field: 'n4bhgsl',
    component: 'Input',
  },
  {
    label: '时间戳',
    field: 'ssjc',
    component: 'Input',
  },
  {
    label: 'ERP总单Id',
    field: 'szdid',
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
    label: 'ERP接口单据号',
    field: 'sxgjkid',
    component: 'Input',
  },
  {
    label: '0合格，1不合格',
    field: 'nbhg',
    component: 'Input',
  },
  {
    label: 'ERP接口行号',
    field: 'njkhh',
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
];
