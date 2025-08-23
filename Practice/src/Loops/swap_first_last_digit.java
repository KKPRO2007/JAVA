package Loops;
import java.util.Scanner;
public class swap_first_last_digit {

	public static void main(String[] args) {
		  Scanner z = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = z.nextInt();
	        int temp=n;
	        int l = temp%10;
	        while(n>10)
	        	n=n/10;
	        System.out.println("frist digit before swap: "+n);
	        System.out.println("last digit before swap: "+l);
	        int t = n;
	        n = l;
	        l = n;
	        System.out.println("frist digit after swap: "+n);
	        System.out.println("last digit after swap: "+l);
	}

}
