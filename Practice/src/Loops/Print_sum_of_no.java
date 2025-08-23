package Loops;

import java.util.Scanner;

public class Print_sum_of_no {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = z.nextInt();
        int sum = 0;
        int i = 1;
        while (i < n + 1) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
