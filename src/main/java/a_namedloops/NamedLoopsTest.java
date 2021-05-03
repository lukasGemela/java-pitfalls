package a_namedloops;

public class NamedLoopsTest {
    public static void main(String[] args) {
        doStuff("dinosaur");
    }

    private static void doStuff(String animal) {
        switch (animal) {
            case "anakonda":
                dinosaur:System.out.println("dinosaur");
                cat: System.out.println("cat");
                break;
            default:
                System.out.println("dog");
        }
    }
}
