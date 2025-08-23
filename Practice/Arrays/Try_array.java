package Arrays;
import java.util.Scanner;
public class Try_array {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = z.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) 
            a[i] = z.nextInt();
        
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) 
            System.out.print(a[i]+ " ");
        
    }
}
