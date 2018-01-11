/**
 * 生成时间：2018年01月11日 07:57:51
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
const RUDDERUSER_COLUMNS = [{
title: '资源ID',
dataIndex: 'id',
key: 'id',
type:'Id',
checked: true
},{
title: '账号名称',
dataIndex: 'rudderuserName',
key: 'rudderuserName',
type:'String',
checked: true
},{
title: '备注',
dataIndex: 'rudderuserDesc',
key: 'rudderuserDesc',
type:'String',
checked: true
},{
title: '密码',
dataIndex: 'password',
key: 'password',
type:'String',
checked: true
},{
title: '用户状态',
dataIndex: 'statusEnum',
key: 'statusEnum',
type:'Enum',
checked: true
},{
title: '昵称',
dataIndex: 'nickname',
key: 'nickname',
type:'String',
checked: true
},{
title: 'email',
dataIndex: 'email',
key: 'email',
type:'String',
checked: true
},{
title: '是否显示',
dataIndex: 'visible',
key: 'visible',
type:'Bool',
checked: true
},{
title: '校区ID',
dataIndex: 'campusIdObject',
key: 'campusIdObject',
type:'Object',
checked: true
}];
export default RUDDERUSER_COLUMNS;
