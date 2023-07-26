package day24_ReturnMethods;

import java.util.Scanner;

public class $3_Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        System.out.println(reversed(word));


    }

    public static String reversed ( String word){

        String reversedWord= "";

        for (int i = word.length()-1; i >= 0; i--) {

            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }




}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */