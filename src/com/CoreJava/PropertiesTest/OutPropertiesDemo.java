package com.CoreJava.PropertiesTest;


import java.io.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * 输出配置文件
 * 知识点：匿名流对象会自动close()
 */

public class OutPropertiesDemo {
    public static void main(String[] args) {
        //properties加载、存储主配置
        Properties properties = new Properties();
        //properties1加载存储另外的配置文件
        Properties properties1 = new Properties();
        File file = new File("src\\com\\CoreJava\\FileOfProperties\\main.properties");

        try{
            //加载主配置文件
            properties.load(new FileInputStream(file));
            if (!file.exists()) System.out.println(file.createNewFile()+"文件不存在 正在创建");

            Scanner scanner = new Scanner(System.in);
            System.out.print("请分别输入k/v");
            properties1.put(scanner.next(),scanner.next());
            properties1.forEach((k,v)-> System.out.println(k.toString()+"="+v));

            properties1.store(new FileOutputStream(properties.getProperty("path")),"Demo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
