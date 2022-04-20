package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60}; // {10,20,30,40,50,60}
        numbers = removeElement(numbers,1); // {10,30,40,50,60}
        System.out.println(Arrays.toString(numbers));

    }

    //  removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) { // i: array's index number
            if (i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
}
