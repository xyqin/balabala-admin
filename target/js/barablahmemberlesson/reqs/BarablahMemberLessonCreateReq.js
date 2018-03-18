import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月18日 05:08:38
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahMemberLessonCreateReq
 * 接口地址：barablahmemberlesson/create
 * 请求方式：Post
 * 接口说明：新建
 */
class BarablahMemberLessonCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahmemberlesson/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '会员ID',
            isRequired: true
        },{key: 'memberId',
            desc: '会员ID',
            isRequired: true
        },{key: 'classId',
            desc: '开班ID',
            isRequired: true
        },{key: 'lessonId',
            desc: '课时ID',
            isRequired: true
        },{key: 'startAt',
            desc: '开始时间',
            isRequired: false
        },{key: 'endAt',
            desc: '结束时间',
            isRequired: false
        },{key: 'type',
            desc: '类型',
            isRequired: true
        },{key: 'probational',
            desc: '是否试听',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,memberId,classId,lessonId,startAt,endAt,type,probational) {
        this.addParams('id', id);
        this.addParams('memberId', memberId);
        this.addParams('classId', classId);
        this.addParams('lessonId', lessonId);
        this.addParams('startAt', startAt);
        this.addParams('endAt', endAt);
        this.addParams('type', type);
        this.addParams('probational', probational);
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

export default BarablahMemberLessonCreateReq;
