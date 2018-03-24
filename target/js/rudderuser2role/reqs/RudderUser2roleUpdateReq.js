import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月24日 04:29:05
 * 该文件系自动生成，手动修改可能会被替换
 * RudderUser2roleUpdateReq
 * 接口地址：rudderuser2role/update
 * 请求方式：Post
 * 接口说明：编辑用户角色关系
 */
class RudderUser2roleUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/rudderuser2role/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '资源ID',
            isRequired: true
        },{key: 'rudderroleId',
            desc: '角色',
            isRequired: true
        },{key: 'rudderuserId',
            desc: '用户',
            isRequired: true
        },{key: 'visible',
            desc: '是否显示',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,rudderroleId,rudderuserId,visible) {
        this.addParams('id', id);
        this.addParams('rudderroleId', rudderroleId);
        this.addParams('rudderuserId', rudderuserId);
        this.addParams('visible', visible);
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

export default RudderUser2roleUpdateReq;
