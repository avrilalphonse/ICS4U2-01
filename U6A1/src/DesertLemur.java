/*
 * Avril Alphonse
 * Unit 6 Activity 2 Assignment 1
 * This class file will define the object DesertLemur which extends to Lemur
 */
public class DesertLemur extends Lemur
{
	//Instance Variables
	private String food;
	private String colour;
	private double babyDeathRate;
	//Default Constructor #1
	public DesertLemur()
	{
		food = "Cacti";
		colour = "White";
		babyDeathRate = 0.66;
	}//end Default constructor
	//Regular Constructor
	public DesertLemur(String food, String colour, double babyDeathRate)
	{
		this.food = food;
		this.colour = colour;
		this.babyDeathRate = babyDeathRate;
	}//end Regular constructor
	//Default Constructor #2
	public DesertLemur(String colour)
	{
		food = "Catci";
		this.colour = colour;
		babyDeathRate = 0.66;
	}//end Default Constructor #2
	//Accessor Methods 
	//Get Methods
	public String getFood()
	{
		return food;
	}//end getFood()
	public String getColour()
	{
		return colour;
	}//end getColour()
	public double getBabyDeathRate()
	{
		return babyDeathRate;
	}//end getBabyDeathRate()
	//Set Methods
	public void setFood(String food)
	{
		this.food = food;
	}//end setFood()
	public void setColour(String colour)
	{
		this.colour = colour;
	}//end setColour()
	public void setBabyDeathRate(double babyDeathRate)
	{
		this.babyDeathRate = babyDeathRate;
	}//end setBabyDeathRate()
	public String toString()
	{	
		String output = "Food: " + food + "\n";
		output += "Colour: " + colour + "\n";
		output += "Baby Death Rate: " + babyDeathRate + "\n";
		return super.toString()  + output;
	}//end toString()
}//end DesertLemur class

