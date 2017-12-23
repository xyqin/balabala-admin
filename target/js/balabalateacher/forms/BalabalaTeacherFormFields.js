/**
 * 生成时间：2017年12月23日 02:13:00
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
const BALABALATEACHER_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'campusId',
    type: 'Object',
    label: '校区ID',
    placeholder: '请选择校区ID',
    displayType: 'SingleTree',
    url: '/balabalacampus/gettree',
    dataLableKey: 'campusName',
    dataValueKey: 'id'
},{
    key: 'username',
    type: 'String',
    label: '账号',
    placeholder: '请输入账号'
},{
    key: 'password',
    type: 'String',
    label: '密码',
    placeholder: '请输入密码'
},{
    key: 'avatar',
    type: 'String',
    label: '头像',
    placeholder: '请输入头像'
},{
    key: 'fullName',
    type: 'String',
    label: '姓名',
    placeholder: '请输入姓名'
},{
    key: 'phoneNumber',
    type: 'String',
    label: '手机号',
    placeholder: '请输入手机号'
},{
    key: 'major',
    type: 'String',
    label: '专业',
    placeholder: '请输入专业'
},{
    key: 'comeFrom',
    type: 'String',
    label: '来自哪里',
    placeholder: '请输入来自哪里'
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
        data: [{        value: 'IN_REVIEW',
        label: '审核中'
        },{        value: 'REJECTED',
        label: '审核被拒'
        },{        value: 'ENABLED',
        label: '启用'
        },{        value: 'DISABLED',
        label: '禁用'
        }]},{
    key: 'accid',
    type: 'String',
    label: '网易云ID',
    placeholder: '请输入网易云ID'
},{
    key: 'token',
    type: 'String',
    label: '网易云登录token',
    placeholder: '请输入网易云登录token'
}];
export default BALABALATEACHER_FORM_FIELDS;