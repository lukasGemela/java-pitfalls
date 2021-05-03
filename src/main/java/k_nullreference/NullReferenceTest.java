package k_nullreference;

public class NullReferenceTest {

    public static void main(String[] args) {
        Panda object = null;
        System.out.println(object.x);
    }

    static class Panda {
        static int x;
    }
}
