package Pages;

import java.net.URL;

public class Page {

    private int pageID = 10; //a class attribute, no modifier assigned
    private String pageName; //an attribute, no modifier assigned
    private String URL; //an attribute, no modifier assigned

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    // public Page(String pageName, int pageID, String URl){
    //   this.pageName = pageName;
    // this.pageID = pageID;
    //this.URL = URL;

    // }


    public Page() { // Empty Constructor

    }

    public int getPageID() {
        return pageID;

    }

     public void setPageID(int pageID) {
     this.pageID = pageID;
 }
    public String buttonName;

    public void openPage() {
        System.out.println(String.format("Page %s has been opened", pageName));

    }

    public void closePage() {
        System.out.println(String.format("Page %s has been closed", pageName));

    }

    public void clickButton(String buttonName) {
        System.out.println(String.format("Button %s has been clicked", buttonName));

    }

    // public void getDeveloperName() {


    }




