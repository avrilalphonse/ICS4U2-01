
public class eratosthenes 
{
	public static void main(String[] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		boolean primeNum[] = new boolean[1000];
		for(int i = 0; i < primeNum.length; i++)
		{
			primeNum[i] = true;
		}
		for(int i = 2; i < primeNum.length; i++)
		{
			if(i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 || i == 19)
			{
				primeNum[i] = true;
				System.out.println(i);
			}
			else if(i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0 || i%11 == 0 || i%13 == 0 || i%17 ==0 || i%19 == 0)
			{
				primeNum[i] = false;
			}
			else
			{
				primeNum[i] = true;
				System.out.println(i);
			}//end if statement
		}//end for loop
	}//end main
}//end class
