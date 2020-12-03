/*
 * Avril Alphonse
 * Unit 6 Activity 5 Assignment 1
 * This sub class file defines a Motorcycle object
 */
import java.text.DecimalFormat;
public class Motorcycle 
{
	//Default Constructor #1
	public Motorcycle()
	{
		super();
	}//end default constructor #1
	public String getDistance(double numLitres)
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		return df.format((100*numLitres)/6.3) + "km";
	}//end getDistance()
	public String toString()
	{
		return super.toString();
	}//end toString()
}//end Motorcycle class
