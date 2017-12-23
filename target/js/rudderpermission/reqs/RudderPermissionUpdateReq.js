import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2017年12月23日 02:13:00
 * 该文件系自动生成，手动修改可能会被替换
 * RudderPermissionUpdateReq
 * 接口地址：rudderpermission/update
 * 请求方式：Post
 * 接口说明：编辑系统权限
 */
class RudderPermissionUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/rudderpermission/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '资源ID',
            isRequired: true
        },{key: 'rudderpermissionName',
            desc: '资源名称',
            isRequired: true
        },{key: 'rudderpermissionDesc',
            desc: '资源描述',
            isRequired: true
        },{key: 'url',
            desc: '资源地址',
            isRequired: true
        },{key: 'parentId',
            desc: '上级资源',
            isRequired: true
        },{key: 'visible',
            desc: '是否显示',
            isRequired: true
        },{key: 'orderNumber',
            desc: '排序号',
            isRequired: false
        },{key: 'leaf',
            desc: 'leaf',
            isRequired: false
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,rudderpermissionName,rudderpermissionDesc,url,parentId,visible,orderNumber,leaf) {
        this.addParams('id', id);
        this.addParams('rudderpermissionName', rudderpermissionName);
        this.addParams('rudderpermissionDesc', rudderpermissionDesc);
        this.addParams('url', url);
        this.addParams('parentId', parentId);
        this.addParams('visible', visible);
        this.addParams('orderNumber', orderNumber);
        this.addParams('leaf', leaf);
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

export default RudderPermissionUpdateReq;
