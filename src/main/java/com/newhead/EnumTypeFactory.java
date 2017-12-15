package com.newhead;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ling on 2017/4/27.
 */
public class EnumTypeFactory {
    private static HashMap<String, String> userstatusMap = new HashMap<String, String>();
    private static HashMap<String, String> memberLevelMap = new HashMap<String, String>();

    static {
        //用户状态呀
        userstatusMap.put("1","正常");
        userstatusMap.put("2","登录锁定");
        userstatusMap.put("3","禁用");

        new HashMap<String,String>();

        new HashMap<String,String>();


        new HashMap<String,String>();


        new HashMap<String,String>();
        new HashMap<String,String>();

        new HashMap<String,String>();

        new HashMap<String,String>();

        new HashMap<String,String>();

        new HashMap<String,String>();

    }
    private void test() {
        Map<String,HashMap> map = Maps.newHashMap();
        map.put("rudderUser.status",userstatusMap);
        map.put("memberLevel",memberLevelMap);

    }
}
