/*
 * Avril Alphonse
 * Unit 2 Activity 2 Question 1
 * This program will allow the user to choose a school, donation amount and enter a population. Then, it will output the estimate donation for each school as well as the total
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class fundRaising
{
	public static void main(String[] args)
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		double fundRaising[][] = new double[4][8];
		//String schoolNames[] = {"Catholic Central", "Holy Cross", "John Paul II", "Mother Teresa", "Regina Mundi", "St. Joseph", "St. Mary", "St. Thomas Aquinas"};
		double donationAm[] = {0.25, 0.75, 1.00, 2.00};
		int schoolPop = 0, schoolName = 0, donation = 0, tryAgain = 0;
		double total = 0, totalAll = 0;
		DecimalFormat df = new DecimalFormat ("#,###,##0.00");
		do
		{
			schoolName = Integer.parseInt(JOptionPane.showInputDialog(null,"Which school are you from?\n0-Catholic Central\n1-Holy Cross\n2-John Paul II\n3-Mother Teresa\n4-Regina Mundi\n5-St. Joseph\n6-St.Mary\n7-St.Thomas Aquinas\n8-EXIT", "SCHOOL INPUT", JOptionPane.QUESTION_MESSAGE));
			if(schoolName < 8)
			{
				donation = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the donation amount?\n0-$0.25\n1-$0.50\n2-$1.00\n3-$2.00", "DONATION INPUT", JOptionPane.QUESTION_MESSAGE));
				schoolPop = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the total population?", "POPULATION INPUT", JOptionPane.QUESTION_MESSAGE));
				//CALCULATIONS
				for(int i = 0; i < fundRaising.length;i++)
				{
					for(int j = 0; j < fundRaising[i].length;j++)
					{
						fundRaising[donation][schoolName] = donationAm[donation] * schoolPop;
					}//end nested loop
				}//end for loop
				//OUTPUT
				System.out.println("\tCatholic Central\tHoly Cross\tJohn Paul II\tMother Teresa\tRegina Mundi\tSt. Joseph\tSt. Mary\tSt. Thomas Aquinas\tTotal");
				for(int i = 0; i < fundRaising.length; i++)
				{
					System.out.print("$" + df.format(donationAm[i]) + " -");
					for(int j = 0; j < fundRaising[i].length;j++)
					{  
						total += fundRaising[i][j];
						totalAll += fundRaising[i][j];
						System.out.print("\t\t" + df.format(fundRaising[i][j]));
					}//end nested loop
					System.out.print("\t\t\t" + df.format(total));
					System.out.println();
					total = 0;
				}//end for loop
				System.out.println("TOTAL DONATIONS: $" + df.format(totalAll));
				System.out.println();
				totalAll = 0;
				tryAgain = 1;
			}//if statement
			else
			{
				System.out.println("\nThank you!");
				tryAgain = 0;
			}//end if statement
		}while(tryAgain == 1);//end do while loop
	}//end main
}//end class

