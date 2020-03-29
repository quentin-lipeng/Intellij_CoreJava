package com.CoreJava.ReflectionTest;

import java.lang.reflect.Field;

public class ClassTest {
    public static void main(String[] args) {
        Class personClass = Person.class;

        //获取public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) System.out.println(field);
        Person p = new Person();



        try {
            Field field= personClass.getField("sex");
            field.set(p,"qun");
            Object name = field.get(p);
            System.out.println(p);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //获取所有成员变量
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field field : fields1) System.out.println(field);

        try {
            Field field2 = personClass.getDeclaredField("name");
            //忽略安全检查 就可以访问非public修饰的成员变量
            field2.setAccessible(true);
            System.out.println(field2.get(p));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
