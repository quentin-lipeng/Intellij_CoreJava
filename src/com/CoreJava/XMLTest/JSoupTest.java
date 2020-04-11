package com.CoreJava.XMLTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 使用JSoup
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        //获取document文档 根据xml文档获取
        String path = JSoupTest.class.getClassLoader().getResource("com/CoreJava/PreferenceTest.xml").getPath();
        //解析sml文件 加载到内存 获取dom树 document
        Document document = Jsoup.parse(new File(path), "UTF-8");
        //获取元素对象 element对象
        Elements entry = document.getElementsByTag("node");
        entry.forEach(System.out::println);

    }
}
