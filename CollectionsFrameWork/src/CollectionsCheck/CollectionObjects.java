package CollectionsCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionObjects {
    public void useCollectionObjects() {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);
        System.out.println("size: " + values.size());
        System.out.println("isEmpty: " + values.isEmpty());
        System.out.println("contains: " + values.contains(5));
        values.add(5);
        System.out.println("added: "+ values.contains(5));
        values.remove(3);
        System.out.println("removed using index: " + values.contains(5)); //remove using Object, removes the first occurrence of the value
        values.remove(Integer.valueOf(3));
        System.out.println("removed using object: " + values.contains(3));
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);
        values.addAll(stackValues);
        System.out.println("addAL? test using containsAll: " + values.containsAll(stackValues));
        values.remove(Integer.valueOf(7));
        System.out.println("containsALl after removing 1 element: " + values.containsAll(stackValues));
        values.removeAll(stackValues);
        System.out.println("removeAll: " + values.contains(8));
        values.clear();
        System.out.println("clear: " + values.isEmpty());
    }
}
