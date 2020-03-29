package com.CoreJava.ReflectionTest;

import java.lang.reflect.Field;

public class ClassTest {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Person p = new Person();

        //获取public修饰的成员变量
        Field[] fields = personClass.getFields();
        System.out.println("所有public成员变量--->");
        for (Field field : fields) System.out.println(field);

        try {
            //当前只能设置public成员变量
            Field field= personClass.getField("sex");
            field.set(p,"male");
            System.out.println("打印Person对象--->");
            System.out.println(p);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //获取所有成员变量(包括非public)
        Field[] fields1 = personClass.getDeclaredFields();
        System.out.println("所有成员变量--->");
        for (Field field : fields1) System.out.println(field);

        try {
            Field field2 = personClass.getDeclaredField("name");
            //忽略安全检查 就可以访问非public修饰的成员变量
            field2.setAccessible(true);
            field2.set(p ,"qun" );
            System.out.println("获取私有成员变量--->");
            System.out.println(field2.get(p));
            System.out.println(p);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
