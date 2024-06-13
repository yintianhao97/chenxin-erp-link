import {BasicColumn} from '/@/components/Table';
import {FormSchema} from '/@/components/Table';
import { rules} from '/@/utils/helper/validator';
import { render } from '/@/utils/common/renderUtils';

export const columns: BasicColumn[] = [
    {
    title: 'ivtid',
    dataIndex: 'ivtid'
   },
   {
    title: 'ufts',
    dataIndex: 'ufts'
   },
   {
    title: 'ccode',
    dataIndex: 'ccode'
   },
   {
    title: 'cptcode',
    dataIndex: 'cptcode'
   },
   {
    title: 'ddate',
    dataIndex: 'ddate'
   },
   {
    title: 'cvencode',
    dataIndex: 'cvencode'
   },
   {
    title: 'cdepcode',
    dataIndex: 'cdepcode'
   },
   {
    title: 'cpersoncode',
    dataIndex: 'cpersoncode'
   },
   {
    title: 'cpaycode',
    dataIndex: 'cpaycode'
   },
   {
    title: 'csccode',
    dataIndex: 'csccode'
   },
   {
    title: 'cexchName',
    dataIndex: 'cexchName'
   },
   {
    title: 'iexchrate',
    dataIndex: 'iexchrate'
   },
   {
    title: 'itaxrate',
    dataIndex: 'itaxrate'
   },
   {
    title: 'cmemo',
    dataIndex: 'cmemo'
   },
   {
    title: 'cbustype',
    dataIndex: 'cbustype'
   },
   {
    title: 'cmaker',
    dataIndex: 'cmaker'
   },
   {
    title: 'bnegative',
    dataIndex: 'bnegative'
   },
   {
    title: 'cdefine1',
    dataIndex: 'cdefine1'
   },
   {
    title: 'cdefine2',
    dataIndex: 'cdefine2'
   },
   {
    title: 'cdefine3',
    dataIndex: 'cdefine3'
   },
   {
    title: 'cdefine4',
    dataIndex: 'cdefine4'
   },
   {
    title: 'cdefine5',
    dataIndex: 'cdefine5'
   },
   {
    title: 'cdefine6',
    dataIndex: 'cdefine6'
   },
   {
    title: 'cdefine7',
    dataIndex: 'cdefine7'
   },
   {
    title: 'cdefine8',
    dataIndex: 'cdefine8'
   },
   {
    title: 'cdefine9',
    dataIndex: 'cdefine9'
   },
   {
    title: 'cdefine10',
    dataIndex: 'cdefine10'
   },
   {
    title: 'cdefine11',
    dataIndex: 'cdefine11'
   },
   {
    title: 'cdefine12',
    dataIndex: 'cdefine12'
   },
   {
    title: 'cdefine13',
    dataIndex: 'cdefine13'
   },
   {
    title: 'cdefine14',
    dataIndex: 'cdefine14'
   },
   {
    title: 'cdefine15',
    dataIndex: 'cdefine15'
   },
   {
    title: 'cdefine16',
    dataIndex: 'cdefine16'
   },
   {
    title: 'ccloser',
    dataIndex: 'ccloser'
   },
   {
    title: 'idiscounttaxtype',
    dataIndex: 'idiscounttaxtype'
   },
   {
    title: 'ibilltype',
    dataIndex: 'ibilltype'
   },
   {
    title: 'cvouchtype',
    dataIndex: 'cvouchtype'
   },
   {
    title: 'cgeneralordercode',
    dataIndex: 'cgeneralordercode'
   },
   {
    title: 'ctmcode',
    dataIndex: 'ctmcode'
   },
   {
    title: 'cincotermcode',
    dataIndex: 'cincotermcode'
   },
   {
    title: 'ctransordercode',
    dataIndex: 'ctransordercode'
   },
   {
    title: 'dportdate',
    dataIndex: 'dportdate'
   },
   {
    title: 'csportcode',
    dataIndex: 'csportcode'
   },
   {
    title: 'caportcode',
    dataIndex: 'caportcode'
   },
   {
    title: 'csvencode',
    dataIndex: 'csvencode'
   },
   {
    title: 'carrivalplace',
    dataIndex: 'carrivalplace'
   },
   {
    title: 'dclosedate',
    dataIndex: 'dclosedate'
   },
   {
    title: 'idec',
    dataIndex: 'idec'
   },
   {
    title: 'bcal',
    dataIndex: 'bcal'
   },
   {
    title: 'guid',
    dataIndex: 'guid'
   },
   {
    title: 'cmaketime',
    dataIndex: 'cmaketime'
   },
   {
    title: 'cmodifytime',
    dataIndex: 'cmodifytime'
   },
   {
    title: 'cmodifydate',
    dataIndex: 'cmodifydate'
   },
   {
    title: 'creviser',
    dataIndex: 'creviser'
   },
   {
    title: 'iverifystate',
    dataIndex: 'iverifystate'
   },
   {
    title: 'cauditdate',
    dataIndex: 'cauditdate'
   },
   {
    title: 'caudittime',
    dataIndex: 'caudittime'
   },
   {
    title: 'cverifier',
    dataIndex: 'cverifier'
   },
   {
    title: 'iverifystateex',
    dataIndex: 'iverifystateex'
   },
   {
    title: 'ireturncount',
    dataIndex: 'ireturncount'
   },
   {
    title: 'iswfcontrolled',
    dataIndex: 'iswfcontrolled'
   },
   {
    title: 'cvenpuomprotocol',
    dataIndex: 'cvenpuomprotocol'
   },
   {
    title: 'cchanger',
    dataIndex: 'cchanger'
   },
   {
    title: 'iflowid',
    dataIndex: 'iflowid'
   },
   {
    title: 'iprintcount',
    dataIndex: 'iprintcount'
   },
   {
    title: 'ccleanver',
    dataIndex: 'ccleanver'
   },
   {
    title: 'cpocode',
    dataIndex: 'cpocode'
   },
   {
    title: 'csysbarcode',
    dataIndex: 'csysbarcode'
   },
   {
    title: 'ccurrentauditor',
    dataIndex: 'ccurrentauditor'
   },
];

