import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max = 1000;
        int min = 1;
        int temp;
        int attempts = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 1000");

        int guess = (max + min) / 2;

        do {
            System.out.println("Is your number " + guess + "?");

            System.out.println("Enter '1' to indicate the guess is too high. Enter '2' to indicate the guess is too low. Enter '3' to indicate I guessed correctly.");
            System.out.println("Your input: ");
            temp = input.nextInt();

            if (temp == 1) {
                min = guess;
                System.out.println("Your number is too high");
                guess = nextGuess(guess, min, max);
                attempts++;

            } else if (temp == 2) {
                max = guess;
                System.out.println("Your number is too low");
                guess = nextGuess(guess, min, max);
                attempts++;

            } else if (temp == 3) {
                System.out.println("I guessed correctly!");
                System.out.println("It took me " + attempts + " attempts to guess your number");
            }
            else {
                System.out.println("Invalid input");
            }

        } while (temp != 3);

    }

    public static int nextGuess(int guess, int min, int max) {
        guess = (max + min) / 2;
        return guess;
    }
}
