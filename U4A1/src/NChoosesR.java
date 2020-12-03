/*
 * Avril Alphonse
 * Unit 4 Activity 1 Assignment 2: NChoosesR
 * This program will calculate the number of ways to choose r different objects from a set of n objects using factorial
 */
import javax.swing.JOptionPane;
public class NChoosesR 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		int n = 0, r = 0, C = 0;
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "This program will calculate the number of ways\nto choose r different objects from a set of n objects.\nHow many objects are there to choose from?", "N BOX",JOptionPane.QUESTION_MESSAGE));
		r = Integer.parseInt(JOptionPane.showInputDialog(null, "How many objects would you like to choose?", "R BOX", JOptionPane.QUESTION_MESSAGE));
		C = factorial(n) / (factorial(r) * factorial(n-r));
		System.out.println("There are " + C + " ways to choose " + r + " objects from a set of " + n + " objects.");
	}//end main
	public static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		return factorial(num-1) * num;
	}//end factorial method
}//end class
