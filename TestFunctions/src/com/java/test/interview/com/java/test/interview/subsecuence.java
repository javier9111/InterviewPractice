package com.java.test.interview.com.java.test.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subsecuence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrSample = {1,2,7,3,4,6};
		
		
		int[] result = subsecuence2(arrSample);
		
		for(int i = 0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
		
		
	}


	
	public static int[] subsecuence2(int[] arrS){
		
		int[] result = new int[arrS.length];
		
		
		for(int i= arrS.length-1; i>= 0; i--)
		{

			int maxSecuanceNumber = 1;
				for(int j=0; j<i; j++)
				{
					int prevnumber =-1;
					int secuenceNumber =0;
					for(int x=0; x<i; x++)
					{
						if(arrS[x]< arrS[i] && arrS[x]>prevnumber)
						{
						secuenceNumber++;
						prevnumber = arrS[x];
						}
					}
					
					
					if(maxSecuanceNumber<secuenceNumber)
					{
						maxSecuanceNumber = secuenceNumber;
					}
				}
				result[i]=maxSecuanceNumber;
		}
		return result;
	}
	
	
	public static Map<Integer,List<List<Integer>>> subsecuence3(int[] arrS)
	{
		int counter = 0;
		Map<Integer, List<List<Integer>>> map = new HashMap<>();
		for(int i= arrS.length-1; i>= 0; i--)
		{
			
		}
		
		return null;
	}
}
