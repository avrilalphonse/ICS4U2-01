/*
 * Avril Alphonse
 * Unit 6 Activity 6 Assignment 1
 * This program will do a lot of things
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class VehicleTester 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATION AND INITIALIZATIONS
		int option = 0;
		Vehicle car1 = new Vehicle();
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		car1.setGasKilometrage(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the gas kilometrage:", "GAS KILO BOX", JOptionPane.QUESTION_MESSAGE))); 
		car1.setFuelTankSize(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the max amount of fuel in tank:", "TANK BOX", JOptionPane.QUESTION_MESSAGE)));
		car1.setFuelAvailable(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the current amount of fuel in tank:", "GAS KILO BOX", JOptionPane.QUESTION_MESSAGE)));
		car1.setNumPassengers(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of passengers:", "PASSENGERS BOX", JOptionPane.QUESTION_MESSAGE)));
		car1.setPassengerFare(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the fare per passenger:", "FARE BOX", JOptionPane.QUESTION_MESSAGE)));
		car1.setFuelCost(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the fuel cost:", "FUEL COST BOX", JOptionPane.QUESTION_MESSAGE)));
		System.out.println(car1);
		car1.driveVehicle(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the kilometres driven:", "KM BOX", JOptionPane.QUESTION_MESSAGE)));
		System.out.println(car1);
		while(option != 3)
		{
			option = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose:\n1-Drive again\n2-Add Fuel\n3-EXIT", "OPTION BOX", JOptionPane.QUESTION_MESSAGE));
			if(option == 1)
			{
				car1.driveVehicle(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the kilometres driven:", "KM BOX", JOptionPane.QUESTION_MESSAGE)));
				System.out.println(car1);
			}
			else if(option == 2)
			{
				car1.addFuel(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter how much fuel you would like to add:", "FUEL BOX", JOptionPane.QUESTION_MESSAGE)));
				System.out.println(car1);
			}//end if statement
		}//end while
		System.out.println("Revenue: $" + df.format(car1.calRevenue()));
		System.out.println("Total Cost: $" + df.format(car1.calTotalCost()));
		System.out.println("Profit: $" + df.format(car1.calProfit()));	
	}//end main
}//end class
