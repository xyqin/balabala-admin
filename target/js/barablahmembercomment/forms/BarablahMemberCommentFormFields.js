/**
 * 生成时间：2018年03月24日 04:29:03
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
const BARABLAHMEMBERCOMMENT_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
    need: 'false',
        placeholder: '请输入主键'
},{
    key: 'classId',
    type: 'Object',
    label: '班级',
    need: 'true',
    placeholder: '请选择班级',
    displayType: 'SingleList',
    url: '/barablahclass/getlist',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    need: 'true',
    placeholder: '请选择会员ID',
    displayType: 'SingleList',
    url: '/barablahmember/getlist',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
},{
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    need: 'true',
    placeholder: '请选择教师ID',
    displayType: 'SingleList',
    url: '/barablahteacher/getlist',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'content',
    type: 'String',
    label: '评语内容',
    need: 'true',
    placeholder: '请输入评语内容'
},{
    key: 'memberHomeworkId',
    type: 'Object',
    label: '学生作业',
    need: 'true',
    placeholder: '请选择学生作业',
    displayType: 'SingleList',
    url: '/barablahmemberhomework/getlist',
    dataLableKey: 'homeworkName',
    dataValueKey: 'id'
},{
    key: 'commentType',
    type: 'Enum',
    label: '性别',
    need: 'true',
        placeholder: '请选择性别',
        data: [{        value: '1',
        label: '班级评论'
        },{        value: '2',
        label: '作业评论'
        }]},{
    key: 'score',
    type: 'Number',
    label: '积分',
    need: 'false',
        placeholder: '请输入积分'
}];
export default BARABLAHMEMBERCOMMENT_FORM_FIELDS;