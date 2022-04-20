package day11_Switch_Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 7;
        String result = "";

        switch (number){ // 0 ~ 9

            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
            default:
                result = "Invalid Number";
                break;



        }
        System.out.println(result);




    }


}
/*
2. NumberToWord (0~9)
 */