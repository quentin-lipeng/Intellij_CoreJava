package com.CoreJava.ThreadTest;

public class ThreadTest3 extends Thread{

    public static void main(String[] args) {
//        Thread thread = Thread.currentThread();
//        //获取线程名 主线程main
//        System.out.println("name= "+thread.getName()+" id= "+thread.getId()+" priority= "+thread.getPriority());
//        //仅仅运行run方法不开启新线程
//        System.out.println("线程状态"+thread.getState());
//        System.out.println(thread.getThreadGroup());
        System.out.println(System.currentTimeMillis()/1000);


    }
}
