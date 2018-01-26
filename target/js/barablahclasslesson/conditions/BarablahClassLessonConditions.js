/**
 * 生成时间：2018年01月26日 11:13:55
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
    key: 'thumbnail',
    type: 'Image',
    label: '课时视频缩略图',
},{
    key: 'video',
    type: 'String',
    label: '课时视频',
    placeholder: '请输入课时视频'
},{
    key: 'room',
    type: 'String',
    label: '网易云房间',
    placeholder: '请输入网易云房间'
},{
    key: 'prepared',
    type: 'Bool',
    label: '是否备课',
    placeholder: '请输入是否备课'
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