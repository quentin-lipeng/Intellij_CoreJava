package com.CoreJava.SystemTest;

import java.io.IOException;
import java.io.PrintStream;

public class PrintTest {
    public static void main(String[] args) {

        PrintStream printStream = null;
        try {
            printStream = new PrintStream("src\\com\\CoreJava\\FileOnly\\file.txt");
            printStream.print(true);

            System.out.println(printStream.checkError());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null) {
                printStream.close();
            }
        }
    }
}
