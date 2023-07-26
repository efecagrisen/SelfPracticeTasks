package day27_WrapperClass;

import java.util.Arrays;

public class $2_SwapTask {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50,60};
        double[] arr2 = {10.5,20.5,30.5,40.5,50.5,60.5};
        char[] arr3 = {'£','#','1','½','{','2',':'};
        String[] arr4 = {"sen", "cagri", "efe"};

        System.out.println(Arrays.toString(swapElements(arr1,0,5)));
        System.out.println(Arrays.toString(swapElements(arr2,0,1)));
        System.out.println(Arrays.toString(swapElements(arr3,2,5)));
        System.out.println(Arrays.toString(swapElements(arr4,0,2)));

    }


    public static int[] swapElements (int[] array, int index1, int index2){

        int[] newArray = new int[array.length];

        int element1 = array[index1];
        int element2 = array[index2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            newArray[index1] = element2;
            newArray[index2] = element1;
        }

        return newArray;
    }

    public static double[] swapElements (double[] array, int index1, int index2){

        double[] newArray = new double[array.length];

        double element1 = array[index1];
        double element2 = array[index2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            newArray[index1] = element2;
            newArray[index2] = element1;
        }

        return newArray;
    }

    public static char[] swapElements (char[] array, int index1, int index2){

        char[] newArray = new char[array.length];

        char element1 = array[index1];
        char element2 = array[index2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            newArray[index1] = element2;
            newArray[index2] = element1;
        }

        return newArray;
    }

    public static String[] swapElements (String[] array, int index1, int index2){

        String[] newArray = new String[array.length];

        String element1 = array[index1];
        String element2 = array[index2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            newArray[index1] = element2;
            newArray[index2] = element1;
        }

        return newArray;
    }

}
/*
Swap Task:
2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
the method swaps the element at index i with the element at index j, and returns the new array
Ex:
    arr = {10, 20, 30, 40, 50};

    swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

2.2 Create the same function for double array, char array and string array
 */