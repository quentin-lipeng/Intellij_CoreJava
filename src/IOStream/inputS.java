package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 数据输入流测试
 */
public class inputS {
    //程序的主方法
    public static void main(String [] args) throws IOException{
        int i=0;
        FileInputStream in=null;
        try {
            in=new FileInputStream("C:\\Users\\16670\\Desktop\\Test.txt");//从文件外读数据
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("找不到文件位置");
            System.exit(-1);
        }
        try {
            int num=0;//用于字节个数的计数
            while((i=in.read())!=-1){
                System.out.print((char)i);//将得到的ASCII码值转换成字符型
                num++;
            }
            in.close();
            System.out.println("传输字节个数："+num);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("读取文件错误");
        }

    }

}