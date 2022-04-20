package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20 > 40; // false

        System.out.println("result1 = " + result1);

        boolean result2 = 200 > 40; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 300 >= 150; // true

        System.out.println("result3 = " + result3); // true

        boolean result4 = 100 >= 100; // true

        System.out.println("result4 = " + result4);

        boolean result5 = 300 >= 500; // false

        System.out.println("result5 = " + result5);

        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater, then it's eligible for the loan

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result6 = 100 < 120; // true
        System.out.println("result6 = " + result6);

        boolean result7 = 200 < 180; // false
        System.out.println("result7 = " + result7);

        int score = 75;
        boolean hadFailed = score <= 59; // false
        //                    75 <= 59

        System.out.println("hadFailed = " + hadFailed);

        boolean result8 = 45 <= 60; // true
        System.out.println("result8 = " + result8);

        System.out.println("---------------------------------------------------------");

        // equal ==

        int x = 180;
        int y = 200;

        boolean equal = x == y; // false
        //            100 == 200
        System.out.println("equal = " + equal);

        boolean result9 = "Barbaros " == "Good Guy"; // false
        System.out.println("result9 = " + result9);

        boolean result10 = 'A' == 'a';
        System.out.println("result10 = " + result10);

        boolean result11 = "Java" == "Java";
        System.out.println("result11 = " + result11);

        // "Hello World" == "hello world"

        System.out.println("-----------------------------------------------------------------");

        // not equal !=

        boolean result12 = 100 != 200; // true
        System.out.println("result12 = " + result12);

        boolean result13 = "Java" != "Break"; // true
        System.out.println("result13 = " + result13);

        boolean result14 = 300 != 300; // false
        System.out.println("result14 = " + result14);

        System.out.println("--------------------------------------------------------------------");




    }



}
