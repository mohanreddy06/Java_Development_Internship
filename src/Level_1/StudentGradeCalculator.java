package level1;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        double[] grades = new double[numberOfSubjects];
        double total = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            total += grades[i];
        }

        double average = total / numberOfSubjects;

        System.out.println("===== Result =====");
        System.out.printf("Total Marks: %.2f%n", total);
        System.out.printf("Average Marks: %.2f%n", average);

        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}