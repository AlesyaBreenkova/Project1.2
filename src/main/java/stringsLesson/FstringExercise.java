package stringsLesson;

import java.util.*;

public class FstringExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // System.in is a standard input stream
        System.out.print("Enter your string: ");
        String wordToCompare = sc.next();
        System.out.println("You entered: " + wordToCompare);


        FstringExercise stringLesson = new FstringExercise();
        stringLesson.checkString(wordToCompare);
        stringLesson.stringStart(wordToCompare);


    }


    public void checkString(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("The word you'd like to compare is null or empty");
        }

    }

    public void stringStart(String str) {
        String subString = str.substring(0, 1);
        System.out.println(subString);

        char lastLetter = str.charAt(str.length() - 1);
        String finalLetter = Character.toString(lastLetter);
        if (subString.equalsIgnoreCase("f") && finalLetter.equals("b")) {
            System.out.println("FizzBuzz");
        } else if (subString.equalsIgnoreCase("f")) {
            System.out.println("Fizz");
        }

            if (finalLetter.equals("b")) {
                System.out.println("Buzz");
            }
        }

    }







