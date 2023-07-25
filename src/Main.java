import HelloWorld.*;
import VarsAndConsts.*;
import DataTypes.*;

public class Main {
    public static void main(String[] args) {

        //start of mock-data
        int packageNumber = 2;
        args = new String[]{Integer.toString(packageNumber)};
        //end of mock-data

        try {
            switch (args[0]) {
                case "0" -> new HelloWorld();
                case "1" -> new VarsAndConst();
                case "2" -> new DataTypes();
                default -> {
                }
            }
        } catch (Exception exception) {
            System.out.println("""
                    No modules selected to execute.
                    Set args[0] value to a number from 0 to 10 to select a specific module to run.""");
        }
    }
}