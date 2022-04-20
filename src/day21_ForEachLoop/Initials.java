package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] name = {"Mehmet Ozdogan", "Fatma Ozdogan", "Barbaros Ozdogan", "Ukba Karaaslanoglu"};

        for (String each : name){
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") +1); // initial: first character first name
            System.out.println(initial);
        }

    }

}
