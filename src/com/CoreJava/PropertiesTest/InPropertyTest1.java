package com.CoreJava.PropertiesTest;

import java.io.*;
import java.util.Properties;

/**
 * 读取.properties文件
 */

public class InPropertyTest1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        File file = new File("src\\com\\CoreJava\\FileOfProperties\\main.properties");
        InputStream inputStream = null;

        try {
            //加载主配置文件
            properties.load(new FileInputStream(file));

            properties.load(new FileInputStream(properties.getProperty("path")));
//            properties.keySet().stream().forEach(System.out::println);
            properties.forEach( (k,v) -> {  System.out.println(k.toString()+"="+v); });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
