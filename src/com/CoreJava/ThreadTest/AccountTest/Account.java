package com.CoreJava.ThreadTest.AccountTest;

public class Account {
    private int num;
    private String accName;

    public Account(int num, String accName) {
        this.num = num;
        this.accName = accName;
    }

    public Account() {
    }

    public void takeM(int needs) {
        synchronized (this) {
            num = num - needs;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 账户名称 " + getAccName() + " = " + getNum());
        }
    }

    public int getNum() {
        return num;
    }

    public String getAccName() {
        return accName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "num=" + num +
                ", accName='" + accName + '\'' +
                '}';
    }
}
