package day19_LoopPractices;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; // a2b1c3d1


        for (int i = 0; i < str.length(); i++) { // each character from string

            char ch = str.charAt(i); // 'a'
            int count = 0;

            for (int j = 0; j < str.length(); j++) { // to find the frequency of each character

                char each = str.charAt(j); // each character of str
                if (ch == each){
                    count++;
                }



            }

            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;


        }

        System.out.println(result);

    }


}
