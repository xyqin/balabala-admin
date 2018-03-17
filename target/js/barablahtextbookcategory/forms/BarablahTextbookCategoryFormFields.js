/**
 * 生成时间：2018年03月18日 02:48:27
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
    need: 'false',
        placeholder: '请输入主键'
},{
    key: 'parentId',
    type: 'Object',
    label: '父ID',
    need: 'false',
    placeholder: '请选择父ID',
    displayType: 'SingleTree',
    url: '/barablahtextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'categoryName',
    type: 'String',
    label: '分类名称',
    need: 'true',
    placeholder: '请输入分类名称'
},{
    key: 'position',
    type: 'Number',
    label: '排序号',
    need: 'false',
        placeholder: '请输入排序号'
}];
export default BARABLAHTEXTBOOKCATEGORY_FORM_FIELDS;