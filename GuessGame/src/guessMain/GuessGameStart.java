package guessMain;

import guessFuction.*;

public class GuessGameStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		int x=0;
		while(run)
		{
		
		
		
		
		//1.Ask user for input
		Functions myFunc=new Functions();
		System.out.println("===========Game Begin============");
		myFunc.AskQuestionToUser("Hello,i am the cpu and i guessed a number bt 0 to 9");
		myFunc.AskQuestionToUser("Now your trun,guess your number(1 digit)");
		
		int userStorage=myFunc.UserInputStorage();
		System.out.println("You Entered: " +userStorage);
		//calculating how many digit  is in the user input we use String.valueOf(userStorage).length()
		int length=String.valueOf(userStorage).length();
		
		
		
		if(userStorage==0)
		{
			System.out.println("Please fix your input,must be one digit,not string");
			x++;
		}
		
		if(userStorage<0)
		{
			System.out.println("Please fix your input,must be positive int");
			x++;
		}
		
		if(length>1)
		{
			System.out.println("please fix your input,must be one digit");
			x++;
		}
			
		
		//2.Generate computer value
		if (x==0)
		{
		ComputerValue cpu=new ComputerValue();
		int cpuStorage=cpu.cpuData();
		System.out.println("Cpu Entered: " +cpuStorage);
		
		//3.compare both input
		String result=myFunc.Comparetwo(userStorage, cpuStorage);
		System.out.println(result);
		System.out.println("do you want to play again");
			if(myFunc.playAgain().equalsIgnoreCase("no"))
			{
				//re run whole program
				run=false;
			}
		
		}
		else
		{
			System.out.println("do you want to play again");
			if(myFunc.playAgain().equalsIgnoreCase("no"))
			{
				//re run whole program
				run=false;
				
			}
		}
		if(x>5)
		{
			System.out.println("sorry,you attempt more than five times");
			run=false;
			
		}
		}
		
		/*wrong user input-->try again
		5 wrong input then time out
		
		they can put more than one
		they can input string
		they can use negative number
		they can use decimal*/
		
		
		
	}

}
