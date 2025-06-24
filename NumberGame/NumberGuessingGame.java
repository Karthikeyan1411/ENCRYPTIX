package NumberGame;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame implements Game {
    private Scanner scan = new Scanner(System.in);
    private Random rand = new Random();
    private int rounds = 0;
    private int score = 0;
        
    @Override
    public void start() {
        System.out.println("Welcome to the Number Guessing Game!");
        
        do {
            playRound();
            rounds++;
        } while (askToPlayAgain());

        showFinalScore();
    }

    @Override
    public void playRound() {
        int numberToGuess = rand.nextInt(100) + 1;
        int maxAttempts = 7;
        boolean guessedCorrectly = false;

        System.out.println("Round " + (rounds + 1) + ": Guess a number between 1 and 100");

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Attempt " + i + ": ");
            int guess = scan.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed it in " + i + " attempts.");
                score += 10;
                guessedCorrectly = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("The correct number was: " + numberToGuess);
        }
    }

    @Override
    public boolean askToPlayAgain() {
        System.out.println("Do you want to play another round ? (yes/no): ");
        String response = scan.next();
        return response.equalsIgnoreCase("yes");  
    }

    @Override
    public void showFinalScore() {
        System.out.println("Game Over!");
        System.out.println("Rounds Played: " + rounds);
        System.out.println("Final Score: " + score);
    }
   
}
