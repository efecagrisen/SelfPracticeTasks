package day25_MethodOverloading;

import java.util.Scanner;

public class $2_maxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the integer array: ");
        int length = scan.nextInt();
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
            }

        System.out.println("Enter the length of the double array: ");
        length = scan.nextInt();
        double[] doubleArray = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArray[i] = scan.nextDouble();
            }

        System.out.println("Enter the length of the long array: ");
        length = scan.nextInt();
        long[] longArray = new long[length];
        for (int i = 0; i < length; i++) {
            longArray[i] = scan.nextLong();
            }

        System.out.println("Enter the length of the short array: ");
        length = scan.nextInt();
        short[] shortArray = new short[length];
        for (int i = 0; i < length; i++) {
            shortArray[i] = scan.nextShort();
            }

        System.out.println("Enter the length of the float array: ");
        length = scan.nextInt();
        float[] floatArray = new float[length];
        for (int i = 0; i < length; i++) {
            floatArray[i] = scan.nextFloat();
            }

        System.out.println("Enter the length of the byte array: ");
        length = scan.nextInt();
        byte[] byteArray = new byte[length];
        for (int i = 0; i < length; i++) {
            byteArray[i] = scan.nextByte();
            }

        System.out.println(maxNumber(intArray));
        System.out.println("--------------------");
        System.out.println(maxNumber(doubleArray));
        System.out.println("--------------------");
        System.out.println(maxNumber(longArray));
        System.out.println("--------------------");
        System.out.println(maxNumber(shortArray));
        System.out.println("--------------------");
        System.out.println(maxNumber(floatArray));
        System.out.println("--------------------");
        System.out.println(maxNumber(byteArray));

    }

    public static int maxNumber (int[] array){

        int max = Integer.MIN_VALUE;

        for (int each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    public static double maxNumber (double[] array){

        double max = Double.MIN_VALUE;

        for (double each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    public static long maxNumber (long[] array){

        long max = Long.MIN_VALUE;

        for (long each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    public static short maxNumber (short[] array){

        short max = Short.MIN_VALUE;

        for (short each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    public static float maxNumber (float[] array){

        float max = Float.MIN_VALUE;

        for (float each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    public static byte maxNumber (byte[] array){

        byte max = Byte.MIN_VALUE;

        for (byte each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */