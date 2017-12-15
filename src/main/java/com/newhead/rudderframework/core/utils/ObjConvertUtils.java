package com.newhead.rudderframework.core.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * Created by ling on 2017/3/23.
 */
public class ObjConvertUtils {

    /**
     *
     * @param resources
     * @param targets
     */
    public static void copyProperties(List resources, List targets,Object c) {
        for(int i=0;i<resources.size();i++) {
            try {
                Object target = c.getClass().newInstance();
                BeanUtils.copyProperties(resources.get(i),target);
                targets.add(target);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
