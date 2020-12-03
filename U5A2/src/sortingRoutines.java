/*
 * Avril Alphonse
 * Unit 5 Activity 2 Assignment 1
 * This program will sort x amount of random numbers using a type of sorting method
 */
import javax.swing.JOptionPane;
public class sortingRoutines 
{
	public static void main(String[] args)
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		int amount = 0, sortType = 0, order = 0;
		amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many random numbers will you like to generate?","RANDOM NUMBERS", JOptionPane.QUESTION_MESSAGE));
		int randomNum[] = new int[amount];
		System.out.print("The unsorted array is:\n");
		for(int i = 0; i < randomNum.length; i++)
		{
			randomNum[i] = (int) (Math.random() * 100) + 1;
			System.out.print(randomNum[i] + " ");
		}//end for loop
		sortType = Integer.parseInt(JOptionPane.showInputDialog(null, "What type of sort would you like?\n0-Selection Sort\n1-Bubble Sort\n2-Insertion Sort\n3-Quick Sort","SORT TYPE", JOptionPane.QUESTION_MESSAGE));
		while(sortType < 0 || sortType > 3)
		{
			sortType = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid. What type of sort would you like?\n0-Selection Sort\n1-Bubble Sort\n2-Insertion Sort\n3-Quick Sort","SORT TYPE", JOptionPane.ERROR_MESSAGE));
		}//end while loop
		if(sortType == 0)
		{
			selectionSort(randomNum);
			System.out.print("\nAfter sorting using Selection Sort, the array in ");
		}
		else if(sortType == 1)
		{
			bubbleSort(randomNum);
			System.out.print("\nAfter sorting using Bubble Sort, the array in ");
		}
		else if(sortType == 2)
		{
			insertionSort(randomNum);
			System.out.print("\nAfter sorting using Insertion Sort, the array in ");
		}
		else
		{
			quickSort(randomNum, 0, randomNum.length-1);
			System.out.print("\nAfter sorting using Quick Sort, the array in ");
		}//end if statement
		order = Integer.parseInt(JOptionPane.showInputDialog(null, "How would you like it sorted?\n0-Ascending\n1-Descending","NUM ORDER", JOptionPane.QUESTION_MESSAGE));
		while(order < 0 || order > 1)
		{
			order = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid. How would you like it sorted?\n0-Ascending\n1-Descending","NUM ORDER", JOptionPane.ERROR_MESSAGE));
		}//end while loop
		if(order == 0)
		{
			System.out.print("ascending order is:\n");
			for(int i = 0; i < randomNum.length; i++)
			{
				System.out.print(randomNum[i] + " ");
			}//end for loop
		}
		else
		{
			System.out.print("descending order is:\n");
			for(int i = randomNum.length-1; i >= 0; i--)
			{
				System.out.print(randomNum[i] + " ");
			}//end for loop
		}//end if statement
	}//end main
	public static void selectionSort(int data[]) 
	{
		for (int i = 0; i < data.length-1; i++) 
		{
			for (int index = i+1; index < data.length; index++) 
			{
				if (data[index] < data[i]) 
				{
					swap(data, i, index);
				}//end if statement
			}//end nested for loop
		}//end for loop
	}//end selectionSort() method
	public static void bubbleSort(int data[]) 
	{
		for (int pass = 1; pass < data.length; pass++) 
		{
			for (int element = 0;element < data.length-1; element++) 
			{
				if (data[element] > data[element + 1]) 
				{
					swap(data, element, element + 1);
				}//end if statement
			}//end nested for loop
		}//end for loop
	}//end bubbleSort() method
	public static void insertionSort(int data[]) 
	{
		int insert = 0, moveItem = 0;
		for (int next = 1; next < data.length; next++) 
		{
			insert = data[next];
			moveItem = next;
			while (moveItem > 0 && data[moveItem - 1] > insert) 
			{
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}//end while loop
			data[moveItem] = insert;
		}//end for loop
	}//end insertionSort() method
	public static void quickSort(int data[], int low, int high) 
	{
		int partitionLoc = 0;
		if (low < high) 
		{
			partitionLoc = partition(data, low, high);
			quickSort(data, low, partitionLoc - 1);
			quickSort(data, partitionLoc + 1, high);
		}//end if statement
	}//end quickSort() method
	public static int partition(int data2[],int left,int right) 
	{
		boolean moveLeft = true;
		int separator = 0;
		separator = data2[left];
		while (left < right) 
		{
			if (moveLeft == true) 
			{
				while ((data2[right] >= separator) && (left < right)) 
				{
					right--;
				}//end while loop
				data2[left] = data2[right];
				moveLeft = false;
			}
			else 
			{
				while ((data2[left] <= separator) && (left < right)) 
				{
					left++;
				}//end while loop
				data2[right] = data2[left];
				moveLeft = true;
			}//end if statement
		}//end while loop
		data2[left] = separator;
		return left;
	}//end partition() method
	public static void swap(int array2[], int first, int second) 
	{
		int hold = 0;
		hold = array2[first];
		array2[first] = array2[second];
		array2[second] = hold;
	}//end swap() method
}//end class
