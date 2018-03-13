/**
 * 生成时间：2018年03月13日 12:41:36
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
const BARABLAHMEMBERLESSON_CONDITIONS = [{
    key: 'type',
    type: 'Enum',
    label: '类型',
        placeholder: '请选择类型',
         data: [{                value: 'ONLINE',
                label: '线上'
            },{                value: 'OFFLINE',
                label: '线下'
            }]
},{
    key: 'probational',
    type: 'Bool',
    label: '是否试听',
    placeholder: '请输入是否试听'
}];
export default BARABLAHMEMBERLESSON_CONDITIONS;