package f_list_iteration_removal;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {
        var set = new HashSet<String>();
        set.add("tiny");
        set.add("little");
        set.add("medium");

        for (final var str : set) {
            if (str.equals("tiny")) {
                set.add("tiny");
            }
        }

        System.out.println(set);


    }
}
