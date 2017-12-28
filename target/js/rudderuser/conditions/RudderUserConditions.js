/**
 * 生成时间：2017年12月28日 03:59:22
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
const RUDDERUSER_CONDITIONS = [{
    key: 'rudderuserName',
    type: 'String',
    label: '账号名称',
    placeholder: '请输入账号名称'
},{
    key: 'status',
    type: 'Enum',
    label: '用户状态',
        placeholder: '请选择用户状态',
         data: [{                value: '1',
                label: '正常'
            },{                value: '2',
                label: '登录锁定'
            },{                value: '3',
                label: '禁用'
            }]
}];
export default RUDDERUSER_CONDITIONS;