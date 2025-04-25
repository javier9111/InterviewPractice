package leetCodeInterviewPrep.medium;

import leetCodeInterviewPrep.medium.utils.ListNode;

/***
 * 
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
 */
public class EvenOdd {


    public static void main(String[] args) {
        
        //crea un listnode de 5 nodos
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        oddEvenList(head);


        for(ListNode temp = head; temp != null; temp = temp.next){
            System.out.print(temp.val + " ");
        }



    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Si la lista tiene 0 o 1 nodo, no hay nada que reorganizar
        }
    
        ListNode odd = head; // Puntero para los nodos impares
        ListNode even = head.next; // Puntero para los nodos pares
        ListNode evenHead = even; // Guardamos el inicio de la lista de pares
    
        while (even != null && even.next != null) {
            odd.next = even.next; // Conectamos el siguiente nodo impar
            odd = odd.next; // Avanzamos el puntero impar
            even.next = odd.next; // Conectamos el siguiente nodo par
            even = even.next; // Avanzamos el puntero par
        }
    
        odd.next = evenHead; // Conectamos el final de la lista impar con el inicio de la lista par
    
        return head; 
    }
}
