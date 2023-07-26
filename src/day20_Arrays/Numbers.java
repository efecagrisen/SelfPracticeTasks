package day20_Arrays;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {

        //1. create an array that has the numbers 1 to 100
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= i+1;
            /*
            i(0) --> index 0 will be i+1=1 (0+1)
            i(1) --> index 1 will be i+1=2 (1+1)
            i(2) --> index 2 will be i+1=3 (2+1)
            .
            .
            .
             */
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("---------------------");



        //2. create an array that has the numbers 100 to 1
        int[] numbers2 = new int[100];
        for (int i = 100; i >= 1; i--) {
            numbers2[100-i]= i;
            /*
            100-i(100)=0-->> index 0 will be i(100)
            100-i(99)=1 --> index 1 will be i(99)
            100-i(98)=2 --> index 2 will be i(98)
            .
            .
            */
        }

        System.out.println(Arrays.toString(numbers2));


    }
}
