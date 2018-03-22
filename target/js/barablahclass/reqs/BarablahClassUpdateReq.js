import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月22日 08:05:49
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahClassUpdateReq
 * 接口地址：barablahclass/update
 * 请求方式：Post
 * 接口说明：编辑
 */
class BarablahClassUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahclass/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '开班ID',
            isRequired: false
        },{key: 'categoryId',
            desc: '班级分类ID',
            isRequired: true
        },{key: 'campusId',
            desc: '校区ID',
            isRequired: true
        },{key: 'teacherId',
            desc: '线上教师',
            isRequired: true
        },{key: 'courseCatId',
            desc: '课程分类',
            isRequired: true
        },{key: 'courseId',
            desc: '课程ID',
            isRequired: true
        },{key: 'englishTeacherId',
            desc: '线下教师',
            isRequired: false
        },{key: 'className',
            desc: '班级名称',
            isRequired: true
        },{key: 'monitor',
            desc: '班长',
            isRequired: false
        },{key: 'monitorPhoneNumber',
            desc: '班长电话',
            isRequired: false
        },{key: 'status',
            desc: '状态',
            isRequired: true
        },{key: 'deleted',
            desc: '课程分类',
            isRequired: false
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,categoryId,campusId,teacherId,courseCatId,courseId,englishTeacherId,className,monitor,monitorPhoneNumber,status,deleted) {
        this.addParams('id', id);
        this.addParams('categoryId', categoryId);
        this.addParams('campusId', campusId);
        this.addParams('teacherId', teacherId);
        this.addParams('courseCatId', courseCatId);
        this.addParams('courseId', courseId);
        this.addParams('englishTeacherId', englishTeacherId);
        this.addParams('className', className);
        this.addParams('monitor', monitor);
        this.addParams('monitorPhoneNumber', monitorPhoneNumber);
        this.addParams('status', status);
        this.addParams('deleted', deleted);
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

export default BarablahClassUpdateReq;
