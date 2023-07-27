package Basics.BitwiseOperations;

import static java.lang.System.out;

public class BitwiseOperations {
    public BitwiseOperations() {
        int a1 = 2;
        int b1 = 5;
        int c = a1 & b1;

        out.printf("""
                [Input]
                a1 = %d;
                b1 = %d;
                c = a1 & b1;
                          
                [Output]
                a1 & b1 = %d
                \n
                """, a1, b1, c);

        int a2 = 4;
        int b2 = 5;

        c = a2 & b2;

        out.printf("""
                [Input]
                a2 = %d;
                b2 = %d;
                c = a2 & b2;
                          
                [Output]
                a2 & b2 = %d
                \n
                """, a2, b2, c);

        int a3 = 2;
        int b3 = 5;

        c = a3 | b3;

        out.printf("""
                [Input]
                a3 = %d;
                b3 = %d;
                c = a3 | b3;
                          
                [Output]
                a3 | b3 = %d
                \n
                """, a3, b3, c);

        int a4 = 4;
        int b4 = 5;

        c = a4 | b4;

        out.printf("""
                [Input]
                a4 = %d;
                b4 = %d;
                c = a4 | b4;
                          
                [Output]
                a4 | b4 = %d
                \n
                """, a4, b4, c);

        int number = 45;
        int key = 102;

        int encrypt = number ^ key;

        out.println("Encrypted number: " + encrypt);

        int decrypt = encrypt & key;

        out.println("Decrypted number: " + decrypt);

        byte a = 12;

        out.println("~12 = " + ~a);

        out.println("4 << 1 = " + (4 << 1));
        out.println("16 >> 1" + (16 >> 1));
        out.println("-8 >>> 2" + (-8 >>> 2));
    }
}
