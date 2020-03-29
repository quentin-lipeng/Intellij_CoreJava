package com.JavaWebTest.SocketTest;

public class SocketClientTest {
    public static void main(String[] args) {
        //需要服务器的正确的IP地址和端口号
        SocketClient client2=new SocketClient("192.168.1.107", 6768);
        client2.start();
    }
}