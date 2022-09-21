package stringsLesson;

import java.util.Scanner;

import static java.lang.System.out;

public class StringsAssignment {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);    // System.in is a standard input stream
        System.out.print("Enter your first word: ");
        String Word1 = sc.next();
        System.out.print("Enter your second word: ");
        String Word2 = sc.next();
        System.out.println("You entered: " + Word1 + " and " + Word2);
*/
        StringsAssignment stringsAssignment = new StringsAssignment();

//        String Word1 = "Alhambra";
//        String Word2 = "";
//        stringsAssignment.compareString(Word1, Word2);
//
//        Word1 = "Valparaiso";
//        Word2 = "Val";
//        stringsAssignment.compareString(Word1, Word2);
//
//        Word1 = "Astragalus";
//        Word2 = "Astragalus";
//        stringsAssignment.compareString(Word1, Word2);

        String Word = "racecar";
        boolean isPalindrome;
        isPalindrome = stringsAssignment.isPalindrome(Word);
        System.out.println("The word " + Word + " is a palindrome: " + isPalindrome);
    }


    public void compareString(String Word1, String Word2) {
        if (Word1 == null || Word2 == null || Word1.isBlank() || Word2.isBlank()) {
            out.println("Cannot compare strings");
        } else if (Word2.equals(Word1)) {
            out.println("The Strings are the same");
        } else if (Word2.contains(Word1)) {
            out.println(Word1 + " is part of " + Word2);
        } else if (Word1.contains(Word2)) {
            out.println(Word2 + " is part of " + Word1);

        }

    }

    public boolean isPalindrome(String text) {

        int l = text.length();
        if (l == 0) {
            return false;
        }
        if (l == 1) {
            return true;
        }

        boolean isStillPalindrome = true;

        for (int i = 0; i < l/2; i++) {
            if (text.charAt(i) != text.charAt(l - i - 1)) {
                isStillPalindrome = false;
                break;
            }
        }


//code which will check if the text is palindrome or not.

//return true if it is, false is it is not;

        return isStillPalindrome;

    }


}



