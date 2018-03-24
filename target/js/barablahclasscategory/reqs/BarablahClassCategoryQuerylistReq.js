import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月24日 04:29:03
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahClassCategoryQuerylistReq
 * 接口地址：barablahclasscategory/querylist
 * 请求方式：Post
 * 接口说明：查找
 */
class BarablahClassCategoryQuerylistReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahclasscategory/querylist',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams() {
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

export default BarablahClassCategoryQuerylistReq;
