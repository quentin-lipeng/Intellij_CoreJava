package com.CoreJava.PropertiesTest;

import java.io.*;
import java.util.Properties;

public class InPropertyTest1 {
    public static void main(String[] args) {

        File file = new File("src\\com\\CoreJava\\FileOnly\\information.properties");

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);

            properties.keySet().stream().forEach(System.out::println);
//            properties.forEach( (k,v) -> {  System.out.println(k.toString()+"="+v); });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
