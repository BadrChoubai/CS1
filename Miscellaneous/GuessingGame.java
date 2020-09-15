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
    public static int guessCounter = 0;
    public static boolean playing = false;
    public int min, max;
    public int number;

    public int getGuess()
    {
        // TODO : Implement logic for fetching, validating and returning user input
        return 0;
    }

    public void play()
    {
        // TODO : implement game logic
        System.out.println(this.min);
        System.out.println(this.max);
        System.out.println(this.number);
    }

    public GuessingGame(int min, int max) {
        this.min = min;
        this.max = max;
        this.number = (int) (Math.random() * max) + min;
    }

    public GuessingGame() {
        this.min = 1;
        this.max = 100;
        this.number = (int) (Math.random() * this.max) + this.min;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to JGuess v:0.0.1");

        GuessingGame gameInstance = new GuessingGame();

        gameInstance.play();

        GuessingGame gameInstanceCustomMinAndMax = new GuessingGame(2, 200);

        gameInstanceCustomMinAndMax.play();
    }
}