package Arrays;
import java.util.Scanner;
public class Array_odd_no_index {

	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("enter the size: ");
		int n = z.nextInt();
		
		int a[]=new int [n];
		System.out.println("entre the elements: ");
		for (int i=0; i<n; i++)
			a[i] =z.nextInt();
		 System.out.println("the elements index: ");
		 for (int i=0; i<n; i++)
		 if (a[i] % 2 != 0)
			 System.out.println(i+a[i]);
	}

}
