package day25_MethodOverloading;

import java.util.Arrays;

public class $1_merge {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        double[] arr3 = {1.1,2.1,3.1};
        double[] arr4 = {1.55,2.66,3.88};

        char[] arr5 = {'a','b','c'};
        char[] arr6 = {'A','@','&'};

        String[] arr7 = {"Efe", "Cagri", "Sen"};
        String[] arr8 = {"Umran", "Sezai", "Ensar"};



        System.out.println(Arrays.toString(merge(arr1,arr2)));

        System.out.println(Arrays.toString(merge(arr3,arr4)));

        System.out.println(Arrays.toString(merge(arr5,arr6)));

        System.out.println(Arrays.toString(merge(arr7,arr8)));


    }


    public static int[] merge(int[] arr1, int[] arr2){

        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int elements1 : arr1) {
            mergedArray[index] = elements1;
            index++;
        }
        for (int elements2 : arr2) {
            mergedArray[index] = elements2;
            index++;
        }
        return mergedArray;
        }

    public static double[] merge(double[] arr1, double[] arr2){

        double[] mergedArray = new double[arr1.length + arr2.length];

        int index = 0;
        for (double elements1 : arr1) {
            mergedArray[index] = elements1;
            index++;
        }
        for (double elements2 : arr2) {
            mergedArray[index] = elements2;
            index++;
        }
        return mergedArray;
    }

    public static char[] merge(char[] arr1, char[] arr2){

        char[] mergedArray = new char[arr1.length + arr2.length];

        int index = 0;
        for (char elements1 : arr1) {
            mergedArray[index] = elements1;
            index++;
        }
        for (char elements2 : arr2) {
            mergedArray[index] = elements2;
            index++;
        }
        return mergedArray;
    }

    public static String[] merge(String[] arr1, String[] arr2){

        String[] mergedArray = new String[arr1.length + arr2.length];

        int index = 0;
        for (String elements1 : arr1) {
            mergedArray[index] = elements1;
            index++;
        }
        for (String elements2 : arr2) {
            mergedArray[index] = elements2;
            index++;
        }
        return mergedArray;
    }


}
/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */