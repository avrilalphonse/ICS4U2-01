/*
 * Avril Alphonse
 * Unit 3 Activity 1 Assignment 1
 * This class contains the properties of the Object Car
*/
import java.text.DecimalFormat;
public class Car 
{
	private String make;
	private String model;
	private int year;
	private double price;
	private String colour;
	private int numSeats;
	//Default Constructor
	public Car()
	{
		make = "Honda";
		model = "CR-V";
		year = 2010;
		price = 15000;
		colour = "grey";
		numSeats = 5;
	}//end Default Constructor
	//Default Constructor #2
	public Car(String make)
	{
		this.make = make;
		model = "CR-V";
		year = 2010;
		price = 15000;
		colour = "grey";
		numSeats = 5;
	}//end Default Constructor #2
	//Regular Constructor
	public Car(String make, String model, int year, double price, String colour, int numSeats)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.colour = colour;
		this.numSeats = numSeats;
	}//end Regular Constructor
	//Get methods
	public String getMake()
	{
		return make;
	}//end getMake()
	public String getModel()
	{
		return model;
	}//end getModel()
	public int getYear()
	{
		return year;
	}//end getYear()
	public double getPrice()
	{
		return price;
	}//end getPrice()
	public String getColour()
	{
		return colour;
	}//end getColour()
	public int getNumSeats()
	{
		return numSeats;
	}//end getNumSeats()
	//Set methods
	public void setMake(String make)
	{
		this.make = make;
	}//end setMake()
	public void setModel(String model)
	{
		this.model = model;
	}//end setModel()
	public void setYear(int year)
	{
		this.year = year;
	}//end setYear()
	public void setPrice(double price)
	{
		this.price = price;
	}//end setPrice()
	public void setColour(String colour)
	{
		this.colour = colour;
	}//end setColour()
	public void setNumSeats(int numSeats)
	{
		this.numSeats = numSeats;
	}//end setNumSeats()
	public String honkHorn()
	{
		return "Beep Beep";
	}//end nonkHorn()
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		String output = "The make of the car is " + make + "\n";
		output += "The model of the car is " + model + "\n";
		output += "The car's year is " + year + "\n";
		output += "The price is $" + df.format(price) + "\n";
		output += "The colour is " + colour + "\n";
		output += "The number of seats is " + numSeats;
		return output;
	}//end toString()
}//end Car
