package CollectionsCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListCollection {

    public void useList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0, 100);
        list1.add(1, 200);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 300);
        list2.add(1, 400);

        list1.addAll(2, list2);

        list1.forEach((Integer val) -> System.out.println(val));

        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("After replace all:");
        list1.forEach((Integer val) -> System.out.println(val));

        list1.sort((Integer val1, Integer val2) -> val1 - val2);
        System.out.println("After sorting in increasing order:");
        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("Value present at index 2 is: " + list1.get(2));

        System.out.println("After set method:");
        list1.forEach((Integer val) -> System.out.println(val));

        list1.remove(2);
        System.out.println("After removing:");
        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("Index of -200 Integer object is: " + list1.indexOf(-200));

        ListIterator<Integer> listIterator1 = list1.listIterator();
        System.out.println("Traversing backward:");
        while (listIterator1.hasPrevious()) {
            int previousVal = listIterator1.previous();
            System.out.println(previousVal);
        }

        ListIterator<Integer> listIterator2 = list1.listIterator();
        while (listIterator2.hasNext()) {
            int val = listIterator2.next();
            System.out.println("Traversing forward: " + val + " next index: " + listIterator2.nextIndex());
            if (val == -200) {
                listIterator2.add(-100);
                System.out.println("Added -100 after -200");
                System.out.println("Next index: " + listIterator2.nextIndex());
            }
        }

        List<Integer> subList = list1.subList(1, 3);
        subList.add(-900);
        System.out.println("After adding -900 to subList:");
        list1.forEach((Integer val) -> System.out.println(val));

    }
}
