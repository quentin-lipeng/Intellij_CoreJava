package com.CoreJava.GenericTest;

public class GenericTest<E , V> {
    public E  gen;
    public V gen1;
    public static void main(String[] args) {
        GenericTest<String, Integer> test = new GenericTest<>("hash",19);
        System.out.println(test);
        generic<GenericTest<String,Integer> > test1 = new generic<>(test);
        System.out.println(test1);
    }

    public GenericTest(E gen , V gen1){
        this.gen = gen;
        this.gen1 = gen1;
    }

    @Override
    public String toString() {
        return "com.CoreJava.GenericTest{" +
                "gen=" + gen +
                ", gen1=" + gen1 +
                '}';
    }
}
class generic<T> {
    T generic;
    public generic(T t){
        this.generic = t;
    }

    @Override
    public String toString() {
        return "generic{" +
                "generic=" + generic +
                '}';
    }
}
