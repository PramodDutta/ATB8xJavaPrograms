package oct.ex_11102024.superkeyword;

public class TestCase1 extends BaseClass{

    // TestCase is A Type of BaseClass - Single Inheritance
    TestCase1(){
        super();// DC of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser,isAuth);
    }
}
