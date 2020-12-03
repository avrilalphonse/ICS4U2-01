/*
 * Avril Alphonse
 * Unit 3 Activity 1 Assignment 1
 * This program asks the user to create 3 different cars and displays the information for each car
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CarTester 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		int inputFlag = 0;
		String make = null;
		ArrayList<Car> carList = new ArrayList<Car>();
		do
		{
			make = JOptionPane.showInputDialog(null, "Enter the make of the car\n*If make is unknown, click OK*", "MAKE BOX", JOptionPane.QUESTION_MESSAGE);
			if(make.equals(""))
			{
				carList.add(new Car());
			}
			else
			{
				carList.add(new Car(make));
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Are there more cars to enter?", "ENTER MORE?", JOptionPane.YES_NO_OPTION);
		}while(inputFlag == JOptionPane.YES_OPTION);//end do while
		for(int i = 0; i < carList.size(); i++)
		{
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the model of " + carList.get(i).getMake() + "?", "CHANGE MODEL?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				carList.get(i).setModel(JOptionPane.showInputDialog(null, "Enter model of " + carList.get(i).getMake() + ":", "MODEL BOX", JOptionPane.QUESTION_MESSAGE));
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the year of " + carList.get(i).getMake() + "?", "CHANGE YEAR?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				carList.get(i).setYear(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year of " + carList.get(i).getMake() + ":", "YEAR BOX", JOptionPane.QUESTION_MESSAGE)));
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the price of " + carList.get(i).getMake() + "?", "CHANGE PRICE?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				carList.get(i).setPrice(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price of " + carList.get(i).getMake() + ":", "PRICE BOX", JOptionPane.QUESTION_MESSAGE)));
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the colour of " + carList.get(i).getMake() + "?", "CHANGE COLOUR?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				carList.get(i).setColour(JOptionPane.showInputDialog(null, "Enter colour of " + carList.get(i).getMake() + ":", "COLOUR BOX", JOptionPane.QUESTION_MESSAGE));
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to change the number of seats for " + carList.get(i).getMake() + "?", "CHANGE SEATS?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				carList.get(i).setNumSeats(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of seats for " + carList.get(i).getMake() + ":", "SEATS BOX", JOptionPane.QUESTION_MESSAGE)));
			}//end if statement
		}//end for loop
		for(int i = 0; i < carList.size(); i++)
		{
			System.out.println("CAR #" + (i+1) + "\n" + carList.get(i));
			inputFlag = JOptionPane.showConfirmDialog(null, "Would you like to honk the horn of " + carList.get(i).getMake() + "?", "HONK HORN?", JOptionPane.YES_NO_OPTION);
			if(inputFlag == JOptionPane.YES_OPTION)
			{
				System.out.print("CAR #" + (i+1) + " says " + carList.get(i).honkHorn());
			}//end if statement
			System.out.println("\n");
		}//end for loop
	}//end main
}//end class
