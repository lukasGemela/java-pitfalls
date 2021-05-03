package n_localclass;

public class LocalClassTest {

//    public static void main(String[] args) {
//
//        System.out.println(X.x);
//        class X {
//            static final int x;
//        }
//
//        X obj = new X();
//        System.out.println(obj.x);
//    }

    public static void method() {
        class X {
//            static int x;  can't have static variable
            int i = 0;

            public X() {
                i = 0;
            }

        }
    }
}
