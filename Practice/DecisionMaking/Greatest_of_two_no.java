package DecisionMaking;
import java.util.Scanner;
public class Greatest_of_two_no {

	public static void main(String[] args) {
		Scanner z = new Scanner (System.in);
		System.out.println("entre the no 1:");
		int num1 = z.nextInt();
		System.out.println("entre the no 2:");
		int num2 = z.nextInt();
		if (num1>num2 )
			System.out.println( num1+" its greatest");
		else 
			System.out.println(num2+" its greatest");
		
		

	}

}
