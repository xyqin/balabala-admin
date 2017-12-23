/**
 * 生成时间：2017年12月23日 02:12:59
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
const BALABALACAMPUS_FORM_FIELDS = [{
    key: 'id',
    type: 'Id',
    label: '校区ID',
        placeholder: '请输入校区ID'
},{
    key: 'regionId',
    type: 'Object',
    label: '地区ID',
    placeholder: '请选择地区ID',
    displayType: 'SingleTree',
    url: '/balabalaregion/gettree',
    dataLableKey: 'regionName',
    dataValueKey: 'id'
},{
    key: 'campusName',
    type: 'String',
    label: '校区名称',
    placeholder: '请输入校区名称'
}];
export default BALABALACAMPUS_FORM_FIELDS;