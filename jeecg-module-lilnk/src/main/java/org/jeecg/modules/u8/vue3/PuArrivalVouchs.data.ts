import {BasicColumn} from '/@/components/Table';
import {FormSchema} from '/@/components/Table';
import { rules} from '/@/utils/helper/validator';
import { render } from '/@/utils/common/renderUtils';

export const columns: BasicColumn[] = [
    {
    title: 'autoid',
    dataIndex: 'autoid'
   },
   {
    title: 'cwhcode',
    dataIndex: 'cwhcode'
   },
   {
    title: 'cinvcode',
    dataIndex: 'cinvcode'
   },
   {
    title: 'inum',
    dataIndex: 'inum'
   },
   {
    title: 'iquantity',
    dataIndex: 'iquantity'
   },
   {
    title: 'ioricost',
    dataIndex: 'ioricost'
   },
   {
    title: 'ioritaxcost',
    dataIndex: 'ioritaxcost'
   },
   {
    title: 'iorimoney',
    dataIndex: 'iorimoney'
   },
   {
    title: 'ioritaxprice',
    dataIndex: 'ioritaxprice'
   },
   {
    title: 'iorisum',
    dataIndex: 'iorisum'
   },
   {
    title: 'icost',
    dataIndex: 'icost'
   },
   {
    title: 'imoney',
    dataIndex: 'imoney'
   },
   {
    title: 'itaxprice',
    dataIndex: 'itaxprice'
   },
   {
    title: 'isum',
    dataIndex: 'isum'
   },
   {
    title: 'cfree1',
    dataIndex: 'cfree1'
   },
   {
    title: 'cfree2',
    dataIndex: 'cfree2'
   },
   {
    title: 'cfree3',
    dataIndex: 'cfree3'
   },
   {
    title: 'cfree4',
    dataIndex: 'cfree4'
   },
   {
    title: 'cfree5',
    dataIndex: 'cfree5'
   },
   {
    title: 'cfree6',
    dataIndex: 'cfree6'
   },
   {
    title: 'cfree7',
    dataIndex: 'cfree7'
   },
   {
    title: 'cfree8',
    dataIndex: 'cfree8'
   },
   {
    title: 'cfree9',
    dataIndex: 'cfree9'
   },
   {
    title: 'cfree10',
    dataIndex: 'cfree10'
   },
   {
    title: 'itaxrate',
    dataIndex: 'itaxrate'
   },
   {
    title: 'cdefine22',
    dataIndex: 'cdefine22'
   },
   {
    title: 'cdefine23',
    dataIndex: 'cdefine23'
   },
   {
    title: 'cdefine24',
    dataIndex: 'cdefine24'
   },
   {
    title: 'cdefine25',
    dataIndex: 'cdefine25'
   },
   {
    title: 'cdefine26',
    dataIndex: 'cdefine26'
   },
   {
    title: 'cdefine27',
    dataIndex: 'cdefine27'
   },
   {
    title: 'cdefine28',
    dataIndex: 'cdefine28'
   },
   {
    title: 'cdefine29',
    dataIndex: 'cdefine29'
   },
   {
    title: 'cdefine30',
    dataIndex: 'cdefine30'
   },
   {
    title: 'cdefine31',
    dataIndex: 'cdefine31'
   },
   {
    title: 'cdefine32',
    dataIndex: 'cdefine32'
   },
   {
    title: 'cdefine33',
    dataIndex: 'cdefine33'
   },
   {
    title: 'cdefine34',
    dataIndex: 'cdefine34'
   },
   {
    title: 'cdefine35',
    dataIndex: 'cdefine35'
   },
   {
    title: 'cdefine36',
    dataIndex: 'cdefine36'
   },
   {
    title: 'cdefine37',
    dataIndex: 'cdefine37'
   },
   {
    title: 'citemClass',
    dataIndex: 'citemClass'
   },
   {
    title: 'citemcode',
    dataIndex: 'citemcode'
   },
   {
    title: 'iposid',
    dataIndex: 'iposid'
   },
   {
    title: 'citemname',
    dataIndex: 'citemname'
   },
   {
    title: 'cunitid',
    dataIndex: 'cunitid'
   },
   {
    title: 'fvalidinquan',
    dataIndex: 'fvalidinquan'
   },
   {
    title: 'fkpquantity',
    dataIndex: 'fkpquantity'
   },
   {
    title: 'frealquantity',
    dataIndex: 'frealquantity'
   },
   {
    title: 'fvalidquantity',
    dataIndex: 'fvalidquantity'
   },
   {
    title: 'finvalidquantity',
    dataIndex: 'finvalidquantity'
   },
   {
    title: 'ccloser',
    dataIndex: 'ccloser'
   },
   {
    title: 'icorid',
    dataIndex: 'icorid'
   },
   {
    title: 'fretquantity',
    dataIndex: 'fretquantity'
   },
   {
    title: 'finvalidinquan',
    dataIndex: 'finvalidinquan'
   },
   {
    title: 'bgsp',
    dataIndex: 'bgsp'
   },
   {
    title: 'cbatch',
    dataIndex: 'cbatch'
   },
   {
    title: 'dvdate',
    dataIndex: 'dvdate'
   },
   {
    title: 'dpdate',
    dataIndex: 'dpdate'
   },
   {
    title: 'frefusequantity',
    dataIndex: 'frefusequantity'
   },
   {
    title: 'cgspstate',
    dataIndex: 'cgspstate'
   },
   {
    title: 'fvalidnum',
    dataIndex: 'fvalidnum'
   },
   {
    title: 'fvalidinnum',
    dataIndex: 'fvalidinnum'
   },
   {
    title: 'finvalidnum',
    dataIndex: 'finvalidnum'
   },
   {
    title: 'frealnum',
    dataIndex: 'frealnum'
   },
   {
    title: 'btaxcost',
    dataIndex: 'btaxcost'
   },
   {
    title: 'binspect',
    dataIndex: 'binspect'
   },
   {
    title: 'frefusenum',
    dataIndex: 'frefusenum'
   },
   {
    title: 'ippartid',
    dataIndex: 'ippartid'
   },
   {
    title: 'ipquantity',
    dataIndex: 'ipquantity'
   },
   {
    title: 'iptoseq',
    dataIndex: 'iptoseq'
   },
   {
    title: 'sodid',
    dataIndex: 'sodid'
   },
   {
    title: 'sotype',
    dataIndex: 'sotype'
   },
   {
    title: 'contractrowguid',
    dataIndex: 'contractrowguid'
   },
   {
    title: 'imassdate',
    dataIndex: 'imassdate'
   },
   {
    title: 'cmassunit',
    dataIndex: 'cmassunit'
   },
   {
    title: 'bexigency',
    dataIndex: 'bexigency'
   },
   {
    title: 'cbcloser',
    dataIndex: 'cbcloser'
   },
   {
    title: 'fsumrefusequantity',
    dataIndex: 'fsumrefusequantity'
   },
   {
    title: 'fsumrefusenum',
    dataIndex: 'fsumrefusenum'
   },
   {
    title: 'fretnum',
    dataIndex: 'fretnum'
   },
   {
    title: 'fdtquantity',
    dataIndex: 'fdtquantity'
   },
   {
    title: 'finvalidinnum',
    dataIndex: 'finvalidinnum'
   },
   {
    title: 'fdegradequantity',
    dataIndex: 'fdegradequantity'
   },
   {
    title: 'fdegradenum',
    dataIndex: 'fdegradenum'
   },
   {
    title: 'fdegradeinquantity',
    dataIndex: 'fdegradeinquantity'
   },
   {
    title: 'fdegradeinnum',
    dataIndex: 'fdegradeinnum'
   },
   {
    title: 'finspectquantity',
    dataIndex: 'finspectquantity'
   },
   {
    title: 'finspectnum',
    dataIndex: 'finspectnum'
   },
   {
    title: 'iinvmpcost',
    dataIndex: 'iinvmpcost'
   },
   {
    title: 'guids',
    dataIndex: 'guids'
   },
   {
    title: 'iinvexchrate',
    dataIndex: 'iinvexchrate'
   },
   {
    title: 'objectidSource',
    dataIndex: 'objectidSource'
   },
   {
    title: 'autoidSource',
    dataIndex: 'autoidSource'
   },
   {
    title: 'uftsSource',
    dataIndex: 'uftsSource'
   },
   {
    title: 'irownoSource',
    dataIndex: 'irownoSource'
   },
   {
    title: 'csocode',
    dataIndex: 'csocode'
   },
   {
    title: 'isorowno',
    dataIndex: 'isorowno'
   },
   {
    title: 'iorderid',
    dataIndex: 'iorderid'
   },
   {
    title: 'cordercode',
    dataIndex: 'cordercode'
   },
   {
    title: 'iorderrowno',
    dataIndex: 'iorderrowno'
   },
   {
    title: 'dlineclosedate',
    dataIndex: 'dlineclosedate'
   },
   {
    title: 'contractcode',
    dataIndex: 'contractcode'
   },
   {
    title: 'contractrowno',
    dataIndex: 'contractrowno'
   },
   {
    title: 'rejectsource',
    dataIndex: 'rejectsource'
   },
   {
    title: 'iciqbookid',
    dataIndex: 'iciqbookid'
   },
   {
    title: 'cciqbookcode',
    dataIndex: 'cciqbookcode'
   },
   {
    title: 'cciqcode',
    dataIndex: 'cciqcode'
   },
   {
    title: 'fciqchangrate',
    dataIndex: 'fciqchangrate'
   },
   {
    title: 'irejectautoid',
    dataIndex: 'irejectautoid'
   },
   {
    title: 'iexpiratdatecalcu',
    dataIndex: 'iexpiratdatecalcu'
   },
   {
    title: 'cexpirationdate',
    dataIndex: 'cexpirationdate'
   },
   {
    title: 'dexpirationdate',
    dataIndex: 'dexpirationdate'
   },
   {
    title: 'cupsocode',
    dataIndex: 'cupsocode'
   },
   {
    title: 'iorderdid',
    dataIndex: 'iorderdid'
   },
   {
    title: 'iordertype',
    dataIndex: 'iordertype'
   },
   {
    title: 'csoordercode',
    dataIndex: 'csoordercode'
   },
   {
    title: 'iorderseq',
    dataIndex: 'iorderseq'
   },
   {
    title: 'cbatchproperty1',
    dataIndex: 'cbatchproperty1'
   },
   {
    title: 'cbatchproperty2',
    dataIndex: 'cbatchproperty2'
   },
   {
    title: 'cbatchproperty3',
    dataIndex: 'cbatchproperty3'
   },
   {
    title: 'cbatchproperty4',
    dataIndex: 'cbatchproperty4'
   },
   {
    title: 'cbatchproperty5',
    dataIndex: 'cbatchproperty5'
   },
   {
    title: 'cbatchproperty6',
    dataIndex: 'cbatchproperty6'
   },
   {
    title: 'cbatchproperty7',
    dataIndex: 'cbatchproperty7'
   },
   {
    title: 'cbatchproperty8',
    dataIndex: 'cbatchproperty8'
   },
   {
    title: 'cbatchproperty9',
    dataIndex: 'cbatchproperty9'
   },
   {
    title: 'cbatchproperty10',
    dataIndex: 'cbatchproperty10'
   },
   {
    title: 'ivouchrowno',
    dataIndex: 'ivouchrowno'
   },
   {
    title: 'irowno',
    dataIndex: 'irowno'
   },
   {
    title: 'cbmemo',
    dataIndex: 'cbmemo'
   },
   {
    title: 'cbsysbarcode',
    dataIndex: 'cbsysbarcode'
   },
   {
    title: 'carrivalcode',
    dataIndex: 'carrivalcode'
   },
   {
    title: 'ipickedquantity',
    dataIndex: 'ipickedquantity'
   },
   {
    title: 'ipickednum',
    dataIndex: 'ipickednum'
   },
   {
    title: 'isourcemocode',
    dataIndex: 'isourcemocode'
   },
   {
    title: 'isourcemodetailsid',
    dataIndex: 'isourcemodetailsid'
   },
   {
    title: 'freworkquantity',
    dataIndex: 'freworkquantity'
   },
   {
    title: 'freworknum',
    dataIndex: 'freworknum'
   },
   {
    title: 'fsumreworkquantity',
    dataIndex: 'fsumreworkquantity'
   },
   {
    title: 'fsumreworknum',
    dataIndex: 'fsumreworknum'
   },
   {
    title: 'iproducttype',
    dataIndex: 'iproducttype'
   },
   {
    title: 'cmaininvcode',
    dataIndex: 'cmaininvcode'
   },
   {
    title: 'imainmodetailsid',
    dataIndex: 'imainmodetailsid'
   },
   {
    title: 'planlotnumber',
    dataIndex: 'planlotnumber'
   },
   {
    title: 'bgift',
    dataIndex: 'bgift'
   },
   {
    title: 'cfactorycode',
    dataIndex: 'cfactorycode'
   },
];

