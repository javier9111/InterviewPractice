package leetCodeInterviewPrep.medium;

import leetCodeInterviewPrep.medium.utils.ListNode;

/***
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 

Example 1:


Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node. 
Example 2:


Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
Example 3:


Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.
 

Constraints:

The number of nodes in the list is in the range [1, 105].
1 <= Node.val <= 105
 * 
 * 
 */
public class DeleteMiddleNode {

    public static void main(String[] args) {
        
        //
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(1);
        

       ListNode result = deleteMiddle(head);

        // Print the resulting list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }


    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;  // Devuelve null porque eliminamos el único nodo
        }
        ListNode temp = head;
        int countItems=0;
        while(temp != null){
            countItems++;
            temp = temp.next;
        }
        int middleNode = countItems/2;
        countItems=0;
        temp = head;
        while(temp != null){

            countItems++;
            if(countItems==middleNode){
                temp.next =temp.next.next;
                break;
            }
            temp =temp.next;
        }
        return head;


    }
}
