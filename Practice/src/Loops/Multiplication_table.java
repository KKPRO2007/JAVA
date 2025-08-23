package Loops;
import java.util.Scanner;
public class Multiplication_table {
	
	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = s.nextInt();
	        
	        int i = 1;
	        while (i <= 20) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	            i++;

}
	  }
}
