import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年03月18日 05:08:40
 * 该文件系自动生成，手动修改可能会被替换
 * RudderMenu2permissionUpdateReq
 * 接口地址：ruddermenu2permission/update
 * 请求方式：Post
 * 接口说明：编辑菜单权限关系
 */
class RudderMenu2permissionUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/ruddermenu2permission/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '资源ID',
            isRequired: true
        },{key: 'ruddermenuId',
            desc: '菜单',
            isRequired: true
        },{key: 'rudderpermissionId',
            desc: '资源编码',
            isRequired: true
        },{key: 'visible',
            desc: '是否显示',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,ruddermenuId,rudderpermissionId,visible) {
        this.addParams('id', id);
        this.addParams('ruddermenuId', ruddermenuId);
        this.addParams('rudderpermissionId', rudderpermissionId);
        this.addParams('visible', visible);
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

export default RudderMenu2permissionUpdateReq;
