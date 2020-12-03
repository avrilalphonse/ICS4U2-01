import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class AvgReadFile 
{
	public static void main(String[] args) throws IOException 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		/*Open the text file and attach a BufferedReader
		 * The path g:/randnums.txt must change depending where the file is located. 
		*/
		BufferedReader readFile = new BufferedReader(new FileReader("randNums.txt"));
		int inMarks[] = new int[100];
		String myLine;
		System.out.println("Contents of the file randnums.txt:");
		//read 100 marks from the file randnums.txt
		for (int i = 0; i < 100; i++) 
		{
			myLine = readFile.readLine();
			System.out.println(myLine);
			inMarks[i] = Integer.parseInt(myLine);
		}//end for loop
		readFile.close();
		System.out.print("The average of the random numbers is: ");
		//Call findAverage method; passes values from inMark array
		System.out.println(findAverage(inMarks));
	}//end main

	public static int findAverage(int marks[]) 
	{
		int sum = 0;
		for (int i = 0; i < marks.length; i++) 
		{
			//sums the values in the new array 'marks'
			sum += marks[i];	
		}//end for loop
		return (sum / marks.length);	//returns average
	}//end method
}//end class
