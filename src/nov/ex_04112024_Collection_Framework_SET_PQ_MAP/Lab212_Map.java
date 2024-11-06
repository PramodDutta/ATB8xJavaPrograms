package nov.ex_04112024_Collection_Framework_SET_PQ_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab212_Map {
    public static void main(String[] args) {
        // name:pramod, roll:31, phone:9876543210
        Map m1 = new HashMap();
//        Map m1 = new LinkedHashMap();
//        Map m1 = new TreeMap();

        m1.put("name","pramod");
        m1.put("rollNo",123);
        m1.put("phone",98765432);
        System.out.println(m1);





    }
}
