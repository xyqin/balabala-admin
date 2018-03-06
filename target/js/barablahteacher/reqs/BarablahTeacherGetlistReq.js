import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月06日 04:53:40
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahTeacherGetlistReq
 * 接口地址：barablahteacher/getlist
 * 请求方式：Get
 * 接口说明：查找
 */
class BarablahTeacherGetlistReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahteacher/getlist',
            type: 'Get',        };
        // 请求参数的描述信息，只定义先不用
        this._paramsDescriptor = [{key: 'username',
            desc: '账号',
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
    setSimpleParams(username,fullName,phoneNumber,major,comeFrom,status) {
        this.addParams('username', username);
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

export default BarablahTeacherGetlistReq;
