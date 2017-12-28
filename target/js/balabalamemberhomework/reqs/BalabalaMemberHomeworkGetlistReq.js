import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2017年12月28日 05:00:59
 * 该文件系自动生成，手动修改可能会被替换
 * BalabalaMemberHomeworkGetlistReq
 * 接口地址：balabalamemberhomework/getlist
 * 请求方式：Get
 * 接口说明：查找
 */
class BalabalaMemberHomeworkGetlistReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/balabalamemberhomework/getlist',
            type: 'Get',        };
        // 请求参数的描述信息，只定义先不用
        this._paramsDescriptor = [{key: 'homeworkName',
            desc: '作业名称',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(homeworkName) {
        this.addParams('homeworkName', homeworkName);
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

export default BalabalaMemberHomeworkGetlistReq;
