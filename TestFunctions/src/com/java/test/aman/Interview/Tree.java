package com.java.test.aman.Interview;

public class Tree implements CustomPrintInterface
{
    Node root;

    Tree()
    {        
    }

    public void printTree( String order)
    {   
        
        if( "inOrder".equals( order ) )
        {
            printTreeInOrder( this.root );
        }
        if( "PostOrder".equals( order ) )
        {
        	printTreePostOrder( this.root );
        }
        if( "PreOrder".equals( order ) )
        {
        	printTreePreOrder( this.root );
        }
        
    }

    public void printTreeInOrder( Node startingValue )
    {
        if( startingValue.left != null )
        {
            printTreeInOrder( startingValue.left );
        }
        System.out.println( startingValue.value );
        if( startingValue.right != null )
        {
            printTreeInOrder( startingValue.right );
        }
    }
    
    public void printTreePostOrder( Node startingValue )
    {
        if( startingValue.left != null )
        {
        	printTreePostOrder( startingValue.left );
        }
        if( startingValue.right != null )
        {
        	printTreePostOrder( startingValue.right );
        }
        System.out.println( startingValue.value );
    }
    
    public void printTreePreOrder( Node startingValue )
    {
        System.out.println( startingValue.value );
        if( startingValue.left != null )
        {
        	printTreePreOrder( startingValue.left );
        }
        if( startingValue.right != null )
        {
        	printTreePreOrder( startingValue.right );
        }

    }
    
    @Override
    public void printObject() {
       this.printTree("PostOrder");     
    }

    void insert( int newValue )
    {
        root = insert(newValue, this.root);
    }

    Node insert( int newValue, Node startingNode )
    {
        if( startingNode == null )
        {
            startingNode = new Node( newValue );
            return startingNode;
        }
        else if( startingNode.value > newValue )
        {            
            startingNode.left = insert( newValue, startingNode.left);
        }
        else if( startingNode.value < newValue )
        {
            startingNode.right = insert( newValue, startingNode.right );
        }
        return startingNode;
    }
}