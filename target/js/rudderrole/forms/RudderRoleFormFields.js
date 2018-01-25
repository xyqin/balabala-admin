/**
 * 生成时间：2018年01月25日 02:58:41
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
const RUDDERROLE_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '角色ID',
        placeholder: '请输入角色ID'
},{
    key: 'rudderroleName',
    type: 'String',
    label: '资源名称',
    placeholder: '请输入资源名称'
},{
    key: 'rudderroleDesc',
    type: 'String',
    label: '资源描述',
    placeholder: '请输入资源描述'
},{
    key: 'code',
    type: 'String',
    label: '角色代码',
    placeholder: '请输入角色代码'
},{
    key: 'visible',
    type: 'Bool',
    label: '是否显示',
placeholder: '请输入是否显示'
},{
    key: 'rudderPermissions',
    type: 'Object',
    label: '所属资源',
    placeholder: '请选择所属资源',
    displayType: 'TreeSelect',
    url: '/rudderpermission/gettree',
    dataLableKey: 'rudderpermissionName',
    dataValueKey: 'id'
}];
export default RUDDERROLE_FORM_FIELDS;