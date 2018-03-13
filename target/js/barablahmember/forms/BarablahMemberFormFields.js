/**
 * 生成时间：2018年03月13日 12:41:36
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
const BARABLAHMEMBER_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '会员ID',
    need: 'true',
        placeholder: '请输入会员ID'
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
    key: 'nickname',
    type: 'String',
    label: '昵称',
    need: 'true',
    placeholder: '请输入昵称'
},{
    key: 'avatar',
    type: 'Image',
    label: '头像',
    need: 'true',
},{
    key: 'englishName',
    type: 'String',
    label: '英文名',
    need: 'true',
    placeholder: '请输入英文名'
},{
    key: 'gender',
    type: 'Enum',
    label: '性别',
    need: 'true',
        placeholder: '请选择性别',
        data: [{        value: 'MALE',
        label: '男'
        },{        value: 'FEMALE',
        label: '女'
        }]},{
    key: 'birthday',
    type: 'String',
    label: '生日',
    need: 'true',
    placeholder: '请输入生日'
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
    need: 'true',
        placeholder: '请选择状态',
        data: [{        value: 'ENABLED',
        label: '启用'
        },{        value: 'DISABLED',
        label: '禁用'
        }]},{
    key: 'points',
    type: 'Number',
    label: '积分',
    need: 'false',
        placeholder: '请输入积分'
}];
export default BARABLAHMEMBER_FORM_FIELDS;