package Basics;
import java.util.Scanner;
public class Rectangle_area {


	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.println("Entre the length of Rectangle: ");
		int l = z.nextInt();
		System.out.println("Entre the width of the Rectangle: ");
		int w = z.nextInt();
		int a = l*w;
		System.out.println("Area of the Rectangle is: "+ a);
	

	}

}
