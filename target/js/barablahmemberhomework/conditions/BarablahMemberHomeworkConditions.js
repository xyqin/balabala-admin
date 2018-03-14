/**
 * 生成时间：2018年03月13日 09:32:06
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
const BARABLAHMEMBERHOMEWORK_CONDITIONS = [{
    key: 'homeworkName',
    type: 'String',
    label: '作业名称',
    placeholder: '请输入作业名称'
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
         data: [{                value: 'PENDING',
                label: '未完成'
            },{                value: 'FINISHED',
                label: '已完成'
            }]
}];
export default BARABLAHMEMBERHOMEWORK_CONDITIONS;