import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月11日 09:18:51
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahMemberSignupGetpageReq
 * 接口地址：barablahmembersignup/getpage
 * 请求方式：Get
 * 接口说明：查找
 */
class BarablahMemberSignupGetpageReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahmembersignup/getpage',
            type: 'Get',        };
        // 请求参数的描述信息，只定义先不用
        this._paramsDescriptor = [{key: 'memberId',
            desc: '会员ID',
            isRequired: true
        },{key: 'classId',
            desc: '开班ID',
            isRequired: true
        },{key: 'payment',
            desc: '支付方式',
            isRequired: true
        },{key: 'page',
            desc: '页码',
            isRequired: false
        },{key: 'size',
            desc: '页的大小',
            isRequired: false
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(memberId,classId,payment,page,size) {
        this.addParams('memberId', memberId);
        this.addParams('classId', classId);
        this.addParams('payment', payment);
        this.addParams('page', page);
        this.addParams('size', size);
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

export default BarablahMemberSignupGetpageReq;
