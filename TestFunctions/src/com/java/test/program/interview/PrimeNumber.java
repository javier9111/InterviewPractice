package com.java.test.program.interview;

public class PrimeNumber {

	
	
	
	public static void main(String[] args)
	{
		
		
		int prime= 131;
		
		System.out.println("is prime "+prime+ ": "+isPrime(prime));
		
		System.out.println(Math.sqrt(prime));
		
	}
	
	
	
	
	
	public static boolean isPrime(int number)
	{
		
		if(number ==2|| number == 3)
		{
			return true;
			
		}else if(number%2==0)
		{
			return false;
		}
		else
		{
			for(int i =3; i<number; i=i+2)
			{
				if(i%number==0)
					return false;
			}
		}
		return true;
		
	}
}