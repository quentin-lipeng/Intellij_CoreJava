package com.CoreJava.PropertiesTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Set;

/**
 * 存储首选项的文件
 * 通常配置文件存储到以.properties为后缀的文件中
 */
public class OutPropertyTest1 {
    public static Properties properties = null;
    public static void main(String[] args) {
        File file = null;

        properties = new Properties();
        properties.setProperty("name","lee");
        properties.setProperty("age","19");
        properties.setProperty("sex","male");
        file = new File("src\\com\\CoreJava\\FileOnly\\propertyTest.properties");

        OutputStream  outputStream = null;
            try {
                if (!file.exists()) file.createNewFile();
                outputStream = new FileOutputStream(file);
                properties.store(outputStream,"PropertyTest");
                Path path = Paths.get("src\\com\\CoreJava\\FileOnly\\propertyTest.properties");
                System.out.println(Files.readAllBytes(path).toString());

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                        outputStream.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
