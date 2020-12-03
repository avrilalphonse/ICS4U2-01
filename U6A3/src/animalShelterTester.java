/*
 * Avril Alphonse
 * Unit 6 Activity 3 Assignment 1
 * This program will allow the user to make changes to and display the dogs in the shelter
 */
import javax.swing.JOptionPane;
public class animalShelterTester 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INTIALIZATIONS
		AnimalShelter shelter = new AnimalShelter();
		int myChoice = 0, age = 0, numDays = 0;
		String name = null, breed = null;
		do
		{
			myChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one of the following:\n1 - Display list of dogs\n" + 
					"2 - Add a dog to shelter\n3 - Remove a dog from shelter\n4 - Display the shelter's operating cost\n5 - EXIT", "MENU", JOptionPane.QUESTION_MESSAGE));
			while(myChoice < 1 || myChoice > 5)
			{
				myChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "INVALID INPUT\nChoose one of the following:\n1 - Display list of dogs\n" + 
						"2 - Add a dog to shelter\n3 - Remove a dog from shelter\n4 - Display the shelter's operating cost\n5 - EXIT", "MENU", JOptionPane.ERROR_MESSAGE));
			}//end while
			if(myChoice == 1)
			{
				System.out.println(shelter);
			}
			else if(myChoice == 2)
			{
				name = JOptionPane.showInputDialog(null, "What is the new dog's name?", "NAME", JOptionPane.QUESTION_MESSAGE);
				breed = JOptionPane.showInputDialog(null, "What is this dog's breed?", "BREED", JOptionPane.QUESTION_MESSAGE);
				age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is this dog's age?", "AGE", JOptionPane.QUESTION_MESSAGE));
				shelter.addDog(name, breed, age);
			}
			else if(myChoice == 3)
			{
				shelter.removeDog(Integer.parseInt(JOptionPane.showInputDialog(null, "Out of the " + shelter.getDogSize() + ", which dog would you like to remove?", "REMOVE", JOptionPane.QUESTION_MESSAGE)));
			}
			else if(myChoice == 4)
			{
				numDays = Integer.parseInt(JOptionPane.showInputDialog(null, "How many days did the dogs stay?", "# OF DAYS", JOptionPane.QUESTION_MESSAGE));
				System.out.print("The daily cost for operating the shelter for " + numDays + " days is $" + shelter.shelterCost(numDays) + "\n\n");
			}//end if statement
		}while(myChoice != 5);//end while
		System.out.println("Thank you for visiting the shelter! :)");
	}//end main
}//end class
