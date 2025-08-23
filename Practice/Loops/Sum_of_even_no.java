package Loops;

import java.util.Scanner;

public class Sum_of_even_no {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("entre the number: ");
		int n =x.nextInt();
		int i = 2;
		int sum=0;
		 while (i <= n) {
			 sum=sum+i;
			   i += 2;
		 }
	            System.out.println(sum);
	          
	}

}
