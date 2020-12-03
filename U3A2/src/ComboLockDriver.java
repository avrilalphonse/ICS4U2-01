/*
 * Avril Alphonse
 * Unit 3 Activity 2 Assignment 2
 * This program will allow the user to set and guess a combination. It will also allow the user to guess a randomly assigned combination
 */
import javax.swing.JOptionPane;
public class ComboLockDriver 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		int numOne = 0, numTwo = 0, numThree = 0, counter = 0;
		ComboLock lockerCombo = new ComboLock(), lockerCombo2 = new ComboLock();
		lockerCombo.setNumOne(Integer.parseInt(JOptionPane.showInputDialog(null, "Set the first number of your combination:", "FIRST NUMBER",JOptionPane.QUESTION_MESSAGE)));
		while(lockerCombo.getNumOne() > 60 || lockerCombo.getNumOne() < 0)
		{
			lockerCombo.setNumOne(Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nRange: 0-60\nSet the first number of your combination:", "FIRST NUMBER",JOptionPane.ERROR_MESSAGE)));
		}//end while loop
		lockerCombo.setNumTwo(Integer.parseInt(JOptionPane.showInputDialog(null, "Set the second number of your combination:", "SECOND NUMBER",JOptionPane.QUESTION_MESSAGE)));
		while(lockerCombo.getNumTwo() > 60 || lockerCombo.getNumTwo() < 0)
		{
			lockerCombo.setNumTwo(Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nRange: 0-60\nSet the second number of your combination:", "SECOND NUMBER",JOptionPane.ERROR_MESSAGE)));
		}//end while loop
		lockerCombo.setNumThree(Integer.parseInt(JOptionPane.showInputDialog(null, "Set the third number of your combination:", "THIRD NUMBER",JOptionPane.QUESTION_MESSAGE)));
		while(lockerCombo.getNumThree() > 60 || lockerCombo.getNumThree() < 0)
		{
			lockerCombo.setNumThree(Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nRange: 0-60\nSet the third number of your combination:", "THIRD NUMBER",JOptionPane.ERROR_MESSAGE)));
		}//end while loop
		numOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the code!\nEnter the first number:", "FIRST NUMBER", JOptionPane.QUESTION_MESSAGE));
		numTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the code!\nEnter the second number:", "SECOND NUMBER", JOptionPane.QUESTION_MESSAGE));
		numThree = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the code!\nEnter the third number:", "THIRD NUMBER", JOptionPane.QUESTION_MESSAGE));
		if(numOne == lockerCombo.getNumOne() && numTwo == lockerCombo.getNumTwo() && numThree == lockerCombo.getNumThree()) 
		{
			System.out.println("Code Entered: " + numOne + " " + numTwo + " " + numThree + "\nYou have opened the locker!");
		}
		else
		{
			System.out.println("Code Entered: " + numOne + " " + numTwo + " " + numThree + "\nYou did not guess the code :(");
		}//end if statement
		System.out.println();
		counter = 3;
		while(counter > 0)
		{
			numOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the code!\nRange: 1-3\nEnter the first number:", "FIRST NUMBER", JOptionPane.QUESTION_MESSAGE));
			while(numOne > 3 || numOne < 1)
			{
				numOne = Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nGuess the code!\nRange: 1-3\nEnter the first number:", "FIRST NUMBER", JOptionPane.ERROR_MESSAGE));
			}//end while loop
			numTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the code!\nRange: 1-3\nEnter the second number:", "SECOND NUMBER", JOptionPane.QUESTION_MESSAGE));
			while(numTwo > 3 || numTwo < 1)
			{
				numTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nGuess the code!\nRange: 1-3\nEnter the second number:", "SECOND NUMBER", JOptionPane.QUESTION_MESSAGE));
			}//end while loop
			numThree = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the code!\nRange: 1-3\nEnter the third number:", "THIRD NUMBER", JOptionPane.QUESTION_MESSAGE));
			while(numThree > 3 || numThree < 1)
			{
				numThree = Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nGuess the code!\nRange: 1-3\nEnter the third number:", "THIRD NUMBER", JOptionPane.QUESTION_MESSAGE));
			}//end while loop
			if(numOne == lockerCombo2.getNumOne() && numTwo == lockerCombo2.getNumTwo() && numThree == lockerCombo2.getNumThree())
			{
				System.out.println("You have guessed the code! " + lockerCombo2);
				counter = 0;
			}
			else
			{
				System.out.println("You have guessed the wrong code :( " + "Guess: " + numOne + " " + numTwo + " " + numThree);
				counter--;
			}//end if statement
		}//end while loop
		System.out.println("Correct Code: " + lockerCombo2);
	}//end main
}//end class
