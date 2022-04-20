package day12_Scanner;

public class GradeLevel {

    public static void main(String [] args){

        // solution 1
        byte number = 15;
        String result = "";

        switch (number){

            case 1: case 2: case 3: case 4: case 5:
                result = "Elementary school";
                break;
            case 6: case 7: case 8:
                result = "Middle school";
                break;
            case 9: case 10: case 11: case 12:
                result = "High school";
                break;
            case 13: case 14: case 15: case 16:
                result = "College";
                break;
            case 17: case 18:
                result = "Grad school";
                break;
            default:
                result = "Invalid grade level given";

        }
        System.out.println(result);

        System.out.println("------------------------------------------------------------------------------------");

        // solution 2

        if (number >= 1 && number <= 18){ // 1~18

            switch (number){

                case 6: case 7: case 8:
                    result = "Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;
                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;
                case 17: case 18:
                    result = "Grad school";
                    break;

                default: // 1 ~ 5
                    result = "Elementary school";

            }

        }else{
            result = "Invalid number level given";
        }

        System.out.println(result);






    }




}
