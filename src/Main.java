import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(); // random # generator
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) { // multiple rounds until user doesn't want to play again
            int die1 = rnd.nextInt(6) + 1; // roll dice
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1); // tell you what dice 1 roll
            System.out.println("Die 2: " + die2); // dice two roll
            System.out.println("Sum: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) { // outcome from sum
                System.out.println("Crapping out ! You lost.");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Natural! You won.");
            } else {
                System.out.println("The Point is set to " + crapsRoll);
                boolean keepRolling = true;

                while (keepRolling) { // dice loop
                    int newDie1 = rnd.nextInt(6) + 1;
                    int newDie2 = rnd.nextInt(6) + 1;
                    int newRoll = newDie1 + newDie2;

                    System.out.println("Rolling the dice again...");
                    System.out.println("Die 1: " + newDie1);
                    System.out.println("Die 2: " + newDie2);
                    System.out.println("Sum: " + newRoll);

                    if (newRoll == crapsRoll) { // next roll results
                        System.out.println("You made  point and won!");
                        keepRolling = false;
                    } else if (newRoll == 7) {
                        System.out.println("You got a seven and lost.");
                        keepRolling = false;
                    } else {
                        System.out.println("Trying for point ");
                    }
                }
            }

            System.out.print("Would you like to play again? (y/n): "); // ask player if they want to play again
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                keepPlaying = false;
            }
        }
    }
}


