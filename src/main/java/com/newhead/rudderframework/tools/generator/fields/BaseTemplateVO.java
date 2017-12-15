package com.newhead.rudderframework.tools.generator.fields;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ling on 2017/3/31.
 */
public class BaseTemplateVO {
    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        return sdf.format(new Date());
    }
}
