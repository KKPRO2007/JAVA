package Lab_sheet_1;
import java.util.Scanner;
public class Experiment_3 {
 public static String checkevenodd(int n) {
		if (n % 2 == 0)
			return "even";
		else 
		return "odd";
 }
	public static void main(String[] args) {
		Scanner z=new Scanner (System.in);
		int n =z.nextInt();
		
		if(n<-1000000 || n > 1000000) 
			System.out.println("invaild, number must be between -1000000 and 1000000");
		else 
			System.out.println(checkevenodd(n));
	
		
}
}	