import javax.swing.JOptionPane;

/*
 * Jillianne Cruz
 * Hi Avril
 */
public class jillianne 
{
	public static void main(String[] args) 
	{
		//Variable Declarations and Initializations
		int input = 0;
		System.out.println("Hi Avril I am currently coding in your house on your computer. \nThis is a reminder to stop listening to sad songs and listen to happy music because being happy is super cool.");
		input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from a scale of 1-10", "USER INPUT", JOptionPane.QUESTION_MESSAGE));
		if (input <= 5)
		{
			System.out.println("\nBOYS ARE NOT WORTH YOUR TIME. >;(");
		}//end if statement
		else
		{
			System.out.println("\nBOYS ARE STILL SHI*!!!!!");
		}//end else
	}//end main
}//end class
