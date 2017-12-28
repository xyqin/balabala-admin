import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2017年12月28日 06:54:55
 * 该文件系自动生成，手动修改可能会被替换
 * BalabalaTextbookUpdateReq
 * 接口地址：balabalatextbook/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BalabalaTextbookUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/balabalatextbook/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '主键',
            isRequired: false
        },{key: 'categoryId',
            desc: '分类ID',
            isRequired: true
        },{key: 'type',
            desc: '题目类型',
            isRequired: true
        },{key: 'textbookName',
            desc: '题目名称',
            isRequired: true
        },{key: 'question',
            desc: '问题',
            isRequired: true
        },{key: 'correct',
            desc: '正确答案',
            isRequired: true
        },{key: 'image',
            desc: '图片',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,categoryId,type,textbookName,question,correct,image) {
        this.addParams('id', id);
        this.addParams('categoryId', categoryId);
        this.addParams('type', type);
        this.addParams('textbookName', textbookName);
        this.addParams('question', question);
        this.addParams('correct', correct);
        this.addParams('image', image);
    }

    /**
     * 添加接口请求参数，适用于请求参数过多，使用对象传参数
     * @param obj 请求参数对象
     * {
     * 'id': '活动编号',
     * }
     */
    setComplexParams(obj) {
        this.setParams(obj);
    }
}

export default BalabalaTextbookUpdateReq;
