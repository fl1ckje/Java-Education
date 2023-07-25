package ConsoleInput;

import static java.lang.System.out;
import static java.lang.System.in;

import java.util.Scanner;

public class ConsoleInput {
    public ConsoleInput() {
        Scanner scanner = new Scanner(in);

        out.print("Input a number: ");
        int number = scanner.nextInt();

        out.printf("Your number is %d\n", number);

        /*
        next() reads string until first space occurs
        nextLine() read the whole string
        nextBoolean() reads boolean value
        nextByte() reads byte value
        nextShort() reads short value
        nextInt() reads int value
        nextLong() reads long value
        nextFloat() reads float value
        nextDouble() reads double value
        */

        out.print("Input name: ");
        String name = scanner.next();

        out.print("Input age: ");
        int age = scanner.nextInt();

        out.print("Input height: ");
        float height = scanner.nextFloat();

        out.printf("""
                Name: %s
                Age: %d
                Height: %f
                """, name, age, height);
        scanner.close();
    }
}
