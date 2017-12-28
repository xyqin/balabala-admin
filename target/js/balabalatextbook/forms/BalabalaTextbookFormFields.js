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
const BALABALATEXTBOOK_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
},{
    key: 'categoryId',
    type: 'Object',
    label: '分类ID',
    placeholder: '请选择分类ID',
    displayType: 'SingleTree',
    url: '/balabalatextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'type',
    type: 'Enum',
    label: '题目类型',
        placeholder: '请选择题目类型',
        data: [{        value: 'CHOICE',
        label: '选择题'
        },{        value: 'FILLIN',
        label: '填空题'
        },{        value: 'LISTEN',
        label: '听写题'
        },{        value: 'SENTENCE',
        label: '看图造句'
        },{        value: 'CONNECT',
        label: '图词对应'
        },{        value: 'WORD',
        label: '认词拼读'
        },{        value: 'PICTURE',
        label: '看图读词'
        },{        value: 'ARTICLE',
        label: '阅读文章'
        }]},{
    key: 'textbookName',
    type: 'String',
    label: '题目名称',
    placeholder: '请输入题目名称'
},{
    key: 'question',
    type: 'String',
    label: '问题',
    placeholder: '请输入问题'
},{
    key: 'correct',
    type: 'String',
    label: '正确答案',
    placeholder: '请输入正确答案'
},{
    key: 'image',
    type: 'String',
    label: '图片',
    placeholder: '请输入图片'
}];
export default BALABALATEXTBOOK_FORM_FIELDS;