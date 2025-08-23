package DecisionMaking;
import java.util.Scanner;
public class Check_pv_ve {

	public static void main(String[] args) {
		Scanner z = new Scanner ( System.in );
		System.out.println("enter the number: ");
		int num = z.nextInt();
		if (num>0)
			System.out.println("its positive");
		else if (num<0)
			System.out.println("its negative");
		else
		    System.out.println("its zero");
			

	}

}
