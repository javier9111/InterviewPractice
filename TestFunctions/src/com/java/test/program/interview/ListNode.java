package com.java.test.program.interview;

public class ListNode {

	private Node head;
	private Node tail;
	
	ListNode(){
		this.head = new Node("Head");
		this.tail = head;
	}
	
	public void add(Node node)
	{
		this.tail.setNext(node);
		this.tail = node;
	}
	public Node getHead()
	{
		return this.head;
	}
	public Node getTail()
	{
		return this.tail;
	}
	
	public void setHead(Node node)
	{
		this.head = node;
	}
	
}
