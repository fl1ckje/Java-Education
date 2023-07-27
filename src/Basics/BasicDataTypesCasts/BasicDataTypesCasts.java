package Basics.BasicDataTypesCasts;

import static java.lang.System.out;
import static java.lang.Math.round;

public class BasicDataTypesCasts {
    public BasicDataTypesCasts() {
        //int a = 4;
        //byte b = a; // error

        {
            int a = 4;
            byte b = (byte) a; // int to byte cast
            out.println(b);
        }
        /*
        Automatic conversions cheatsheet

        byte -> short
        short -> int
        char -> int
        int -> long/float/double
        long -> float/double
        float -> double
        */

        {
            byte b = 7;
            int d = b; // byte to int cast
            out.println(d);
        }

        {
            int a = 2147483647;
            float b = a; // int to float cast
            out.println(b); // 2.14748365E9
        }

        {
            long a = 4;
            int b = (int) a;
            out.println(b);
        }

        {
            int a = 5;
            byte b = (byte) a;
            out.println(b);
        }

        {
            double a = 56.9898;
            int b = (int) a;
            out.println(b);
        }

        {
            double a = 56.9898;
            int b = (int) round(a);
            out.println(b);
        }

        {
            int a = 3;
            double b = 4.6;
            double c = a + b;
            out.println(c);
        }

        {
            byte a = 3;
            short b = 4;
            byte c = (byte) (a + b);
            out.println(c);
        }

        int d = 'a' + 5;
        out.println(d);
    }
}
