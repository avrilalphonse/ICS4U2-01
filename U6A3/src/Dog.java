/*
 * Avril Alphonse
 * Unit 6 Activity 3 Assignment 1
 * This class defines a Dog object
 */
public class Dog 
{
	//Instance Variables
	private String name;
	private String breed;
	private int age;
	//Default Constructor
	public Dog()
	{
		name = "Rover";
		breed = "Golden Retreiver";
		age = (int) (Math.random() * 10) + 1;
	}//end Default Constructor
	//Default Constructor #2
	public Dog(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
		age = (int) (Math.random() * 10) + 1;
	}//end Default Constructor #2
	//Regular Constructor
	public Dog(String name, String breed, int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
	}//end Regular Constructor
	//Accessor Methods
	//Set methods
	public void setName(String name)
	{
		this.name = name;
	}//end setName()
	public void setBreed(String breed)
	{
		this.breed = breed;
	}//end setBredd()
	public void setAge(int age)
	{
		this.age = age;
	}//end setAge()
	//Get methods
	public String getName()
	{
		return name;
	}//end getName()
	public String getBreed()
	{
		return breed;
	}//end getBreed()
	public int getAge()
	{
		return age;
	}//end getAge()
	public String toString()
	{
		String output = "The dog's name is " + name + "\n";
		output += "The dog's breed is " + breed + "\n";
		output += "The dog's age is " + age + "\n";
		return output;
	}//end toString()
}//end Dog
