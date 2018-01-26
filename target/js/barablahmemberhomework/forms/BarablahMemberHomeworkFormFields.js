/**
 * 生成时间：2018年01月26日 03:39:50
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
const BARABLAHMEMBERHOMEWORK_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    placeholder: '请选择会员ID',
    displayType: 'SingleList',
    url: '/barablahmember/getlist',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
},{
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    placeholder: '请选择教师ID',
    displayType: 'SingleList',
    url: '/barablahteacher/getlist',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'homeworkName',
    type: 'String',
    label: '作业名称',
    placeholder: '请输入作业名称'
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
        data: [{        value: 'PENDING',
        label: '未完成'
        },{        value: 'FINISHED',
        label: '已完成'
        }]}];
export default BARABLAHMEMBERHOMEWORK_FORM_FIELDS;