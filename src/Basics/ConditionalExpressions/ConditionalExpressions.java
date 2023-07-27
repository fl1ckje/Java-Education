package Basics.ConditionalExpressions;

import static java.lang.System.out;

public class ConditionalExpressions {
    public ConditionalExpressions() {
        int a = 10;
        int b = 4;

        boolean c = a == b;
        boolean d = a == 10;

        out.printf("""
                [Input]
                a = %d;
                b = %d;
                c = a == b;
                d = a == 10;
                                
                [Output]
                c = %b
                d = %b
                \n
                """, a, b, c, d);

        c = a != b;
        d = a != 10;

        out.printf("""
                [Input]
                a = %d;
                b = %d;
                c = a != b;
                d = a != 10;
                                
                [Output]
                c = %b
                d = %b
                \n
                """, a, b, c, d);

        c = a < b;
        d = a > b;

        out.printf("""
                [Input]
                a = %d;
                b = %d;
                c = a < b;
                d = a > b;
                                
                [Output]
                c = %b
                d = %b
                \n
                """, a, b, c, d);

        c = 10 >= 10;
        d = 10 >= 4;

        boolean e = 10 >= 20;

        out.printf("""
                [Input]
                c = 10 >= 10;
                d = 10 >= 4;
                e = 10 >= 20;
                                
                [Output]
                c = %b
                d = %b
                e = %b
                \n
                """, c, d, e);

        c = 10 <= 10;
        d = 10 <= 4;
        e = 10 <= 20;

        out.printf("""
                [Input]
                c = 10 <= 10;
                d = 10 <= 4;
                e = 10 <= 20;
                                
                [Output]
                c = %b
                d = %b
                e = %b
                \n
                """, c, d, e);

        boolean a1 = (5 > 6) || (4 < 6);
        boolean a2 = (5 > 6) || (4 > 6);
        boolean a3 = (5 > 6) && (4 < 6);
        boolean a4 = (50 > 6) && (4 / 2 < 3);
        boolean a5 = (5 < 6) ^ (4 > 6);
        boolean a6 = (50 > 6) ^ (4 / 2 < 3);

        out.printf("""
                [Input]
                a1 = (5 > 6) || (4 < 6);
                a2 = (5 > 6) || (4 > 6);
                a3 = (5 > 6) && (4 < 6);
                a4 = (50 > 6) && (4 / 2 < 3);
                a5 = (5 < 6) ^ (4 > 6);
                a6 = (50 > 6) ^ (4 / 2 < 3);
                                
                [Output]
                a1 = %b
                a2 = %b
                a3 = %b
                a4 = %b
                a5 = %b
                a6 = %b
                """, a1, a2, a3, a4, a5, a6);
    }
}
