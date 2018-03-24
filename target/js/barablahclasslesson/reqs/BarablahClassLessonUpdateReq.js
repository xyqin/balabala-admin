import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月24日 04:29:03
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahClassLessonUpdateReq
 * 接口地址：barablahclasslesson/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BarablahClassLessonUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahclasslesson/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '课时ID',
            isRequired: false
        },{key: 'lessonName',
            desc: '课时名称',
            isRequired: true
        },{key: 'classId',
            desc: '班级',
            isRequired: true
        },{key: 'categoryId',
            desc: '教材四级分类',
            isRequired: true
        },{key: 'startAt',
            desc: '开始时间',
            isRequired: false
        },{key: 'endAt',
            desc: '结束时间',
            isRequired: false
        },{key: 'thumbnail',
            desc: '课时视频缩略图',
            isRequired: true
        },{key: 'prepared',
            desc: '是否备课',
            isRequired: true
        },{key: 'status',
            desc: '类型',
            isRequired: true
        },{key: 'type',
            desc: '类型',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,lessonName,classId,categoryId,startAt,endAt,thumbnail,prepared,status,type) {
        this.addParams('id', id);
        this.addParams('lessonName', lessonName);
        this.addParams('classId', classId);
        this.addParams('categoryId', categoryId);
        this.addParams('startAt', startAt);
        this.addParams('endAt', endAt);
        this.addParams('thumbnail', thumbnail);
        this.addParams('prepared', prepared);
        this.addParams('status', status);
        this.addParams('type', type);
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

export default BarablahClassLessonUpdateReq;
