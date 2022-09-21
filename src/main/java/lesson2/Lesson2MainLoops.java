package lesson2;

import java.util.*;
class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // System.in is a standard input stream
        System.out.print("Enter first number: ");
        int start_number = sc.nextInt();
        System.out.print("Enter second number that is larger than first number: ");
        int end_number = sc.nextInt();

        int current_sum = 0;
        for (int i = start_number; i <= end_number; i++) {
            current_sum += i;
        }
        System.out.println("Total sum is " + current_sum);
    }

}
//public class Lesson2MainLoops {
//
//    public static void main(String[] args) {
//        Lesson2MainLoops loops = new Lesson2MainLoops();
//        //loops.countNumbers(1);
//        //loops.countNumbers();
//        // loops.numbersTemplate(9);
//        loops.drawPyramide();
//    }
//

//    public void drawPyramide() {
//        {
//            for(int i=7; i > 0; i -- ){
//                for(int j=0; j<=i; j++){
//                    System.out.print("*");
            //for (int i = 1; i <= 100; i++) {
              //  if (i % 2 == 0) {
                //    if (i % 3 == 0) {
                  //      System.out.println(i + " is divisible by 2 and 3");
                    // } else if (i % 2 != 0) {
                       //  System.out.println(i + " is an odd number");

                        // ;
                    // }
                // }

                // if (i % 2 == 0) {
                   // if (i % 3 != 0) {
                     //   System.out.println(i + " is an even number");

                      //  if (i % 2 != 0) {
                        //    if (i % 3 == 0) {
                          //      System.out.println(i + " is divisible by 3");




