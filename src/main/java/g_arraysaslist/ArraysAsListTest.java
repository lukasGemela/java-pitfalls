package g_arraysaslist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArraysAsListTest {

    public static void main(String[] args) {

        Integer[] arr = new Integer[] {2, 1, 4, 3};
        List<Integer> list = Arrays.asList(arr);

        System.out.println("arr before sort:" + List.of(arr));
        Collections.sort(list);
        System.out.println("arr after sort:" + List.of(arr));

        System.out.println(list.equals(Arrays.asList(arr)));
    }

}
