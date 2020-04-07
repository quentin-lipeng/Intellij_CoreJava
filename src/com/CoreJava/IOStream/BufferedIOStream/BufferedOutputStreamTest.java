package com.CoreJava.IOStream.BufferedIOStream;

import java.io.*;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedOutputStream b = new BufferedOutputStream(
                new FileOutputStream("src\\com\\CoreJava\\FileOnly\\file.txt"));
    }
}
