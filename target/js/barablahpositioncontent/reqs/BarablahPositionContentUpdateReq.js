import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月24日 04:29:04
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahPositionContentUpdateReq
 * 接口地址：barablahpositioncontent/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BarablahPositionContentUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahpositioncontent/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '内容ID',
            isRequired: true
        },{key: 'positionId',
            desc: '位置ID',
            isRequired: true
        },{key: 'contentName',
            desc: '内容名称',
            isRequired: true
        },{key: 'image',
            desc: '内容图片',
            isRequired: true
        },{key: 'link',
            desc: '内容链接地址',
            isRequired: true
        },{key: 'startAt',
            desc: '开始时间',
            isRequired: false
        },{key: 'endAt',
            desc: '结束时间',
            isRequired: false
        },{key: 'position',
            desc: '排序号',
            isRequired: false
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,positionId,contentName,image,link,startAt,endAt,position) {
        this.addParams('id', id);
        this.addParams('positionId', positionId);
        this.addParams('contentName', contentName);
        this.addParams('image', image);
        this.addParams('link', link);
        this.addParams('startAt', startAt);
        this.addParams('endAt', endAt);
        this.addParams('position', position);
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

export default BarablahPositionContentUpdateReq;
