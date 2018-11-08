import java.util.Scanner;

public class TestClass {
	public Boolean makeHangman(String word, int numOfGuesses){
		String wordToGuess 		= word;
		int lengthOfWord			= 6;
		int maxTries				= numOfGuesses;
		int tries					= 0;
		boolean gameRunning		= true;
		Scanner scanner			= new Scanner(System.in);
		char[] lettersGuessed 	= new char[lengthOfWord];

		for (int i = 0; i < lengthOfWord; i++) {
			lettersGuessed[i] = '*';
		}
		while (gameRunning == true) {
			//TODO: while gueses are still remaining
			System.out.print("Word to guess: ");
			for (int i = 0; i < lengthOfWord; i++) {
				System.out.print(lettersGuessed[i]);
				if (i < lengthOfWord - 1) {
					System.out.print(" ");
				}
			}

			System.out.print("\n\nEnter a letter: ");
			String wordEntered = scanner.next();
			char letter = wordEntered.charAt(0);

			boolean foundMatch = false;
			for (int i = 0; i < lengthOfWord; i++) {
				char letterInWord = wordToGuess.charAt(i);
				char letterInGuesses = lettersGuessed[i];
				if (letterInWord == letter && letterInGuesses == '*') {
					lettersGuessed[i] = letter;
					foundMatch = true;
				}
			}

			if (foundMatch == false) {
				tries = tries + 1;
				if (tries < maxTries) {
					int triesLeft = maxTries - tries;
					System.out.println("\nIncorrect. You have " + triesLeft + " tries left.\n");
				} else {
					System.out.println("\nIncorrect. Sorry, you are out of tries! The word was: " + wordToGuess);
					gameRunning = false;
				}
			} else {
				System.out.println("\nCorrect!\n");
				
				boolean anyLettersLeft = false;
				for (int i = 0; i < lengthOfWord; i++) {
					if (lettersGuessed[i] == '*') {
						anyLettersLeft = true;
					}
				}
				
				if (anyLettersLeft == false) {
					System.out.println("Congrats! You win! The word was: " + wordToGuess);
					gameRunning = false;
					return true;
				}
			}
		}
		return false;
		scanner.close();
	}
	public static void main(String[] args) {
		String word = "banana";
		int guesses = 7;
		Boolean success = makeHangman(word, guesses);
		if (success == true){
			System.out.println("You won");
		}
		else{
			System.out.println("You lost");
		}
	}
}
