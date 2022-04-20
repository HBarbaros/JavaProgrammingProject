package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 100;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber; // not even number

        if(evenNumber){
            System.out.println(number + " is even number");
        }

        if(oddNumber){
            System.out.println(number + " is odd number");
        }

        System.out.println("----------------------------------------------");

        int n = 200;

        // positive
        if(n > 0){ // if the n is greater than zero, then it's positive
            System.out.println(n + " is positive");

        }
        // negative
        if(n < 0 ){// if n is less than zero, then it's negative
            System.out.println(n + " is negative");

        }
        // zero
        if(n == 0){
            System.out.println(n + " is zero");

        }





    }
}
/*
if statements:
Single if: can be used creating cindition for 1 possible output
 */