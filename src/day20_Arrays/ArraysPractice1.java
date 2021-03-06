package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        // store the elements: 10, 20, 50, 70
        int[] numbers = {10, 20, 50, 70}; // size: 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------------------------");

        // creat a variable that can contain 5 scores

        int[] scores = new int[5];


        scores[1] = 85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println( Arrays.toString(scores)); // [65, 85, 55, 75, 95]

        System.out.println("-------------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" }; // 0 ~ 11 (length-1)

        /*System.out.println(month[0]); // jan
        System.out.println(month[1]); // feb
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);
      */

        for (int i = 0; i < months.length; i++) { // i: represents the index numbers of array, starting from 0
            System.out.println( months[i] );
        }

        System.out.println("-------------------------------------------------------");

        for (int i = months.length-1; i >= 0; i--){ // i: represents the index numbers of array, starting from last index
            System.out.println( months[i] );
        }


    }

}
