import Basics.HelloWorld.*;
import Basics.VarsAndConsts.*;
import Basics.DataTypes.*;
import Basics.ConsoleOutput.*;
import Basics.ConsoleInput.*;
import Basics.ArithmeticOperations.*;
import Basics.BitwiseOperations.*;
import Basics.ConditionalExpressions.*;
import Basics.AssignmentOperations.*;
import Basics.BasicDataTypesCasts.*;

public class Main {
    public static void main(String[] args) {

        //start of mock-data
        int packageNumber = 8;
        args = new String[]{Integer.toString(packageNumber)};
        //end of mock-data

        try {
            switch (Integer.parseInt(args[0])) {
                case 0 -> new HelloWorld();
                case 1 -> new VarsAndConst();
                case 2 -> new DataTypes();
                case 3 -> new ConsoleOutput();
                case 4 -> new ConsoleInput();
                case 5 -> new ArithmeticOperations();
                case 6 -> new BitwiseOperations();
                case 7 -> new ConditionalExpressions();
                case 8 -> new AssignmentOperations();
                case 9 -> new BasicDataTypesCasts();
                default -> throw new Exception("""
                        No existing modules selected to execute.
                        Set args[0] value to an integer number from 0 to 10 to select a specific module to run.\
                        """);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}