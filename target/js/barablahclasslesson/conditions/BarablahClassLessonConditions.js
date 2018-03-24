/**
 * 生成时间：2018年03月24日 04:29:03
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
const BARABLAHCLASSLESSON_CONDITIONS = [{
    key: 'lessonName',
    type: 'String',
    label: '课时名称',
    placeholder: '请输入课时名称'
},{
    key: 'classId',
    type: 'Object',
    label: '班级',
    placeholder: '请选择班级',
    displayType: 'SingleList',
    url: '/barablahclass/getlist',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'status',
    type: 'Enum',
    label: '类型',
        placeholder: '请选择类型',
         data: [{                value: 'WAITING',
                label: '待开课'
            },{                value: 'GOING',
                label: '开课中'
            },{                value: 'GONE',
                label: '已过期'
            },{                value: 'FINISH',
                label: '已结束'
            }]
},{
    key: 'type',
    type: 'Enum',
    label: '类型',
        placeholder: '请选择类型',
         data: [{                value: 'ONLINE',
                label: '线上'
            },{                value: 'OFFLINE',
                label: '线下'
            }]
}];
export default BARABLAHCLASSLESSON_CONDITIONS;