package com.java.test.interview;

import java.util.ArrayList;
import java.util.List;

public class ZipRange {

	public static void main(String[] args) {
//		[94133,94133] [94200,94299] [94226,94399] 
		List<ZipCodeRange> collectionOfRanges = new ArrayList<>();
		
		collectionOfRanges.add(new ZipCodeRange(94133,94133));
		
		collectionOfRanges.add(new ZipCodeRange(94133,94133));
		
		collectionOfRanges.add(new ZipCodeRange(94135,94136));
//		collectionOfRanges.add(new ZipCodeRange(94213,94214));
//		collectionOfRanges.add(new ZipCodeRange(94213,94213));
//		
		collectionOfRanges = getMinimunRangeCollection(collectionOfRanges);
		
		System.out.println("This is the total result");
		for(ZipCodeRange zipRange : collectionOfRanges )
		{
			
			System.out.println( zipRange.toString() );
		}
		
		
	}

	/**
	 * Gets the minimum number of ranges
	 * @param collectionOfRanges
	 * @return
	 */
	protected static List<ZipCodeRange> getMinimunRangeCollection( List<ZipCodeRange> collectionOfRanges )
	{	
		//We sort the values of the collection by using java 8 lambda expression.
		collectionOfRanges.sort( ( o1, o2 )-> o1.getLowerBound() - o2.getLowerBound() );
		
		ZipCodeRange zipRangeCollected = null;
		
		List<ZipCodeRange> zipRangesResultCollection = new ArrayList<ZipCodeRange>();
		
		int counter = 0;
		
		for ( ZipCodeRange zipRange : collectionOfRanges)
		{
			
			//Checks if is the first Item in the list
			if(zipRangeCollected == null)
			{
				zipRangeCollected = zipRange;
			}
			/*Checks if the current zipRange can be join to the previous zip range by checking the upper bounds 
			 * I have added a +1 for the scenario that the next in the zip range has the lower bound as the number that follows the upper bound of the previous zip range
			 */
			else if( zipRangeCollected.getUpperBound()+1 >= zipRange.getLowerBound() )
			{
				if( zipRange.getUpperBound() > zipRangeCollected.getUpperBound() )
				{
					zipRangeCollected.setUpperBound( zipRange.getUpperBound());
				}
				//if we face the end of the list we save what we currently have on our zip consolidated range.
				if(counter == collectionOfRanges.size()-1)
				{
					zipRangesResultCollection.add(zipRangeCollected);
				}
			}	
			else
			{
				//If the zip range cannot be consolidate within other range we save it to the list.
				zipRangesResultCollection.add(zipRangeCollected);
				zipRangeCollected = zipRange;
				
				//if we face the end of the list we save our current zip  range.
				if(counter == collectionOfRanges.size()-1)
				{
					zipRangesResultCollection.add( zipRange );
				}
			}
			counter++;
		}
		
		return zipRangesResultCollection;
		
	}
}
