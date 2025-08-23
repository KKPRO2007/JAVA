package Arrays;

import java.util.Scanner;

public class Array_print__max_min {

	public static void main(String[] args) {
			Scanner z = new Scanner (System.in);
			System.out.println("enter the size: ");
			int n = z.nextInt();
			
			int a[]=new int [n];
			System.out.println("entre the elements: ");
			for (int i=0; i<n; i++)
				a[i] =z.nextInt();
			
			int min =a[0];
			int max =a[0];
			
			
			 for (int i=1; i<n; i++) {
			 if ( a[i] >max) {
				 max=a[i];
			 }
				 if (a[i] <min) {
					 min=a[i];
				 }
			 }
		
			 System.out.println("the elements max: "+max);
			 System.out.println("the elements min: "+min);
		}

	}
