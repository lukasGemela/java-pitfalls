package o_finally;

public class FinallyReturn {


    public static void main(String[] args) {

        System.out.println(doSomething());


    }

    private static int doSomething() {

        try {
//            return 1;
            throw new NullPointerException();
        } finally {
            return 0;
        }
    }


}
