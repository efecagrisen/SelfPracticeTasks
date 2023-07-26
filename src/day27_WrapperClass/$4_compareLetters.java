package day27_WrapperClass;

public class $4_compareLetters {

    public static void main(String[] args) {

        //String word = "EfeCagriSEN"; // false
        String word = "EEfeCagriSEN"; // true

        int numOfUpperCase = 0;
        int numOFLowerCase = 0;

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if(Character.isLowerCase(each)){
                numOFLowerCase++;
            }else {
                numOfUpperCase++;
            }
        }
        boolean result = numOFLowerCase==numOfUpperCase;
        System.out.println(result);




    }



}
/*
4. Write program that returns true if the total number of upper case characters
are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */