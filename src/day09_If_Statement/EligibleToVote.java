package day09_If_Statement;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 23;

        boolean isEligible = (age > 18);

        if (isEligible){
            System.out.println(age + " is eligible to vote");
        }
        else{
            System.out.println(age + " is not eligible to vote");
        }
    }


}
