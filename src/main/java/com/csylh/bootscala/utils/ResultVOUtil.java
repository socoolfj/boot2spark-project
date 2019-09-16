package com.csylh.bootscala.utils;

/**
 * Description: 返回工具类
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 21:38
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }


    public static ResultVO success() {
        return success(null);
    }


    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg("msg");
        return resultVO;
    }

}
