package day27_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class $3_RetrieveTask {
    public static void main(String[] args) {

        String word = "1q@QæAa|<2€dfi76;9*21fg";
        String letters = "";
        String digits = "";
        String specChars = "";


        for (char elements : word.toCharArray()) {
            if (Character.isLetter(elements)) {
                letters += elements;
            }else if(Character.isDigit(elements)){
                digits += elements;
            }else {
                specChars += elements;
            }
        }
        /* --> from task solutions
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }
         */
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specChars = " + specChars);
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
Ex:
    str = "Wooden Spoon!"

output:
    letters= "WoodenSpoon";
    Digits = "";
    specialChars = " !";
 */