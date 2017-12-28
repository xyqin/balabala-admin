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
const BALABALAMEMBERLESSON_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '会员ID',
        placeholder: '请输入会员ID'
},{
    key: 'memberId',
    type: 'Object',
    label: '会员ID',
    placeholder: '请选择会员ID',
    displayType: 'SingleTree',
    url: '/balabalamember/gettree',
    dataLableKey: 'nickname',
    dataValueKey: 'id'
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
    key: 'lessonId',
    type: 'Object',
    label: '课时ID',
    placeholder: '请选择课时ID',
    displayType: 'SingleTree',
    url: '/balabalaclasslesson/gettree',
    dataLableKey: 'lessonName',
    dataValueKey: 'id'
}];
export default BALABALAMEMBERLESSON_FORM_FIELDS;