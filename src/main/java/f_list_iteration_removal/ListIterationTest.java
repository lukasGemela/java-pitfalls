package f_list_iteration_removal;

import java.util.ArrayList;

public class ListIterationTest {

    public static void main(String[] args) {

        var list = new ArrayList<String>();
        list.add("tiny");
        list.add("little");
        list.add("medium");

        for (final var str : list) {
            if (str.equals("tiny")) {
                list.remove("tiny");
            }
        }

        System.out.println(list);
    }
}
