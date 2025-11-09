

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 16.0, b = -8.0;
        System.out.println("sqrt(a): " + sqrt(a));
        System.out.println("pow(a, 2): " + pow(a, 2));
        System.out.println("max(a, b): " + max(a, b));
        System.out.println("min(a, b): " + min(a, b));
        System.out.println("abs(b): " + abs(b));
    }
}
