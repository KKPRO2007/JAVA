package Loops;

import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = z.nextInt();
        int rev = 0;

        while (n > 0) {
            int k = n % 10;     
                n = n / 10; 
            rev = rev * 10 + k;   
        }

        System.out.println(rev);
    }
}
