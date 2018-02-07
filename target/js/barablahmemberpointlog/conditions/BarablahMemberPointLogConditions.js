/**
 * 生成时间：2018年02月07日 04:55:40
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
const BARABLAHMEMBERPOINTLOG_CONDITIONS = [{
    key: 'type',
    type: 'Enum',
    label: '类型',
        placeholder: '请选择类型',
         data: [{                value: 'TROPHY',
                label: '奖杯'
            },{                value: 'CLAPPING',
                label: '鼓掌'
            },{                value: 'SMILING',
                label: '开心'
            }]
}];
export default BARABLAHMEMBERPOINTLOG_CONDITIONS;