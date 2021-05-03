package l_division;

public class DivisionTest {

    public static void main(String[] args) {

        float x = 10.0f / 0.0f;
        System.out.println(x);

        double y = 10.0 / 0.0;
        System.out.println(y);

        Double.isInfinite(y);
        Double.isFinite(x);
    }

}
