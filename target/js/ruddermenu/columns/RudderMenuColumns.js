/**
 * 生成时间：2018年03月11日 09:18:48
 * 该文件系自动生成，手动修改可能会被替换
 * 根据搜索接口的响应字段生成
 * 表头：拼团
 * {
 * "title": "显示的名称",
 * "dataIndex": "排序标识",
 * "key": "列的唯一标识",
 * "checked": "默认是否显示"
 * }
 */
const RUDDERMENU_COLUMNS = [{
title: '菜单ID',
dataIndex: 'id',
key: 'id',
type:'Id',
checked: true
},{
title: '菜单名称',
dataIndex: 'ruddermenuName',
key: 'ruddermenuName',
type:'String',
checked: true
},{
title: '菜单描述',
dataIndex: 'ruddermenuDesc',
key: 'ruddermenuDesc',
type:'String',
checked: true
},{
title: '菜单链接',
dataIndex: 'url',
key: 'url',
type:'String',
checked: true
},{
title: '是否显示',
dataIndex: 'visible',
key: 'visible',
type:'Bool',
checked: true
},{
title: '排序号',
dataIndex: 'orderNumber',
key: 'orderNumber',
type:'Number',
checked: true
},{
title: '上级菜单',
dataIndex: 'parentIdObject',
key: 'parentIdObject',
type:'Object',
checked: true
},{
title: '上级资源',
dataIndex: 'resourceIdObject',
key: 'resourceIdObject',
type:'Object',
checked: true
}];
export default RUDDERMENU_COLUMNS;
