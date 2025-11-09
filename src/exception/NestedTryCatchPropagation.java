package exception;
public class NestedTryCatchPropagation {

    public static void methodB() {
        try {
            String num = "abc";
            int value = Integer.parseInt(num); // NumberFormatException handled
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException inside methodB.");
        }

        String str = null;
        System.out.println(str.length()); // NullPointerException propagates
    }

    public static void methodA() {
        try {
            methodB();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in methodA (propagated).");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Nested Try-Catch Propagation ===");
        methodA();
    }
}
