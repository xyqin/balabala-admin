package com.newhead.barablah.modules.barablahtextbookcategory.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahtextbookcategory.base.AbstractBarablahTextbookCategoryService;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.dao.BarablahTextbookCategoryMapper;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategory;
import com.newhead.barablah.modules.barablahtextbookcategory.base.repository.entity.BarablahTextbookCategoryExample;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.SimpleBarablahTextbookCategoryQueryListRequest;
import com.newhead.barablah.modules.barablahtextbookcategory.ext.protocol.SimpleBarablahTextbookCategoryQueryResponse;
import com.newhead.rudderframework.core.web.component.tree.*;
import com.newhead.rudderframework.modules.LabelValueItem;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 教材分类表服务
 * 2018年01月25日 02:58:38
 */
@Api(tags = "教材分类表", description = "相关的API")
@Service
public class SimpleBarablahTextbookCategoryService extends AbstractBarablahTextbookCategoryService {

    @Autowired
    private BarablahTextbookCategoryMapper mapper;

    @Override
    protected BarablahTextbookCategoryMapper getMapper() {
        return this.mapper;
    }

    @Autowired
    private BarablahClassMapper classMapper;

    @Autowired
    private BarablahCourseMapper courseMapper;

    @Override
    protected void saveOrUpdate(BarablahTextbookCategory entity) {

    }

    /**
     * 返回树结构对象
     *
     * @return
     */
    public Tree getTree(long classid) {
        TransitionTree tt = getTransitionTree1(classid);
        Tree tree = new Tree();
        tree.setLazy(false);
        tree.setRemoteApi(tt.getUrl());
        tree.setSelectButton(SelectButtonEnum.radio.name());

        Node rootNode = new Node();
        rootNode.setLevel(0);
        tree.setRootNode(rootNode);
        Map<Long,Node> nodeMapById = new HashMap<>();
        List<Node> tempNodes = new ArrayList<>();
        List<ExtNode> source = tt.getNdoes();
        for(ExtNode node:source) {
            nodeMapById.put(node.getId(),node.getNode());
            String parentId = node.getNode().getParentId();
            if (StringUtils.isEmpty(parentId) || parentId.equals("0")) {
                node.getNode().setLevel(1);
                rootNode.addChild(node.getNode());
                continue;
            }

            //如果该节点的上级节点已经出现，找到父节点，建立父子关系
            if (nodeMapById.containsKey(Long.valueOf(parentId))){
                Node parent = nodeMapById.get(Long.valueOf(parentId));
                parent.setLeaf(false);
                nodeAddLevel(parent);
                parent.addChild(node.getNode());
            }
            //如果没有出现，暂时放到临时的队列中
            else {
                tempNodes.add(node.getNode());
            }
        }

        //遍历未找到上级节点的列表数据，并重建父子节点关系
        for (Node node:tempNodes) {
            Node parent = nodeMapById.get(Long.valueOf(node.getParentId()));
            if (parent==null) {
                throw new RuntimeException("数据错误！");
            }
            parent.setLeaf(false);
            nodeAddLevel(parent);
            parent.addChild(node);
        }
        return tree;
    }

    protected TransitionTree getTransitionTree1(long calssid) {
        TransitionTree tree = new TransitionTree();
        tree.setUrl("/barablahtextbookcategory/gettree");

        SimpleBarablahTextbookCategoryQueryListRequest request = new SimpleBarablahTextbookCategoryQueryListRequest();

        List<SimpleBarablahTextbookCategoryQueryResponse> sources = queryList(calssid);

        for(SimpleBarablahTextbookCategoryQueryResponse response:sources) {
            ExtNode node = new ExtNode();
            node.setId(response.getId());
            node.getNode().setLeaf(true);
            node.getNode().setLabel(response.getCategoryName());
            node.getNode().setValue(String.valueOf(response.getId()));
            node.getNode().setSelected(false);
            if (response.getParentIdObject()!=null) {
                node.getNode().setParentId(response.getParentIdObject().getValue());
            } else {
                node.getNode().setParentId("0");
            }
            tree.getNdoes().add(node);
        }
        return tree;
    }


    /**
     * 查询
     * @param classid
     * @return list
     */
    public List<SimpleBarablahTextbookCategoryQueryResponse> queryList(long classid) {
        List<SimpleBarablahTextbookCategoryQueryResponse> results = new ArrayList<SimpleBarablahTextbookCategoryQueryResponse>();

        //构造查询对象
        BarablahTextbookCategoryExample example = new BarablahTextbookCategoryExample();
        BarablahTextbookCategoryExample.Criteria c = example.createCriteria();

        c.andDeletedEqualTo(false);
        BarablahClass classobj = classMapper.selectByPrimaryKey(classid);
        BarablahCourse courseObj = courseMapper.selectByPrimaryKey(classobj.getCourseId());

        c.andParentIdEqualTo(courseObj.getTextbookCategoryId());

        String ordersrc ="";
        ordersrc = "position desc,";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        convertEntityToResponse1(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse1(List<BarablahTextbookCategory> entitys,List<SimpleBarablahTextbookCategoryQueryResponse> results) {
        Map<Long,Long> parentIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> parentIdResultMap = Maps.newHashMap();

        for(BarablahTextbookCategory entity:entitys) {
            parentIdMap.put(entity.getId(),entity.getParentId());
        }
        BarablahTextbookCategoryExample parentIdExample = new BarablahTextbookCategoryExample();

        List<Long> parentIds = new ArrayList<>();
        parentIds.addAll(parentIdMap.values());
        if (parentIds.size()>0) {
            parentIdExample.createCriteria().andIdIn(parentIds);
        }
        List<BarablahTextbookCategory> parentIdList = getMapper().selectByExample(parentIdExample);
        for(BarablahTextbookCategory item:parentIdList) {
            LabelValueItem parentIdItem = new LabelValueItem();
            parentIdItem.setName("parentId");
            parentIdItem.setValue(String.valueOf(item.getId()));
            parentIdItem.setLabel(item.getCategoryName());
            parentIdResultMap.put(item.getId(),parentIdItem);
        }
        //第一组
        for(BarablahTextbookCategory entity:entitys) {
            SimpleBarablahTextbookCategoryQueryResponse response = new SimpleBarablahTextbookCategoryQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long parentId = parentIdMap.get(entity.getId());

            LabelValueItem parentIdlvi = null;
            if (parentId!=null && parentIdResultMap.get(parentId)!=null) {
                parentIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(parentIdResultMap.get(parentId),parentIdlvi);
            }
            response.setParentIdObject(parentIdlvi);
            results.add(response);
        }
    }

}
