/**
 * 生成时间：2018年03月13日 09:32:07
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
const BARABLAHTEACHERHOMEWORKITEM_FORM_FIELDS = [{
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
    key: 'homeworkId',
    type: 'Object',
    label: '教师发布作业ID',
    need: 'true',
    placeholder: '请选择教师发布作业ID',
    displayType: 'SingleList',
    url: '/barablahteacherhomework/getlist',
    dataLableKey: 'homeworkName',
    dataValueKey: 'id'
},{
    key: 'textbookId',
    type: 'Object',
    label: '题目ID',
    need: 'true',
    placeholder: '请选择题目ID',
    displayType: 'SingleList',
    url: '/barablahtextbook/getlist',
    dataLableKey: 'textbookName',
    dataValueKey: 'id'
}];
export default BARABLAHTEACHERHOMEWORKITEM_FORM_FIELDS;