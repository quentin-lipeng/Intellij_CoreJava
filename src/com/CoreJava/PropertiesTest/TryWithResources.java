package com.CoreJava.PropertiesTest;

import java.io.*;

/**
 * Try With Resources语句
 * 实现了AutoCloseable接口
 * 在try()中的流对象会自动关闭
 */

public class TryWithResources {
    public static void main(String[] args) {
        File file = new File("src\\com\\CoreJava\\FileOnly\\file.txt");


        try (InputStream inputStream = new FileInputStream(file)){

            byte[] bytes = new byte[inputStream.available()];

            System.out.println(inputStream.read(bytes));
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
