package Arrays;
import java.util.Scanner;
public class Array_reverse {

	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("enter the size: ");
		int n = z.nextInt();
		
		int a[]=new int [n];
		System.out.println("entre the elements: ");
		for (int i=0; i<n; i++)
			a[i] =z.nextInt();
		 System.out.println("the elements: ");
		 for(int i=n-1;i>=0;i--)
			 System.out.println(a[i]);
	}

}
