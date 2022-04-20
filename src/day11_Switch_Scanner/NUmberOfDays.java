package day11_Switch_Scanner;

public class NUmberOfDays {

    public static void main(String[] args) {

        int year = 2000;
        int number = 6;
        String result = "";

        if(number >= 1 && number <= 12) {

            switch (number) {

                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    result = "31 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default: // 2 which is February
                    result = (year % 4 == 0)? "29 days" : "28 days";
                    break;

            }

        }else{
            result = "Invalid";
        }

        System.out.println(result);








    }


}
/*
logic we can use it in switch by declaring case blocks back to back



4. NumberOfDays
28 Days: 2
30 days: 4, 6, 9, 11
31 days: 1, 3, 5, 7, 8, 10, 12
If(1~12){
}else{
Invalid
}
 */