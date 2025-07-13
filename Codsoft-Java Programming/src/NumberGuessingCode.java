import java.util.Random;
import java.util.Scanner;
public class NumberGuessingCode {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        int roundsplayed=0;
	        int roundswon=0;
	        int totalScore=0;
	        

	        int lower = 1;
	        int upper = 100;
	        int maxAttempts = 5;
	        String playAgain;

	        do {
	            int numberToGuess = random.nextInt(100)+1;
	            int attempts = 0;
	            boolean guessed = false;
	            roundsplayed++;
	        

	            System.out.println("heyy!!Guess the number between " + lower + " and " + upper);
	            System.out.println("You have " + maxAttempts + " attempts");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int guess = sc.nextInt();
	                attempts++;

	                if (guess == numberToGuess) {
	                    System.out.println("You guessed the number correctly");
	                    guessed = true;
	                    roundswon++;
	                    int score =(roundswon) * 10;
	                    totalScore += score;
	                    break;
	                } else if (guess < numberToGuess) {
	                    System.out.println("Too low!");
	                } else {
	                    System.out.println("Too high!");
	                }
	            }

	            if (!guessed) {
	                System.out.println("Sorry! The correct number was: " + numberToGuess);
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            sc.nextLine();
	           
	            playAgain = sc.nextLine().toLowerCase();

	        }
	        while (playAgain.equals("yes"));
	     
	        
	        System.out.println("Your number of attempts:"+roundsplayed);
	        System.out.println("You won"+" "+roundswon+" "+"rounds");
	        System.out.println("Your total score:"+totalScore);
	        System.out.println("Thanks for playing! Goodbye!");
	       
	    }
	}

