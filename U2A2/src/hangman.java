/*
 * Avril Alphonse
 * Hangman: Unit 2 Activity 2 Program 2
 * This program will play hangman with the user
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class hangman
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		ArrayList<String> wordList = new ArrayList<String>();
		String wordChoice = null, letterGuesses = null, lettersUsed = "";
		int wordCount = 0, wrongG = 0, correctG = 0, guessCounter = 0;
		Scanner sc = new Scanner(System.in);
		wordCount = 1;
		Collections.addAll(wordList, "snickers", "mars", "twix", "aero", "kitkat", "smarties", "hersheys", "coffee crisp", "bubble gum");
		wordChoice = wordList.get((int)(Math.random() * 8 + 1));
		String word[][] = new String [2][wordChoice.length()];
		for(int i = 0; i < wordChoice.length(); i++)
		{
			if (wordChoice.charAt(i) == ' ')
			{
				wordCount += 1;
				word[0][i] = " ";
			}
			else
			{
				word[0][i] = "-";
			}//end if statement
			word[1][i] = wordChoice.substring(i, i+1);
		}//end for loop
		System.out.println("Would you like to play hangman? Lets make the topic different types of chocolate!");
		System.out.println("Word Count: " + wordCount);
		do
		{
			for (int i = 0; i < wordChoice.length(); i++)
			{
				System.out.print(word[0][i]);
			}//end for loop
			System.out.println("\nGuessed letters: " + lettersUsed);
			System.out.println("Guess a letter:");
			letterGuesses = sc.next();
			lettersUsed = lettersUsed + letterGuesses + " ";
			for(int i = 0; i < wordChoice.length(); i++)
			{
				if (letterGuesses.equals(word[1][i]))
				{
					correctG += 1;
					word[0][i] = letterGuesses;
					guessCounter = 1;
				}//end if statement
				if (i == (wordChoice.length() - 1) && guessCounter == 0)
				{
					wrongG += 1;
					System.out.println("Incorrect Guess :(");
				}
				else if (i == (wordChoice.length() - 1))
				{
					System.out.println("Correct Guess!");
				}//end if statement
			}//end for loop
			guessCounter = 0;
			if (wrongG == 0)
			{
				System.out.println("Nobody is hanging yet...");
			}
			else if (wrongG == 1)
			{
				System.out.println(" 0 ");
			}
			else if (wrongG == 2)
			{
				System.out.println(" 0 \n/");
			}
			else if (wrongG == 3) 
			{
				System.out.println(" 0 \n/|");
			}
			else if (wrongG == 4)
			{
				System.out.println(" 0 \n/|\\");
			}
			else if (wrongG == 5)
			{
				System.out.println(" 0 \n/|\\\n |");
			}
			else if (wrongG == 6)
			{
				System.out.println(" 0 \n/|\\\n |\n/");
			}
			else
			{
				System.out.println(" 0 \n/|\\\n |\n/ \\");
			}//end if statement
		}while (correctG < (wordChoice.length() + 1 - wordCount) && wrongG < 7);//end do while
		if (wrongG == 7)
		{
			System.out.println("You lost. Try again next time!");
		}
		else 
		{
			System.out.println("Great! You won!");
		}//end if statements
		sc.close();
	}//end main
}//end class

