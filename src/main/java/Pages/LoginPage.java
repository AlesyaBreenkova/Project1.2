package Pages;

public class LoginPage extends Page implements PageInterface {

    private String userName; // a class attribute

    private String password; // a class attribute


    public void populateCredentials() {

        System.out.println(String.format("Credentials have been successfully populated: %s, %s", userName, password));
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getDeveloperName() {
       System.out.println("The page was developed by Valerie James");
    }

}



