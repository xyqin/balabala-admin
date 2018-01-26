import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月26日 03:43:32
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahCourseUpdateReq
 * 接口地址：barablahcourse/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BarablahCourseUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahcourse/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '课程ID',
            isRequired: true
        },{key: 'categoryId',
            desc: '课程分类ID',
            isRequired: true
        },{key: 'textbookCategoryId',
            desc: '教材二级分类ID',
            isRequired: true
        },{key: 'courseName',
            desc: '课程名称',
            isRequired: true
        },{key: 'onlineLessons',
            desc: '线上授课次数',
            isRequired: false
        },{key: 'onlineDuration',
            desc: '线上授课时长',
            isRequired: false
        },{key: 'offlineLessons',
            desc: '线下授课次数',
            isRequired: false
        },{key: 'offlineDuration',
            desc: '线下授课时长',
            isRequired: false
        },{key: 'commission',
            desc: '总部抽取佣金（元/每位学生）',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,categoryId,textbookCategoryId,courseName,onlineLessons,onlineDuration,offlineLessons,offlineDuration,commission) {
        this.addParams('id', id);
        this.addParams('categoryId', categoryId);
        this.addParams('textbookCategoryId', textbookCategoryId);
        this.addParams('courseName', courseName);
        this.addParams('onlineLessons', onlineLessons);
        this.addParams('onlineDuration', onlineDuration);
        this.addParams('offlineLessons', offlineLessons);
        this.addParams('offlineDuration', offlineDuration);
        this.addParams('commission', commission);
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

export default BarablahCourseUpdateReq;
