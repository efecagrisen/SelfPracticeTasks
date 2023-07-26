package day24_ReturnMethods;

import java.util.Scanner;

public class $9_contains {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr1 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        int element = scan.nextInt();
        System.out.println(contains(arr1,element));

    }

    public static boolean contains(int[] arr1, int element){

        boolean check = false;

        for (int each : arr1) {
            if(each==element){
                check = true;
            }
        }
        return check;
    }
}
/*
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

    Ex:
        arr = {1,2,3,4,5,6,7};
        num = 10;

        contains(arr, num) ===> false
 */