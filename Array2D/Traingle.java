package Array2D;
 import java.util.*;

class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be printed:");
        int rows = sc.nextInt();
    
            // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
                // Print spaces before each star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
                // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
             System.out.println();
        }
    }
}
    


