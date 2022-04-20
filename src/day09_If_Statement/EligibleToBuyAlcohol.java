package day09_If_Statement;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        int age = 18;

        boolean buyAlcohol = (age > 20);

        if (buyAlcohol){
            System.out.println(age + " is eligible to buy Alcohol");
        }
        else{
            System.out.println(age + " is not eligible to buy Alcohol");
        }



    }
}
