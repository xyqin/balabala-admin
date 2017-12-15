package com.newhead.rudderframework.core.utils;

/**
 * Created by ling on 2017/3/30.
 */
public class StringUtils {
    public static String captureName(String name) {

        char[] cs=name.toCharArray();
        cs[0]-=32;
        return name.substring(0,1).toUpperCase()+name.substring(1);
        //return String.valueOf(name.substring(0,1).toUpperCase());
    }

    /**
     *
     * @param name
     * @return
     */
    public static String convertNameBy(String name) {
        String[] names = org.apache.commons.lang3.StringUtils.split(name,"_");
        StringBuffer ts = new StringBuffer();
        boolean isFirst = true;
        for(String n:names) {
            if (isFirst) {
                ts.append(n);
                isFirst =false;
            }
            else ts.append(captureName(n));
        }
        return ts.toString();
    }
}
