import java.util.Scanner;
import java.util.Random;

public class Team {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int userChoice = 0;

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");

        try {
            System.out.print("Enter your choice (1-3): ");
            userChoice = sc.nextInt();

            // Check for invalid number input
            if (userChoice < 1 || userChoice > 3) {
                throw new IllegalArgumentException("Invalid choice! Please enter a number between 1 and 3.");
            }

            int computerChoice = rand.nextInt(3) + 1;

            String[] choices = {"", "Rock", "Paper", "Scissors"};

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Game Logic
            if (userChoice == computerChoice) {
                System.out.println("Result: It's a Draw!");
            }
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {

                System.out.println("Result: You Win!");
            }
            else {
                System.out.println("Result: Computer Wins!");
            }

        } 
        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid number (1, 2, or 3).");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("Game Ended.");
        }
    }
}