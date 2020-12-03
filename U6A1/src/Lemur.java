/*
 * Avril Alphonse
 * Unit 6 Activity 2 Assignment 1
 * This class file will define the object Lemur which extends to Mammal
 */
public class Lemur extends Mammal
{
	///Instance	variables
	private String location;
	private String coat;
	private String classification;
	private boolean female;
	//Default Constructor #1
	public Lemur()
	{
		super();
		location = "Madagascar";
		coat = "Fur";
		classification = "Prosimians";
		if(getGender() == "Female")
		{
		female = true;
		}
		else
		{
			female = false;
		}//end if statement
	}//end default constructor #1
	//Regular Constructor
	public Lemur(String location, String coat, String classification, boolean female)
	{
		super();
		this.location = location;
		this.coat = coat;
		this.classification = classification;
		this.female = female;
	}//end regular constructor
	//Default Constructor #2
	public Lemur(boolean female)
	{
		super();
		location = "Madagascar";
		coat = "fur";
		classification = "Prosimians";
		this.female = female;
	}//default constructor #2
	//Get methods
	public String getLocation()
	{
		return location;
	}//end getLocation()
	public String getCoat()
	{
		return coat;
	}//end getCoat()
	public String getClassification()
	{
		return classification;
	}//end getClassification()
	public boolean getFemale()
	{
		return female;
	}//end getFemale();
	//Set methods
	public void setLocation(String location)
	{
		this.location = location;
	}//end setLocation()
	public void setCoat(String coat)
	{
		this.coat = coat;
	}//end setCoat()
	public void setClassification(String classification)
	{
		this.classification = classification;
	}//end setClassification()
	public void setFemale(boolean female)
	{
		this.female = female;
	}//end setFemale()
	public String toString()
	{
		String output = "Location: " + location + "\n";
		output += "Coat: " + coat + "\n";
		output += "Classification: " + classification + "\n";
		if(female == true)
		{
			output += "Female: Dominant Role" + "\n";
		}//end if statement
		return super.toString()  + output;
	}//end toString()
}//end Lemur class
