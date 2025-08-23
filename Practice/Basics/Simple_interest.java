package Basics;
import java.util.Scanner;
public class Simple_interest {

	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.println("entre thr princpal amount: ");
		Double princapal = z.nextDouble();
		System.out.println("entre thr rate of intrestt: ");
		Double rate = z.nextDouble();
		System.out.println("entre the time: ");
		Double time = z.nextDouble();
		double si = (princapal*rate*time) /100;
		System.out.println("simple intres: " + si);
	}

}
