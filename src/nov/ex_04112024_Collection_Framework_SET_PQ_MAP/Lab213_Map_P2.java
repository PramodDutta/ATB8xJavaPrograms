package nov.ex_04112024_Collection_Framework_SET_PQ_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab213_Map_P2 {
    public static void main(String[] args) {
//      Map<String,Integer> map = new HashMap<String,Integer>();
//      Map<String,Integer> map = new HashMap<>();
//      Map<String,Integer> map = new HashMap();

        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,100);
        //map.put(null,102);


        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));


        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id3"));

        System.out.println(" --- ");




        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }

















    }
}
