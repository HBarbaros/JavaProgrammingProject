package day18_NestedLoop;

public class Shape {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
/*

Use a nested loop to print the following shape
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *

 */