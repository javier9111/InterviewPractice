package com.java.test.aman.Interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Runner
{
    public static void main( String[] args)
    {
        Tree myTree = new Tree();
        myTree.insert( 1 );
        myTree.insert(3);
        myTree.insert( 2 );
        myTree.insert( 4 );
        myTree.insert( 5);
        myTree.printTree(" PreOrder");


        // MyLinkedList  ll = new MyLinkedList();
        // ll.insert(1);
        // ll.insert(2);
        // ll.insert(3);
        // ll.insert(4);

        // ll.printLinkedList();
        
      //  Runner.reverseString( "Test");

      //  System.out.println( Runner.reverseStringRecursion( "mystring") );

     //   Runner.findDuplicateCharactersInString( "ThisIsTheString ");
        
        Map linkedHash = new LinkedHashMap<Integer,String>(); 
    }

    public static void reverseString( String stringToReverse)
    {
        if( stringToReverse== null || stringToReverse.length() <=1 )
        {
            System.out.println( "String is null or already reversed" );
        }
        char[] stringReversedCharArray = stringToReverse.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int j = stringReversedCharArray.length -1; j>=0; j--)
        {
            sb.append( stringReversedCharArray[j] );
        };
        System.out.println("Original String = " +  stringToReverse );
        System.out.println( "Reversed = " + sb.toString() );
    }

    public static String reverseStringRecursion( String strToRev )
    {
        if( strToRev == null || strToRev.length() <= 1 )
        {
            return strToRev;
        }
        return reverseStringRecursion( strToRev.substring(1) ) + strToRev.charAt(0);
    }

    public static void findDuplicateCharactersInString( String inputString )
    {
        Map< String,Integer> duplicateCharMap = new HashMap<>();
        for( int i =0; i< inputString.length(); i++ )
        {
            String inputCharAsString = inputString.substring(i,i+1);

            if( duplicateCharMap.get( inputCharAsString ) != null )
            {
                duplicateCharMap.put( inputCharAsString, duplicateCharMap.get(inputCharAsString) + 1  );
            }
            else
            {
                duplicateCharMap.put( inputCharAsString, 1);
            }
        }
        
        for( String key : duplicateCharMap.keySet() )
        {
            if( duplicateCharMap.get(key) > 1 )
            {
                System.out.println( key );
            }
        }
        
        
    }
}
