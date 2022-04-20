package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        int [] reserved = new int[numbers.length];   // {80, 70, 60, 50, 40, 30, 20, 10} // to make sure that the array has enough capacity to contain all the elements of first array

        /*
        reserved[0] = numbers[6];
        reserved[1] = numbers[5];
        reserved[2] = numbers[4];
        reserved[3] = numbers[3];
        reserved[4] = numbers[2];
        reserved[5] = numbers[1];
        reserved[6] = numbers[0];
         */

        for (int i = numbers.length -1, j = 0; i >= 0; i--, j++){
            reserved[j] = numbers[i];
        }



        System.out.println(Arrays.toString(reserved));

    }

}
