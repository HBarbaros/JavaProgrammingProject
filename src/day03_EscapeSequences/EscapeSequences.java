package day03_EscapeSequences;
/*
escape sequences: MUST be given with double quote
    \n: start a new line
    \t: paragraph space(tab)
    \\: single backslash
    \": double quote
 */


public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");


        System.out.println("--------------------------------------");

        System.out.println("Hello Cydeo. \nHow are you today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("---------------------------------------");

        System.out.println("/ \\"); // in order to print one backslash we need to give two backward slash.

        System.out.println("---------------------------------------");

        System.out.println("My favorite TV show is \"Game Of Throne\""); // in order to print double quote, we need to use \"

    }

}
