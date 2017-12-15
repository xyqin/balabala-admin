package com.newhead.rudderframework.tools.generator.v1.web.rpc;

import com.newhead.rudderframework.core.web.component.KeyValue;
import com.newhead.rudderframework.tools.generator.fields.BaseTemplateVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/5/1.
 */
public class RPCMainVo extends BaseTemplateVO {

    private List<KeyValue> items = new ArrayList<>();

    public List<KeyValue> getItems() {
        return items;
    }

    public void setItems(List<KeyValue> items) {
        this.items = items;
    }
}
