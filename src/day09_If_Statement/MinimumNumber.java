package day09_If_Statement;

public class MinimumNumber {

    public static void main(String[] args) {

        int a = 39,
                b = 15;

        boolean minNum = (a < b);

        if (minNum){
            System.out.println(a + " is minimum number");
        }
        else{
            System.out.println(b + " is minimum number");
        }


    }

}
