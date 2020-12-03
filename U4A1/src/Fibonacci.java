/*
 * Avril Alphonse
 * Unit 4 Activity 1 Assignment 1: Fibonacci
 * This program will output the Fibonacci number for the term given by the user
 */
import javax.swing.JOptionPane;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INTIALIZATIONS
		int number = 0;
		number = Integer.parseInt(JOptionPane.showInputDialog(null, "The first 9 fibonacci numbers are listed below\n1,1,2,3,5,8,13,21,34\nPlease enter the fibonacci term you would like to see:", "NUM BOX", JOptionPane.QUESTION_MESSAGE));
		System.out.println( "The fibonacci number for the " + number + "th term is " + fibonacci(number));
	}//end main
	public static int fibonacci(int n) 
	{
	 if(n == 0)
	 {
		 return 0;
	 }
	 else if(n == 1)
	 {
		 return 1;
	 }
	 return fibonacci(n-1) + fibonacci(n-2);
	}//end fibonacci method
}//end class
