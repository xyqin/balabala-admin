/**
 * 生成时间：2017年12月28日 07:22:05
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
const BALABALAMEMBER_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '会员ID',
        placeholder: '请输入会员ID'
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
    key: 'nickname',
    type: 'String',
    label: '昵称',
    placeholder: '请输入昵称'
},{
    key: 'avatar',
    type: 'String',
    label: '头像',
    placeholder: '请输入头像'
},{
    key: 'englishName',
    type: 'String',
    label: '英文名',
    placeholder: '请输入英文名'
},{
    key: 'gender',
    type: 'Enum',
    label: '性别',
        placeholder: '请选择性别',
        data: [{        value: 'MALE',
        label: '男'
        },{        value: 'FEMALE',
        label: '女'
        }]},{
    key: 'birthday',
    type: 'String',
    label: '生日',
    placeholder: '请输入生日'
},{
    key: 'accid',
    type: 'String',
    label: '网易云ID',
    placeholder: '请输入网易云ID'
},{
    key: 'token',
    type: 'String',
    label: '网易云登录token',
    placeholder: '请输入网易云登录token'
},{
    key: 'points',
    type: 'Number',
    label: '积分',
        placeholder: '请输入积分'
}];
export default BALABALAMEMBER_FORM_FIELDS;