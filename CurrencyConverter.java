package currencyConverter;

import java.util.*;

public class CurrencyConverter
{
	
	public static void main(String[] args)
	{
		
		Scanner kbIn 	= new Scanner(System.in);
		String 	usrIn 	= "";
		int		usrNum	= 0;
		
		System.out.println("Welcome to the Currency Converter by KaosArbitrium.");
		
		try
		{
			usrIn = kbIn.nextLine();
			usrNum = kbIn.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
