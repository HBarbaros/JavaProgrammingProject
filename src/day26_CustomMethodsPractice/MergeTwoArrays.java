package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        int[] array3 = merge(array1,array2);

        System.out.println(Arrays.toString(array3));

    }

    public static int[] merge(int[] array, int[] array2){

        int[] result = new int[array.length + array2.length];

        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }

        for (int each : array2) {
            result[i++] = each;
        }

        return result;

    }


}
