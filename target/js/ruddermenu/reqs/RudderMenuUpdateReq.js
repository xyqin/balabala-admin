import BaseRobotReq from "../../../base/reqs/BaseRobotReq";

/**
 * 生成时间：2018年01月26日 11:13:55
 * 该文件系自动生成，手动修改可能会被替换
 * RudderMenuUpdateReq
 * 接口地址：ruddermenu/update
 * 请求方式：Post
 * 接口说明：编辑菜单
 */
class RudderMenuUpdateReq extends BaseRobotReq {
    constructor(options, params, successFn, errorFn) {
        super(options, params, successFn, errorFn);
        // 配置当前接口请求的，包含url、请求类型、请求内容类型等
        // 约定url使用相对地址，都以斜杠开头
        this._defaultOptions = {
            url: '/ruddermenu/update',
            type: 'Post',
            contentType: 'application/json'
        };
        this._paramsDescriptor = [{key: 'id',
            desc: '菜单ID',
            isRequired: true
        },{key: 'ruddermenuName',
            desc: '菜单名称',
            isRequired: true
        },{key: 'ruddermenuDesc',
            desc: '菜单描述',
            isRequired: true
        },{key: 'url',
            desc: '菜单链接',
            isRequired: true
        },{key: 'visible',
            desc: '是否显示',
            isRequired: true
        },{key: 'orderNumber',
            desc: '排序号',
            isRequired: false
        },{key: 'parentId',
            desc: '上级菜单',
            isRequired: true
        },{key: 'resourceId',
            desc: '上级资源',
            isRequired: true
        }];        this.curd = 'd';
    }

    /**
     * 添加接口请求参数，适用于参数较少
     * @param id 活动编号
     */
    setSimpleParams(id,ruddermenuName,ruddermenuDesc,url,visible,orderNumber,parentId,resourceId) {
        this.addParams('id', id);
        this.addParams('ruddermenuName', ruddermenuName);
        this.addParams('ruddermenuDesc', ruddermenuDesc);
        this.addParams('url', url);
        this.addParams('visible', visible);
        this.addParams('orderNumber', orderNumber);
        this.addParams('parentId', parentId);
        this.addParams('resourceId', resourceId);
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

export default RudderMenuUpdateReq;
