package leetCodeInterviewPrep.medium;

import leetCodeInterviewPrep.medium.utils.ListNode;

/*
 * 
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkList {


    public static void main(String[] args) {
        
        //crea un listnode de 5 nodos
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseList(head);
        for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " ");
        }

    }
    public static ListNode reverseList(ListNode head) {

        if(head ==null || head.next==null){
            return head;
        }   
          // Llamada recursiva para invertir el resto de la lista
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;


       return newHead;    
   }
    
}