export const searchFormSchema: FormSchema[] = [
 {
    label: 'ivtid',
    field: 'ivtid',
    component: 'InputNumber'
  },
 {
    label: 'ufts',
    field: 'ufts',
    component: 'Input'
  },
];

export const formSchema: FormSchema[] = [
  // TODO 主键隐藏字段，目前写死为ID
  {label: '', field: 'id', component: 'Input', show: false},
  {
    label: 'ivtid',
    field: 'ivtid',
    component: 'InputNumber',
  },
  {
    label: 'ufts',
    field: 'ufts',
    component: 'Input',
  },
  {
    label: 'ccode',
    field: 'ccode',
    component: 'Input',
  },
  {
    label: 'cptcode',
    field: 'cptcode',
    component: 'Input',
  },
  {
    label: 'ddate',
    field: 'ddate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cvencode',
    field: 'cvencode',
    component: 'Input',
  },
  {
    label: 'cdepcode',
    field: 'cdepcode',
    component: 'Input',
  },
  {
    label: 'cpersoncode',
    field: 'cpersoncode',
    component: 'Input',
  },
  {
    label: 'cpaycode',
    field: 'cpaycode',
    component: 'Input',
  },
  {
    label: 'csccode',
    field: 'csccode',
    component: 'Input',
  },
  {
    label: 'cexchName',
    field: 'cexchName',
    component: 'Input',
  },
  {
    label: 'iexchrate',
    field: 'iexchrate',
    component: 'Input',
  },
  {
    label: 'itaxrate',
    field: 'itaxrate',
    component: 'InputNumber',
  },
  {
    label: 'cmemo',
    field: 'cmemo',
    component: 'Input',
  },
  {
    label: 'cbustype',
    field: 'cbustype',
    component: 'Input',
  },
  {
    label: 'cmaker',
    field: 'cmaker',
    component: 'Input',
  },
  {
    label: 'bnegative',
    field: 'bnegative',
    component: 'InputNumber',
  },
  {
    label: 'cdefine1',
    field: 'cdefine1',
    component: 'Input',
  },
  {
    label: 'cdefine2',
    field: 'cdefine2',
    component: 'Input',
  },
  {
    label: 'cdefine3',
    field: 'cdefine3',
    component: 'Input',
  },
  {
    label: 'cdefine4',
    field: 'cdefine4',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cdefine5',
    field: 'cdefine5',
    component: 'InputNumber',
  },
  {
    label: 'cdefine6',
    field: 'cdefine6',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cdefine7',
    field: 'cdefine7',
    component: 'Input',
  },
  {
    label: 'cdefine8',
    field: 'cdefine8',
    component: 'Input',
  },
  {
    label: 'cdefine9',
    field: 'cdefine9',
    component: 'Input',
  },
  {
    label: 'cdefine10',
    field: 'cdefine10',
    component: 'Input',
  },
  {
    label: 'cdefine11',
    field: 'cdefine11',
    component: 'Input',
  },
  {
    label: 'cdefine12',
    field: 'cdefine12',
    component: 'Input',
  },
  {
    label: 'cdefine13',
    field: 'cdefine13',
    component: 'Input',
  },
  {
    label: 'cdefine14',
    field: 'cdefine14',
    component: 'Input',
  },
  {
    label: 'cdefine15',
    field: 'cdefine15',
    component: 'InputNumber',
  },
  {
    label: 'cdefine16',
    field: 'cdefine16',
    component: 'Input',
  },
  {
    label: 'ccloser',
    field: 'ccloser',
    component: 'Input',
  },
  {
    label: 'idiscounttaxtype',
    field: 'idiscounttaxtype',
    component: 'Input',
  },
  {
    label: 'ibilltype',
    field: 'ibilltype',
    component: 'Input',
  },
  {
    label: 'cvouchtype',
    field: 'cvouchtype',
    component: 'Input',
  },
  {
    label: 'cgeneralordercode',
    field: 'cgeneralordercode',
    component: 'Input',
  },
  {
    label: 'ctmcode',
    field: 'ctmcode',
    component: 'Input',
  },
  {
    label: 'cincotermcode',
    field: 'cincotermcode',
    component: 'Input',
  },
  {
    label: 'ctransordercode',
    field: 'ctransordercode',
    component: 'Input',
  },
  {
    label: 'dportdate',
    field: 'dportdate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'csportcode',
    field: 'csportcode',
    component: 'Input',
  },
  {
    label: 'caportcode',
    field: 'caportcode',
    component: 'Input',
  },
  {
    label: 'csvencode',
    field: 'csvencode',
    component: 'Input',
  },
  {
    label: 'carrivalplace',
    field: 'carrivalplace',
    component: 'Input',
  },
  {
    label: 'dclosedate',
    field: 'dclosedate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'idec',
    field: 'idec',
    component: 'InputNumber',
  },
  {
    label: 'bcal',
    field: 'bcal',
    component: 'Input',
  },
  {
    label: 'guid',
    field: 'guid',
    component: 'Input',
  },
  {
    label: 'cmaketime',
    field: 'cmaketime',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cmodifytime',
    field: 'cmodifytime',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cmodifydate',
    field: 'cmodifydate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'creviser',
    field: 'creviser',
    component: 'Input',
  },
  {
    label: 'iverifystate',
    field: 'iverifystate',
    component: 'InputNumber',
  },
  {
    label: 'cauditdate',
    field: 'cauditdate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'caudittime',
    field: 'caudittime',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cverifier',
    field: 'cverifier',
    component: 'Input',
  },
  {
    label: 'iverifystateex',
    field: 'iverifystateex',
    component: 'InputNumber',
  },
  {
    label: 'ireturncount',
    field: 'ireturncount',
    component: 'InputNumber',
  },
  {
    label: 'iswfcontrolled',
    field: 'iswfcontrolled',
    component: 'Input',
  },
  {
    label: 'cvenpuomprotocol',
    field: 'cvenpuomprotocol',
    component: 'Input',
  },
  {
    label: 'cchanger',
    field: 'cchanger',
    component: 'Input',
  },
  {
    label: 'iflowid',
    field: 'iflowid',
    component: 'InputNumber',
  },
  {
    label: 'iprintcount',
    field: 'iprintcount',
    component: 'InputNumber',
  },
  {
    label: 'ccleanver',
    field: 'ccleanver',
    component: 'Input',
  },
  {
    label: 'cpocode',
    field: 'cpocode',
    component: 'Input',
  },
  {
    label: 'csysbarcode',
    field: 'csysbarcode',
    component: 'Input',
  },
  {
    label: 'ccurrentauditor',
    field: 'ccurrentauditor',
    component: 'Input',
  },
];
