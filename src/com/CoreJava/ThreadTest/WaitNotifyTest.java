package com.CoreJava.ThreadTest;

public class WaitNotifyTest {
    private static int flag;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            flag = 1;
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(flag++);
            }
        });
        thread.setDaemon(true);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread1.start();
        thread.start();

        if (flag > 10 && flag < 30) {
            try {
                thread1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (flag > 30) {
            thread1.notify();
        }


    }
}
