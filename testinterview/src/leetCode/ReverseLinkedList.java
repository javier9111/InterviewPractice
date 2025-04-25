package leetCode;

import Utils.ListNode;

public class ReverseLinkedList {

	/**
	 * Definition for singly-linked list.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode head = new ListNode(1, node2);
		
		
		
		printListNode(head);
		
		ListNode reverseList = reverseList(head);
		
		
		printListNode(reverseList);
		
	}

	
	public static void printListNode(ListNode Node){
		System.out.println(Node.val);
		if(Node.next!= null ){
			printListNode(Node.next);
		}
	}
	
	
	public static ListNode reverseList(ListNode head) {
        
		 // Special case...
        if (head == null || head.next == null) return head;
        // Create a new node to call the function recursively and we get the reverse linked list...
        ListNode res = reverseList(head.next);
        // Set head node as head.next.next...
        head.next.next = head;
        //set head's next to be null...
        head.next = null;
        return res;    
		
    }
	
}

