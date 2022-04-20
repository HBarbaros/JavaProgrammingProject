package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        System.out.println("-------------------------------------");

        double[] array1 = {1.4, 1.5, 1.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique1 = uniqueElements(array1);
        System.out.println(Arrays.toString(unique1));


    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {

        int[] result = {}; // new int[0]

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency is one, then the elements is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {

        double[] result = {}; // new double[0]

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){ // if the frequency is one, then the elements is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){

        char[] result = {}; // new char[0]
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElement(String[] array){

        String[] result = {}; // new String[0]
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }




}
