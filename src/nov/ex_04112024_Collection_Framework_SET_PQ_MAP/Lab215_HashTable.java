package nov.ex_04112024_Collection_Framework_SET_PQ_MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab215_HashTable {
    public static void main(String[] args) {
        // Map
        // 1 null allows


        // Hashtable
        //  // Synchronised
        //        // Slow
        //        // Legacy Class

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(3, null);
        System.out.println(ht1);

//        HashMap<Integer,String> ht2 = new HashMap<>();
//        ht2.put(1, "one");
//        ht2.put(2, "two");
//        ht2.put(3, "three");
//        ht2.put(3, null);
//        System.out.println(ht2);


        //

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
            System.out.println(ht1.get(e.nextElement()));
        }


    }
}
