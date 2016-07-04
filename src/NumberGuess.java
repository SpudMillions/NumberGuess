import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//get max value from user
		int max;
		System.out.print("Enter an integer to set as the Max Value: ");
		max = sc.nextInt();
		
		//generate target number
		Random gen = new Random();
		int target = 1 + gen.nextInt(max);
		
		//start guessing loop
		int numGuesses = 1;
		int curGuess = 0;
		System.out.println("Guess a number between 1 and " + max);
		
		for(numGuesses = 1;curGuess != target; numGuesses ++){
			System.out.println("Next guess: ");
			curGuess = sc.nextInt();
			
			//print output based on the guess
			if(curGuess < target){
				System.out.println(curGuess + " is too low.");
			}else if (curGuess > target){
				System.out.println(curGuess + " is too high");
			}else{
				System.out.println("You got it in " + numGuesses + " guesses!");
				sc.close();
			}
		}
	}

}
