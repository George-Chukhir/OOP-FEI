package org.example;
import org.w3c.dom.ls.LSOutput;
import java.io.PrintWriter;

public class Main { //class
    public static void main(String[] args) { //method

        int[] arr = new int[10]; //Static Array
        fillAndPrintArray(arr);

        String[] cars = {"Volvo", "BMW", "Ford"};
        arrayOfCars(cars);
    }


    public static void fillAndPrintArray(int[] array){ //method
        //filling
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //printing
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Arr[%d] = %d\n", i, array[i]);
        }
    }

    public static void arrayOfCars(String[] array){ //method
        int index = 1;
        for (String i : array) {
            System.out.printf("Car %d is: %s\n", index,  i);
            index++;
        }
    }

}