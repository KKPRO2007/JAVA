package Loops;

import java.util.Scanner;

public class Sum_of_first_last_digit_no {
	public static void main(String[] args) {
		  Scanner z = new Scanner(System.in);
	        System.out.print("Enter any number: ");
	        int n = z.nextInt();
	        int temp=n;
	        int l = temp%10;
	        int sum=0;
	        while(n>10)
	        {
	        	n=n/10;
	        sum=n+l;
	        }
	        System.out.println(sum);
	        
}
}
