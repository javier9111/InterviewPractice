	package testinterview.datastructures.hashmaps;

public class Binarytree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node noderoot = new Node(10);
		
		noderoot.insert(5);
		noderoot.insert(8);
		noderoot.insert(15);
		
		noderoot.printInOrder();
		System.out.println("---------------------------------------");
		noderoot.printPreOrder();
		System.out.println("---------------------------------------");
		noderoot.printPostOrder();
		
		
		System.out.println(noderoot.contains(15));
	}


}
