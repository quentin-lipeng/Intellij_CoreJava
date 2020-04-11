package com.CoreJava.ThreadTest;

/**
 * 通过继承runnable接口
 */
public class ThreadTest01 {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread1());
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程" + i);
        }

    }

    /**
     * 1. 通过new匿名对象实现
     */
    public void thread1() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("分支线程" + i);
                }
            }
        });
        thread1.start();
    }

    /**
     * 通过lambda实现线程
     */
    public void thread2() {

        new Thread(() -> System.out.println(Thread.currentThread().getName() + " ")).start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) System.out.println("分线程" + i);
        }).start();

//        Runnable runnable = () -> {
//            for (int i = 0; i < 30; i++)
//                System.out.println("分支线程"+i);
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
    }
}

//  2. 通过新建类完成接口实现
class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("分支线程" + i);
        }
    }
}
