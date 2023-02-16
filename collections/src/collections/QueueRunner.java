package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    } //main

} //QueueRunner

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {

        //오름차순
        return Integer.compare(value1.length(), value2.length());

        // 내림차순
        //return Integer.compare(value2.length(), value1.length());
    }
}
