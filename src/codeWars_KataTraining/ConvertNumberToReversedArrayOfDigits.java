package codeWars_KataTraining;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {

    public static void main(String[] args) {

        int a = 456231589;
//        System.out.println(Arrays.toString(digitize(a)));

        String str = ""+a;
        int index = 0;
        int[] result = new int[str.length()];

        char[] strToCharArr = str.toCharArray();

        for(int i = strToCharArr.length-1; i>=0; i--){
            result[index]=strToCharArr[i];
            index++;
        }

//        for (int i = 0; i < result.length; i++) {
//            result[i] = Character.toString(result[i]);
//
//        }

        System.out.println(Character.toString(57));
        System.out.println(str);
        System.out.println(Arrays.toString(strToCharArr));
        System.out.println(Arrays.toString(result));



    }

//    public static int[] digitize(long n) {
//        // Code here
//        String str = ""+n;
//        int index = 0;
//        int[] result = new int[str.length()];
//
//        char[] strToCharArr = str.toCharArray();
//
//        for(int i = strToCharArr.length-1; i>=0; i--){
//            result[index]=strToCharArr[i];
//            index++;
//        }
//        return result;
//
//    }
}
