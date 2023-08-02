package Basics.MethodParameters;

import static java.lang.System.out;

public class MethodParameters {
    public MethodParameters() {
        int a = 6;
        int b = 8;

        Sum(a, b);
        Sum(3, a);
        Sum(5, 23);

        DisplayData("Tom", 34);
        DisplayData("Bob", 28);
        DisplayData("Sam", 23);

        Sum(1, 2, 3);
        Sum(1, 2, 3, 4, 5);
        Sum();

        Sum("There is a sum of some numbers!!!", 1, 3, 3, 7);
        Sum("Passed array as parameter!", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    void Sum(int x, int y) {
        int z = x + y;
        out.printf("%d + %d = %d\n", x, y, z);
    }

    void DisplayData(String name, int age) {
        out.printf("Name: %s;\tAge: %d;\n", name, age);
    }

    void Sum(int... numbers) {
        //this method is overloaded by parameter type (different method signature, but the same name)
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        out.println("result = " + result);
    }

    void Sum(String message, int... numbers) {
        out.println(message);
        Sum(numbers);
    }
}
