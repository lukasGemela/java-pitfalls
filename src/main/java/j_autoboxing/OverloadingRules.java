package j_autoboxing;

public class OverloadingRules {

    public static void main(String[] args) {
        doSomething(10.0);
        doSomething(10);
    }

//    static void doSomething(double d) { System.out.println("double"); }
    static void doSomething(Double d) { System.out.println("Double"); }

    static void doSomething(Object d) { System.out.println("Object"); }

//    static void doSomething(double... varargs) {System.out.println("varargs");}











    //rules:
    // Exact match by type
    // Larger primitive type
    // Autoboxed SAME type
    // Varargs
}
