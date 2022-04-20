package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        nameOfMonths(50);

    }

    public static void nameOfMonths(int number) {

        if (number < 1 || number > 12) { // if number is invalid
            System.out.println("Invalid");
            return; // exits nameOfMonth method
        }


        String name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";


        System.out.println("Month name = " + name);


    }

}