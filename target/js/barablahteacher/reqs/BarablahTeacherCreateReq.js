import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年02月06日 02:51:01
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahTeacherCreateReq
 * 接口地址：barablahteacher/create
 * 请求方式：Post
 * 接口说明：新建
 */
class BarablahTeacherCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahteacher/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '主键',
            isRequired: false
        },{key: 'campusId',
            desc: '校区ID',
            isRequired: true
        },{key: 'username',
            desc: '账号',
            isRequired: true
        },{key: 'avatar',
            desc: '头像',
            isRequired: true
        },{key: 'fullName',
            desc: '姓名',
            isRequired: true
        },{key: 'phoneNumber',
            desc: '手机号',
            isRequired: true
        },{key: 'major',
            desc: '专业',
            isRequired: true
        },{key: 'comeFrom',
            desc: '来自哪里',
            isRequired: true
        },{key: 'status',
            desc: '状态',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,campusId,username,avatar,fullName,phoneNumber,major,comeFrom,status) {
        this.addParams('id', id);
        this.addParams('campusId', campusId);
        this.addParams('username', username);
        this.addParams('avatar', avatar);
        this.addParams('fullName', fullName);
        this.addParams('phoneNumber', phoneNumber);
        this.addParams('major', major);
        this.addParams('comeFrom', comeFrom);
        this.addParams('status', status);
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

export default BarablahTeacherCreateReq;
