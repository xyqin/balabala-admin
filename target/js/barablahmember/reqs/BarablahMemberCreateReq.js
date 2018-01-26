import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月26日 03:39:50
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahMemberCreateReq
 * 接口地址：barablahmember/create
 * 请求方式：Post
 * 接口说明：新建
 */
class BarablahMemberCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahmember/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '会员ID',
            isRequired: true
        },{key: 'campusId',
            desc: '校区ID',
            isRequired: true
        },{key: 'nickname',
            desc: '昵称',
            isRequired: true
        },{key: 'avatar',
            desc: '头像',
            isRequired: true
        },{key: 'gender',
            desc: '性别',
            isRequired: true
        },{key: 'birthday',
            desc: '生日',
            isRequired: true
        },{key: 'points',
            desc: '积分',
            isRequired: false
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,campusId,nickname,avatar,gender,birthday,points) {
        this.addParams('id', id);
        this.addParams('campusId', campusId);
        this.addParams('nickname', nickname);
        this.addParams('avatar', avatar);
        this.addParams('gender', gender);
        this.addParams('birthday', birthday);
        this.addParams('points', points);
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

export default BarablahMemberCreateReq;
