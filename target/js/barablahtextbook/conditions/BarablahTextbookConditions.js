/**
 * 生成时间：2018年01月26日 11:59:32
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
const BARABLAHTEXTBOOK_CONDITIONS = [{
    key: 'categoryId',
    type: 'Object',
    label: '教材三级分类ID',
    placeholder: '请选择教材三级分类ID',
    displayType: 'SingleTree',
    url: '/barablahtextbookcategory/gettree',
    dataLableKey: 'categoryName',
    dataValueKey: 'id'
},{
    key: 'type',
    type: 'Enum',
    label: '题目类型',
        placeholder: '请选择题目类型',
         data: [{                value: 'CHOICE',
                label: '选择题'
            },{                value: 'FILLIN',
                label: '填空题'
            },{                value: 'LISTEN',
                label: '听写题'
            },{                value: 'SENTENCE',
                label: '看图造句'
            },{                value: 'CONNECT',
                label: '图词对应'
            },{                value: 'WORD',
                label: '认词拼读'
            },{                value: 'PICTURE',
                label: '看图读词'
            },{                value: 'ARTICLE',
                label: '阅读文章'
            }]
},{
    key: 'textbookName',
    type: 'String',
    label: '题目名称',
    placeholder: '请输入题目名称'
}];
export default BARABLAHTEXTBOOK_CONDITIONS;