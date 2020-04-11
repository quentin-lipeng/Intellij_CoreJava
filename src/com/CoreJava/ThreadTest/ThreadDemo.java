package com.CoreJava.ThreadTest;

import com.CoreJava.ThreadTest.AccountTest.Account;

/**
 * 测试synchronized代码同步机制
 */

public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account(1000, "Lee");
        Account account1 = new Account(1000, "Qun");
        System.out.println(account);
        System.out.println(account1);

        Thread thread = new Thread1(account);
        Thread thread1 = new Thread1(account);
        thread.setName("t");
        thread1.setName("t1");

        new Thread(() -> {
            account1.takeM(200);
        }, "t2").start();

        thread.start();
        thread1.start();

    }
}

class Thread1 extends Thread {
    private Account account;

    @Override
    public void run() {
        account.takeM(200);
    }

    public Thread1(Account account) {
        this.account = account;
    }

    public Thread1() {
    }
}

