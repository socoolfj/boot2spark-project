package com.csylh.bootscala.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: http请求返回的对象
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 21:36
 */
@Data
public class ResultVO<T> implements Serializable {

    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;


    public ResultVO() {
    }

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
