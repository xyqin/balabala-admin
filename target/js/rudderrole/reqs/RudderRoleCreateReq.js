import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月06日 09:19:41
 * 该文件系自动生成，手动修改可能会被替换
 * RudderRoleCreateReq
 * 接口地址：rudderrole/create
 * 请求方式：Post
 * 接口说明：新建系统角色
 */
class RudderRoleCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/rudderrole/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '角色ID',
            isRequired: true
        },{key: 'rudderroleName',
            desc: '资源名称',
            isRequired: true
        },{key: 'rudderroleDesc',
            desc: '资源描述',
            isRequired: true
        },{key: 'code',
            desc: '角色代码',
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
    setSimpleParams(id,rudderroleName,rudderroleDesc,code,visible) {
        this.addParams('id', id);
        this.addParams('rudderroleName', rudderroleName);
        this.addParams('rudderroleDesc', rudderroleDesc);
        this.addParams('code', code);
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

export default RudderRoleCreateReq;
