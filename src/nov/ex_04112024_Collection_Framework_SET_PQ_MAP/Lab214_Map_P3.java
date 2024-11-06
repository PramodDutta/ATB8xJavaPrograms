package nov.ex_04112024_Collection_Framework_SET_PQ_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab214_Map_P3 {
    public static void main(String[] args) {

        HashMap<String,String> student1 = new HashMap();
        student1.put("name","pramod");
        student1.put("roll","1");
        student1.put("phone","96543210");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap();
        student2.put("name","amit");
        student2.put("roll","2");
        student2.put("phone","65432356");
        System.out.println(student2);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);


    }
}
