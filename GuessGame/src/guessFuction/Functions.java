package guessFuction;

import java.util.*;


public class Functions {
	public static void AskQuestionToUser(String question)
	{
		System.out.println(question);
	}
	public static int UserInputStorage()
	{
		try
		{
		Scanner userData = new Scanner(System.in);
	    int userInputNumber=userData.nextInt();
	    return userInputNumber;
		}
		catch(InputMismatchException e)
		{
			return 0;
		}
	    
		
	}
	
	public static String Comparetwo(int digitOne,int digitTwo)

	{
		if(digitOne==digitTwo)
			return "you gussed the cpu number";
		else
			return "Oops,you got it wrong";
			
	}
	
	public static String playAgain()
	{
		try
		{
		Scanner playAgainData = new Scanner(System.in);
	    String playAgainAnswer=playAgainData.nextLine();
	    return  playAgainAnswer.toLowerCase();
		}
		catch(InputMismatchException e)
		{
			return "wrong answer";
		}
	    
		
	}

}
