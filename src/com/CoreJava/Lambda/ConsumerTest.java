package com.CoreJava.Lambda;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        /**
         * s的类型是是泛型类型<String>
         */
        ( (Consumer<String>) System.out::println).accept("s ");
//        ( (Consumer<String>) (s) -> System.out.println(s) ).accept("s2");

//        Consumer<String> c2 = s ->System.out.println(s);
//        c2.accept(" . ");
//
//        new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        }.accept("s2");

//        Function<String , String> fun = String::toUpperCase;
    }
}
