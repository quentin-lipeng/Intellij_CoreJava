package com.CoreJava.APITest;

public class ComparableTest implements Comparable{
    double dou = 5.0;

    @Override
    public int compareTo(Object o) {
        return Double.compare((Double)o,dou);
    }

    public static void main(String[] args) {
        ComparableTest test = new ComparableTest();
        System.out.println(test.compareTo(4.0));
    }

}
