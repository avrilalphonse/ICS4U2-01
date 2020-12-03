/*
 * Avril Alphonse
 * Unit 6 Activity 5 Assignment 1
 * This sub class file defines a Truck object
 */
import java.text.DecimalFormat;
public class Truck extends Vehicle
{
	//Default Constructor #1
	public Truck()
	{
		super();
	}//end default constructor #1
	public String getDistance(double numLitres)
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		return df.format((100*numLitres)/14.1) + "km";
	}//end getDistance()
	public String toString()
	{
		return super.toString();
	}//end toString()
}//end Truck class
