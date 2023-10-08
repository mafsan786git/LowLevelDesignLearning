package CollectionsCheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtility {
    public void usingCollectionsUtility(){
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(1);
        values.add(8);
        System.out.println("max value : " + Collections.max(values));
        System.out.println("min value : " + Collections.min(values));
        Collections.sort(values);
        values.forEach((Integer value) -> System.out.println(value));
    }
}
