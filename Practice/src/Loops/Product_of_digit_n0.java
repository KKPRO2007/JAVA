package Loops;
import java.util.Scanner;

public class Product_of_digit_n0 {

	public static void main(String[] args) {
		 Scanner z = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n = z.nextInt();
	        int product = 1; 
	        while (n > 0) {
	            int k = n % 10; 
	                n = n / 10;  
	                product *= k;    
	        }

	        System.out.println("Product of digits: " +product);
	    }

	}


