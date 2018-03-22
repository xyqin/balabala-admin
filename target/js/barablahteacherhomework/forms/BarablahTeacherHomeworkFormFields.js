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
const BARABLAHTEACHERHOMEWORK_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
    need: 'false',
        placeholder: '请输入主键'
},{
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    need: 'true',
    placeholder: '请选择教师ID',
    displayType: 'SingleList',
    url: '/barablahteacher/getlist',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'homeworkName',
    type: 'String',
    label: '作业名称',
    need: 'true',
    placeholder: '请输入作业名称'
}];
export default BARABLAHTEACHERHOMEWORK_FORM_FIELDS;