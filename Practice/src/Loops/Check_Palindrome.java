package Loops;
import java.util.Scanner;

public class Check_Palindrome {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = z.nextInt();
        int rev = 0;
        int num = n; 
        while (n > 0) {
            int k = n % 10;
            n = n / 10;
            rev = rev * 10 + k;
        }
        if (num== rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
