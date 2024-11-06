package nov.ex_04112024_Collection_Framework_SET_PQ_MAP;

import java.util.PriorityQueue;

public class Lab211_Queue {
    public static void main(String[] args) {
        // Queue - < 0.01% in Automation.
        PriorityQueue pq= new PriorityQueue();
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);







    }
}
