package oct.ex_23102024_Exception;

public class Lab183_Custom_Exception {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank jp_chase = new Bank("USD",100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));
    }
}
