package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'R', 'T', 'P', 'C'};
        Arrays.sort(charArray);

        System.out.println("-----------------------------------------------------------------");

        // sum of 10, 20
        int sum1 = sumOfNumbers(10,20);

        // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10,20,30);

        // sum of 10, 20,30, 40
        int sum3 = sumOfNumbers(10,20,30,40);

        // sum of 10.5, 30.5
        double sum4 = sumOfNumber(10.5, 30.5);

        // sum of 2.5, 5.5, 4.5
        double sum5 = sumOfNumbers(2.5, 5.5, 4.5);

        // sum of 10.5, 11.5, 5.5, 4.5
        double sum6 = sumOfNumbers(10.5, 11.5, 5.5, 4.5);




    }

    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static double sumOfNumber(double num1, double num2){
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4; // same with other
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }


}

