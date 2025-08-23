package Loops;
import java.util.Scanner;
public class count_number_digit {

	public static void main(String[] args) {
		  Scanner z = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = z.nextInt();
	        int count = 0;
	        while (n>0) {
	        	int k = n % 10;
	        	    n = n / 10;
	            count++;
	         
	        }

	        System.out.println("Number of digits: " +count);
	}

}
