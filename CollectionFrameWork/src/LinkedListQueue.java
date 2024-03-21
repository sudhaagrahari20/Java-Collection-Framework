import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
       //add element in queue
        queue.offer(12);
        queue.offer(26);
        queue.offer(36);
        queue.offer(42);

        System.out.println(queue);

        //removes element
        System.out.println(queue.poll());
        System.out.println(queue);

        //returns the head of the queue
        System.out.println(queue.peek());



    }
}
