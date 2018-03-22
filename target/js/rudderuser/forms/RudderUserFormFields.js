/**
 * 生成时间：2018年03月22日 08:05:49
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
const RUDDERUSER_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '资源ID',
    need: 'true',
        placeholder: '请输入资源ID'
},{
    key: 'rudderuserName',
    type: 'String',
    label: '账号名称',
    need: 'true',
    placeholder: '请输入账号名称'
},{
    key: 'rudderuserDesc',
    type: 'String',
    label: '备注',
    need: 'true',
    placeholder: '请输入备注'
},{
    key: 'password',
    type: 'String',
    label: '密码',
    need: 'true',
    placeholder: '请输入密码'
},{
    key: 'status',
    type: 'Enum',
    label: '用户状态',
    need: 'true',
        placeholder: '请选择用户状态',
        data: [{        value: '1',
        label: '正常'
        },{        value: '2',
        label: '登录锁定'
        },{        value: '3',
        label: '禁用'
        }]},{
    key: 'nickname',
    type: 'String',
    label: '昵称',
    need: 'true',
    placeholder: '请输入昵称'
},{
    key: 'email',
    type: 'String',
    label: 'email',
    need: 'true',
    placeholder: '请输入email'
},{
    key: 'visible',
    type: 'Bool',
    label: '是否显示',
    need: 'true',
placeholder: '请输入是否显示'
},{
    key: 'campusId',
    type: 'Object',
    label: '校区ID',
    need: 'true',
    placeholder: '请选择校区ID',
    displayType: 'SingleList',
    url: '/barablahcampus/getlist',
    dataLableKey: 'campusName',
    dataValueKey: 'id'
},{
    key: 'rudderRoles',
    type: 'Object',
    label: '所属角色',
    need: 'false',
    placeholder: '请选择所属角色',
    displayType: 'ListSelect',
    url: '/rudderrole/getlist',
    dataLableKey: 'rudderroleName',
    dataValueKey: 'id'
}];
export default RUDDERUSER_FORM_FIELDS;