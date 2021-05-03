package n_localclass;

public class InnerClass {

    private String test = "test";

    public class X {

        private int x;

//        public class Y {
//
//            private int y;
//
//            public class Z {
//
//                private int z;
//
//                public Z() {
//                    z = X.Y.this.y;
//                }
//
//
//            }
//        }
    }

    //////
    public InnerClass() {
        new X();
    }

//    public static void main(String[] args) {
//        new InnerClass().new X().new Y().new Z();
//    }


}
