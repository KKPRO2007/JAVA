package Arrays;

import java.util.Scanner;

public class Array_sum_of_all_no {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = z.nextInt();
        int sum=0;
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = z.nextInt();
          sum+= a[i];
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }
            System.out.println("\n sum: "+sum);
        }
    }

