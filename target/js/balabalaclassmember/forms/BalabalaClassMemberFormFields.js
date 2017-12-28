/**
 * 生成时间：2017年12月28日 03:59:22
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
const BALABALACLASSMEMBER_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '开班会员ID',
        placeholder: '请输入开班会员ID'
},{
    key: 'classId',
    type: 'Object',
    label: '开班ID',
    placeholder: '请选择开班ID',
    displayType: 'SingleTree',
    url: '/balabalaclass/gettree',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    placeholder: '请选择会员ID',
    displayType: 'SingleTree',
    url: '/balabalamember/gettree',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
}];
export default BALABALACLASSMEMBER_FORM_FIELDS;