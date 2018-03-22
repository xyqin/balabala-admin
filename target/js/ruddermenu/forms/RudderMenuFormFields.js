/**
 * 生成时间：2018年03月22日 08:05:49
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
    need: 'true',
        placeholder: '请输入菜单ID'
},{
    key: 'ruddermenuName',
    type: 'String',
    label: '菜单名称',
    need: 'true',
    placeholder: '请输入菜单名称'
},{
    key: 'ruddermenuDesc',
    type: 'String',
    label: '菜单描述',
    need: 'true',
    placeholder: '请输入菜单描述'
},{
    key: 'url',
    type: 'String',
    label: '菜单链接',
    need: 'true',
    placeholder: '请输入菜单链接'
},{
    key: 'visible',
    type: 'Bool',
    label: '是否显示',
    need: 'true',
placeholder: '请输入是否显示'
},{
    key: 'orderNumber',
    type: 'Number',
    label: '排序号',
    need: 'false',
        placeholder: '请输入排序号'
},{
    key: 'parentId',
    type: 'Object',
    label: '上级菜单',
    need: 'true',
    placeholder: '请选择上级菜单',
    displayType: 'SingleTree',
    url: '/ruddermenu/gettree',
    dataLableKey: 'ruddermenuName',
    dataValueKey: 'id'
},{
    key: 'resourceId',
    type: 'Object',
    label: '上级资源',
    need: 'true',
    placeholder: '请选择上级资源',
    displayType: 'SingleTree',
    url: '/rudderpermission/gettree',
    dataLableKey: 'rudderpermissionName',
    dataValueKey: 'id'
}];
export default RUDDERMENU_FORM_FIELDS;