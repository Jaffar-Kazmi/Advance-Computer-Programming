package practice;

/**
 * Description:
 * This class demonstrates how to take various types of input from the user
 * using the java.util.Scanner class in Java. It covers primitive data types,
 * as well as Strings and characters. For each type of input, it also prints
 * the size (in bytes) and the range of the type (where applicable). Additionally,
 * it shows how small integer types (byte, short, char) are promoted to int
 * during arithmetic operations.
 *
 * Usage:
 * Call ScannerInput.run() from the main method to execute the program.
 */


import java.util.Scanner;

public class ScannerInput {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte integer: ");
        byte num1 = sc.nextByte();
        System.out.println(num1);
        System.out.println(Byte.BYTES);
        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.print("Enter an integer: ");
        int num2 = sc.nextInt();
        System.out.println(num2);
        System.out.println(Integer.BYTES);
        System.out.println("Int Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.print("Enter an short integer: ");
        short num3 = sc.nextShort();
        short num4 = 123;
//      short res = num3 + num4;         //   small types (byte, short, char) are promoted to int when used in arithmetic.
        System.out.println(num3+num4);   //   result is integer
        System.out.println(Short.BYTES);
        System.out.println("Short Int Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.print("Enter an long integer: ");
        long num5 = sc.nextLong();
        long num6 = 123;
        System.out.println(num5+num6);
        System.out.println(Long.BYTES);
        System.out.println("Long Int Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.print("Enter an floating point number: ");
        float num7 = sc.nextFloat();
        float num8 = 16899.89f;
        System.out.println(num7+num8);
        System.out.println(Float.BYTES);
        System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.print("Enter an double point number: ");
        double num9 = sc.nextDouble();
        System.out.println(num9);
        System.out.println(Double.BYTES);
        System.out.println("Double Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.print("Enter an boolean value: ");
        boolean state = sc.nextBoolean();
        System.out.println(state);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.println( (char) (ch+2));
        System.out.println(Character.BYTES);
        System.out.println("Char Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        System.out.println("Enter a word: ");
        String word = sc.next();
        System.out.println(word);
        System.out.println(word.length());

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter a line: ");
        String line = sc.nextLine();
        System.out.println(line);
        System.out.println(line.length());
    }
}
