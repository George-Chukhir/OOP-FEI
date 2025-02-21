package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main { //class
    public static void main(String[] args) { //method

        int[] arr = new int[10]; //Static Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.printf("arr[%d] = %d\n", i, 2*arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
           // System.out.printf("arr[%d] = %d\n", i, 2*arr[i]);
                cout(arr[i]);
        }



    }

    public static void cout(int a){ //method
        System.out.println("arr[i] = " + a);
    }

}