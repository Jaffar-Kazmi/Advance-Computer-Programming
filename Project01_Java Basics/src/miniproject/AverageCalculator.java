package miniproject;
/**
 * Description:
 * This class implements a simple Student Grade Analysis System.
 * It allows the user to:
 * - Enter details for multiple students and multiple subjects
 * - Calculate each student's average marks
 * - Calculate the average marks per subject
 * - Identify the student with the highest and lowest average
 * - Identify the subject with the highest and lowest average
 *
 * Features:
 * - Uses 2D arrays to store student marks
 * - Demonstrates nested loops for data input and processing
 * - Performs basic calculations such as sum, average, and comparisons
 *
 * Usage:
 * Call AverageCalculator.run() from the main method to execute the program.
 */

import java.util.Scanner;

public class AverageCalculator {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Analysis System");

        System.out.print("Enter number of students: ");
        int numOfStudents = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = sc.nextInt();

        int[] studentId = new int[numOfStudents];
        String[] studentName = new String[numOfStudents];
        double[][] marks = new double[numOfStudents][numOfSubjects];
        double[] sumOfMarks = new double[numOfStudents];
        double[] averageMarks = new double[numOfStudents];
        double[] subjectSum = new double[numOfSubjects];
        double[] subjectAverage = new double[numOfSubjects];

        for(int i=0; i<numOfStudents; i++){
            System.out.println("Enter details for student " + (i+1));
            System.out.print("Id: ");
            studentId[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            studentName[i] = sc.nextLine();

            System.out.println("Enter subject marks below");
            for (int j = 0; j < numOfSubjects; j++) {
                System.out.println("Subject # " + (j+1));
                System.out.print("Marks: ");
                marks[i][j] = sc.nextDouble();
                sumOfMarks[i] += marks[i][j];
            }
            averageMarks[i] = sumOfMarks[i]/numOfSubjects;
        }

        System.out.println("---Results---");

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(studentId[i] + ". " + studentName[i] + " --> Average Marks = " + averageMarks[i]);
        }

        System.out.println("---Average per subject---");
        for (int i = 0; i < numOfSubjects; i++) {
            for (int j = 0; j < numOfStudents; j++) {
                subjectSum[i] += marks[j][i];
            }
            subjectAverage[i] = subjectSum[i]/numOfStudents;
            System.out.println("Subject " + (i+1) + " --> Average = " + subjectAverage[i] );
        }

        System.out.println("---Highest Average---");
        double highestAverage = averageMarks[0];
        double lowestAverage = averageMarks[0];
        String highestName = studentName[0];
        String lowestName = studentName[0];

        for (int i = 0; i < numOfStudents; i++) {
            if(averageMarks[i]>=highestAverage){
                highestAverage = averageMarks[i];
                highestName = studentName[i];
            }
            if(averageMarks[i]<=lowestAverage){
                lowestAverage = averageMarks[i];
                lowestName = studentName[i];
            }
        }

        System.out.println("Student with highest average: " + highestName + " (" + highestAverage + ")");
        System.out.println("Student with lowest average: " + lowestName + " (" + lowestAverage + ")");

        highestAverage = subjectAverage[0];
        lowestAverage = subjectAverage[0];
        highestName = "";
        lowestName = "";

        for (int i = 0; i < numOfSubjects; i++) {
            if (subjectAverage[i]>=highestAverage) {
                highestAverage = subjectAverage[i];
                highestName = "Subject " + (i+1);
            }
            if (subjectAverage[i]<=lowestAverage) {
                lowestAverage = subjectAverage[i];
                lowestName = "Subject " + (i+1);
            }
        }
        System.out.println("Subject with highest average: " + highestName + " (" + highestAverage + ")");
        System.out.println("Subject with lowest average: " + lowestName + " (" + lowestAverage + ")");
    }
}
