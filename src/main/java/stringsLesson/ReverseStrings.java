package stringsLesson;

public class ReverseStrings {
    public static void main(String[] args) {
        ReverseStrings reverseStrings = new ReverseStrings();
        reverseStrings.reverseStrings("Algambra");

    }

    public void reverseStrings(String texttoReverse) {
        if (texttoReverse == null || texttoReverse.isEmpty() || texttoReverse.isBlank()) {
            System.out.println("The String is null or empty");

        } else {
            System.out.println(String.format("The original string is %s", texttoReverse));

            String result = "";
            int lastLetter = texttoReverse.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                result = result + texttoReverse.charAt(i);
            }

            System.out.println(result);
        }
    }


}
