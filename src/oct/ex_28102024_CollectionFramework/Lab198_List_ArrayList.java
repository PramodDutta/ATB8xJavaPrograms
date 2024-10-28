package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab198_List_ArrayList {
    public static void main(String[] args) {
        // List list  = new List();
        List list = new ArrayList();
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        System.out.println(list.contains(1)); - //false
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("3")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the first occ of element in list







    }
}
