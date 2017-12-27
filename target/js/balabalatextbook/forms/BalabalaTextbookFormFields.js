/**
 * 生成时间：2017年12月28日 12:00:30
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
const BALABALATEXTBOOK_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'categoryId',
    type: 'Object',
    label: '分类ID',
    placeholder: '请选择分类ID',
    displayType: 'SingleTree',
    url: '/balabalatextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'textbookName',
    type: 'String',
    label: '教材名称',
    placeholder: '请输入教材名称'
}];
export default BALABALATEXTBOOK_FORM_FIELDS;