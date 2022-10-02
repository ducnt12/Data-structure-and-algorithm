import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStructure {
    public static void main(String[] args) {
        // Queue = FIFO data structure. First In First out (Line of people)
        // add = enqueue, offer()
        // remove = poll()

        Queue<String> people = new LinkedList<>();

        people.offer("Karen");
        people.offer("Chad");
        people.offer("Harold");
        people.offer("Steve");

        // System.out.println(people.contains("Steve"));
        // System.out.println(people.size());
        // System.out.println(people.isEmpty());

        System.out.println(people.peek()); // Karen

        people.poll();

        System.out.println(people);

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Priority Queue = FIFO serves elements with the highest priorities first
        // before elements with lower priorities
        // Application: Sorted array
        Queue<String> newPeople = new PriorityQueue<>(Collections.reverseOrder());

        newPeople.offer("Karen");
        newPeople.offer("Chad");
        newPeople.offer("Harold");
        newPeople.offer("Steve");

        System.out.println(newPeople);

        while (!newPeople.isEmpty()) {
            System.out.println(newPeople.poll());
        }
    }
}
