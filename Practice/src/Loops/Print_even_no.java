package Loops;
import java.util.Scanner;
public class Print_even_no {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("entre the number: ");
		int n =x.nextInt();
		int i = 2;
		 while (i <= n) {
	            System.out.println(i);
	            i += 2;
		 }
	}

}
