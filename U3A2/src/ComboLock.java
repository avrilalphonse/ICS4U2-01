/*
 * Avril Alphonse
 * Unit 3 Activity 2 Assignment 2
 * This class file defines a locker combination
 */
public class ComboLock 
{
	//Instance Variables
	private int numOne;
	private int numTwo;
	private int numThree;
	//Regular Constructor
	public ComboLock(int numOne, int numTwo, int numThree)
	{
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.numThree = numThree;
	}//end Regular Constructor
	//Default Constructor 
	public ComboLock()
	{
		numOne = (int) (Math.random() * 3) + 1;
		numTwo = (int) (Math.random() * 3) + 1;
		numThree = (int) (Math.random() * 3) + 1;
	}//end Default Constructor
	//Default Constructor #2
	public ComboLock(int numOne)
	{
		this.numOne = numOne;
		numTwo = (int) (Math.random() * 3) + 1;
		numThree = (int) (Math.random() * 3) + 1;
	}//end Default Constructor #2
	//Set methods
	public void setNumOne(int numOne)
	{
		this.numOne = numOne;
	}//end setNumOne()
	public void setNumTwo(int numTwo)
	{
		this.numTwo = numTwo;
	}//end setTwo()
	public void setNumThree(int numThree)
	{
		this.numThree = numThree;
	}//end setThree()
	//Get methods
	public int getNumOne()
	{
		return numOne;
	}//end getNumOne()
	public int getNumTwo()
	{
		return numTwo;
	}//end getTwo()
	public int getNumThree()
	{
		return numThree;
	}//end getThree()
	public String toString()
	{
		String output = "The combination is " + numOne + " " + numTwo + " " + numThree;
		return output;
	}//end toString()
}//end ComboLock
