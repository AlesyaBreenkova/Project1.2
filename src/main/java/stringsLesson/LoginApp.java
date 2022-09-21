package stringsLesson;

import java.util.Locale;

public class LoginApp {
    public String expectedUserName = "admin";
    public String expectedPassword = "password";

    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
//        boolean succes = loginApp.verifyUser("ADMIN", "password");
//        System.out.println("Login success " + succes);

        loginApp.stringExamples();

    }

    public boolean verifyUser(String userName, String password) {
        userName = userName.toLowerCase();
        password = password.toLowerCase();
        boolean success = false;
        // if(userName.isEmpty() || password.isEmpty())
        if (userName.length() == 0 || password.length() == 0) {
            System.out.println("The username or password is empty");
        } else if (userName.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank");
        } else if (userName == null || password == null) {
            System.out.println("The username or password is blank");
        } else if (!userName.equalsIgnoreCase(expectedUserName) || !password.equals(expectedPassword)) {
            System.out.println("The username or password does not match the expected values");
        } else {
            success = true;
        }
        return success;
    }

    public void stringExamples() {
        String txt1 = "dog";
        String txt2 = "catalog";

//        System.out.println(txt2.contains(txt1));
//
//        System.out.println(txt2.replace("cat",txt1));

        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(1));
        System.out.println(txt1.charAt(txt1.length()-1));
    }
}