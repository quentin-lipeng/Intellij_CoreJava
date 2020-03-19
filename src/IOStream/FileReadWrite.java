package IOStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("C:\\Users\\16670\\Desktop\\Test.txt");//要读取的文件
            fw = new FileWriter("C:\\Users\\16670\\Desktop\\TestOut.txt");//要复制的目的文件
            int i = 0;
            while ((i = fr.read()) != -1) {
                fw.write(i);
                System.out.print((char) i);//将得到的ASCII码值转换成字符型
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}