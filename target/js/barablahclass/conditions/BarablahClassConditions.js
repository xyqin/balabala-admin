/**
 * 生成时间：2018年03月13日 07:57:10
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
    key: 'categoryId',
    type: 'Object',
    label: '班级分类ID',
    placeholder: '请选择班级分类ID',
    displayType: 'SingleList',
    url: '/barablahclasscategory/getlist',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'campusId',
    type: 'Object',
    label: '校区ID',
    placeholder: '请选择校区ID',
    displayType: 'SingleList',
    url: '/barablahcampus/getlist',
    dataLableKey: 'campusName',
    dataValueKey: 'id'
},{
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    placeholder: '请选择教师ID',
    displayType: 'SingleList',
    url: '/barablahteacher/getlist',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'courseId',
    type: 'Object',
    label: '课程ID',
    placeholder: '请选择课程ID',
    displayType: 'SingleList',
    url: '/barablahcourse/getlist',
    dataLableKey: 'courseName',
    dataValueKey: 'id'
},{
    key: 'className',
    type: 'String',
    label: '班级名称',
    placeholder: '请输入班级名称'
},{
    key: 'status',
    type: 'Enum',
    label: '状态',
        placeholder: '请选择状态',
         data: [{                value: 'IN_REVIEW',
                label: '审核中'
            },{                value: 'REJECTED',
                label: '审核被拒'
            },{                value: 'WAITTING',
                label: '待开课'
            },{                value: 'ONGOING',
                label: '已开课'
            },{                value: 'FINISHED',
                label: '已结束'
            }]
}];
export default BARABLAHCLASS_CONDITIONS;