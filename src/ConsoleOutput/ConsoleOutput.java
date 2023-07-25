package ConsoleOutput;

import static java.lang.System.out;

public class ConsoleOutput {
    public ConsoleOutput() {
        out.println("Hello world!");
        out.println("Goodbye world...");

        out.print("Hello and\n");
        out.print("goodbye world\n");

        int x = 5, y = 6;

        /*
        %d for int values
        %x for hex numbers
        %f for float numbers
        %e for exponential form of a number
        %c for symbol
        %s for string values
        */
        out.println("x=" + x + "; y=" + y);
        out.printf("x=%d; y=%d \n", x, y);

        String name = "Vlad";
        int age = 22;
        float height = 1.77f;

        out.printf("""
                        Name: %s
                        Age: %d
                        Height: %f
                        """,
                name, age, height);
    }
}
