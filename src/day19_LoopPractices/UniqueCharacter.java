package day19_LoopPractices;

public class UniqueCharacter {

    public static void main(String[] args) {


        String str = "aabcccdf"; // 'a'
        String result = ""; // bdf

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0; // represents the frequency of the ch

            for (int j = 0; j < str.length(); j++) { // compares thr character that outer loop picked, with each character of string

                char unique = str.charAt(j);
                if (ch == unique){ // each character of str
                    count++;
                }
            }

            if (ch != 1){
                continue;
            }
            result += ch;

 /*           if (count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
  */
        }
        System.out.println(result);

    }

}
