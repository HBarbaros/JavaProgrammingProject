package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6}; // 7
        numbers = addElement(numbers,7);

        char[] chars = {'A', 'B', 'C', 'D'}; // 'E'
        chars = addElement(chars, 'E');

        String[] names = {"Mehmet", "Fatma", "Bilal", "Zeynep", "Barbaros"}; // "Ukba"
        names = addElement(names, "Ukba");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length +1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length +1];

        int i = 0;

        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length +1];

        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }


}
