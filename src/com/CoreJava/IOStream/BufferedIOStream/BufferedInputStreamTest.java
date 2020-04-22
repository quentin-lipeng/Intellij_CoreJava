package com.CoreJava.IOStream.BufferedIOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src\\com\\CoreJava\\FileOnly\\file.txt");

            bufferedInputStream = new BufferedInputStream(inputStream);
            int read = bufferedInputStream.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}