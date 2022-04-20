package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args){

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; 160 is out of byte' range
        short weight = 160; // 160 is within the range of short

        // salary: 100000 €
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        // int asset = 3_333_333_333; // 3_333_333_333 os out of int' range
        long asset = 3_333_333_333L; // add uppercase 'L' or lowercase 'l'

        // tax: 0.26
        float tax = 0.26F; // add uppercase 'F' or lowercase 'f'

        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);

        double salaryAfterTax = 2.5;
        // double salaryAftertax = 2.5; // Must be unique

    }




}
