package Loops;
import java.util.Scanner;
public class Sum_of_n_num {
	public static void main(String k []) {
	Scanner z = new Scanner(System.in);
	System.out.println("Entre the number");
	int n =z.nextInt();
	int i = 1;
	int sum = 0;
	while(i<=n)
	{
		sum=sum+i;
		i++;
}
	
	System.out.println(sum);
}
}
