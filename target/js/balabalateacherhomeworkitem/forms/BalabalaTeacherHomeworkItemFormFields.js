/**
 * 生成时间：2017年12月28日 01:55:50
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
const BALABALATEACHERHOMEWORKITEM_FORM_FIELDS = [{
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
    key: 'homeworkId',
    type: 'Object',
    label: '教师发布作业ID',
    placeholder: '请选择教师发布作业ID',
    displayType: 'SingleTree',
    url: '/balabalateacherhomework/gettree',
    dataLableKey: 'homeworkName',
    dataValueKey: 'id'
},{
    key: 'textbookId',
    type: 'Object',
    label: '题目ID',
    placeholder: '请选择题目ID',
    displayType: 'SingleTree',
    url: '/balabalatextbook/gettree',
    dataLableKey: 'textbookName',
    dataValueKey: 'id'
}];
export default BALABALATEACHERHOMEWORKITEM_FORM_FIELDS;