package lesson4;

import java.util.*;

import java.util.Scanner;

public class ArrayExamples {

    public void stringsArray() {

        String[] buttons = {"OK", "Cancel", "Login", "Sign up", "Sign in"};
        buttons[2] = "Exit";

    }


    //int length = buttons.length;

    // System.out.println(buttons[2]);
    //System.out.println("length: " + length);

    //for(int i = 0; i< buttons.length; i++){
    //  System.out.println(buttons[i]);
    //}

    //for (String button : buttons) {
    //  System.out.println(button);


    // public void stringsArraywithSize() {

    // String[] array = new String[6];
        /*array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "Sign up";
        array[4] = "Sign in";
        array[5] = "OK";

        for(int i = 0; i< buttons.size; i++){
            System.out.println(buttons.get(i));

    }


    public void intergerArray() {

        int[] ids = {1, 34, 125, 2, 3};
        System.out.println(ids[2]);
    }
*/

    public String getToyByID() {

        HashMap<Integer, String> ToysAvailable = new HashMap<>();
        ToysAvailable.put(12, "Batmobile");
        ToysAvailable.put(45, "Light Saber");
        ToysAvailable.put(6, "Wonder Woman");
        ToysAvailable.put(201, "Hello Kitty Bag");
        ToysAvailable.put(56, "Junior QA Analyst Doll");

        Scanner scanner = new Scanner(System.in);
// ask the question in console
        System.out.print("Enter the Toy ID: ");
// get  input as a String
        int id = Integer.parseInt(scanner.next());

        if (ToysAvailable.containsKey(id)) {
            return ToysAvailable.get(id);
        }
        return "No such toy";
    }

    public String getDayoftheWeek(int[] day) {

        ArrayList<String> DaysoftheWeek = new ArrayList<String>();
        DaysoftheWeek.add("Sunday");
        DaysoftheWeek.add("Monday");
        DaysoftheWeek.add("Tuesday");
        DaysoftheWeek.add("Wednesday");
        DaysoftheWeek.add("Thursday");
        DaysoftheWeek.add("Friday");
        DaysoftheWeek.add("Saturday");

        // for (int i = 0; i < DaysoftheWeek.size(); i++) {
        // System.out.println(DaysoftheWeek.get(i));

        int dayNumber = 0;
        return DaysoftheWeek.get(dayNumber -1);


           /* buttons.add("Sign in");

            for (String button : buttons) {
                System.out.println(button);
            }

            System.out.println("The size of the list is " + buttons.size());


            buttons.remove("Sign in");

            for (String button : buttons) {
                System.out.println(button);
            }

            System.out.println("The size of the list is " + buttons.size());


            buttons.clear();

            for (String button : buttons) {
                System.out.println(button);
            }

            System.out.println("The size of the list is " + buttons.size());
*/
    }


    public void arrayListSortingExample() {

        ArrayList<String> Names = new ArrayList<>();
        Names.add("Steve");
        Names.add("Tim");
        Names.add("Lucy");
        Names.add("Steve");
        Names.add("Pat");
        Names.add("Angela");
        Names.add("Tom");
        Names.add("Tim");
        Names.add("Anna");
        Names.add("Lucy");


        Collections.sort(Names);


        int i = 0;
        while ((i + 1) < Names.size()) {
            if (Names.get(i) == Names.get(i + 1)) {
                Names.remove(i + 1);
            } else {
                i = i + 1;
            }

        }
        System.out.println(Names);

    /*public void hashMapExample() {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Stanton", "Lisboa");
        hashMap.put("Kate", "Cambrigde");
        hashMap.put("Valerie", "Paris");
        System.out.println(hashMap);


        System.out.println(hashMap.get("Valerie"));
        System.out.println(hashMap.remove("Stanton"));

        System.out.println(hashMap);
        System.out.println(hashMap.size());
    }

     */

    /*public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Argentina");
        hashSet.add("Chile");
        hashSet.add("Peru");

        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);

        Collections.sort(list);

        System.out.println(list);

    }

     */

    }

}
