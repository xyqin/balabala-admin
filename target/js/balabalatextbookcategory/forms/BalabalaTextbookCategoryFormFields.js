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
const BALABALATEXTBOOKCATEGORY_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'parentId',
    type: 'Object',
    label: '父ID',
    placeholder: '请选择父ID',
    displayType: 'SingleTree',
    url: '/balabalatextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'categoryName',
    type: 'String',
    label: '分类名称',
    placeholder: '请输入分类名称'
},{
    key: 'path',
    type: 'String',
    label: '分类路径',
    placeholder: '请输入分类路径'
},{
    key: 'position',
    type: 'Number',
    label: '排序号',
        placeholder: '请输入排序号'
}];
export default BALABALATEXTBOOKCATEGORY_FORM_FIELDS;