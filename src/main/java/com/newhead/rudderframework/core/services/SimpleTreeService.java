package com.newhead.rudderframework.core.services;

import com.newhead.rudderframework.core.web.component.tree.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SimpleTreeService extends BaseService {
    protected abstract TransitionTree getTransitionTree();
    /**
     * 返回树结构对象
     *
     * @return
     */
    public Tree getTree() {
        TransitionTree tt = getTransitionTree();
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

    /**
     * node添加层级
     * @param node
     */
    protected void nodeAddLevel(Node node) {
        node.setLevel(node.getLevel()+1);
        if (node.getChildren()!=null && node.getChildren().size()>0) {
            for (Node child:node.getChildren()) {
                nodeAddLevel(child);
            }
        }
    }
}
