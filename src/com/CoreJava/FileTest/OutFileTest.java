package com.CoreJava.FileTest;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OutFileTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter out = new PrintWriter("com.CoreJava.Test.txt","UTF-8");
        int a = 1;
        out.print(a);
        String dir = System.getProperty("com.CoreJava.Test.txt");
        System.out.println(dir);
    }
}
