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
const BARABLAHMEMBERCOMMENT_CONDITIONS = [{
    key: 'classId',
    type: 'Object',
    label: '班级',
    placeholder: '请选择班级',
    displayType: 'SingleList',
    url: '/barablahclass/getlist',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'content',
    type: 'String',
    label: '评语内容',
    placeholder: '请输入评语内容'
},{
    key: 'commentType',
    type: 'Enum',
    label: '性别',
        placeholder: '请选择性别',
         data: [{                value: '1',
                label: '班级评论'
            },{                value: '2',
                label: '作业评论'
            }]
}];
export default BARABLAHMEMBERCOMMENT_CONDITIONS;