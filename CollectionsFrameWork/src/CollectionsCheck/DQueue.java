package CollectionsCheck;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DQueue {
    public void useDeque() {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(1);
        arrayDeque.addLast(4);
        arrayDeque.addLast(5);

        System.out.println(arrayDeque.removeFirst());

        //for threadSafe :
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();

        Deque<Integer> arrayDequeStack = new ArrayDeque<>();
        arrayDequeStack.addFirst(1);
        arrayDequeStack.addFirst(4);
        arrayDequeStack.addFirst(5);

        System.out.println(arrayDequeStack.removeFirst());

    }
}
