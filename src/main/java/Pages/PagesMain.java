package Pages;

public class PagesMain {

    public static void main(String[] args) {

       // Page loginScreen = new Page("Login", 1 , "www.legionIT.com/login");

        // loginScreen.pageID = 1;
        // loginScreen.pageName = "Login";
        // loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//
//        Page aboutScreen = new Page();
//
//       // aboutScreen.setPageID(2);
//        System.out.println(aboutScreen.getPageID());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("Exit");
//        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("LoginPage");
//        loginPage.setURL("https//...");
//
//        loginPage.openPage();
//        loginPage.setUserName("name");
//        loginPage.setPassword("password");
//        loginPage.populateCredentials();

//   Page page = new Page();
//   page.getDeveloperName();

   LoginPage loginPage = new LoginPage(); // transforming an object of Page class into an object of LoginPage class
        loginPage.setPageID(1);
        loginPage.setPageName("Login");
        loginPage.getDeveloperName();

   AboutPage aboutPage = new AboutPage();
   aboutPage.getDeveloperName();



    }
}
