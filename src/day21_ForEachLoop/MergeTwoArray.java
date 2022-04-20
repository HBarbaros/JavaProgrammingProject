package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Ayse"}; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; // 5

        String[] students = new String[group1.length + group2.length]; //  3+5=8

        int i = 0;

        for (String each : group1){ // "Ali", "Layan", "Ayse"
            students[i++] = each;
        }

        for (String each : group2){ // "Maria", "Aygun", "Duygu", "Suat", "Valeriy"
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("-------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char each : ch1){
            chars[j] = each;
            j++;
        }

        for (char each : ch2){
            chars[j] = each; // "chars[j++]" and "j++"  is same
            j++;
        }

        System.out.println(Arrays.toString(chars));


    }

}

/*
Task
1. write a program that can merge two arrays of integers
    Ex:
        arr1 = {1,2,3,4}
        arr2 = {5,6}

    output:
        arr3 = {1,2,3,4,5,6}
 */