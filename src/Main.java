import HelloWorld.*;
import VarsAndConsts.*;
import DataTypes.*;
import ConsoleOutput.*;
import ConsoleInput.*;
import ArithmeticOperations.*;
import BitwiseOperations.*;

public class Main {
    public static void main(String[] args) {

        //start of mock-data
        int packageNumber = 6;
        args = new String[]{Integer.toString(packageNumber)};
        //end of mock-data

        try {
            switch (args[0]) {
                case "0" -> new HelloWorld();
                case "1" -> new VarsAndConst();
                case "2" -> new DataTypes();
                case "3" -> new ConsoleOutput();
                case "4" -> new ConsoleInput();
                case "5" -> new ArithmeticOperations();
                case "6" -> new BitwiseOperations();
                default -> System.out.println("""
                        No modules selected to execute.
                        Set args[0] value to a number from 0 to 10 to select a specific module to run.\
                        """);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}