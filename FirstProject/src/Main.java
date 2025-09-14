import java.util.Scanner;
import miniproject.*;
import practice.*;
/**
 * Main.java
 *
 * Entry point of the project.
 *
 * This class provides a simple text-based menu system that allows the user
 * to run different practice modules and mini projects. Each option in the
 * menu corresponds to a separate class with its own functionality:
 *
 * 1. Scanner Input       -> Demonstrates basic user input via Scanner.
 * 2. Input via GUI       -> Demonstrates input handling with GUI dialogs.
 * 3. Parsing Data Types  -> Shows how to parse and convert between data types.
 * 4. For Each            -> Demonstrates the use of enhanced for-loops
 *                           and the forEach() method.
 * 5. Mini Project        -> Runs the "Average Calculator" mini-project
 *                           for analyzing student grades.
 *
 * Author: Jaffar-Kazmi
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Scanner Input");
        System.out.println("2. Input via GUI");
        System.out.println("3. Parsing Data Types");
        System.out.println("4. For Each");
        System.out.println("5. Mini Project");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> ScannerInput.run();
            case 2 -> InputViaGUI.run();
            case 3 -> ParsingDataTypes.run();
            case 4 -> ForEach.run();
            case 5 -> AverageCalculator.run(); // small project
            default -> System.out.println("Invalid choice");
        }
    }
}
