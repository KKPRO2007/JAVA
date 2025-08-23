package Arrays;

import java.util.Scanner;

public class Array_print_negtive {

	public static void main(String[] args) {
			Scanner z = new Scanner (System.in);
			System.out.println("enter the size: ");
			int n = z.nextInt();			
			int a[]=new int [n];
			System.out.println("entre the elements: ");
			for (int i=0; i<n; i++)
				a[i] =z.nextInt();
			
			 System.out.println("the negtive number ");
			 for (int i=0; i<n; i++)
			 if (a[i] < 0)
				 System.out.println(a[i]);
		}

	}
