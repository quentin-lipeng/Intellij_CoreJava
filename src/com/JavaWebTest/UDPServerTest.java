package com.JavaWebTest;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * udp 是面向无连接，协议不可靠，是以数据包方式进行发送
 * @classDesc: 功能描述(socket udp服务器端)
 * @author: ChauncyWang
 * @version: 1.0
 */
public class UDPServerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("udp 服务器端启动。。。");
        //创建一个端口号
        int port=8080;
        DatagramSocket ds = new DatagramSocket(port);
        byte[] byteArr= new byte[1024];
        DatagramPacket dp = new DatagramPacket(byteArr, byteArr.length);
        //等待客户端进行发送，如果客户端不发送内容，一直等待。阻塞的效果
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println("客户端发送的数据是："+ str);
        ds.close();
    }
}