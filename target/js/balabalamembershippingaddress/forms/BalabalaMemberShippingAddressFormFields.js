/**
 * 生成时间：2017年12月23日 02:12:59
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
const BALABALAMEMBERSHIPPINGADDRESS_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员',
    placeholder: '请选择会员',
    displayType: 'SingleList',
    url: '/balabalamember/getlist',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
},{
    key: 'fullName',
    type: 'String',
    label: '收获人全名',
    placeholder: '请输入收获人全名'
},{
    key: 'region',
    type: 'String',
    label: '省市地区',
    placeholder: '请输入省市地区'
},{
    key: 'regionPath',
    type: 'String',
    label: '省市地区ID',
    placeholder: '请输入省市地区ID'
},{
    key: 'streetAddress',
    type: 'String',
    label: '街道地址',
    placeholder: '请输入街道地址'
},{
    key: 'phoneNumber',
    type: 'String',
    label: '电话号码',
    placeholder: '请输入电话号码'
},{
    key: 'prior',
    type: 'Bool',
    label: '优先的',
placeholder: '请输入优先的'
}];
export default BALABALAMEMBERSHIPPINGADDRESS_FORM_FIELDS;