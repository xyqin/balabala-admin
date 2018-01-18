/**
 * 生成时间：2018年01月18日 06:53:01
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
        placeholder: '请输入会员报名ID'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    placeholder: '请选择会员ID',
    displayType: 'SingleTree',
    url: '/barablahmember/gettree',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
},{
    key: 'classId',
    type: 'Object',
    label: '开班ID',
    placeholder: '请选择开班ID',
    displayType: 'SingleTree',
    url: '/barablahclass/gettree',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'amount',
    type: 'Number',
    label: '报名费用',
        placeholder: '请输入报名费用'
},{
    key: 'payment',
    type: 'String',
    label: '支付方式',
    placeholder: '请输入支付方式'
}];
export default BARABLAHMEMBERSIGNUP_FORM_FIELDS;