import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年02月07日 10:47:10
 * 该文件系自动生成，手动修改可能会被替换
 * BarablahClassCreateReq
 * 接口地址：barablahclass/create
 * 请求方式：Post
 * 接口说明：新建
 */
class BarablahClassCreateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/barablahclass/create',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '开班ID',
            isRequired: true
        },{key: 'categoryId',
            desc: '班级分类ID',
            isRequired: true
        },{key: 'courseId',
            desc: '课程ID',
            isRequired: true
        },{key: 'teacherId',
            desc: '教师ID',
            isRequired: true
        },{key: 'campusId',
            desc: '校区ID',
            isRequired: true
        },{key: 'englishTeacherId',
            desc: '外教教师ID',
            isRequired: true
        },{key: 'className',
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
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,categoryId,courseId,teacherId,campusId,englishTeacherId,className,monitor,monitorPhoneNumber,status) {
        this.addParams('id', id);
        this.addParams('categoryId', categoryId);
        this.addParams('courseId', courseId);
        this.addParams('teacherId', teacherId);
        this.addParams('campusId', campusId);
        this.addParams('englishTeacherId', englishTeacherId);
        this.addParams('className', className);
        this.addParams('monitor', monitor);
        this.addParams('monitorPhoneNumber', monitorPhoneNumber);
        this.addParams('status', status);
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

export default BarablahClassCreateReq;
