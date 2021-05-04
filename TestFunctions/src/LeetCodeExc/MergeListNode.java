package LeetCodeExc;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(5, l1);
		ListNode l3 = new ListNode(4, l2);
		ListNode l4 = new ListNode(3, l3);
		ListNode l5 = new ListNode(2, l4);
		ListNode l6 = new ListNode(1, l5);
		
		ListNode dosl1 = new ListNode(12);
		ListNode dosl2 = new ListNode(7, dosl1);
		ListNode dosl3 = new ListNode(6, dosl2);
		ListNode dosl4 = new ListNode(5, dosl3);
		ListNode dosl5 = new ListNode(4, dosl4);
		ListNode dosl6 = new ListNode(3, dosl5);
		
		ListNode result = mergeTwoLists(l6,dosl6);
		
		printList(result);
		
	}
	/* Method to print linked list */
	static void printList(ListNode temp)
	{

	    while (temp != null)
	    {
	        System.out.print(temp.val + " ");
	        temp = temp.next;
	    } 
	    System.out.println();
	}
	  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
		  
		  ListNode dummyNode = new ListNode(0);
		  
		  ListNode tail = dummyNode;
		  
		  
		  while(true)
		  {
			  
			  
			  if(l1.next== null)
			  {
				  tail.next = l2;
				  break;
			  }
			  if(l2.next == null)
			  {
				  tail.next = l1;
				  break;
			  }
			   
			  
			  
			  if(l1.val<= l2.val){
				  tail.next = l1;
				  l1 = l1.next;
				  
			  }
			  else
			  {
				  tail.next = l2;
				  l2 = l2.next;
			  }
			  tail = tail.next;
		  }
		 
	    return dummyNode.next ;
	    }
	  
	
	  
	  

}
