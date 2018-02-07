import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年02月07日 10:47:10
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahCampusUpdateReq
 * 接口地址：barablahcampus/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BarablahCampusUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahcampus/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '校区ID',
            isRequired: true
        },{key: 'regionId',
            desc: '地区ID',
            isRequired: true
        },{key: 'campusName',
            desc: '校区名称',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,regionId,campusName) {
        this.addParams('id', id);
        this.addParams('regionId', regionId);
        this.addParams('campusName', campusName);
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

export default BarablahCampusUpdateReq;
