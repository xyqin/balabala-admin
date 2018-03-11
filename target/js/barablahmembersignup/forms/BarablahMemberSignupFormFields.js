/**
 * 生成时间：2018年03月12日 05:37:10
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
const BARABLAHMEMBERSIGNUP_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '会员报名ID',
    need: 'true',
        placeholder: '请输入会员报名ID'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    need: 'true',
    placeholder: '请选择会员ID',
    displayType: 'SingleList',
    url: '/barablahmember/getlist',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
},{
    key: 'classId',
    type: 'Object',
    label: '班级',
    need: 'true',
    placeholder: '请选择班级',
    displayType: 'SingleList',
    url: '/barablahclass/getlist',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'amount',
    type: 'Number',
    label: '报名费用',
    need: 'true',
        placeholder: '请输入报名费用'
},{
    key: 'payment',
    type: 'String',
    label: '支付方式',
    need: 'true',
    placeholder: '请输入支付方式'
},{
    key: 'createdAt',
    type: 'Date',
    label: '系统创建时间',
    need: 'false',
placeholder: '请输入系统创建时间'
}];
export default BARABLAHMEMBERSIGNUP_FORM_FIELDS;