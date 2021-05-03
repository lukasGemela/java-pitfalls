package e_string_comparison;

import java.util.ArrayList;

public class StringComparisonTest {

    public static void main(String[] args) {

        String test1 = "te" + "st";
        String test2 = "te".concat("st");
        String test3 = new StringBuilder().append("te").append("st").toString();

        System.out.println("test" == test1);
        System.out.println("test" == test2);
        System.out.println("test" == test3);
        System.out.println("test" == test3.intern());
    }
}
