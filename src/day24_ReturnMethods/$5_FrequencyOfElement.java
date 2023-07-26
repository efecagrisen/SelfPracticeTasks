package day24_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class $5_FrequencyOfElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr1 = new int[length];

        for (int i = 0; i < length; i++) {
            arr1[i] = scan.nextInt();
        }

        //System.out.println(Arrays.toString(arr1));
        System.out.println(frequencyOfElement(arr1, scan.nextInt()));




    }

    public static int frequencyOfElement(int[] list, int element){

        int frequency = 0;

        for (int i = 0; i < list.length; i++) {
            if(list[i] == element){
            frequency++;
            }
        }
        return frequency;
    }



}

/*
 5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */
