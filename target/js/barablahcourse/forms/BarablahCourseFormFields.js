/**
 * 生成时间：2018年02月07日 04:00:59
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
const BARABLAHCOURSE_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '课程ID',
        placeholder: '请输入课程ID'
},{
    key: 'categoryId',
    type: 'Object',
    label: '课程分类ID',
    placeholder: '请选择课程分类ID',
    displayType: 'SingleList',
    url: '/barablahcoursecategory/getlist',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'textbookCategoryId',
    type: 'Object',
    label: '教材二级分类ID',
    placeholder: '请选择教材二级分类ID',
    displayType: 'SingleTree',
    url: '/barablahtextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'courseName',
    type: 'String',
    label: '课程名称',
    placeholder: '请输入课程名称'
},{
    key: 'onlineLessons',
    type: 'Number',
    label: '线上授课次数',
        placeholder: '请输入线上授课次数'
},{
    key: 'onlineDuration',
    type: 'Number',
    label: '线上授课时长',
        placeholder: '请输入线上授课时长'
},{
    key: 'offlineLessons',
    type: 'Number',
    label: '线下授课次数',
        placeholder: '请输入线下授课次数'
},{
    key: 'offlineDuration',
    type: 'Number',
    label: '线下授课时长',
        placeholder: '请输入线下授课时长'
},{
    key: 'commission',
    type: 'Number',
    label: '总部抽取佣金（元/每位学生）',
        placeholder: '请输入总部抽取佣金（元/每位学生）'
}];
export default BARABLAHCOURSE_FORM_FIELDS;