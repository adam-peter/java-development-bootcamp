import java.util.Random;
import java.util.Scanner;

public class GuessIt {

    public static final int MAX_ALLOWED_TRIES = 4;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = new Random().nextInt(1, 11);
        System.out.println(randomNum);
        String guessedNumString = null;
        int numberOfGuesses;

        //do { //not guessedNumString.equals("q") - we cant call methods on a null object
        for (numberOfGuesses = 1; numberOfGuesses <= MAX_ALLOWED_TRIES && !"q".equals(guessedNumString); numberOfGuesses++) {
            System.out.print("Guess a number between 1 - 10 inclusive (q to quit): ");
            guessedNumString = scan.nextLine();

            if (guessedNumString.matches("-?\\d{1,2}")) { //if its between 1 - 2 digits
                int guessedNum = Integer.parseInt(guessedNumString);
                String guessText = numberOfGuesses == 1 ? "guess" : "guesses";

                if (randomNum == guessedNum) {
                    System.out.printf("The random number was %d. You got it! (%d %s)%n", randomNum, numberOfGuesses, guessText);
                    System.out.println("You win!");
                    break;
                } else {
                    System.out.printf("You didn't get it! The random number is %s than %d (%d %s)%n", (randomNum > guessedNum) ? "greater" : "smaller", guessedNum, numberOfGuesses, guessText);
                }
            }
        }
        //} while (!"q".equals(guessedNumString) && numberOfGuesses < MAX_ALLOWED_TRIES);

        if (numberOfGuesses > MAX_ALLOWED_TRIES) {
            System.out.printf("You lose! The random number was %d.%n", randomNum);
        }

        System.out.println("Goodbye!");
    }
}
