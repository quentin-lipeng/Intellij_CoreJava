package com.CoreJava.IOStream.ObjectIOStream;


import com.CoreJava.IOStream.Employee;

import java.io.*;
import java.util.Collections;

public class ObjectIOStream {
    public static void main(String[] args) {
//        try {
//            ObjectOutputStream objOut = new ObjectOutputStream(
//                    new FileOutputStream("src\\com.CoreJava.FileOnly\\object.dat"));
//
//            Employee harry = new Employee("Harry" , 5000, 1989, 10, 1);
//            Employee sara = new Employee("sara" , 7000, 1999, 9, 23);
//
//            objOut.writeObject(harry);
//            objOut.writeObject(sara);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            ObjectInputStream objIn = new ObjectInputStream(
                    new FileInputStream("src\\com.CoreJava.FileOnly\\Object.dat"));
            try {
                Employee s = (Employee)objIn.readObject();
                System.out.println(s);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
