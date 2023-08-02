package Basics.VarsAndConsts;

import static java.lang.System.out;

public class VarsAndConst {
    public VarsAndConst() {
        int x;
        x = 10;

        int y = 5;
        var z = 15;

        out.println(x);
        out.println(y);
        out.println(z);

        final float FLOAT_MAX = Float.MAX_VALUE;

        out.println(FLOAT_MAX);
    }
}
