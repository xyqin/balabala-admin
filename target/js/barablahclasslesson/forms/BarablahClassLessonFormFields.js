/**
 * 生成时间：2018年02月07日 04:55:40
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
const BARABLAHCLASSLESSON_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '课时ID',
        placeholder: '请输入课时ID'
},{
    key: 'classId',
    type: 'Object',
    label: '开班ID',
    placeholder: '请选择开班ID',
    displayType: 'SingleList',
    url: '/barablahclass/getlist',
    dataLableKey: 'className',
    dataValueKey: 'id'
},{
    key: 'categoryId',
    type: 'Object',
    label: '教材三级分类ID',
    placeholder: '请选择教材三级分类ID',
    displayType: 'SingleTree',
    url: '/barablahtextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'lessonName',
    type: 'String',
    label: '课时名称',
    placeholder: '请输入课时名称'
},{
    key: 'thumbnail',
    type: 'Image',
    label: '课时视频缩略图',
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
        data: [{        value: 'ONLINE',
        label: '线上'
        },{        value: 'OFFLINE',
        label: '线下'
        }]}];
export default BARABLAHCLASSLESSON_FORM_FIELDS;