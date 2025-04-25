package LeetCodeExc.medium;

public class AddTwoNumsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node3 = new ListNode(2);
		
		ListNode node2 = new ListNode(4);
		ListNode node1 = new ListNode(3);
		
		node3.next = node2;
		node2.next = node1;
		
		int numb = getListInt(node3);
		
		System.out.println(numb);
		
		
	convertToList(1203);

	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        
		 
		 return null;
	    }
	 
	 public static int getListInt(ListNode list){
		 
		 ListNode temp = list.next;
		 int sum=list.val;
		 int counter = 1;
		 int tempSum = 0;
		 while (temp != null)
		 {
			 System.out.println("temp value:"+temp.val+" sum value:"+sum+ " Temp sum value:"+tempSum+" counter:"+counter);
			 
			      sum += temp.val*(Math.pow(10, counter));
				 counter ++;	 
				 temp = temp.next;
		 }
		 
		 
		 
		 
		 return sum;
	 }
	 
	 public static ListNode convertToList(int Numb)
	 {
		 
		 ListNode node = new ListNode();
		 ListNode listNode =new ListNode();
		 
		 node.next = listNode;
			// int number
			while (Numb > 0) {

			    System.out.println( Numb % 10);

			   
			    
			    ListNode tempNode = new ListNode( Numb % 10);
			    listNode.next = tempNode;
			    listNode = listNode.next;
			    
			    System.out.println("list node valor:"+listNode.val);
			    Numb = Numb / 10;
			}
		 
		 System.out.println(listNode.next);
		 
		 return node.next;
	 }
	 
	 
	 
	 /***
	  * Solution leetCode
	  * 
	  */
	 
	 public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
	       ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	    }
}


