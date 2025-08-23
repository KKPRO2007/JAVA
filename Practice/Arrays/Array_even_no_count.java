package Arrays;
import java.util.Scanner;

public class Array_even_no_count {
	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("enter the size: ");
		int n = z.nextInt();
		
		int a[]=new int [n];
		System.out.println("entre the elements: ");
		for (int i=0; i<n; i++)
			a[i] =z.nextInt();
		int evenCount = 0; 
		 System.out.println("the elements: ");
		 for (int i=0; i<n; i++)
		 if (a[i] % 2 == 0) {
	     System.out.println(a[i]);
		 evenCount++;
		 }
	        System.out.println("Total even numbers: " + evenCount);

		 

}
}