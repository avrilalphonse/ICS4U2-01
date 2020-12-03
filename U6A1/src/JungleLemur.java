/*
 * Avril Alphonse
 * Unit 6 Activity 2 Assignment 1
 * This class file will define the object JungleLemur which extends to Lemur
 */
public class JungleLemur extends Lemur
{
	//Instance Variables
	private String food;
	private String colour;
	private String packSize;
	//Default Constructor #1
	public JungleLemur()
	{
		food = "Mice, Snails and Insects";
		colour = "Black or Blue";
		packSize = "Small groups";
	}//end default constructor #1
	//Regular Constructor
	public JungleLemur(String food, String colour, String packSize)
	{
		this.food = food;
		this.colour = colour;
		this.packSize = packSize;
	}//end regular constructor
	//Default Constructor #2
	public JungleLemur(String packSize)
	{
		food = "Mice, Snails and Insects";
		colour = "Black or Blue";
		this.packSize = packSize;
	}//end default constructor #2
	//Get methods
	public String getFood()
	{
		return food;
	}//end getFood()
	public String getColour()
	{
		return colour;
	}//end getColour()
	public String getPackSize()
	{
		return packSize;
	}//end getPackSize()
	//Set methods
	public void setFood(String food)
	{
		this.food = food;
	}//end setFood()
	public void setColour(String colour)
	{
		this.colour = colour;
	}//end setColour()
	public void setPackSize(String packSize)
	{
		this.packSize = packSize;
	}//end setPackSize()
	public String toString()
	{
		String output = "Food: " + food + "\n";
		output += "Colour: " + colour + "\n";
		output += "Pack Size: " + packSize + "\n";
		return super.toString() + output;
	}//end toString()
}//end JungleLemur class
