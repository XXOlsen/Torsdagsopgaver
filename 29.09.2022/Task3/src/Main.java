import java.util.Random;
import java.util.Scanner;


public class Main {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Read user input
        int input = scan.nextInt();

        // if so...
        if (input == rnd_number) {  //   Compare it with the random number
            //   Let the user know the result of the comparison (was it the right number?)
            System.out.println("You guessed it right, the number was: " + input);
        } else if (input > rnd_number) {
            System.out.println("You guessed wrong, your number is too high");
            makeAGuess();
        } else if (input < rnd_number) {
            System.out.println("You guessed wrong, your number is too low");
            makeAGuess();
        }


        //   If it was NOT the right number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }


}
