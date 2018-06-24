package guessFuction;
import java.util.Random;

public class ComputerValue {
	
	public static int cpuData()
	{
		//create intance of random 
		Random rand= new Random();
		//int randCpuValue=rand.nextInt(10);
		//return randCpuValue;
		return rand.nextInt(10);
	}

}
