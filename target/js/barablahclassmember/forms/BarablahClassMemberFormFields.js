/**
 * 生成时间：2018年02月06日 05:34:58
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
const BARABLAHCLASSMEMBER_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '开班会员ID',
        placeholder: '请输入开班会员ID'
},{
    key: 'classId',
    type: 'Object',
    label: '开班ID',
    placeholder: '请选择开班ID',
    displayType: 'SingleList',
    url: '/barablahclass/getlist',
    dataLableKey: 'className',
    dataValueKey: 'id'
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
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
        data: [{        value: 'IN_REVIEW',
        label: '审核中'
        },{        value: 'REJECTED',
        label: '审核被拒'
        },{        value: 'ONGOING',
        label: '进行中'
        },{        value: 'FINISHED',
        label: '已结束'
        }]}];
export default BARABLAHCLASSMEMBER_FORM_FIELDS;