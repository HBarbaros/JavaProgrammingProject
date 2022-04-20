package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJava";

        int frequency = 0;
        //                  8 - 4
        for (int i = 0; i <= str.length()-4; i++){ // it's given substring (-4) that means that have many character has word. If word has five words then could we write chars numbers.
            String eachSub = str.substring(i, i+4);

            if (eachSub.equals("Java")){
                frequency++;
            }

        }
        System.out.println(frequency);


    }

}
/*
2. write a program that can return the frequency of the word Java
from the sentence
Ex:
sentence = "JavaJavaJava";
output: 3
 */