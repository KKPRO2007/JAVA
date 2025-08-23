package Loops;
import java.util.Scanner;
public class find_first_last_digit_no {

	public static void main(String[] args) {
		  Scanner z = new Scanner(System.in);
	        System.out.print("Enter any number: ");
	        int n = z.nextInt();
	        int temp=n;
	        int l = temp%10;
	        while(n>10)
	        	n=n/10;
	        System.out.println("frist digit "+n);
	        System.out.println("last digit "+l);

	}

}
