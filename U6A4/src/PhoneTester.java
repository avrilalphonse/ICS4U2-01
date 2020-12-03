/*
 * Avril Alphonse
 * Unit 6 Activity 4 Assignment 1
 * This program allows the user to create their own CellPhone Object
 */
import javax.swing.JOptionPane;
public class PhoneTester 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		CellPhone phoneOne = new CellPhone();
		phoneOne.setCarrier(JOptionPane.showInputDialog(null, "What is the phone's carrier?", "CARRIER", JOptionPane.QUESTION_MESSAGE));
		phoneOne.setType(JOptionPane.showInputDialog(null, "What is the type of the phone?", "TYPE", JOptionPane.QUESTION_MESSAGE));
		phoneOne.setSpeed(Double.parseDouble(JOptionPane.showInputDialog(null, "What is the phone's speed?(Ghz)", "SPEED", JOptionPane.QUESTION_MESSAGE)));
		phoneOne.setMemory(Double.parseDouble(JOptionPane.showInputDialog(null, "What is the memory of the phone?(Gb)", "MEMORY", JOptionPane.QUESTION_MESSAGE)));
		phoneOne.setNumApps(Integer.parseInt(JOptionPane.showInputDialog(null, "How many apps does the phone have?", "NUM APPS", JOptionPane.QUESTION_MESSAGE)));
		System.out.println(phoneOne);
	}//end class
}//end main
