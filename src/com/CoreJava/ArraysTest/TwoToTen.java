package com.CoreJava.ArraysTest;

public class TwoToTen {
    public static void main(String[] args) {
        int ten = 3 ;
        int[] two = new int[]{0,0,0,0};
        int temp = 0;
        int zero = 0;
        temp = ten / 2;
        zero = ten % 2;
        System.out.println("temp: "+temp);
        System.out.println("zero: "+zero);
        if ( zero == 0 ){
            two[3] = 0;
        }else {
            two[3] = zero;
            System.out.println("temp: "+temp);
            System.out.println("zero: "+zero);
            if (temp == 1){
                two[2] = temp;
            }else {
                temp = temp / 2;
                two[2] = 1;
            }
        }
        System.out.print("two: "+"00" + two[2] + two[3]);
    }
}
