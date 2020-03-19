package com.wells.maven.demo.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Description 该类主要是为了Maven打包引入依赖
 * Created by wells on 2020-03-18 22:19:20
 */

public class FastUtil {
    public static String objToJsonStr(Map<String, Object> map){
        return JSONObject.toJSONString(map);
    }
}
