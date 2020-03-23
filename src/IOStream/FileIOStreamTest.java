package IOStream;

import java.io.*;

public class FileIOStreamTest {
    public static void main(String[] args) {
        File file = new File("src\\FileOnly\\File.txt");

        try {
            FileInputStream input = new FileInputStream(file);

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
            int readData = 0;
            while ( (readData=input.read()) != -1 ){
                System.out.println(readData);
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
//                    new File("src\\FileOnly\\File1.txt"));
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
