package Basics.TheReturnOperator;

import static java.lang.System.out;

public class TheReturnOperator {
    public TheReturnOperator() {

        int x = Sum(1, 2, 3);
        int y = Sum(1, 4, 9);

        out.println(x);
        out.println(y);

        out.println(DayTime(7));
        out.println(DayTime(14));
        out.println(DayTime(19));
        out.println(DayTime(32));
        out.println(DayTime(3));

        out.println(Sum());
        out.println(Sum(1, 2));

    }

    int Sum(int a, int b, int c) {
        return a + b + c;
    }

    String DayTime(int hour) {
        if (hour > 24 || hour < 0) {
            return "Wrong data";
        } else if (hour > 22 || hour < 5) {
            return "Good night";
        } else if (hour >= 17) {
            return "Good evening";
        } else if (hour >= 12) {
            return "Good afternoon";
        } else {
            return "Good morning";
        }
    }

    int Sum(int... numbers) {
        if (numbers.length < 2) {
            out.println("Pass 2 or more numbers for sum");
            return 0;
        } else {
            int result = 0;

            for (int number : numbers) {
                result += number;
            }
            return result;
        }
    }
}
