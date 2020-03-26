package com.CoreJava.ReflectionTest;

import java.util.Random;

public class ClassTest {
    public static void main(String[] args) {
        Class cl1 = Random.class;
        Class cl2 = int.class;
        System.out.println(cl1);
        System.out.println(cl2);
    }
}
