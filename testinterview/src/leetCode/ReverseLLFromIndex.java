package leetCode;

import Utils.LinkedList;

public class ReverseLLFromIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				LinkedList myList = new LinkedList(1);
				myList.append(2);
				myList.append(3);
				myList.append(4);
				myList.append(5);
				myList.reverseBetween(1, 3);
				myList.printList(); // Output: 3
				 
				myList.append(6);
				
				
	}

}
