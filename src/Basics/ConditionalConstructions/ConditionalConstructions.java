package Basics.ConditionalConstructions;

import static java.lang.System.out;

public class ConditionalConstructions {
    public ConditionalConstructions() {
        {
            int a = 6;
            int b = 4;

            if (a > b) {
                out.printf("%d > %d\n", a, b);
            }
        }

        {
            int a = 6;
            int b = 4;

            if (b > a) {
                out.printf("%d > %d\n", b, a);
            } else {
                out.printf("%d <= %d\n", b, a);
            }
        }


        int a = 6;
        int b = 8;

        if (a > b) {
            out.printf("%d > %d\n", a, b);
        } else if (a < b) {
            out.printf("%d < %d\n", a, b);
        } else {
            out.printf("%d = %d\n", a, b);
        }


        {
            int number = 8;

            switch (number) {
                case 1:
                    out.println("number = 1");
                    break;
                case 8:
                    out.println("number = 8");
                    break;
                case 9:
                    out.println("number = 9");
                    break;
            }
        }

        {
            int number = 3;
            int output;

            switch (number) {

                case 1:
                    output = 3;
                    break;
                case 2:
                case 3:
                case 4:
                    output = 6;
                    break;
                case 5:
                    output = 12;
                    break;
                default:
                    output = 24;
            }

            out.println(output);
        }


        int x = 3;
        int y = 2;
        int z = x < y ? (x + y) : (x - y);
        out.println(z);

    }
}
