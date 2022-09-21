package lesson1;

public class Lesson1_Main {

    public static void main(String[] args) {
        String textToprint = "Hello";
        String textToPrintinFrench = "Bonjour";
        String nameToprint = "Alesia Breenkova";
        System.out.println(textToprint);
        System.out.println(nameToprint);

        int num = -5, num1 = 8, num2 = 6;
        System.out.println(num + " + " + num1 + " * " + num2 + " = " + (num + num1 * num2));


        double num3 = 20, num4 = -3, num5 = 5, num6 = 8;
        System.out.println(num3 + " + " + num4 + " * " + num5 + " / " + num6 + " = " + (num3 + num4 * num5 / num6));


        double num7 = 1.45, num8 = 7.009, num9 = 1347.09, num10 = 789.08, num11 = 12.01;
        System.out.println(num7 + " * " + num8 + " * " + num9 + " * " + num10 + " * " + num11 + " = " + (num7 * num8 * num9 * num10 * num11));


    }

}