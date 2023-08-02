package Basics.IntroToExceptions;

import static java.lang.System.out;

public class IntroToExceptions {
    public IntroToExceptions() {
        example1();
        example2();
        example3();
    }

    private void example1() {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            out.println(numbers[4]);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        out.println("End of program");
    }

    private void example2() {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            out.println(numbers[4]);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            out.println("Finally block");
        }
        out.println("End of program");
    }

    private void example3() {
        int[] numbers = new int[3];
        try {
            numbers[6] = 45;
            numbers[6] = Integer.parseInt("gfd");
        } catch (ArrayIndexOutOfBoundsException exception) {
            out.println("Index is out of bounds");
        } catch (Exception exception) {
            out.println("Error during cast string to int");
        }
    }
}
