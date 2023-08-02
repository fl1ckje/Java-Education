package Basics.Array;

import static java.lang.System.out;

public class Array {
    public Array() {
        {
            int a[];
            int[] b;
        }

        {
            int a[];

            a = new int[4];
        }

        {
            int a[] = new int[4];
            int[] b = new int[5];
        }

        {
            int[] a = new int[]{1, 2, 3, 5};

            int[] b = {1, 2, 3, 5};
        }

        {
            int[] a = new int[4];

            a[0] = 1;
            a[1] = 2;
            a[2] = 4;
            a[3] = 100;

            out.println(a[2]);
        }

        {
            int[] a = {1, 2, 3, 4, 5};

            int length = a.length;
            int last = a[a.length - 1];
        }

        {
            int[] a = new int[]{0, 1, 2, 3, 4, 5};

            int[][] b = {
                    {0, 1, 2},
                    {3, 4, 5}
            };

            b[1][0] = 44;

            out.println(b[1][0]);
        }

        {
            int[][][] a = new int[2][3][4];
        }

        {
            int[][] a = new int[3][];

            a[0] = new int[2];
            a[1] = new int[3];
            a[2] = new int[5];
        }

        {
            int[] a = new int[]{1, 2, 3, 4, 5};

            for (int i : a) {

                out.println(i);
            }
        }

        {
            int[] a = new int[]{1, 2, 3, 4, 5};

            for (int i = 0; i < a.length; i++) {
                out.println(a[i]);
            }
        }

        {
            int[] a = new int[]{1, 2, 3, 4, 5};

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                out.println(a[i]);
            }
        }

        {
            int[][] a = new int[][]
                    {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    };

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    out.printf("%d ", a[i][j]);
                }
                out.println();
            }
        }
    }
}
