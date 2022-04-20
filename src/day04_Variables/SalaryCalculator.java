package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args){
        //hourlyRate, weeklyHours

        int hourlyRate = 50;
        int weeklyRate = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyRate * numberOfWeeks;

        // System.out.println(salary);
        System.out.println("hourlyRate = €" + hourlyRate);
        System.out.println("weeklyRate = " + weeklyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = €" + salary);


    }




    }
