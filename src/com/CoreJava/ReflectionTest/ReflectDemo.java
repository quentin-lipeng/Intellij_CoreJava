package com.CoreJava.ReflectionTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) {
        //用于加载配置文件
        Properties properties = new Properties();
        Class demoClass;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src\\com\\CoreJava\\ReflectionTest\\proper.properties");
            properties.load(inputStream);
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            demoClass = Class.forName(className);
            Object object = demoClass.newInstance();
            Method method = demoClass.getMethod(methodName);
            method.invoke(object);
        } catch (ClassNotFoundException | InstantiationException
                | NoSuchMethodException | InvocationTargetException
                | IllegalAccessException | IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
