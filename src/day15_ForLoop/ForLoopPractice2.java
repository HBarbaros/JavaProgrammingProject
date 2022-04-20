package day15_ForLoop;

public class ForLoopPractice2 {

    public static void main(String[] args) {

         /*
        A~Z
        a~z
        Z~A
        z~a
         */

        for (int i = 65; i <= 90; i++){ // 65 = A, 66 = B.... 90 = Z
            System.out.print((char)i + " ");
        }
        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++){ // A~Z
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--){ // Z~A
            System.out.print(i + " ");
        }
        System.out.println();

       for (char i = 'a'; i <= 'z'; i++ ){
           System.out.print(i + " ");
       }
        System.out.println();

       for (char i = 'z'; i >= 'a'; i--){
           System.out.print(i + " ");
       }
        System.out.println();

        System.out.println("------------------------------------------------------------");

        for (char i = 1; i <= 40000; i++){
            System.out.print(i + " ");
        }






    }
}
