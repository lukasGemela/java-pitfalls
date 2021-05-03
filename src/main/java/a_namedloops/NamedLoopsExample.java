package a_namedloops;

public class NamedLoopsExample {

    public static void main(String[] args) {

        int x = 0;
        used_label: x = 1;

        inner: for(int i = 0; i < 5; i++) {
            outer: for(int j = 0; j < 5; j++) {

                if (j == 3) {
                    break inner;
                } else if (j == 2) {
                    continue outer;
                }

                System.out.println(i + " " + j);
            }
        }
    }
}
