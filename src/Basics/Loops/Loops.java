package Basics.Loops;

import static java.lang.System.out;

public class Loops {
    public Loops() {
        for (int i = 0; i < 10; i++) {
            out.printf("Square of number %d equals %d\n", i, i * i);
        }

        // infinite loop
        // {
        //      int i = 1;
        //      for (; ; ) {
        //      out.printf("Square of number %d equals %d\n", i, i * i);
        //      }
        // }
        {
            int i = 1;
            for (; i < 9; ) {
                out.printf("Square of number %d equals %d\n", i, i * i);
                i++;
            }
        }

        {
            int n = 10;
            for (int i = 0, j = n - 1; i < j; i++, j--) {

                out.println(i * j);
            }
        }

        {
            int j = 7;
            do {
                out.println(j);
                j--;
            }
            while (j > 0);
        }

        {
            int j = -1;
            do {
                out.println(j);
                j--;
            }
            while (j > 0);
        }

        {
            int j = 6;
            while (j > 0) {

                out.println(j);
                j--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            out.println(i);
        }
    }
}
