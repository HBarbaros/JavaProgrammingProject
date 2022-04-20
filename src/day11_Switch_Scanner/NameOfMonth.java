package day11_Switch_Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 6;
        String result = "";

        switch (number){ // (1 ~ 12)

            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid Number";
                break;


        }
        System.out.println(result);

    }
}
           /*
           1. NameOfMonth  (1~12)
            */