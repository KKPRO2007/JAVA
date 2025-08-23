package DecisionMaking;
import java.util.Scanner;
public class Check_even_odd {

	public static void main(String[] args) {
		Scanner z=new Scanner (System.in);
		System.out.println("Entre the Number: ");
		int num=z.nextInt();
		if (num%2 == 0)
			System.out.println("its even");
		else 
			System.out.println("its odd");
		

	}

}
