// import java.util.Scanner;

// public class Demo{
//     public static void main(String[] args) {
//         // Create a Scanner object to read input from the user
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter the first number
//         System.out.print("Enter the first number: ");
//         // Read the first number from the user
//         int num1 = scanner.nextInt();

//         // Prompt the user to enter the second number
//         System.out.print("Enter the second number: ");
//         // Read the second number from the user
//         int num2 = scanner.nextInt();

//         // Close the Scanner to prevent resource leak
//         scanner.close();

//         // Add the numbers
//         int sum = num1 + num2;

//         // Display the result
//         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//     }
// }

// import java.util.Scanner;

// public class Demo{
//     public static void main(String[] args) {
//         // Create a Scanner object to read input from the user
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter numbers
//         System.out.println("Enter numbers to calculate their sum. Enter 0 to finish.");

//         // Initialize sum to 0
//         int sum = 0;

//         // Continue reading numbers until the user enters 0
//         while (true) {
//             // Read the next number from the user
//             System.out.print("Enter a number (enter 0 to finish): ");
//             int num = scanner.nextInt();

//             // Break the loop if the user enters 0
//             if (num == 0) {
//                 break;
//             }

//             // Add the number to the sum
//             sum += num;
//         }

//         // Close the Scanner to prevent resource leak
//         scanner.close();

//         // Display the result
//         System.out.println("The sum of the entered numbers is: " + sum);
//     }
// }
