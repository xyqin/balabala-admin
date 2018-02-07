/**
 * 生成时间：2018年02月07日 10:47:10
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
const BARABLAHCLASS_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '开班ID',
        placeholder: '请输入开班ID'
},{
    key: 'categoryId',
    type: 'Object',
    label: '班级分类ID',
    placeholder: '请选择班级分类ID',
    displayType: 'SingleList',
    url: '/barablahclasscategory/getlist',
    dataLableKey: 'categoryName',
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
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    placeholder: '请选择教师ID',
    displayType: 'SingleList',
    url: '/barablahteacher/getlist',
    dataLableKey: 'fullName',
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
    key: 'englishTeacherId',
    type: 'Object',
    label: '外教教师ID',
    placeholder: '请选择外教教师ID',
    displayType: 'SingleList',
    url: '/barablahteacher/getlist',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
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
        data: [{        value: 'IN_REVIEW',
        label: '审核中'
        },{        value: 'REJECTED',
        label: '审核被拒'
        },{        value: 'ONGOING',
        label: '已通过'
        },{        value: 'FINISHED',
        label: '已结束'
        }]}];
export default BARABLAHCLASS_FORM_FIELDS;