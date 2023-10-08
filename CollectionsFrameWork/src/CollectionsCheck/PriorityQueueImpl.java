package CollectionsCheck;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {
    public void usePriorityQueue(){
        //default min heap --min priority queue
        Queue<Integer> minPq = new PriorityQueue<>();
        minPq.add(5);
        minPq.add(2);
        minPq.add(3);
        minPq.add(10);
        minPq.forEach((Integer val) -> System.out.println(val));

        while (!minPq.isEmpty()){
            System.out.println("remove from top fro min: " + minPq.poll());
        }

        Queue<Integer> maxPq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        maxPq.add(5);
        maxPq.add(2);
        maxPq.add(3);
        maxPq.add(10);
        maxPq.forEach((Integer val) -> System.out.println(val));

        while (!maxPq.isEmpty()){
            System.out.println("remove from top max : " + maxPq.poll());
        }

    }
}
