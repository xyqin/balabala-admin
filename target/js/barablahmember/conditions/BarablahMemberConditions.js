/**
 * 生成时间：2018年03月10日 07:58:17
 * 该文件系自动生成，手动修改可能会被替换
 * 根据搜索接口的请求字段生成，如果没有搜索条件返回空数组
 * 搜索条件：拼团
 * {
 * 'key': '关键字',
 * 'type': '类型',
 * 'label': '显示名称',
 * 'placeholder': '默认占位文字',
 * 'data': '附加的数据'
 * }
 */
const BARABLAHMEMBER_CONDITIONS = [{
    key: 'nickname',
    type: 'String',
    label: '昵称',
    placeholder: '请输入昵称'
},{
    key: 'gender',
    type: 'Enum',
    label: '性别',
        placeholder: '请选择性别',
         data: [{                value: 'MALE',
                label: '男'
            },{                value: 'FEMALE',
                label: '女'
            }]
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
         data: [{                value: 'ENABLED',
                label: '启用'
            },{                value: 'DISABLED',
                label: '禁用'
            }]
}];
export default BARABLAHMEMBER_CONDITIONS;