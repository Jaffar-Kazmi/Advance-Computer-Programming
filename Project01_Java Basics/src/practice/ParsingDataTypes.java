package practice;

/**
 * Description:
 * This class demonstrates how to convert between Strings and other data types
 * in Java. It covers:
 * - Parsing Strings to numeric types (int, float, double)
 * - Converting numeric types (int, float, double, short) to Strings
 * - Formatting Strings using String.format()
 *
 * Usage:
 * Call ParsingDataTypes.run() from the main method to execute the program.
 */

public class ParsingDataTypes {
    public static void run(){
        // String to other data types
        String intString = "123";
        String floatString = "123.123f";
        String doubleString = "123.3768890";

        System.out.println(Integer.parseInt(intString) + 1);
        System.out.println(Float.parseFloat(floatString) + 2);
        System.out.println(Double.parseDouble((doubleString)) + 3);

        // Other data types to String
        double num = 100.000;
        String str = num + "";
        System.out.println(str);
        System.out.println(String.format("%.3f", num));

        float num2 = 19.19f;
        String str2 = Float.toString(num2);
        System.out.println(str2);

        short num3 = 124;
        String str3 = String.valueOf(num3);
        System.out.println(str3);

        int hrs = 10;
        int min = 12;
        int sec = 34;
        String time = String.format("%d : %d : %d", hrs, min, sec);
        System.out.println(time);
    }
}
