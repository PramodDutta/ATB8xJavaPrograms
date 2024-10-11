package oct.ex_11102024.ecap;

public class Lab136 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1  = new GoodVWOLogin("goodadmin","admin123");
        // System.out.println(vwoLogin1.password);
        // vwoLogin1.password = "pass123";>?
        System.out.println(vwoLogin1.getPassword());

        // Checking Admin
        boolean isAdmin = false;

        // vwoLogin1.setYourKey("admin");

        vwoLogin1.setPassword("newpassword",isAdmin);
        System.out.println(vwoLogin1.getPassword());




    }
}
