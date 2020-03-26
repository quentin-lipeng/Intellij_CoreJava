package com.CoreJava.IOStream;

import java.io.*;

public class FileIOStreamTest {
    public static void main(String[] args) {
        File file = new File("src\\com.CoreJava.FileOnly\\File.txt");
        FileInputStream input = null;

        try {
            input = new FileInputStream(file);
            int length = input.available();
            /**
             * ps如果使用while(input.read()!=-1)
             * 则会因为多次调用read方法使得会读不到完整数据
             * 因为调用一次read方法就会让“读取文件指针向右移一位”
             */
//            while (true){
//                int temp = input.read();
//                if (temp != -1){
//                    System.out.println(temp);
//                }else {
//                    break;
//                }
//            }
//            int readData = 0;
//            while ( (readData=input.read()) != -1 ){
//                System.out.println(readData);
//            }

            byte[] byteData = new byte[length];
            int intData = 0;
            while ( (intData = input.read(byteData)) != -1){
                System.out.println(new String(byteData, 0 ,intData));
            }

//            byte[] bytes = new byte[input.available()];
//            input.read(bytes);
//            for (byte aByte : bytes) {
//                System.out.println("aByte = " + aByte);
//           }
//            if (input != null) {
//                input.close();
//            }
//
//            FileOutputStream fileOutputStream = new FileOutputStream(
//                    new File("src\\com.CoreJava.FileOnly\\File1.txt"));
//            fileOutputStream.write(bytes);
//            if (fileOutputStream != null) {
//                fileOutputStream.flush();
//                fileOutputStream.close();
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
