/*
 * Avril Alphonse
 * Unit 6 Activity 2 Assignment 1
 * This program will output the number of lemurs and its type chosen by the user
 */
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class LemurDatabase 
{
	public static void main(String[] args) 
	{
		ArrayList<Lemur> lemurArray = new ArrayList<Lemur>();
		int numLemurs = 0, type = 0;
		ImageIcon image = new ImageIcon("lemur.jpg");
		numLemurs = Integer.parseInt((String) JOptionPane.showInputDialog(null, "How many lemurs would you like?", "LEMUR BOX", JOptionPane.INFORMATION_MESSAGE,image, null, ""));
		System.out.println("LIST OF " + numLemurs + " LEMUR(S)\n");
		for(int i = 0; i < numLemurs; i++)
		{
			type = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a type of lemur for lemur #" + (i+1) + ":\n1-Desert Lemur\n2-Jungle Lemur\n3-Tree Lemur", "LEMUR BOX", JOptionPane.QUESTION_MESSAGE));
			if(type == 1)
			{
				lemurArray.add(new DesertLemur());
				lemurArray.get(i).setBreed("Desert Lemur");
				System.out.println((i+1) + ") " + lemurArray.get(i).getBreed() + ":");
			}
			else if(type == 2)
			{
				lemurArray.add(new JungleLemur());
				lemurArray.get(i).setBreed("Jungle Lemur");
				System.out.println((i+1) + ") " + lemurArray.get(i).getBreed() + ":");
			}
			else
			{
				lemurArray.add(new TreeLemur());
				lemurArray.get(i).setBreed("Tree Lemur");
				System.out.println((i+1) + ") " + lemurArray.get(i).getBreed() + ":");
			}//end if statement
			System.out.println(lemurArray.get(i));
		}//end for loop
	}//end main
}//end class
