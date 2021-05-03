package j_autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingText {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.remove(1);

        System.out.println(list);

    }
}
