/**
 * 生成时间：2017年12月28日 03:59:22
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
const RUDDERPERMISSION_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '资源ID',
        placeholder: '请输入资源ID'
},{
    key: 'rudderpermissionName',
    type: 'String',
    label: '资源名称',
    placeholder: '请输入资源名称'
},{
    key: 'rudderpermissionDesc',
    type: 'String',
    label: '资源描述',
    placeholder: '请输入资源描述'
},{
    key: 'url',
    type: 'String',
    label: '资源地址',
    placeholder: '请输入资源地址'
},{
    key: 'parentId',
    type: 'Object',
    label: '上级资源',
    placeholder: '请选择上级资源',
    displayType: 'SingleTree',
    url: '/rudderpermission/gettree',
    dataLableKey: 'rudderpermissionName',
    dataValueKey: 'id'
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
}];
export default RUDDERPERMISSION_FORM_FIELDS;