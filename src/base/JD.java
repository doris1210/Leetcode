package base;

import java.util.*;

public class JD {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println();
        System.out.println();
        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new LinkedList<>();

        Set<Integer> integerSet = new HashSet<>();

        Map<Integer,Integer> treeMap= new TreeMap<>();

        Deque<Integer> deque = new LinkedList<>();


        deque.push(1);
        deque.pop();
        deque.peek();


        deque.offer(1);
        deque.poll();
        deque.element();
        deque.peek();

    }
}
