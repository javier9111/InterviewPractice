package com.java.test.aman.Interview;

public class MyLinkedList
{
    MyLinkedListNode head;
    
    void insert( int value )
    {
        head = insert(value, head);
    }

    MyLinkedListNode insert( int value, MyLinkedListNode startingValue )
    {
        if( startingValue == null )
        {
            startingValue = new MyLinkedListNode( value );
            return startingValue;
        }
        else 
        {
            startingValue.next = insert( value, startingValue.next );
            return startingValue;
        }        
    }

    void printLinkedList()
    {
        MyLinkedListNode node = this.head;
        StringBuilder sb = new StringBuilder();
        while ( node != null )
        {
            sb.append( node.value );
            if( node.next != null )
            {
                sb.append(" - ");
            }
            node = node.next;
        }
        System.out.println( sb.toString() );
    }

}