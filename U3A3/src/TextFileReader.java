/*
 * Avril Alphonse
 * Unit 3 Activity 3 Assignment 1
 * This program will read any text file and output it
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class TextFileReader 
{
	public static void main(String[] args) throws IOException 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		BufferedReader readFile = new BufferedReader(new FileReader(JOptionPane.showInputDialog(null, "Enter the name of the text file(include .txt)", "FILE BOX", JOptionPane.QUESTION_MESSAGE)));
		String file = null;
		file = readFile.readLine();
		while(file != null)
		{
			System.out.println(file);
			file = readFile.readLine();
		}//end while loop
		readFile.close();
	  }//end main
}//end class
