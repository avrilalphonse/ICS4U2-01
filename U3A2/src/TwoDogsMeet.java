/*
 * Avril Alphonse
 * Unit 3 Activity 2 Assignment 2
 * This program will make the decision if the two user inputted dogs can meet or not
 * If ALL the aggression and hunger levels are below 5, they can meet
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TwoDogsMeet 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		String name = null, breed = null;
		int inputFlag = 0;
		for(int i = 0; i < 2; i++)
		{
			name = JOptionPane.showInputDialog(null, "What is the name of dog " + (i+1) + "?", "DOG NAME", JOptionPane.QUESTION_MESSAGE);
			breed = JOptionPane.showInputDialog(null, "What is the breed of dog " + (i+1) + "?", "DOG BREED", JOptionPane.QUESTION_MESSAGE);
			dogs.add(new Dog(name, breed));
			System.out.println(dogs.get(i));
		}//end for loop
		for(int i = 0; i < dogs.size(); i++)
		{
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the age of " + dogs.get(i).getName() + "?", "CHANGE AGE?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				dogs.get(i).setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "What is the age of " + dogs.get(i).getName() + "?", "DOG AGE", JOptionPane.QUESTION_MESSAGE)));
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the aggression level of " + dogs.get(i).getName() + "?", "CHANGE AGGRESSION?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				dogs.get(i).setAggression(Integer.parseInt(JOptionPane.showInputDialog(null, "On a scale of 1-10,\nwhat is the aggression of " + dogs.get(i).getName() + "?", "DOG AGGRESSION", JOptionPane.QUESTION_MESSAGE)));
				while(dogs.get(i).getAggression() > 10)
				{
					dogs.get(i).setAggression(Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nOn a scale of 1-10,\nwhat is the aggression of " + dogs.get(i).getName() + "?", "DOG AGGRESSION", JOptionPane.ERROR_MESSAGE)));
				}//end while loop
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the hunger level of " + dogs.get(i).getName() + "?", "CHANGE HUNGER?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				dogs.get(i).setHunger(Integer.parseInt(JOptionPane.showInputDialog(null, "On a scale of 1-10,\nwhat is the hunger of " + dogs.get(i).getName() + "?", "DOG HUNGER", JOptionPane.QUESTION_MESSAGE)));
				while(dogs.get(i).getHunger() > 10)
				{
					dogs.get(i).setHunger(Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID\nOn a scale of 1-10,\nwhat is the hunger of " + dogs.get(i).getName() + "?", "DOG HUNGER", JOptionPane.ERROR_MESSAGE)));
				}//end while loop
			}//end if statement
			System.out.println("FINAL LEVELS");		
			System.out.println(dogs.get(i));
		}//end for loop
		if(dogs.get(0).getAggression() <= 5 && dogs.get(1).getAggression() <= 5 && dogs.get(0).getHunger() <= 5 && dogs.get(1).getHunger() <= 5)
		{
			System.out.println("The dogs CAN meet");
		}
		else
		{
			System.out.println("The dogs CANNOT meet");
		}//end if statement
	}//end main
}//end class

