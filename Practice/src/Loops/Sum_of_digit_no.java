package Loops;

import java.util.Scanner;

public class Sum_of_digit_no {

	public static void main(String[] args) {
		 Scanner z = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n = z.nextInt();
	        int sum = 0;
	        while (n > 0) {
	            int k = n % 10;
	            sum = sum + k;
	            n = n / 10;
	        }
	        System.out.println(sum);
	    }
	}