export const searchFormSchema: FormSchema[] = [
 {
    label: 'autoid',
    field: 'autoid',
    component: 'InputNumber'
  },
 {
    label: 'cwhcode',
    field: 'cwhcode',
    component: 'Input'
  },
];

export const formSchema: FormSchema[] = [
  // TODO 主键隐藏字段，目前写死为ID
  {label: '', field: 'id', component: 'Input', show: false},
  {
    label: 'autoid',
    field: 'autoid',
    component: 'InputNumber',
  },
  {
    label: 'cwhcode',
    field: 'cwhcode',
    component: 'Input',
  },
  {
    label: 'cinvcode',
    field: 'cinvcode',
    component: 'Input',
  },
  {
    label: 'inum',
    field: 'inum',
    component: 'InputNumber',
  },
  {
    label: 'iquantity',
    field: 'iquantity',
    component: 'InputNumber',
  },
  {
    label: 'ioricost',
    field: 'ioricost',
    component: 'InputNumber',
  },
  {
    label: 'ioritaxcost',
    field: 'ioritaxcost',
    component: 'InputNumber',
  },
  {
    label: 'iorimoney',
    field: 'iorimoney',
    component: 'Input',
  },
  {
    label: 'ioritaxprice',
    field: 'ioritaxprice',
    component: 'Input',
  },
  {
    label: 'iorisum',
    field: 'iorisum',
    component: 'Input',
  },
  {
    label: 'icost',
    field: 'icost',
    component: 'InputNumber',
  },
  {
    label: 'imoney',
    field: 'imoney',
    component: 'Input',
  },
  {
    label: 'itaxprice',
    field: 'itaxprice',
    component: 'Input',
  },
  {
    label: 'isum',
    field: 'isum',
    component: 'Input',
  },
  {
    label: 'cfree1',
    field: 'cfree1',
    component: 'Input',
  },
  {
    label: 'cfree2',
    field: 'cfree2',
    component: 'Input',
  },
  {
    label: 'cfree3',
    field: 'cfree3',
    component: 'Input',
  },
  {
    label: 'cfree4',
    field: 'cfree4',
    component: 'Input',
  },
  {
    label: 'cfree5',
    field: 'cfree5',
    component: 'Input',
  },
  {
    label: 'cfree6',
    field: 'cfree6',
    component: 'Input',
  },
  {
    label: 'cfree7',
    field: 'cfree7',
    component: 'Input',
  },
  {
    label: 'cfree8',
    field: 'cfree8',
    component: 'Input',
  },
  {
    label: 'cfree9',
    field: 'cfree9',
    component: 'Input',
  },
  {
    label: 'cfree10',
    field: 'cfree10',
    component: 'Input',
  },
  {
    label: 'itaxrate',
    field: 'itaxrate',
    component: 'InputNumber',
  },
  {
    label: 'cdefine22',
    field: 'cdefine22',
    component: 'Input',
  },
  {
    label: 'cdefine23',
    field: 'cdefine23',
    component: 'Input',
  },
  {
    label: 'cdefine24',
    field: 'cdefine24',
    component: 'Input',
  },
  {
    label: 'cdefine25',
    field: 'cdefine25',
    component: 'Input',
  },
  {
    label: 'cdefine26',
    field: 'cdefine26',
    component: 'Input',
  },
  {
    label: 'cdefine27',
    field: 'cdefine27',
    component: 'Input',
  },
  {
    label: 'cdefine28',
    field: 'cdefine28',
    component: 'Input',
  },
  {
    label: 'cdefine29',
    field: 'cdefine29',
    component: 'Input',
  },
  {
    label: 'cdefine30',
    field: 'cdefine30',
    component: 'Input',
  },
  {
    label: 'cdefine31',
    field: 'cdefine31',
    component: 'Input',
  },
  {
    label: 'cdefine32',
    field: 'cdefine32',
    component: 'Input',
  },
  {
    label: 'cdefine33',
    field: 'cdefine33',
    component: 'Input',
  },
  {
    label: 'cdefine34',
    field: 'cdefine34',
    component: 'InputNumber',
  },
  {
    label: 'cdefine35',
    field: 'cdefine35',
    component: 'InputNumber',
  },
  {
    label: 'cdefine36',
    field: 'cdefine36',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cdefine37',
    field: 'cdefine37',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'citemClass',
    field: 'citemClass',
    component: 'Input',
  },
  {
    label: 'citemcode',
    field: 'citemcode',
    component: 'Input',
  },
  {
    label: 'iposid',
    field: 'iposid',
    component: 'InputNumber',
  },
  {
    label: 'citemname',
    field: 'citemname',
    component: 'Input',
  },
  {
    label: 'cunitid',
    field: 'cunitid',
    component: 'Input',
  },
  {
    label: 'fvalidinquan',
    field: 'fvalidinquan',
    component: 'InputNumber',
  },
  {
    label: 'fkpquantity',
    field: 'fkpquantity',
    component: 'InputNumber',
  },
  {
    label: 'frealquantity',
    field: 'frealquantity',
    component: 'InputNumber',
  },
  {
    label: 'fvalidquantity',
    field: 'fvalidquantity',
    component: 'InputNumber',
  },
  {
    label: 'finvalidquantity',
    field: 'finvalidquantity',
    component: 'InputNumber',
  },
  {
    label: 'ccloser',
    field: 'ccloser',
    component: 'Input',
  },
  {
    label: 'icorid',
    field: 'icorid',
    component: 'InputNumber',
  },
  {
    label: 'fretquantity',
    field: 'fretquantity',
    component: 'InputNumber',
  },
  {
    label: 'finvalidinquan',
    field: 'finvalidinquan',
    component: 'InputNumber',
  },
  {
    label: 'bgsp',
    field: 'bgsp',
    component: 'Input',
  },
  {
    label: 'cbatch',
    field: 'cbatch',
    component: 'Input',
  },
  {
    label: 'dvdate',
    field: 'dvdate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'dpdate',
    field: 'dpdate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'frefusequantity',
    field: 'frefusequantity',
    component: 'InputNumber',
  },
  {
    label: 'cgspstate',
    field: 'cgspstate',
    component: 'Input',
  },
  {
    label: 'fvalidnum',
    field: 'fvalidnum',
    component: 'Input',
  },
  {
    label: 'fvalidinnum',
    field: 'fvalidinnum',
    component: 'Input',
  },
  {
    label: 'finvalidnum',
    field: 'finvalidnum',
    component: 'Input',
  },
  {
    label: 'frealnum',
    field: 'frealnum',
    component: 'Input',
  },
  {
    label: 'btaxcost',
    field: 'btaxcost',
    component: 'Input',
  },
  {
    label: 'binspect',
    field: 'binspect',
    component: 'Input',
  },
  {
    label: 'frefusenum',
    field: 'frefusenum',
    component: 'InputNumber',
  },
  {
    label: 'ippartid',
    field: 'ippartid',
    component: 'InputNumber',
  },
  {
    label: 'ipquantity',
    field: 'ipquantity',
    component: 'Input',
  },
  {
    label: 'iptoseq',
    field: 'iptoseq',
    component: 'InputNumber',
  },
  {
    label: 'sodid',
    field: 'sodid',
    component: 'Input',
  },
  {
    label: 'sotype',
    field: 'sotype',
    component: 'Input',
  },
  {
    label: 'contractrowguid',
    field: 'contractrowguid',
    component: 'Input',
  },
  {
    label: 'imassdate',
    field: 'imassdate',
    component: 'InputNumber',
  },
  {
    label: 'cmassunit',
    field: 'cmassunit',
    component: 'Input',
  },
  {
    label: 'bexigency',
    field: 'bexigency',
    component: 'Input',
  },
  {
    label: 'cbcloser',
    field: 'cbcloser',
    component: 'Input',
  },
  {
    label: 'fsumrefusequantity',
    field: 'fsumrefusequantity',
    component: 'InputNumber',
  },
  {
    label: 'fsumrefusenum',
    field: 'fsumrefusenum',
    component: 'InputNumber',
  },
  {
    label: 'fretnum',
    field: 'fretnum',
    component: 'InputNumber',
  },
  {
    label: 'fdtquantity',
    field: 'fdtquantity',
    component: 'InputNumber',
  },
  {
    label: 'finvalidinnum',
    field: 'finvalidinnum',
    component: 'InputNumber',
  },
  {
    label: 'fdegradequantity',
    field: 'fdegradequantity',
    component: 'InputNumber',
  },
  {
    label: 'fdegradenum',
    field: 'fdegradenum',
    component: 'InputNumber',
  },
  {
    label: 'fdegradeinquantity',
    field: 'fdegradeinquantity',
    component: 'InputNumber',
  },
  {
    label: 'fdegradeinnum',
    field: 'fdegradeinnum',
    component: 'InputNumber',
  },
  {
    label: 'finspectquantity',
    field: 'finspectquantity',
    component: 'InputNumber',
  },
  {
    label: 'finspectnum',
    field: 'finspectnum',
    component: 'InputNumber',
  },
  {
    label: 'iinvmpcost',
    field: 'iinvmpcost',
    component: 'InputNumber',
  },
  {
    label: 'guids',
    field: 'guids',
    component: 'Input',
  },
  {
    label: 'iinvexchrate',
    field: 'iinvexchrate',
    component: 'InputNumber',
  },
  {
    label: 'objectidSource',
    field: 'objectidSource',
    component: 'Input',
  },
  {
    label: 'autoidSource',
    field: 'autoidSource',
    component: 'InputNumber',
  },
  {
    label: 'uftsSource',
    field: 'uftsSource',
    component: 'Input',
  },
  {
    label: 'irownoSource',
    field: 'irownoSource',
    component: 'InputNumber',
  },
  {
    label: 'csocode',
    field: 'csocode',
    component: 'Input',
  },
  {
    label: 'isorowno',
    field: 'isorowno',
    component: 'InputNumber',
  },
  {
    label: 'iorderid',
    field: 'iorderid',
    component: 'InputNumber',
  },
  {
    label: 'cordercode',
    field: 'cordercode',
    component: 'Input',
  },
  {
    label: 'iorderrowno',
    field: 'iorderrowno',
    component: 'InputNumber',
  },
  {
    label: 'dlineclosedate',
    field: 'dlineclosedate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'contractcode',
    field: 'contractcode',
    component: 'Input',
  },
  {
    label: 'contractrowno',
    field: 'contractrowno',
    component: 'Input',
  },
  {
    label: 'rejectsource',
    field: 'rejectsource',
    component: 'Input',
  },
  {
    label: 'iciqbookid',
    field: 'iciqbookid',
    component: 'InputNumber',
  },
  {
    label: 'cciqbookcode',
    field: 'cciqbookcode',
    component: 'Input',
  },
  {
    label: 'cciqcode',
    field: 'cciqcode',
    component: 'Input',
  },
  {
    label: 'fciqchangrate',
    field: 'fciqchangrate',
    component: 'Input',
  },
  {
    label: 'irejectautoid',
    field: 'irejectautoid',
    component: 'InputNumber',
  },
  {
    label: 'iexpiratdatecalcu',
    field: 'iexpiratdatecalcu',
    component: 'Input',
  },
  {
    label: 'cexpirationdate',
    field: 'cexpirationdate',
    component: 'Input',
  },
  {
    label: 'dexpirationdate',
    field: 'dexpirationdate',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'cupsocode',
    field: 'cupsocode',
    component: 'Input',
  },
  {
    label: 'iorderdid',
    field: 'iorderdid',
    component: 'InputNumber',
  },
  {
    label: 'iordertype',
    field: 'iordertype',
    component: 'Input',
  },
  {
    label: 'csoordercode',
    field: 'csoordercode',
    component: 'Input',
  },
  {
    label: 'iorderseq',
    field: 'iorderseq',
    component: 'InputNumber',
  },
  {
    label: 'cbatchproperty1',
    field: 'cbatchproperty1',
    component: 'InputNumber',
  },
  {
    label: 'cbatchproperty2',
    field: 'cbatchproperty2',
    component: 'InputNumber',
  },
  {
    label: 'cbatchproperty3',
    field: 'cbatchproperty3',
    component: 'InputNumber',
  },
  {
    label: 'cbatchproperty4',
    field: 'cbatchproperty4',
    component: 'InputNumber',
  },
  {
    label: 'cbatchproperty5',
    field: 'cbatchproperty5',
    component: 'InputNumber',
  },
  {
    label: 'cbatchproperty6',
    field: 'cbatchproperty6',
    component: 'Input',
  },
  {
    label: 'cbatchproperty7',
    field: 'cbatchproperty7',
    component: 'Input',
  },
  {
    label: 'cbatchproperty8',
    field: 'cbatchproperty8',
    component: 'Input',
  },
  {
    label: 'cbatchproperty9',
    field: 'cbatchproperty9',
    component: 'Input',
  },
  {
    label: 'cbatchproperty10',
    field: 'cbatchproperty10',
    component: 'DatePicker',
    componentProps: {
      showTime: true,
      valueFormat: 'YYYY-MM-DD hh:mm:ss',
    },
  },
  {
    label: 'ivouchrowno',
    field: 'ivouchrowno',
    component: 'InputNumber',
  },
  {
    label: 'irowno',
    field: 'irowno',
    component: 'InputNumber',
  },
  {
    label: 'cbmemo',
    field: 'cbmemo',
    component: 'Input',
  },
  {
    label: 'cbsysbarcode',
    field: 'cbsysbarcode',
    component: 'Input',
  },
  {
    label: 'carrivalcode',
    field: 'carrivalcode',
    component: 'Input',
  },
  {
    label: 'ipickedquantity',
    field: 'ipickedquantity',
    component: 'Input',
  },
  {
    label: 'ipickednum',
    field: 'ipickednum',
    component: 'Input',
  },
  {
    label: 'isourcemocode',
    field: 'isourcemocode',
    component: 'Input',
  },
  {
    label: 'isourcemodetailsid',
    field: 'isourcemodetailsid',
    component: 'InputNumber',
  },
  {
    label: 'freworkquantity',
    field: 'freworkquantity',
    component: 'Input',
  },
  {
    label: 'freworknum',
    field: 'freworknum',
    component: 'Input',
  },
  {
    label: 'fsumreworkquantity',
    field: 'fsumreworkquantity',
    component: 'Input',
  },
  {
    label: 'fsumreworknum',
    field: 'fsumreworknum',
    component: 'Input',
  },
  {
    label: 'iproducttype',
    field: 'iproducttype',
    component: 'Input',
  },
  {
    label: 'cmaininvcode',
    field: 'cmaininvcode',
    component: 'Input',
  },
  {
    label: 'imainmodetailsid',
    field: 'imainmodetailsid',
    component: 'InputNumber',
  },
  {
    label: 'planlotnumber',
    field: 'planlotnumber',
    component: 'Input',
  },
  {
    label: 'bgift',
    field: 'bgift',
    component: 'Input',
  },
  {
    label: 'cfactorycode',
    field: 'cfactorycode',
    component: 'Input',
  },
];
