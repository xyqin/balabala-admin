import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2017年12月28日 12:00:31
 * 该文件系自动生成，手动修改可能会被替换
 * BalabalaMemberShippingAddressCreateReq
 * 接口地址：balabalamembershippingaddress/create
 * 请求方式：Post
 * 接口说明：新建
 */
class BalabalaMemberShippingAddressCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/balabalamembershippingaddress/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '主键',
            isRequired: true
        },{key: 'memberId',
            desc: '会员',
            isRequired: true
        },{key: 'fullName',
            desc: '收获人全名',
            isRequired: true
        },{key: 'region',
            desc: '省市地区',
            isRequired: true
        },{key: 'regionPath',
            desc: '省市地区ID',
            isRequired: true
        },{key: 'streetAddress',
            desc: '街道地址',
            isRequired: true
        },{key: 'phoneNumber',
            desc: '电话号码',
            isRequired: true
        },{key: 'prior',
            desc: '优先的',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,memberId,fullName,region,regionPath,streetAddress,phoneNumber,prior) {
        this.addParams('id', id);
        this.addParams('memberId', memberId);
        this.addParams('fullName', fullName);
        this.addParams('region', region);
        this.addParams('regionPath', regionPath);
        this.addParams('streetAddress', streetAddress);
        this.addParams('phoneNumber', phoneNumber);
        this.addParams('prior', prior);
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

export default BalabalaMemberShippingAddressCreateReq;
