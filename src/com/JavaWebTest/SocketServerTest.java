package com.JavaWebTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerTest {
    public static void main(String[] args) {
        ServerSocket ss = null;//服务器端
        Socket s = null;//客服端
        InputStream in = null;//输入流
        OutputStream out = null;//输出流
        //没有下面的对输入流和输出流进行包装，只能输入一个字符，就会马上从服务器端返回数据
        BufferedReader reader = null;//缓冲流
        PrintStream print=null;//输出流
        try {
            //服务端建立连接，端口号为10000
            ss= new ServerSocket(10000);
            //服务器端接受客户端的请求
            s=ss.accept();
            //从客户端获取输入流，用于读取用户端数据
            in=s.getInputStream();
            //想客服端写东西
            out=s.getOutputStream();
            reader=new BufferedReader(new InputStreamReader(in));
            print = new PrintStream(out);
			/*//这是只能输入一个字符，就会马上从服务器端返回数据的代码，没有经过输入流和输出流包装
			byte[] b = new byte[1024];
			int len = in.read(b);
			String clientStr = new String(b, 0, len);
			String outputStr=clientStr+",您好！";
			out.write(outputStr.getBytes());*/
            String clientStr;
            //使用循环，解决每当客服端程序输入一句话按返回键后服务端就结束的问题
            while (!(clientStr = reader.readLine()).equalsIgnoreCase("exit")) {
                String outputStr = clientStr+"您好！";
                print.println(outputStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                out.close();
                in.close();
                s.close();
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
