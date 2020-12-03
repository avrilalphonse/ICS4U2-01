/*
 * Avril Alphonse
 * Unit 3 Activity 1 Assignment 2
 * Object file: This class contains the properties of an ATM
 */
import java.text.DecimalFormat;
public class ATM 
{
	private String bankName;
	private double initialBalance;
	//Default Constructor
	public ATM()
	{
		bankName = "CIBC";
		initialBalance = 1000;
	}//end Default Constructor
	//Regular Constructors
	public ATM(String bankName, double intialBalance)
	{
		this.bankName = bankName;
		this.initialBalance = intialBalance;
	}//end Regular Constructor
	//Default Constructor #2
	public ATM(String bankName)
	{
		this.bankName = bankName;
		initialBalance = 1000;
	}//end Default Constructor #2
	//Get Methods
	public String getBankName()
	{
		return bankName;
	}//end getBankName
	public double getInitialBalance()
	{
		return initialBalance;
	}//end getInitialBalance
	//Set Methods
	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}//end setBankName
	public void setInitialBalance(double initialBalance)
	{
		this.initialBalance = initialBalance;
	}//end setInitialBalnce
	public void depositMon(double amount)
	{
		initialBalance = initialBalance + amount;
	}//end depositMon
	public void withdrawMon(double amount)
	{
		initialBalance = initialBalance - amount;
	}//end withdrawMon
	public String displayCurrentBal()
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		return "The current balance is $" + df.format(initialBalance);
	}//end displayCurrentBal
	public String calDailyInterest(double interestRate, int numDays)
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		double interest = 0;
		interest = initialBalance * Math.pow((1 + (interestRate/100)), numDays);
		initialBalance = interest + initialBalance;
		return df.format(interest);
	}//end addDailyInterest
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		String output = "The bank is " + bankName + "\n";
		output += "The initial balance is $" + df.format(initialBalance);
		return output;
	}//end toString
}//end ATM()
