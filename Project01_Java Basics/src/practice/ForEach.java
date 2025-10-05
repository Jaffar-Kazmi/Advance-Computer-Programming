package practice;
/**
 * Description:
 * This class demonstrates different ways to iterate over arrays and collections in Java.
 * It covers:
 * - The enhanced for loop (for-each) for arrays
 * - The forEach() method with lambda expressions for ArrayLists
 *
 * Usage:
 * Call ForEach.run() from the main method to execute the program.
 */

import java.util.ArrayList;

public class ForEach {
    public static void run(){
        int[] arr = {1,2,3,4,5};

        // Enhanced for loop - for-each loop
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        // forEach method for collections
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(20);
        marks.add(50);
        marks.add(39);

        marks.forEach(mark -> System.out.print(mark + " "));
    }
}
