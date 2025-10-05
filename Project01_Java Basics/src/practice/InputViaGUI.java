package practice;
/**
 * Description:
 * This class demonstrates how to take user input using GUI dialogs in Java with javax.swing.JOptionPane. It shows:
 * - Prompting the user for input via input dialogs
 * - Parsing String input to integers
 * - Performing simple arithmetic (sum of two numbers)
 * - Displaying the result using a message dialog
 *
 * Usage:
 * Call InputViaGUI.run() from the main method to execute the program.
 */

import javax.swing.*;

public class InputViaGUI {
    public static void run(){
        int num1, num2, res;

        String inp1 = JOptionPane.showInputDialog(null, "Please enter a number: ", "Sum", JOptionPane.QUESTION_MESSAGE);
        num1 = Integer.parseInt(inp1);
        String inp2 = JOptionPane.showInputDialog(null, "Please enter a number: ", "Sum", JOptionPane.QUESTION_MESSAGE);
        num2 = Integer.parseInt(inp2);

        res = num1 + num2;

        JOptionPane.showMessageDialog(null, "Sum of " + num1 + " and " + num2 + " is: " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
