package ArithmeticOperations;

import java.math.BigDecimal;

import static java.lang.System.out;

public class ArithmeticOperations {
    public ArithmeticOperations() {
        int a = 10, b = 7;

        int c = a + b;
        int d = 4 + b;

        out.printf("%d + %d = %d\n", a, b, c);
        out.printf("%d + %d = %d\n", 4, b, d);

        c = a - b;
        d = 4 - b;

        out.printf("%d - %d = %d\n", a, b, c);
        out.printf("%d - %d = %d\n", 4, b, d);

        c = a * b;
        d = b * 5;

        out.printf("%d * %d = %d\n", a, b, c);
        out.printf("%d * %d = %d\n", b, 5, d);

        a = 20;
        b = 5;

        c = a / b;
        double e = 22.5 / 4;
        float f = (float) a / b;

        out.printf("%d / %d = %d\n", a, b, c);
        out.printf("%f / %d = %f\n", 22.5, 4, e);
        out.printf("%f / %d = %f\n", (float) a, b, f);

        a = 33;

        c = a % b;
        d = 22 % 4;

        out.printf("%d %c %d = %d\n", a, '%', b, c);
        out.printf("%d %c %d = %d\n", 22, '%', 4, d);

        a = 8;
        b = ++a;

        out.println(a);
        out.println(b);

        a = 8;
        b = a++;

        out.println(a);
        out.println(b);

        a = 8;
        b = --a;

        out.println(a);
        out.println(b);

        a = 8;
        b = a--;

        out.println(a);
        out.println(b);

        /*
        Priority:
        1) ++ (postfix inc), -- (postfix dec)
        2) ++ (prefix inc), -- (prefix dec)
        3) * (mul), / (div), % (mod)
        4) + (add), - (sub)
        */

        a = 8;
        b = 7;
        c = a + 5 * ++b;
        out.println(c);

        b = 7;
        c = (a + 5) * ++b;
        System.out.println(c);

        e = 2.0 - 1.1;
        out.println(e);
    }
}
