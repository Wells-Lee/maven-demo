package com.wells.maven.demo.execute;

import com.wells.maven.demo.util.FastUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 * Created by wells on 2020-03-18 22:19:44
 */

public class TestMaven {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hello", "java");
        map.put("deprecated", "Java");

        System.out.println(FastUtil.objToJsonStr(map));
    }
}
