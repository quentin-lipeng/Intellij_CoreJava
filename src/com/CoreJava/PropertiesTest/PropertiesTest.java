package com.CoreJava.PropertiesTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        try {
            /**建议配置文件扩展名写 .properties
             * 配置文件内容规范：
             * key=value
            */
            FileReader fr = new FileReader("src\\com.CoreJava.FileOnly\\information.properties");
            Properties pro = new Properties();
            pro.load(fr);
            System.out.println(pro.getProperty("name"));
            System.out.println(pro.getProperty("number"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
