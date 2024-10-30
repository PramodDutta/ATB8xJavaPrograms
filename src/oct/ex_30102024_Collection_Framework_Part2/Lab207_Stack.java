package oct.ex_30102024_Collection_Framework_Part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        // Vector, Stack - Legacy -
        // 95% of time we are not going
        // to use it in automation

//        // ArrayList - 95% we are going to use.
//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s); // LIFO
//
//        Stack books = new Stack();
//        books.push("Python");
//        books.push("Java");
//        books.push("C#");
//        System.out.println(books);
////        System.out.println(books.pop());
//        System.out.println(books.peek());
//        System.out.println(books);
//        System.out.println(books.pop());
//        System.out.println(books);

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.add("Amit2");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Dutta"));

        System.out.println(" --- ");

        System.out.println(s);

        s.add(0,"Lucky");
        System.out.println(s);
        // s.remove()
        System.out.println(s.get(0));













    }
}
