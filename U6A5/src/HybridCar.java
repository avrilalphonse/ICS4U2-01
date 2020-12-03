/*
 * Avril Alphonse
 * Unit 6 Activity 5 Assignment 1
 * This sub class file defines a HybridCar object
 */
import java.text.DecimalFormat;
public class HybridCar 
{
	//Default Constructor #1
	public HybridCar()
	{
		super();
	}//end default constructor #1
	public String getDistance(double numLitres)
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		return df.format((100*numLitres)/3.8) + "km";
	}//end getDistance()
	public String toString()
	{
		return super.toString();
	}//end toString()
}//end HybridCar class
