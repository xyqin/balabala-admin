import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月26日 03:43:33
 * 该文件系自动生成，手动修改可能会被替换
 * RudderUserCreateReq
 * 接口地址：rudderuser/create
 * 请求方式：Post
 * 接口说明：新建系统用户
 */
class RudderUserCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/rudderuser/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '资源ID',
            isRequired: true
        },{key: 'rudderuserName',
            desc: '账号名称',
            isRequired: true
        },{key: 'rudderuserDesc',
            desc: '备注',
            isRequired: true
        },{key: 'password',
            desc: '密码',
            isRequired: true
        },{key: 'status',
            desc: '用户状态',
            isRequired: true
        },{key: 'nickname',
            desc: '昵称',
            isRequired: true
        },{key: 'salt',
            desc: 'salt',
            isRequired: false
        },{key: 'email',
            desc: 'email',
            isRequired: true
        },{key: 'visible',
            desc: '是否显示',
            isRequired: true
        },{key: 'campusId',
            desc: '校区ID',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,rudderuserName,rudderuserDesc,password,status,nickname,salt,email,visible,campusId) {
        this.addParams('id', id);
        this.addParams('rudderuserName', rudderuserName);
        this.addParams('rudderuserDesc', rudderuserDesc);
        this.addParams('password', password);
        this.addParams('status', status);
        this.addParams('nickname', nickname);
        this.addParams('salt', salt);
        this.addParams('email', email);
        this.addParams('visible', visible);
        this.addParams('campusId', campusId);
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

export default RudderUserCreateReq;
