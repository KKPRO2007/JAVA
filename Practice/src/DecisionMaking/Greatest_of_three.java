package DecisionMaking;
import java.util.Scanner;
public class Greatest_of_three {

	public static void main(String[] args) {
		Scanner z= new Scanner (System.in);
		System.out.println("entre the value of a: ");
		int a = z.nextInt();
		System.out.println("entre the value of b: ");
		int b = z.nextInt();
		System.out.println("entre the value of b: ");
		int c = z.nextInt();
		
		if(a>=b && a>=c)
			System.out.println(a+" its greatest");
		else if(b>=b && b>=c)
			System.out.println(b+"i ts greatest");
		else 
			System.out.println(c+" its greatest");
		

	}

}
