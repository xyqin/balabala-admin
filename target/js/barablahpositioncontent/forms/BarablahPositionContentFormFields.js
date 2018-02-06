/**
 * 生成时间：2018年02月06日 05:34:58
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
const BARABLAHPOSITIONCONTENT_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '内容ID',
        placeholder: '请输入内容ID'
},{
    key: 'positionId',
    type: 'Object',
    label: '位置ID',
    placeholder: '请选择位置ID',
    displayType: 'SingleList',
    url: '/barablahposition/getlist',
    dataLableKey: 'positionName',
    dataValueKey: 'id'
},{
    key: 'contentName',
    type: 'String',
    label: '内容名称',
    placeholder: '请输入内容名称'
},{
    key: 'image',
    type: 'Image',
    label: '内容图片',
},{
    key: 'link',
    type: 'String',
    label: '内容链接地址',
    placeholder: '请输入内容链接地址'
},{
    key: 'position',
    type: 'Number',
    label: '排序号',
        placeholder: '请输入排序号'
}];
export default BARABLAHPOSITIONCONTENT_FORM_FIELDS;