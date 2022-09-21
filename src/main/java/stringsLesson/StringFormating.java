package stringsLesson;

public class StringFormating {

    public static void main(String[] args) {

        String name = "Vasily";
        String gender = "male";
        int age = 20;
        double salary = 5000.50;

        System.out.println("He is " + name + ", his gender is " + gender + ", his age is " + age + ", he makes " + salary);

        System.out.println(String.format("He is %s, his gender is %s, his age is %d, makes %f", name, gender,age, salary));
    }
}
