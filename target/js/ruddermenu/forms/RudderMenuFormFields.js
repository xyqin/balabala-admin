/**
 * 生成时间：2018年01月09日 04:35:24
 * 该文件系自动生成，手动修改可能会被替换
 * 根据创建或修改接口的请求字段生成
 * 表单数据：
 * {
 * 'key': '关键字',
 * 'type': '类型',
 * 'label': '显示名称',
 * 'placeholder': '默认占位文字',
 * 'data': '附加的数据'
 * }
 */
const RUDDERMENU_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '菜单ID',
        placeholder: '请输入菜单ID'
},{
    key: 'ruddermenuName',
    type: 'String',
    label: '菜单名称',
    placeholder: '请输入菜单名称'
},{
    key: 'ruddermenuDesc',
    type: 'String',
    label: '菜单描述',
    placeholder: '请输入菜单描述'
},{
    key: 'url',
    type: 'String',
    label: '菜单链接',
    placeholder: '请输入菜单链接'
},{
    key: 'visible',
    type: 'Bool',
    label: '是否显示',
placeholder: '请输入是否显示'
},{
    key: 'orderNumber',
    type: 'Number',
    label: '排序号',
        placeholder: '请输入排序号'
},{
    key: 'parentId',
    type: 'Object',
    label: '上级菜单',
    placeholder: '请选择上级菜单',
    displayType: 'SingleTree',
    url: '/ruddermenu/gettree',
    dataLableKey: 'ruddermenuName',
    dataValueKey: 'id'
},{
    key: 'resourceId',
    type: 'Object',
    label: '上级资源',
    placeholder: '请选择上级资源',
    displayType: 'SingleTree',
    url: '/rudderpermission/gettree',
    dataLableKey: 'rudderpermissionName',
    dataValueKey: 'id'
}];
export default RUDDERMENU_FORM_FIELDS;