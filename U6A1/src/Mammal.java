/*
 * Avril Alphonse
 * Unit 6 Activity 2 Assignment 1
 * This class file will define the object Mammal
 */
public class Mammal 
{
	//Instance Variables
	private int itsAge;
	private double itsWeight;
	private String breed;
	private String gender;
	private String[] genders = {"Male", "Female"};
	//Regular Constructor
	public Mammal(int itsAge, double itsWeight, String breed, String gender)
	{
		this.itsAge = itsAge;
		this.itsWeight = itsWeight;
		this.breed = breed;
		this.gender = gender;
	}//end Reg Constructor
	//Default Constructor #1
	public Mammal()
	{
		itsAge = (int) (Math.random() * 15) + 1;
		itsWeight = (int) (Math.random() * 5) + 1;
		breed = "Unknown";
		gender = genders[(int) (Math.random() * 2) + 0];
	}//end Default Constructor #1
	//Default Constructor #2
	public Mammal(String breed, String gender) 
	{
		itsAge = 2;
		itsWeight = 5;
		this.breed = breed;
		this.gender = gender;
	}//end Default Constructor #2
	//Get methods
	public int getAge() 
	{
		return itsAge;
	}//end getAge()
	public double getWeight() 
	{
		return itsWeight;
	}//end getWeight()
	public String getBreed() 
	{
		return breed;
	}//end getBreed()
	public String getGender()
	{
		return gender;
	}//end getGenger()
	//Set methods
	public void setAge(int itsAge) 
	{
		this.itsAge = itsAge;
	}//end setAge()
	public void setWeight(int itsWeight) 
	{
		this.itsWeight = itsWeight;
	}//end setWeight()
	public void setBreed(String breed) 
	{
		this.breed = breed;
	}//end setBreed()
	public void setGender(String gender)
	{
		this.gender = gender;
	}//end setGender()
	public String toString()
	{
		String output = "Age: " + itsAge + "\n";
		output += "Weight: " + itsWeight + "\n";
		output += "Breed: " + breed + "\n";
		output += "Gender: " + gender + "\n";
		return output;
	}//end toString()
}//end Mammal()
