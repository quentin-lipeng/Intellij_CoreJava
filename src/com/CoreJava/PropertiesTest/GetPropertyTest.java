package com.CoreJava.PropertiesTest;

/**
 * 使用getProperty方法获取系统属性
 */
public class GetPropertyTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.home"));
    }
}
