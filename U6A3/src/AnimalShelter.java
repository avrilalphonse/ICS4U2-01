/*
 * Avril Alphonse
 * Unit 6 Activity 3 Assignment 1
 * This class defines an AnimalShelter object
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AnimalShelter 
{
	//Instance Variables
	private ArrayList<Dog> dogs;
	//Default Constructor
	public AnimalShelter()
	{
		dogs = new ArrayList<Dog>();
		fillDogs();
	}//end default constructor
	//Accessor Methods
	//Get methods
	public ArrayList<Dog> getDogs()
	{
		return dogs;
	}//end getDogs()
	//Set methods
	public void setDogs(ArrayList<Dog> dogs)
	{
		this.dogs = dogs;
	}//end setDogs()
	//Other methods
	public void fillDogs()
	{
		String name = null, breed = null;
		int age = 0, inputFlag = 0;
		do
		{
			name = JOptionPane.showInputDialog(null, "What is the dog's name?", "NAME BOX", JOptionPane.QUESTION_MESSAGE);
			breed = JOptionPane.showInputDialog(null, "What is the dog's breed?", "BREED BOX", JOptionPane.QUESTION_MESSAGE);
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the dog's age?", "AGE BOX", JOptionPane.QUESTION_MESSAGE));
			dogs.add(new Dog(name, breed, age));
			inputFlag = (JOptionPane.showConfirmDialog(null, "Would you like to add another dog?", "ADD DOG?", JOptionPane.YES_NO_OPTION));
		}while(inputFlag == JOptionPane.YES_NO_OPTION);//end do while
	}//end fillDogs()
	public int getDogSize()
	{
		return dogs.size();
	}//end getDogSize()
	public void addDog(String name, String breed, int age)
	{
		dogs.add(new Dog(name, breed, age));
	}//end addDog()
	public void removeDog(int numDog)
	{
		dogs.remove((numDog-1));
	}//end removeDog()
	public int shelterCost(int days)
	{
		return (15 * dogs.size()) * days;
	}//end shelterCost()
	public String toString()
	{
		String output = "The dogs in the shelter are:\n";
		for(int i = 0; i < dogs.size(); i++)
		{
			output += "Dog #" + (i+1) + "\n";
			output += dogs.get(i);
		}//end for loop
		return output;
	}//end toString()
}//end AnimalShelter class
