package day24_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class $6_AddElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr1 = new int[length];

        for (int i = 0; i < length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(newArray( arr1, scan.nextInt() ) ) );

    }

    public static int[] newArray(int[] arr1, int element){

        int[] arr2 = new int[arr1.length+1];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = element;

        return arr2;
    }


}
/*
6. create a method named addElement that takes one integer array and one integer,
the method can add the Integer number after the last index of the integer array and returns the new array

    Ex:
        arr ={1,2,3};
        num = 4;

        addElement(arr, num) ==> {1,2,3,4}
 */
