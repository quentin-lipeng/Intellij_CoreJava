package com.CoreJava.ReflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest2 {
    public static void main(String[] args) {
        Class personClass = Person.class;
        try {
            Constructor<Person> constructor = personClass.getConstructor(String.class);
            System.out.println(constructor);
            //创建对象（实例）
            System.out.println(constructor.newInstance("male"));
            System.out.println(personClass.newInstance());
        } catch (NoSuchMethodException | IllegalAccessException |
                InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
