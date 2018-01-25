import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月25日 03:24:37
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahPositionUpdateReq
 * 接口地址：barablahposition/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BarablahPositionUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahposition/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '位置ID',
            isRequired: true
        },{key: 'positionName',
            desc: '位置名称',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,positionName) {
        this.addParams('id', id);
        this.addParams('positionName', positionName);
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

export default BarablahPositionUpdateReq;
