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
const BALABALAMEMBERPASSPORT_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '会员ID',
        placeholder: '请输入会员ID'
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
    key: 'provider',
    type: 'String',
    label: '帐号来源',
    placeholder: '请输入帐号来源'
},{
    key: 'providerId',
    type: 'String',
    label: '帐号授权ID',
    placeholder: '请输入帐号授权ID'
},{
    key: 'password',
    type: 'String',
    label: '密码',
    placeholder: '请输入密码'
}];
export default BALABALAMEMBERPASSPORT_FORM_FIELDS;