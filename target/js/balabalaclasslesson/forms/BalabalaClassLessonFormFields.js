/**
 * 生成时间：2017年12月28日 01:55:50
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
const BALABALACLASSLESSON_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '课时ID',
        placeholder: '请输入课时ID'
},{
    key: 'classId',
    type: 'Object',
    label: '开班ID',
    placeholder: '请选择开班ID',
    displayType: 'SingleTree',
    url: '/balabalaclass/gettree',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'courseId',
    type: 'Object',
    label: '课程ID',
    placeholder: '请选择课程ID',
    displayType: 'SingleTree',
    url: '/balabalacourse/gettree',
    dataLableKey: 'courseName',
    dataValueKey: 'id'
},{
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    placeholder: '请选择教师ID',
    displayType: 'SingleTree',
    url: '/balabalateacher/gettree',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'englishTeacherId',
    type: 'Object',
    label: '外教教师ID',
    placeholder: '请选择外教教师ID',
    displayType: 'SingleTree',
    url: '/balabalateacher/gettree',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'lessonName',
    type: 'String',
    label: '课时名称',
    placeholder: '请输入课时名称'
},{
    key: 'thumbnail',
    type: 'String',
    label: '课时视频缩略图',
    placeholder: '请输入课时视频缩略图'
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
}];
export default BALABALACLASSLESSON_FORM_FIELDS;