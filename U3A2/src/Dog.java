/*
 * Avril Alphonse
 * Unit 3 Activity 2 Assignment 1
 * This class contains the properties of a Dog object
 */
public class Dog 
{
	private String name;
	private String breed;
	private int age;
	private int aggression;
	private int hunger;
	//Default Constructor
	public Dog()
	{
		name = "Rover";
		breed = "Golden Retreiver";
		age = 0;
		aggression = (int) (Math.random() * 10) + 1;
		hunger = (int) (Math.random() * 10) + 1;
	}//end Default Constructor
	//Default Constructor #2
	public Dog(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
		age = 0;
		aggression = (int) (Math.random() * 10) + 1;
		hunger = (int) (Math.random() * 10) + 1;
	}//end Default Constructor #2
	//Regular Constructor
	public Dog(String name, String breed, int age, int aggression, int hunger)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.aggression = aggression;
		this.hunger = hunger;
	}//end Regular Constructor
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
	public void setAggression(int aggression)
	{
		this.aggression = aggression;
	}//end setAggression()
	public void setHunger(int hunger)
	{
		this.hunger = hunger;
	}//end setHunger()
	//Set methods
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
	public int getAggression()
	{
		return aggression;
	}//end getAggression()
	public int getHunger()
	{
		return hunger;
	}//end getHunger()
	public String toString()
	{
		String output = "The dog's name is " + name + "\n";
		output += "The dog's breed is " + breed + "\n";
		output += "The dog's age is " + age + "\n";
		output += "The dog aggression level is " + aggression + "\n";
		output += "The dog hunger level is " + hunger + "\n";
		return output;
	}//end toString()
}//end Dog
