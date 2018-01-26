import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月26日 03:43:32
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahClassGetpageReq
 * 接口地址：barablahclass/getpage
 * 请求方式：Get
 * 接口说明：查找
 */
class BarablahClassGetpageReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahclass/getpage',
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
    setSimpleParams(className,monitor,monitorPhoneNumber,status,page,size) {
        this.addParams('className', className);
        this.addParams('monitor', monitor);
        this.addParams('monitorPhoneNumber', monitorPhoneNumber);
        this.addParams('status', status);
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

export default BarablahClassGetpageReq;
