package oct.ex_04102024.Constructos.PC;

public class Lab126 {
    public static void main(String[] args) {
        Dog gs = new Dog("GS","AA",1,4);
        System.out.println(gs.breed);
        System.out.println(gs.name);
        System.out.println(gs.age);
        System.out.println(gs.legs);


        Dog bd = new Dog("BD");
        System.out.println(bd.name);
        System.out.println(bd.legs);
        System.out.println(bd.age);


    }
}
