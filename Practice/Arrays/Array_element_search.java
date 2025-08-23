package Arrays;
import java.util.Scanner;

public class Array_element_search {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int n = z.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) 
            a[i] = z.nextInt();
        System.out.print("Enter the element to search: ");
        int search = z.nextInt();
        
        boolean found = false;
        int index = -1;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == search) {
                found = true;
                index = i;
                break;
            }
        }
        
        if (found) System.out.println("Element found at index " + index);
         else  System.out.println("not found");
        
        
    
    }
}
