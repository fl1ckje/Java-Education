package Basics.MethodOverloading;

import static java.lang.System.out;

public class MethodOverloading {
    public MethodOverloading() {
        out.println(Sum(2, 3));
        out.println(Sum(2, 2, 8));
        out.println(Sum(3.14f, 1.02f));
    }

    int Sum(int x, int y) {
        return x + y;
    }

    int Sum(int x, int y, int z) {
        return x + y + z;
    }

    float Sum(float x, float y) {
        return x + y;
    }

    // this one won't compile and run, because has the same parameter types and number has been defined already
    // void Sum(float x, float y)
    // {
    // return x + y;
    // }
}
