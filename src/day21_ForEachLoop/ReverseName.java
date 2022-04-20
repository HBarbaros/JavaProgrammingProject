package day21_ForEachLoop;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"Mehmet Ozdogan", "Fatma Ozdogan", "Barbaros Ozdogan", "Ukba Karaaslanoglu"};

        for (String each : names){ // each :"Mehmet Ozdogan", "Fatma Ozdogan", "Barbaros Ozdogan", "Ukba Karaaslanoglu"

            String reverse = "";

            for (int i = each.length() -1; i >= 0; i--) { // reverse the string
                reverse += each.charAt(i);
            }

            System.out.println(reverse);

        }


    }

}
