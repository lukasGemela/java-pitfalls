package c_assignment;

public class AssignmentTest {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;

        doStuff(a);

        if (a = b) {
            System.out.println("match");
        } else {
            System.out.println("does not match");
        }

        doStuff(a);
    }

    private static void doStuff(boolean bool) {

    }
}
