import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月18日 05:08:40
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahTeacherMajorCreateReq
 * 接口地址：barablahteachermajor/create
 * 请求方式：Post
 * 接口说明：新建
 */
class BarablahTeacherMajorCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahteachermajor/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '主键',
            isRequired: false
        },{key: 'majorName',
            desc: '专业名称',
            isRequired: true
        },{key: 'position',
            desc: '排序号',
            isRequired: false
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,majorName,position) {
        this.addParams('id', id);
        this.addParams('majorName', majorName);
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

export default BarablahTeacherMajorCreateReq;