import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; 
        int attempts = 0;
        int maxAttempts = 10; 

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println(" Congratulations! You won!");
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you didn't guess the number. The secret number was " + secretNumber);
        }

        System.out.print("Do you want to play again? (y/n): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {
            main(args); 
        }
    }
}

