package f_list_iteration_removal;

import java.util.ArrayList;
import java.util.Collections;

public class SynchronizedListExample {

    public static void main(String[] args) {

        var list = Collections.synchronizedList(new ArrayList<String>());
        list.add("tiny");
        list.add("little");
        list.add("medium");

        for (final var str : list) {
            if (str.equals("tiny")) {
                list.remove("tiny");
            }
        }

        //does not work either, throws ConcurrentModificationException
        System.out.println(list);

    }
}
