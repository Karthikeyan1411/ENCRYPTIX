package NumberGame;

public interface Game {
    void start(); // Start the game
    void playRound(); // Play a single round
    boolean askToPlayAgain(); // Ask user to continue
    void showFinalScore(); // Display final result
}