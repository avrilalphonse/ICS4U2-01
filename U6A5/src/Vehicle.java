/*
 * Avril Alphonse
 * Unit 6 Activity 5 Assignment 1
 * This class file defines a Vehicle object
 */
public abstract class Vehicle 
{
	//Instance Variables
	private double gasKilometrage;
	private double fuelTankSize;
	private double fuelAvailable;
	//Default Constructor #1
	public Vehicle()
	{
		gasKilometrage = 0;
		fuelTankSize = 0;
		fuelAvailable = 0;
	}//end default constructor #1
	//Default Constructor #2
	public Vehicle(double fuelTankSize)
	{
		gasKilometrage = 0;
		this.fuelTankSize = fuelTankSize;
		fuelAvailable = 0;
	}//end default constructor #2
	//Regular Constructor
	public Vehicle(double gasKilometrage, double fuelTankSize, double fuelAvailable)
	{
		this.gasKilometrage = gasKilometrage;
		this.fuelTankSize = fuelTankSize;
		this.fuelAvailable = fuelAvailable;
	}//end regular constructor
	//Accessor Methods
	//Get Methods
	public double getGasKilometrage()
	{
		return gasKilometrage;
	}//end getGasKilometrage()
	public double getFuelTankSize()
	{
		return fuelTankSize;
	}//end getFuelTankSize()
	public double getFuelAvailable()
	{
		return fuelAvailable;
	}//end getFuelAvailable()
	//Set Methods
	public void setGasKilometrage(double gasKilometrage)
	{
		this.gasKilometrage = gasKilometrage;
	}//end setGasKilometrage()
	public void setFuelTankSize(double fuelTankSize)
	{
		this.fuelTankSize = fuelTankSize;
	}//end setFuelTankSize()
	public void setFuelAvailable(double fuelAvailable)
	{
		this.fuelAvailable = fuelAvailable;
	}//end setFuelAvailable()
	//Other methods
	public abstract String getDistance(double numLitres);
	//toString method
	public String toString()
	{
		String output = "Gas Kilometrage: " + gasKilometrage + "\n";
		output += "Fuel Tank Size:" + fuelTankSize + "\n";
		output += "Fuel Available: " + fuelAvailable;
		return output;
	}//end toString()
}//end Vehicle class
