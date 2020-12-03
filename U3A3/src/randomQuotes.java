/*
 * Avril Alphonse
 * Unit 3 Activity 3 Assignment 2
 * This program will read any text file and output it
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class randomQuotes 
{
	public static void main(String[] args) throws IOException
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		BufferedReader readQuote = new BufferedReader(new FileReader("quotes.txt"));
		String line = null;
		String[] quotes = new String[10];
		for(int i = 0; i < quotes.length; i++)
		{
			line = readQuote.readLine();
			quotes[i] = line;
		}//end for loop
		System.out.println("Quote of the Day:\n" + quotes[(int) (Math.random() * 10) + 1]);
		readQuote.close();
	}//end main
}//end class
