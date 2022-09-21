package stringsLesson;

import java.util.*;

public class CompareStrings {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);    // System.in is a standard input stream
        System.out.print("Enter your string: ");
       String wordToCompare = sc.next();
       System.out.println("You entered: " + wordToCompare);



        CompareStrings compareStrings = new CompareStrings();
        compareStrings.checkString(wordToCompare);
        boolean success = compareStrings.maxStart(wordToCompare);


    }


    public void checkString(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("The word you'd like to compare is null or empty");
        }

    }

    public boolean maxStart(String str) {
        String subString = str.substring(1, 3);
        System.out.println(subString);
        if (subString.equals("ax")) {
            System.out.println("ax is part of " + str);
            System.out.println("true");
            return  true;
        }
        System.out.println("ax is not part of " + str);
        System.out.println("false");
        return false;
    }


}

