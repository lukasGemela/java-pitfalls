package o_finally;

public class FinallyTest {

    public static void main(String[] args) {

        try {
            doSomething();
        } finally {
            System.out.println("DONE!");
        }

    }















    

    private static void doSomething() {
        System.exit(0);
    }
}
