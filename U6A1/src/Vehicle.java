/*
 * Avril Alphonse
 * Unit 6 Activity 6 Assignment 1
 * This class file defines a Vehicle and its properties
 */
public class Vehicle 
{
	//Instance Variables
	private double gasKilometrage;
	private double fuelTankSize;
	private double fuelAvailable;
	private double kilometresTravelled;
	private int numPassengers;
	private double passengerFare;
	private double fuelCost;
	//Default Constructor
	public Vehicle() 
	{
		gasKilometrage = 0;
		fuelTankSize = 0;
		fuelAvailable = 0;
		kilometresTravelled = 0;
		numPassengers = 0;
		passengerFare = 0;
		fuelCost = 0;
	}//end Default Constructor
	//Regular Constructor
	public Vehicle(double gasKilometrage, double fuelTankSize, double fuelAvailable, double kilometresTravelled, int numPassengers, double passengerFare, double fuelCost)
	{
		this.gasKilometrage = gasKilometrage;
		this.fuelTankSize = fuelTankSize;
		this.fuelAvailable = fuelAvailable;
		this.kilometresTravelled = kilometresTravelled;
		this.numPassengers = numPassengers;
		this.passengerFare = passengerFare;
		this.fuelCost = fuelCost;
	}//end Regular Constructor
	//Set methods
	public void setGasKilometrage(double gasKilometrage)
	{
		this.gasKilometrage = gasKilometrage;
	}//end setGasKilometrage()
	public void setFuelTankSize(double fuelTankSize)
	{
		this.fuelTankSize = fuelTankSize;
	}//end setFuelTanksSize()
	public void setFuelAvailable(double fuelAvailable)
	{
		this.fuelAvailable = fuelAvailable;
	}//end setFuelAvailable()
	public void setKilometresTravelled(double kilometresTravelled)
	{
		this.kilometresTravelled = kilometresTravelled;
	}//end setKilometresTravelled()
	public void setNumPassengers(int numPassengers)
	{
		this.numPassengers = numPassengers;
	}//end setNumPassengers()
	public void setPassengerFare(double passengerFare)
	{
		this.passengerFare = passengerFare;
	}//end setPassengerFare()
	public void setFuelCost(double fuelCost)
	{
		this.fuelCost = fuelCost;
	}//end setFuelCost()
	//Get Methods
	public double getGasKilometrage()
	{
		return gasKilometrage;
	}//end getGasKilometrage()
	public double getFuelTankSize()
	{
		return fuelTankSize;
	}//end getFuelTanksSize()
	public double getFuelAvailable()
	{
		return fuelAvailable;
	}//end getFuelAvailable()
	public double getKilometresTravelled()
	{
		return kilometresTravelled;
	}//end getKilometresTravelled()
	public int getNumPassengers()
	{
		return numPassengers;
	}//end getNumPassengers()
	public double getPassengerFare()
	{
		return passengerFare;
	}//end getPassengerFare()
	public double getFuelCost()
	{
		return fuelCost;
	}//end getFuelCost()
	public double calRevenue()
	{
		return numPassengers * passengerFare;
	}//end calRevenu()
	public double calTotalCost()
	{
		return (fuelCost * gasKilometrage * kilometresTravelled) / 100;
	}//end calTotalCost()
	public double calProfit()
	{
		return calRevenue() - calTotalCost();
	}//end calProfit()
	public void addFuel(double gas)
	{
		if((fuelTankSize - fuelAvailable) >= gas)
		{
			fuelAvailable += gas;
			System.out.println("Added " + gas + 
					"L of gas to the tank.");
		}
		else 
		{
			System.out.println("You tried to add "+gas+"L of gas.");
			System.out.println("There is only room for " + 
					(fuelTankSize - fuelAvailable) + "L.");
		}//end if statement
	}//end addFuel()
	public void driveVehicle(double kms)
	{
		//Drive the vehicle
		//ex.  If the vehicle uses 9.5L/100 km then
		//litresNeeded = kms * 9.5 / 100
		System.out.println("Drive " + kms + "kms.  Start with " + 
				fuelAvailable + "L of gas.");
		double litresNeeded=(kms*gasKilometrage)/100.0;
		if(fuelAvailable >= litresNeeded)
		{
			fuelAvailable -= litresNeeded;
			kilometresTravelled += kms;
			System.out.println("Used " + litresNeeded + "L of gas.");
		}
		else 
		{
			System.out.println("Ran out of fuel!");
			//Calculate how many kms were driven
			double kmsThisDrive=(fuelAvailable*100.0)/gasKilometrage;
			kilometresTravelled += kmsThisDrive;
			fuelAvailable = 0;
			System.out.println("The vehicle drove " + kmsThisDrive +
					" before running out of gas.");
		}//end if statement
	}//end driveVehicle()
	public String toString() 
	{
		String output = "Gas Kilometrage = " + gasKilometrage+"\n";
		output += "Fuel Tank Size = " + fuelTankSize + "\n";
		output += "Fuel Available = " + fuelAvailable + "\n";
		output += "Kilometres Driven = "+kilometresTravelled+"\n";
		output += "Number of Passengers = " + numPassengers +" \n";
		output += "Passenger Fare = " + passengerFare + "\n";
		output += "Fuel Cost = $" + fuelCost + "/L\n";
		return output;
	}//end toString()
}//end class
