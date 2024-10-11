package oct.ex_11102024.superkeyword;

public class BaseClass {

    private String browser;

    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    BaseClass(String b){
        System.out.println("CC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }



}
