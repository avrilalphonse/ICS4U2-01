/*
 * Avril Alphonse
 * Unit 6 Activity 4 Assignment 1
 * This class file defines the Object CellPhone
 */
public class CellPhone 
{
	//Instance Variables
	private String carrier;
	private String type;
	private double speed;
	private double memory;
	private int numApps;
	//Default Constructor #1
	public CellPhone()
	{
		carrier = "Rogers";
		type = "IPhone";
		speed = 1.2;
		memory = 64.0;
		numApps = 10;
	}//end default constructor #1
	//Default Constructor #2
	public CellPhone(String carrier, String type)
	{
		this.carrier = carrier;
		this.type = type;
		speed = 1.2;
		memory = 64.0;
		numApps = 10;
	}// end default constructor #2
	//Regular Constructor
	public CellPhone(String carrier, String type, double speed, double memory, int numApps)
	{
		this.carrier = carrier;
		this.type = type;
		this.speed = speed;
		this.memory = memory; 
		this.numApps = numApps;
	}//end reg constructor
	//Accessor Methods
	//Get methods
	public String getCarrier()
	{
		return carrier;
	}//end getCarrier()
	public String getType()
	{
		return type;
	}//end getType()
	public double getSpeed()
	{
		return speed;
	}//end getSpeed()
	public double getMemory()
	{
		return memory;
	}//end getMemory()
	public int getNumApps()
	{
		return numApps;
	}//end getNumApps()
	//Set methods
	public void setCarrier(String carrier)
	{
		this.carrier = carrier;
	}//end setCarrier()
	public void setType(String type)
	{
		this.type = type;
	}//end setType()
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}//end setSpeed()
	public void setMemory(double memory)
	{
		this.memory = memory;
	}//end setMemory()
	public void setNumApps(int numApps)
	{
		this.numApps = numApps;
	}//end setNumApps()
	//toString method
	public String toString()
	{
		String output = "The carrier is " + carrier + "\n";
		output += "The type is " + type + "\n";
		output += "The speed is " + speed + "GHz\n";
		output += "The memory is " + memory + "GB\n";
		output += "The number of apps is " + numApps + "\n";
		return output;
	}//end toString()
}//end CellPhone class
