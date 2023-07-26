package day27_WrapperClass;

import java.util.Arrays;

public class $1_InsertTask {
    public static void main(String[] args) {
        // all methods were tried and they worked
        char[] arr1 = {'a','H','@','*'};

        System.out.println(Arrays.toString(insertElements(arr1,1,'+')));

    }

    public static int[] insertElements (int[] array ,int index, int element){

        int[] newArray = new int[array.length+1];


        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;

        for (int i = index; i < array.length; i++) {
            newArray[i+1]=array[i];
        }

        return  newArray;
        }

    public static double[] insertElements (double[] array ,int index, double element){

        double[] newArray = new double[array.length+1];


        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;

        for (int i = index; i < array.length; i++) {
            newArray[i+1]=array[i];
        }

        return  newArray;
    }

    public static String[] insertElements (String[] array ,int index, String element){

        String[] newArray = new String[array.length+1];


        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;

        for (int i = index; i < array.length; i++) {
            newArray[i+1]=array[i];
        }

        return  newArray;
    }

    public static char[] insertElements (char[] array ,int index, char element){

        char[] newArray = new char[array.length+1];


        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;

        for (int i = index; i < array.length; i++) {
            newArray[i+1]=array[i];
        }

        return  newArray;
    }
    
}
    
    
/*
1. Insert Task:
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
Ex:
    arr = {10, 20, 30, 40, 50};

    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


1.2 Create the same function for double array, char array and string array
 */
