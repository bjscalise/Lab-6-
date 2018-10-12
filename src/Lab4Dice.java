import java.util.Scanner;
import java.util.Random;

public class Lab4Dice {

	public static void main(String[] args) {

		/*
		 * Prompt the user to input # of die faces. Create a scanner for the input.
		 * Prompt the user to roll the dice. Create do/while to allow this to replay
		 * when the user inputs Y Use random # generator to output random dice roll.
		 */
		Scanner scan = new Scanner(System.in); // Creating an instance of the scanner.

		System.out.println("Welcome to the Grand Circus Casino!");
		String contPrompt = "yes"; // This prompt indicates if the user wants to continue using the program.

		do { // This do while is used to keep the program running as long as the user indicates yes.
			System.out.println("How many sides will each die have?: ");
			int dieSides = scan.nextInt(); // User input, # of sides.

			int firstRoll = rollDice(dieSides); // This calls the rollDice method and gives dieSides as in input.
			int secondRoll = rollDice(dieSides); // This creates the variables for both rolls so they can be identified for craps.

			System.out.println("Your first roll: " + firstRoll); // Prints out the rolls.
			System.out.println("Your second roll: " + secondRoll);

			craps(firstRoll, secondRoll); // This calls the craps method and inputs the dice value.

			System.out.println("Type yes to continue. Press any other key to quit.");

			scan.nextLine(); // Garbage line.

			contPrompt = scan.nextLine();

		} while (contPrompt.equalsIgnoreCase("yes")); // This while loop confirms that the user wants to continue.

	}

	private static void craps(int firstRoll, int secondRoll) { // The dice value is inputed here as a parameter.

		if ((firstRoll + secondRoll == 7) || (firstRoll + secondRoll == 11)) {
			System.out.println("Craps!");
		}
		if ((firstRoll == 6) && (secondRoll == 6)) {
			System.out.println("Boxcars!");
		}
		if ((firstRoll == 1) && (secondRoll == 1)) {
			System.out.println("Snake eyes!");
		}
		// The names of certain dice pairings are outputed based on the value of the dice.
	}

	private static int rollDice(int dieSides) { // The # of sides is inputed into this method.

		Random generator = new Random(); // Creating an instance of the Random class.
		int rollRandom = (generator.nextInt(dieSides - 1 + 1) + 1); 
		// The generator will find #'s between 1 and the # of sides. 
		return rollRandom;
		// The data(int) from this method is returned.
	}
	
	}
