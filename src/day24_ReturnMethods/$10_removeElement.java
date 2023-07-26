package day24_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class $10_removeElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr1 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        int element = scan.nextInt();
        System.out.println(Arrays.toString(removeElement(arr1,element)));


    }

    public static int[] removeElement(int[] array, int element){

        int[] arr2 = new int[array.length-1];

        int index = 0;
        for (int each : array) {
            if (each==element) {
                continue;
            }
            arr2[index] = each;
            index++;
        }
        return arr2;

    }



}



/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
Ex:
    array = {10, 20, 30, 40, 50, 60}
    index = 2


    removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */