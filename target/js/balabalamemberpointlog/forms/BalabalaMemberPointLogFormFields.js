/**
 * 生成时间：2018年01月06日 09:19:40
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
const BALABALAMEMBERPOINTLOG_FORM_FIELDS = [{
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
    key: 'points',
    type: 'Number',
    label: '积分',
        placeholder: '请输入积分'
},{
    key: 'type',
    type: 'Enum',
    label: '类型',
        placeholder: '请选择类型',
        data: [{        value: 'TROPHY',
        label: '奖杯'
        },{        value: 'CLAPPING',
        label: '鼓掌'
        },{        value: 'SMILING',
        label: '开心'
        }]}];
export default BALABALAMEMBERPOINTLOG_FORM_FIELDS;