import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2017年12月23日 02:13:00
 * 该文件系自动生成，手动修改可能会被替换
 * BalabalaClassGetlistReq
 * 接口地址：balabalaclass/getlist
 * 请求方式：Get
 * 接口说明：查找
 */
class BalabalaClassGetlistReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/balabalaclass/getlist',
            type: 'Get',        };
        // 请求参数的描述信息，只定义先不用
        this._paramsDescriptor = [{key: 'className',
            desc: '班级名称',
            isRequired: true
        },{key: 'monitor',
            desc: '班长',
            isRequired: true
        },{key: 'monitorPhoneNumber',
            desc: '班长电话',
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
    setSimpleParams(className,monitor,monitorPhoneNumber,status) {
        this.addParams('className', className);
        this.addParams('monitor', monitor);
        this.addParams('monitorPhoneNumber', monitorPhoneNumber);
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

export default BalabalaClassGetlistReq;
