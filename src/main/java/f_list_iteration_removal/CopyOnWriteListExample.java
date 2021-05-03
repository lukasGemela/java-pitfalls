package f_list_iteration_removal;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListExample {


    public static void main(String[] args) {

        var list = new CopyOnWriteArrayList<String>();
        list.add("tiny");
        list.add("tiny");
        list.add("tiny");
        list.add("tiny");
        list.add("little");
        list.add("medium");

        for (final var str : list) {
            if (str.equals("tiny")) {
                list.add("tiny");
            }
        }

        System.out.println(list);

    }
}
