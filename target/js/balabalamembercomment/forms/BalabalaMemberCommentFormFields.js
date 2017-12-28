/**
 * 生成时间：2017年12月28日 06:54:55
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
const BALABALAMEMBERCOMMENT_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '主键',
        placeholder: '请输入主键'
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
    key: 'teacherId',
    type: 'Object',
    label: '教师ID',
    placeholder: '请选择教师ID',
    displayType: 'SingleTree',
    url: '/balabalateacher/gettree',
    dataLableKey: 'fullName',
    dataValueKey: 'id'
},{
    key: 'content',
    type: 'String',
    label: '评语内容',
    placeholder: '请输入评语内容'
}];
export default BALABALAMEMBERCOMMENT_FORM_FIELDS;