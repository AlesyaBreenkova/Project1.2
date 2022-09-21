package stringsLesson;

import java.util.*;

public class ModifyString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // System.in is a standard input stream
        System.out.print("Enter your string: ");
        String wordToModify = sc.next();



        ModifyString modifyString = new ModifyString();
        modifyString.modifyString(wordToModify);


    }

    public void

    modifyString(String wordToModify) {
        if (wordToModify == null || wordToModify.isEmpty() || wordToModify.isBlank()) {
            System.out.println("The word you'd like to modify is null or empty");

        } else {
            System.out.println(String.format("The original string is %s", wordToModify));

         String result = "";
          int lastLetter = wordToModify.length() - 1;
            for (int i = lastLetter; i >= wordToModify.length() - 1; i--) {
              result = wordToModify.charAt(i) + wordToModify + wordToModify.charAt(i);
            }

            System.out.println(result);
        }
    }
}
