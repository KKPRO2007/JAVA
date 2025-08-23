package Lab_sheet_1;

import java.util.Scanner;

public class Experiment_5 {

    public static void calculategrade(int[] marks) {
        int total = 0;
        for (int mark : marks) 
            total += mark;

        int average = total / marks.length;

        String grade;
        if (average >= 90) 
            grade = "A";
        else if (average >= 75) 
            grade = "B";
        else if (average >= 60) 
            grade = "C";
        else if (average >= 40) 
            grade = "D";
        else 
            grade = "Fail";

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int[] marks = new int[5];
        boolean valid = true;

 
        for (int i = 0; i < 5; i++) {
            marks[i] = z.nextInt();
            if (marks[i] < 0 || marks[i] > 100) 
                valid = false;
            }
        

        if (valid) 
            calculategrade(marks);
         else 
            System.out.println("Invalid, Marks must be between 0 and 100 ");
        
    }
}
