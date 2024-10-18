package oct.ex_16102024;

public class Lab153_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
        System.out.println(s1.school_name);

    }
}

class Student {
    int age; // Instance Variable (Non Static)
    static String school_name = "ABC"; // Static Variable


    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when Object is created");
        System.out.println("Read a MySQL db()");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded Once, When Class is Laoded.");

    }


    public Student(int age) {
        this.age = age;
    }
}