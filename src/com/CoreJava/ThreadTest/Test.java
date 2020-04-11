package com.CoreJava.ThreadTest;

public class Test {

    public static void main(String[] args) {
//        new Thread(new Test1()).start();
        Runnable runnable = ()->{
            int i = 20;
            while (i > 0) {
                System.out.println(Thread.currentThread().getName() + i);
                i--;
            }
        };

        new Thread().start();

        int i = 20;
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + i);
            i--;
        }
    }
}

class Test2 extends Thread{
    @Override
    public void run() {
        int i = 20;
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + i);
            i--;
        }
    }
}

class Test1 implements Runnable {
    @Override
    public void run() {
        int i = 20;
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + i);
            i--;
        }
    }
}
