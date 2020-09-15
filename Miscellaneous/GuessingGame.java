import java.util.Scanner;

class GuessingGame {
    /**
     * @class GuessingGame
     *
     * ```
     * usage:
     *
     * GuessingGame gameInstanceName = new GuessingGame();
     * gameInstanceName.play() // Starts the game;
     * ```
     */

    private static Scanner inputScanner = new Scanner(System.in);
    public static boolean playing = true;
    public static int number;

    public int getGuess()
    {
        // TODO : Implement logic for fetching, validating and returning user input
        return 0;
    }

    public void play()
    {
        // TODO : implement game logic
    }


    public GuessingGame() {
        this.playing = true;
        this.number = (int) (1 * Math.random()) * 100;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to JGuess v:0.0.1");

        GuessingGame gameInstance = new GuessingGame();

        gameInstance.play();
    }
}