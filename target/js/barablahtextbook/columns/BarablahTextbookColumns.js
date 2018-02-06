/**
 * 生成时间：2018年02月06日 02:51:00
 * 该文件系自动生成，手动修改可能会被替换
 * 根据搜索接口的响应字段生成
 * 表头：拼团
 * {
 * "title": "显示的名称",
 * "dataIndex": "排序标识",
 * "key": "列的唯一标识",
 * "checked": "默认是否显示"
 * }
 */
const BARABLAHTEXTBOOK_COLUMNS = [{
title: '主键',
dataIndex: 'id',
key: 'id',
type:'Id',
checked: true
},{
title: '教材三级分类ID',
dataIndex: 'categoryIdObject',
key: 'categoryIdObject',
type:'Object',
checked: true
},{
title: '题目类型',
dataIndex: 'typeEnum',
key: 'typeEnum',
type:'Enum',
checked: true
},{
title: '题目名称',
dataIndex: 'textbookName',
key: 'textbookName',
type:'String',
checked: true
},{
title: '问题',
dataIndex: 'question',
key: 'question',
type:'String',
checked: true
},{
title: '选项',
dataIndex: 'option',
key: 'option',
type:'String',
checked: true
},{
title: '正确答案',
dataIndex: 'correct',
key: 'correct',
type:'String',
checked: true
},{
title: '图片',
dataIndex: 'image',
key: 'image',
type:'Image',
checked: true
},{
title: '音频',
dataIndex: 'video',
key: 'video',
type:'File',
checked: true
}];
export default BARABLAHTEXTBOOK_COLUMNS;
