package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        int element = 5;

        array = addInteger(array, element); // {1,2,3,4,5}
        System.out.println(Arrays.toString(array));

        System.out.println();

        double[] array1 = {1.2, 2.5, 4.5, 5.6};
        double element1 = 5.5;

        array1 = addDouble(array1, element1);
        System.out.println(Arrays.toString(array1));

        System.out.println();

        String[] names = {"Mehmet", "Fatma",  "Zeynep", "Bilal", "Barbaros"};
        names = addString(names, "Ukba");
        System.out.println(Arrays.toString(names));

        System.out.println();

        char[] ch = {'A', 'B', 'C', 'D', 'E'};
        ch = addChar(ch, 'F');
        System.out.println(Arrays.toString(ch));



    }

    public static int[] addInteger(int[] array, int element){

        int[] result = new int[array.length +1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;

    }

    public static double[] addDouble(double[] array, double element){

        double[] result = new double[array.length +1];

        int i = 0;

        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static String[] addString(String[] names, String element){

        String[] result = new String[names.length + 1];

        int i = 0;
        for (String each : names) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static char[] addChar(char[] array, char element){

        char[] result = new char[array.length +1];

        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }



}

/*
Task2:
    1. create a return method called addInteger that can add an Integer  after the  last index of an integer array

            {1,2,3,4}, 5        new array ==> {1,2,3,4,5}

    2. create a return method called addDouble that can add a double after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array


 */