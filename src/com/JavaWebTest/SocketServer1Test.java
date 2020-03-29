package com.JavaWebTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer1Test {
    private List<Socket> sockets = new ArrayList<Socket>();

    public static void main(String[] args) {
        new SocketServer1Test().startServer();
    }

    public void startServer() {
        ServerSocket ss = null;// 服务器端
        try {
            // 服务端建立连接，端口号为10000
            ss = new ServerSocket(10000);
            while (true) {
                // 服务器端接受客户端的请求
                Socket s = ss.accept();// ServerSocket.accept此方法在连接接入之前一直阻塞。
                sockets.add(s);
                // 启动一个线程
                new Start(s).start();
                // new Server2().new Start(s).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Start extends Thread {
        Socket s = null;// 客服端
        InputStream in = null;// 输入流
        // 没有下面的对输入流和输出流进行包装，只能输入一个字符，就会马上从服务器端返回数据
        BufferedReader reader = null;// 缓冲流

        public Start(Socket _socket) {
            this.s = _socket;
        }

        @Override
        public void run() {

            try {
                // 从客户端获取输入流，用于读取用户端数据
                in = s.getInputStream();
                // 想客服端写东西
                reader = new BufferedReader(new InputStreamReader(in));
                // 使用循环，解决每当客服端程序输入一句话按返回键后服务端就结束的问题
                // 客户端可以不断的输入，知道接收到exit服务器不在回复
                out: while (true) {
                    String clientStr = reader.readLine();
                    String outputStr = clientStr + "您好！";
                    for (Socket socket : sockets) {
                        if (clientStr.equalsIgnoreCase("exit")) {
                            System.out.println(sockets.size() + "——eee——" + s
                                    + "次用户已被删除");
                            sockets.remove(s);
                            break out;
                        }
                        System.out
                                .println(sockets.size() + "--------" + socket);
                        OutputStream out = socket.getOutputStream();// 输出流
                        PrintStream print = new PrintStream(out);// 输出流
                        print.println(outputStr);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}