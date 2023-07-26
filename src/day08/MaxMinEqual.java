package day08;

public class MaxMinEqual {
    public static void main(String[] args) {

        int n1 = 600,
              n2 =601;

        if(n1-n2<0){
            System.out.println(n2 + " is maximum number");
        } else if (n1-n2>0) {
            System.out.println(n1 + " is maximum number");
        } else {
            System.out.println("Equal");
        }



        /*
        3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

         */
    }
}
