/**
 * 生成时间：2018年01月26日 11:59:32
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
const BARABLAHTEXTBOOKCATEGORY_FORM_FIELDS = [{
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
    url: '/barablahtextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'categoryName',
    type: 'String',
    label: '分类名称',
    placeholder: '请输入分类名称'
},{
    key: 'position',
    type: 'Number',
    label: '排序号',
        placeholder: '请输入排序号'
},{
    key: 'url',
    type: 'String',
    label: '资源地址',
    placeholder: '请输入资源地址'
}];
export default BARABLAHTEXTBOOKCATEGORY_FORM_FIELDS;