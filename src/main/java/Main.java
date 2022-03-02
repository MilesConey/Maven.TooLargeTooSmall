
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner guessingGame = new Scanner(System.in);
        System.out.println("Guess the mystery number between 0 and 20! Enter your guess:");

        double mysteryNumber = Math.floor((Math.random() * 20)); // Math.random generates a number between zero and one. Multiplying the random number of Math.random, 0 to 1, sets a maximum range of 20 and min of 0.
        int guessCounter = 0; // guess attempt counter
        int previousGuess = 0;

        while (true) { // while the while loop is true, it will continue to execute the statements repeatedly
            int guess = guessingGame.nextInt(); // created variable that allowed me to utilize the scanner, and more importantly the scanners input method and .nextInt so that the user can repeatedly enter in another integer.
            if(guess == previousGuess) {
                System.out.println("Oops..you've already entered that number, please enter a new number");
                continue;
            } else if (guess == mysteryNumber) {  //if statement is checking if the user's input is equal to mystery number and if so, prints correct and breaks out of loop
                guessCounter++; //this is counting number of attempts until correct number is guessed, includes guess as part of counter, put within while loop, but outside if statements, so it is applied to all attempts
                System.out.println("correct");
                break;
            } else if (guess > mysteryNumber) { // else if used because there is an additional condition to check
                System.out.println("too large, guess again");
            } else { // else used because this is the final condition
                System.out.println("too small, guess again");
            }
            guessCounter++;
            previousGuess = guess;
        }

        System.out.println("The correct number was " + (int)mysteryNumber + ", you guessed " + guessCounter + " times."); // prints correct number and number of attempts

    }
}
