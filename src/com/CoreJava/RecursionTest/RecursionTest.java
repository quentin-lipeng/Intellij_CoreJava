package com.CoreJava.RecursionTest;

public class RecursionTest {
    public static void main(String[] args) {
        countDown(5);

//        int arr[] = {3,5,1,3,6,7};
//        ergodic(arr,3);
    }

    public static void ergodic(int arr[],int fromIndex){
        if (fromIndex <arr.length){
            System.out.println(arr[fromIndex]);
            ++fromIndex;
            ergodic(arr,fromIndex);
        }
    }
    public static void countDown(int n) {
        if (n == 0 ) {
            System.out.println("blastOff");
        }else {
            System.out.println(n);
            countDown(n-1);
        }
    }
}
