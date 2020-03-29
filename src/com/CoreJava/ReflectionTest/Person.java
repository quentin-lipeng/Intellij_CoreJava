package com.CoreJava.ReflectionTest;

public class Person {
    private String name ;
    public  String sex;

    public Person() {}

    public Person(String sex){
        this.sex = sex;
    }

    public void sayHello(){
        System.out.println("hello");
    }
    public  void saySomething(String something){
        System.out.println("i say " + something);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
