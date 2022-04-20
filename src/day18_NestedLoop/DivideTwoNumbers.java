package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

         int a = 30; // a = 30-7=23 , a = 23-7=16 , a = 16-7=9 , a = 9-7=2
         int b = 7;

         int count = 0; // count: 1+1=2 , 2+1=3 , 3+1=4

         while (a >= b){
             a -= b;
             count++;

         }
        System.out.println(count + " with a remainder of " + a );



    }

}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

               a = 20;
                    b = 6;

                    a -= b // a = 14
                    a -= b // a = 8
                    a -= b // a = 2

                    while(a >= b)
                           a -= b;
                           count++;

 */