package Lab_sheet_1;
import java.util.Scanner;
public class Experiment_1 {
public static void
displayuserinfo(String name, int age) {
	System.out.println("hello "+name+" you are "+age+" years old");
}
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		
		String name= z.nextLine();
		int age = z.nextInt();
		
		if( age<1 || age >120 || name.length()>50)
			System.out.println("invaild input");
		else
			displayuserinfo(name, age);
		
	}
		
	}

