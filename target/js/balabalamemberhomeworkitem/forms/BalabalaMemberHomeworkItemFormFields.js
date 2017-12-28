/**
 * 生成时间：2017年12月28日 06:54:55
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
const BALABALAMEMBERHOMEWORKITEM_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    placeholder: '请选择会员ID',
    displayType: 'SingleTree',
    url: '/balabalamember/gettree',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
},{
    key: 'homeworkId',
    type: 'Object',
    label: '会员作业ID',
    placeholder: '请选择会员作业ID',
    displayType: 'SingleTree',
    url: '/balabalamemberhomework/gettree',
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
},{
    key: 'answer',
    type: 'String',
    label: '答案',
    placeholder: '请输入答案'
}];
export default BALABALAMEMBERHOMEWORKITEM_FORM_FIELDS;