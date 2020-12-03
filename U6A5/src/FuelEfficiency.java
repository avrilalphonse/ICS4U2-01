/*
 * Avril Alphonse
 * Unit 6 Activity 5 Assignment 1
 * This class will take in the number of litres of gas and output the number of kilometres it can drive
 */
import javax.swing.JOptionPane;
public class FuelEfficiency 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		double numLitres = 0;
		Car carOne = new Car();
		Truck truckOne = new Truck();
		HybridCar hybridOne = new HybridCar();
		Motorcycle motorOne = new Motorcycle();
		numLitres = Double.parseDouble(JOptionPane.showInputDialog(null, "How many litres do you want the vehicle to drive?", "NUM LITRES", JOptionPane.QUESTION_MESSAGE));
		System.out.println("On " + numLitres + "L of gas the vehicles can drive:\n");
		System.out.println("Car: " + carOne.getDistance(numLitres));
		System.out.println("Truck: " + truckOne.getDistance(numLitres));
		System.out.println("Hybrid Car: " + hybridOne.getDistance(numLitres));
		System.out.println("Motorcycle: " + motorOne.getDistance(numLitres));
	}//end main
}//end class
