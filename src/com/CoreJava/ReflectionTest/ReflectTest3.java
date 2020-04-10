package com.CoreJava.ReflectionTest;

import com.CoreJava.ReflectionTest.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest3 {
    public static void main(String[] args) {
        Class personClass = Person.class;
        Person person = new Person();

        try {
            Method sayHello = personClass.getMethod("sayHello");
            sayHello.invoke(person);
            Method saySomething = personClass.getMethod("saySomething", String.class);
            saySomething.invoke(person,"stop");

            Method[] methods = personClass.getMethods();
            //会打印出所有方法 包括继承的方法
            for (Method method : methods) System.out.println(method);

            System.out.println(personClass.getName());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
