package day09_If_Statement;

public class MaximumNumber {

    public static void main(String[] args) {

        int a = 20,
                b = 10;

        boolean maxNum = (a > b);

        if (maxNum){
            System.out.println(a + " is maximum number");
        }
        else{
            System.out.println(b + " is maximum number");
        }


    }
}
