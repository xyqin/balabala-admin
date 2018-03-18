/**
 * 生成时间：2018年03月18日 05:08:36
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
const BARABLAHREGION_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
    need: 'false',
        placeholder: '请输入主键'
},{
    key: 'parentId',
    type: 'Object',
    label: '上级ID',
    need: 'true',
    placeholder: '请选择上级ID',
    displayType: 'SingleList',
    url: '/barablahregion/getlist',
    dataLableKey: 'regionName',
    dataValueKey: 'id'
},{
    key: 'regionName',
    type: 'String',
    label: '地区名称',
    need: 'true',
    placeholder: '请输入地区名称'
},{
    key: 'path',
    type: 'String',
    label: '地区路径，以分隔',
    need: 'true',
    placeholder: '请输入地区路径，以分隔'
},{
    key: 'position',
    type: 'Number',
    label: '排序号',
    need: 'false',
        placeholder: '请输入排序号'
},{
    key: 'url',
    type: 'String',
    label: '资源地址',
    need: 'true',
    placeholder: '请输入资源地址'
}];
export default BARABLAHREGION_FORM_FIELDS;