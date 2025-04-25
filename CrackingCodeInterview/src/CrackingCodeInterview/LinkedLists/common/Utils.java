/**
 * 
 */
package CrackingCodeInterview.LinkedLists.common;

/**
 * @author ringo
 *
 */
public class Utils {

	
	
	
	public static void printNodes(Node head){
		
		Node n = head;
		
		while(n != null){
			
			System.out.println(n.data);
			n=n.next;
			
		}
		
	}
}
