package com.CoreJava.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * 输入输出流测试
 */
public class OutPutStream {
    //程序主方法
    public static void main(String[] args) {
        int i = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //实例化FileInputStream，FileOutputStream对象
            in = new FileInputStream("C:\\Users\\16670\\Desktop\\com.CoreJava.Test.txt");
            out = new FileOutputStream("C:\\Users\\16670\\Desktop\\TestOut.txt");
            while ((i = in.read()) != -1) {
                out.write(i);
                System.out.print((char) i);
            }
            in.close();
            out.close();
            System.out.println("文件已复制");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("文件复制错误");
            System.exit(-1);
        }


    }
}
