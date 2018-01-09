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
const BALABALATEACHERHOMEWORK_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    placeholder: '请选择教师ID',
    displayType: 'SingleTree',
    url: '/balabalateacher/gettree',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'homeworkName',
    type: 'String',
    label: '作业名称',
    placeholder: '请输入作业名称'
}];
export default BALABALATEACHERHOMEWORK_FORM_FIELDS;