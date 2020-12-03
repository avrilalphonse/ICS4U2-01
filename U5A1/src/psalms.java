/*
 * Avril Alphonse
 * Unit 5 Activity 1 Assignment 1
 * This program will search for a user given psalm passage in the Psalms text file
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class psalms 
{
	public static void main(String[] args) throws IOException
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		BufferedReader psalmsReader = new BufferedReader(new FileReader("Psalms.txt"));
		String line = null;
		int userPsalm = 0;
		int psalmNum[] = new int[24]; 
		String psalmWord[] = new String[24];
		boolean psalmSearch = false;
		userPsalm = Integer.parseInt(JOptionPane.showInputDialog(null, "What Psalm number would you like?(1-99)", "PSALM NUM", JOptionPane.QUESTION_MESSAGE));
		for(int i = 0;i < psalmNum.length; i++)
		{
			line = psalmsReader.readLine();
			psalmNum[i] = Integer.parseInt(line);
			line = psalmsReader.readLine();
			psalmWord[i] = line;
		}//end for loop
		psalmsReader.close();
		psalmSearch = binarySearch(psalmNum, 0, psalmNum.length - 1, userPsalm);
		System.out.println("Binary Search: Psalm #" + userPsalm + " " + psalmSearch);
		if(psalmSearch == true)
		{
			for(int i = 0; i < psalmNum.length; i++)
			{
				if(psalmNum[i] == userPsalm)
				{
					JOptionPane.showMessageDialog(null, psalmWord[i], "Psalm #" + userPsalm, JOptionPane.INFORMATION_MESSAGE);
				}//end if statement
			}//end for loop
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Psalm cannot be found", "Psalm #" + userPsalm, JOptionPane.INFORMATION_MESSAGE);
		}//if statement
	}//end main
	public static boolean binarySearch(int myArray[], int left, int right, int psalmNumber) 
	{
		System.out.print("Searching array: ");
		for (int i = left; i <= right; i++) 
		{
			System.out.print("[" + myArray[i] + "]");
		}//end for loop
		System.out.println(" for " + psalmNumber);
		int middle = 0;
		if (left > right) 
		{
			return false;
		}//end if statement
		middle = (left + right) / 2;
		if (myArray[middle] == (psalmNumber)) 
		{
			return true;
		}//end if statement
		if (psalmNumber < (myArray[middle])) 
		{
			return binarySearch(myArray, left, middle - 1,psalmNumber);
		} 
		else 
		{
			return binarySearch(myArray, middle + 1, right,psalmNumber);
		}//end if statement
	}//end binarySearch() method
}//end class
