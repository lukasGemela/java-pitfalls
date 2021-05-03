package d_exception_no_stacktrace;

public class ExceptionTest {

    public static void main(String[] args) {

        int[] a = new int[] {};

        for (int i = 0; i < 1000000; i++) {
            try {
                int x = a[0];
            } catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }
        }
    }


//    For some basic exceptions, the JVM reuses the same exception instance after a while, in which case there's no stack trace anymore
//    -XX:-OmitStackTraceInFastThrow, set by default to true
}
