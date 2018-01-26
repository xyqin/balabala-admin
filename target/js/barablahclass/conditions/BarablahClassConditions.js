/**
 * 生成时间：2018年01月26日 03:43:32
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
const BARABLAHCLASS_CONDITIONS = [{
    key: 'className',
    type: 'String',
    label: '班级名称',
    placeholder: '请输入班级名称'
},{
    key: 'monitor',
    type: 'String',
    label: '班长',
    placeholder: '请输入班长'
},{
    key: 'monitorPhoneNumber',
    type: 'String',
    label: '班长电话',
    placeholder: '请输入班长电话'
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
         data: [{                value: 'IN_REVIEW',
                label: '审核中'
            },{                value: 'REJECTED',
                label: '审核被拒'
            },{                value: 'ONGOING',
                label: '进行中'
            },{                value: 'FINISHED',
                label: '已结束'
            }]
}];
export default BARABLAHCLASS_CONDITIONS;