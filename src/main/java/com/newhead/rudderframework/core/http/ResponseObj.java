package com.newhead.rudderframework.core.http;

import lombok.Data;

/**
 * 携带包裹返回数据
 */
@Data
public class ResponseObj {
    //原生数据,服务端直接返回未经过加工的数据。
    private String originalData;

    //0,表示正确
    private int code = 0;

    private String errorMsg;


    public ResponseObj(String originalData) {
        this.originalData = originalData;
    }
}
