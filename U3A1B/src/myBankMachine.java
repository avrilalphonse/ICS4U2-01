/*
 * Avril Alphonse
 * Unit 3 Activity 1 Assignment 2
 * This program functions like an ATM. It allows the user to choose an option and check their balance
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class myBankMachine 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INTIALIZATIONS
		ImageIcon image = new ImageIcon("money1.jpg");
		ATM ATM1 = new ATM();
		int option = 0, numDays = 0, inputFlag = 0;
		double amount = 0, rate = 0;
		ATM1.setBankName(JOptionPane.showInputDialog(null, "Welcome to the ATM!\nPlease enter the name of your bank:", "BANK BOX", JOptionPane.QUESTION_MESSAGE));
		ATM1.setInitialBalance(Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your initial balance:", "BALANCE BOX", JOptionPane.QUESTION_MESSAGE)));
		System.out.println(ATM1.toString());
		do
		{
			option = Integer.parseInt((String) JOptionPane.showInputDialog(null, "What would you like to do today?\n0-Deposit Money\n1-Withdraw Money\n2-Add Daily Interest\n3-Display Current Balance", "MENU", JOptionPane.INFORMATION_MESSAGE,image, null, ""));
			while(option < 0 || option > 3)
			{
				option = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid option. Choose again:\n0-Deposit Money\n1-Withdraw Money\n2-Add Daily Interest\n3-Display Current Balance", "MENU", JOptionPane.ERROR_MESSAGE));
			}//end while loop
			if(option == 0)
			{
				amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount to deposit:", "DEPOSIT AMOUNT", JOptionPane.QUESTION_MESSAGE));
				while(amount < 0)
				{
					amount = Double.parseDouble(JOptionPane.showInputDialog(null,"INVALID\nEnter the amount to deposit:", "DEPOSIT AMOUNT", JOptionPane.ERROR_MESSAGE));
				}//end while loop
				ATM1.depositMon(amount);
				System.out.println("\nYou have deposited $" + amount + " into your account\n" + ATM1.displayCurrentBal());
			}
			else if(option == 1)
			{
				amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount to withdraw:", "WITHDRAW AMOUNT", JOptionPane.QUESTION_MESSAGE));
				while(amount < 0)
				{
					amount = Double.parseDouble(JOptionPane.showInputDialog(null,"INVALID\nEnter the amount to withdraw:", "WITHDRAW AMOUNT", JOptionPane.ERROR_MESSAGE));
				}//end while loop
				ATM1.withdrawMon(amount);
				System.out.println("\nYou have withdrawn $" + amount + " from your account\n" + ATM1.displayCurrentBal());
			}
			else if(option == 2)
			{
				rate = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount of the annual interest rate:", "INTEREST RATE", JOptionPane.QUESTION_MESSAGE));
				while(rate < 0)
				{
					rate = Double.parseDouble(JOptionPane.showInputDialog(null,"INVALID\nEnter the amount of the annual interest rate:", "INTEREST RATE", JOptionPane.ERROR_MESSAGE));
				}//end while loop
				numDays = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of days to leave the balance invested:", "DAY NUMBER", JOptionPane.QUESTION_MESSAGE));
				while(numDays < 0)
				{
					numDays = Integer.parseInt(JOptionPane.showInputDialog(null,"INVALID\nEnter the number of days to leave the balance invested:", "DAY NUMBER", JOptionPane.ERROR_MESSAGE));
				}//end while loop
				System.out.println("\nYou collected $" + ATM1.calDailyInterest(rate, numDays) + " from an interest rate of " + rate + "% for " + numDays + " days\n" + ATM1.displayCurrentBal());
			}
			else
			{
				System.out.println("\n" + ATM1.displayCurrentBal());
			}//end if statement
			inputFlag = JOptionPane.showConfirmDialog(null, "Is there anything else you would like to do?", "CONTINUE?", JOptionPane.YES_NO_OPTION);
		}while(inputFlag == JOptionPane.YES_OPTION);
		System.out.print("\nThank you for using me today!");
	}//end main
}//end class
