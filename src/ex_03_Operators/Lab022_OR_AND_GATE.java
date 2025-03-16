package ex_03_Operators;

public class Lab022_OR_AND_GATE {
    public static void main(String[] args) {

        // OR Gate
        // T || T -->true
        // T || F -->true
        // F || T -->true
        // F || F -->false

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println('\n');

        // AND Gate
        // T && T -->true
        // T && F -->true
        // F && T -->true
        // F && F -->false

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
